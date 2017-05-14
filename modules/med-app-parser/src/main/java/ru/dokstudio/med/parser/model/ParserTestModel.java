package ru.dokstudio.med.parser.model;

import java.util.ArrayList;
import java.util.List;

public class ParserTestModel {
	private String testNumber;
	private String testCode;
	private String testQuestion;
	private List<String> testAnswers;
	
	public ParserTestModel() {
		this.testAnswers = new ArrayList<String>();
	}

	public String getTestNumber() {
		return testNumber;
	}

	public void setTestNumber(String testNumber) {
		this.testNumber = testNumber;
	}

	public String getTestCode() {
		return testCode;
	}

	public void setTestCode(String testCode) {
		this.testCode = testCode;
	}

	public String getTestQuestion() {
		return testQuestion;
	}

	public void setTestQuestion(String testQuestion) {
		this.testQuestion = testQuestion;
	}

	public List<String> getTestAnswers() {
		return testAnswers;
	}

	public void setTestAnswers(List<String> testAnswers) {
		this.testAnswers = testAnswers;
	}
	
	public void addTextAnswer(String testAnswer) {
		this.testAnswers.add(testAnswer);
	}
}
