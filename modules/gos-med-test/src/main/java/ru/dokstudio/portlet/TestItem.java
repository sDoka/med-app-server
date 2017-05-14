package ru.dokstudio.portlet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ru.dokstudio.model.TestItemAnswer;
import ru.dokstudio.model.TestItemQuestion;

public class TestItem {
	TestItemQuestion question;
	List<TestItemAnswer> answers;

	public TestItem(TestItemQuestion question, List<TestItemAnswer> answers) {
		this.question = question;
		this.answers = new ArrayList<>(answers);
		Collections.shuffle(this.answers);
	}

	public TestItemQuestion getQuestion() {
		return question;
	}

	public List<TestItemAnswer> getAnswers() {
		return answers;
	}
}
