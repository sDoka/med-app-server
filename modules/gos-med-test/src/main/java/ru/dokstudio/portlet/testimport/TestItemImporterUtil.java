package ru.dokstudio.portlet.testimport;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.osgi.service.component.annotations.Component;
import ru.dokstudio.portlet.testimport.model.TestItemImportModel;

@Component
public class TestItemImporterUtil {
	private static final String QUESTION_KEY = "Q";
	private static final String ANSWER_KEY = "A";
	
	public static List<TestItemImportModel> importTestItems(File textFile) throws IOException {
		List<TestItemImportModel> test = new LinkedList<>();
		Scanner scanner = new Scanner(textFile);
		
		try {
			String questionContent, answerContent;
			boolean isQuestionLine = false;
			TestItemImportModel testItem = null;
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				if (line.startsWith(QUESTION_KEY)) {
					isQuestionLine = true;
					if(testItem != null) {
						test.add(testItem);
					}
					testItem = new TestItemImportModel();
					//this is a new question
					questionContent = line.substring(2, line.length());
					testItem.setQuestion(questionContent);
				} else if (line.startsWith(ANSWER_KEY)) {
					isQuestionLine = false;
					answerContent = line.substring(2, line.length());
					testItem.addAnswer(answerContent);
				} else {
					if (isQuestionLine) {
						questionContent = testItem.getQuestion() + " " + line;
						testItem.setQuestion(questionContent);
					} else {
						if (testItem != null) {
							answerContent = testItem.getLastAnswerContent();
							testItem.updateLastAnswerContent(answerContent);
						} else {
							continue;
						}
					}
				}				
			}
			test.add(testItem);
		} finally {
			scanner.close();
		}
		return test;
	}
}

