package ru.dokstudio.med.parser;

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
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

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
	
	@Override
	public void uploadNewSpecializationTest(long specializationId, File testFile) {
		log.info("Tip: in input file test units must be separate from each other with empty strings.");
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