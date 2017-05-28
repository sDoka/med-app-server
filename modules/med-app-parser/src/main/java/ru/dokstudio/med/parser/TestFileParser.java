package ru.dokstudio.med.parser;

import ru.dokstrudio.med.srv.exception.NoSuchTestUnitException;
import ru.dokstrudio.med.srv.model.TestUnit;
import ru.dokstrudio.med.srv.model.TestUnitAnswer;
import ru.dokstrudio.med.srv.service.TestUnitAnswerLocalService;
import ru.dokstrudio.med.srv.service.TestUnitLocalService;
import ru.dokstudio.med.parser.api.TestFileParserApi;
import ru.dokstudio.med.parser.model.ParserTestModel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * @author Home
 */
@Component(
	immediate = true,
	property = {
		// TODO enter required service properties
	},
	service = TestFileParserApi.class
)
public class TestFileParser implements TestFileParserApi {
	
	private static final Log log = LogFactoryUtil.getLog(TestFileParser.class);
	
	@Reference
	TestUnitLocalService testUnitLocalService;
	
	@Reference
	TestUnitAnswerLocalService testUnitAnswerLocalService;
	
	@Reference
	CounterLocalService counterLocalService;
	
	@Override
	public void uploadNewSpecializationTest(long specializationId, File testFile) {
		log.info("Tip: in input file test units must be separate from each other with empty string.");
		log.info("If there are empty strings inside test unit, the parser will stop at this unit");
		log.info("You should correct test unit in the input file and start parser again for proper result");
		
		List<ParserTestModel> testUnitList = new ArrayList<ParserTestModel>();
		ParserTestModel medTestModel = null;
		
		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(
						new FileInputStream(testFile), StandardCharsets.UTF_8))){
			String line = reader.readLine();
			while (line != null) {
				if (isEmptyLine(line)) {
					line = reader.readLine();
					continue;
				}
				medTestModel = getNextTestUnit(line, reader);
				testUnitList.add(medTestModel);
				line = reader.readLine();
			}
			log.info("Parsing done for the file:" + testFile.getName());
		} catch (IOException e) {
			log.error(e);
		}
		
		for (ParserTestModel parserTestModel : testUnitList) {
			long number = 0;
			try {
				number = Long.parseLong(parserTestModel.getTestNumber());
				TestUnit testUnit = testUnitLocalService.findTestUnitByNumberAndSpecializationId(number, specializationId);
				log.info("Found test unit with specializationId = " 
						+ specializationId + " and number = " 
						+ number +". Setting current as not actual and creating new one...");
				testUnit.setIsActual(false);
				Date now = new Date();
				testUnit.setModifiedDate(now);
				testUnitLocalService.updateTestUnit(testUnit);
				TestUnit newTestUnit = createTestUnit(number, specializationId, parserTestModel);
				createTestUnitAnswers(newTestUnit.getPrimaryKey(), parserTestModel);
			} catch (NumberFormatException e) {
				log.warn("Can not parse test unit number as long. Skipping...");
				continue;
			} catch (NoSuchTestUnitException e) {
				log.info("Test unit with specializationId = " 
						+ specializationId + " and number = " 
						+ number + " not found. Creating...");
				TestUnit newTestUnit = createTestUnit(number, specializationId, parserTestModel);
				createTestUnitAnswers(newTestUnit.getPrimaryKey(), parserTestModel);
			}
		}
	}
	
	private TestUnit createTestUnit(long number, long specializationId, ParserTestModel parserTestModel) {
		TestUnit newTestUnit = testUnitLocalService.createTestUnit(counterLocalService.increment(TestUnit.class.getName()));
		newTestUnit.setNumber(number);
		newTestUnit.setCode(parserTestModel.getTestCode());
		newTestUnit.setQuestionText(parserTestModel.getTestQuestion());
		newTestUnit.setSpecializationId(specializationId);
		newTestUnit.setQuestionType(1);
		newTestUnit.setIsActual(true);
		Date now = new Date();
		newTestUnit.setCreateDate(now);
		newTestUnit.setModifiedDate(now);
		testUnitLocalService.addTestUnit(newTestUnit);
		return newTestUnit;
	}
	
	private void createTestUnitAnswers(long testUnitId, ParserTestModel parserTestModel) {
		List<String> answers = parserTestModel.getTestAnswers();
		boolean isCorrect = true;
		for (String answer : answers) {
			TestUnitAnswer testUnitAnswer = testUnitAnswerLocalService.createTestUnitAnswer(
					counterLocalService.increment(TestUnitAnswer.class.getName()));
			testUnitAnswer.setTestUnitId(testUnitId);
			testUnitAnswer.setAnswerText(answer);
			testUnitAnswer.setAnswerType(1);
			testUnitAnswer.setIsCorrent(isCorrect);
			testUnitAnswerLocalService.addTestUnitAnswer(testUnitAnswer);
			
			if (isCorrect) {
				isCorrect = false;
			}
		}
	}
	
	private ParserTestModel getNextTestUnit(String currentLine, BufferedReader reader) throws IOException {
		String line = currentLine;
		log.info("Parsing the question with number:" + getQuestionNumber(line));
		ParserTestModel parserTestModel = new ParserTestModel();
		boolean questionReading = false;
		while (!isEmptyLine(line)) {
			if (isQuestionBegining(line)) {
				parserTestModel.setTestNumber(getQuestionNumber(line));
				parserTestModel.setTestCode(getQuestionCode(line));
				parserTestModel.setTestQuestion(line.replaceAll("^.*?\\]\\s", ""));
				questionReading = true;
				line = reader.readLine();
				continue;
			}
			if (!isAnswerBegining(line) && questionReading) {
				String tmp = parserTestModel.getTestQuestion();
				parserTestModel.setTestQuestion(tmp + " " + line.trim());
				line = reader.readLine();
				continue;
			}
			if (isAnswerBegining(line)) {
				questionReading = false;
				parserTestModel.addTextAnswer(line);
				line = reader.readLine();
				continue;
			}
			if (!isAnswerBegining(line) && !questionReading) {
				List<String> answerList = parserTestModel.getTestAnswers();
				String tmp = answerList.get(answerList.size() - 1);
				answerList.set(answerList.size() - 1, tmp + " " + line.trim());
				parserTestModel.setTestAnswers(answerList);
				line = reader.readLine();
				continue;
			}
		}
		return parserTestModel;
	}
	
	private boolean isQuestionBegining(String line) {
		Pattern p = Pattern.compile("^\\d{1,4}\\.");
		Matcher m = p.matcher(line);
		return m.find();
	}
	
	private String getQuestionNumber(String line) {
		Pattern p = Pattern.compile("^(\\d{1,4})\\.");
		Matcher m = p.matcher(line);
		if (m.find())
		{
		    return m.group(1);
		}
		return null;
	}
	
	private String getQuestionCode(String line) {
		Pattern p = Pattern.compile("\\[(.*?)\\]");
		Matcher m = p.matcher(line);
		if (m.find())
		{
		    return m.group(1);
		}
		return null;
	}
	
	private boolean isEmptyLine(String line) {
		return line.trim().isEmpty();
	}
	
	private boolean isAnswerBegining(String line) {
		Pattern p = Pattern.compile("^[¿¡¬√]\\)");
		Matcher m = p.matcher(line);
		return m.find();
	}

}