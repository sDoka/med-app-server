package ru.dokstudio.portlet.testimport.model;

import java.util.ArrayList;
import java.util.List;

public class TestItemImportModel {
	private long questionNumber;
	private String question = "";
	private List<String> answers = new ArrayList<>();
	
	public void setQuestion(String question) {
		this.question = question;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}

	public String getQuestion() {
		return question;
	}

	public List<String> getAnswers() {
		return answers;
	}
	
	public void addAnswer(String answer) {
		answers.add(answer);
	}

	public long getQuestionNumber() {
		return questionNumber;
	}

	public void setQuestionNumber(long questionNumber) {
		this.questionNumber = questionNumber;
	}
	
	public String getLastAnswerContent() {
		return answers.get(answers.size() - 1);
	}
	
	public void updateLastAnswerContent(String answerContent) {
		answers.remove(answers.size() - 1);
		answers.add(answerContent);
	}
}
