package ru.dokstuduio.med.rest.synchronization.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import ru.dokstrudio.med.srv.model.TestUnit;
import ru.dokstrudio.med.srv.model.TestUnitAnswer;

public class TestUnitList {
	List<TestUnit> testUnitList;
	HashMap<Long, List<TestUnitAnswer>> testUnitAnswers;
	
	public TestUnitList (List<TestUnit> testUnitList) {
		this.testUnitList = testUnitList;
		this.testUnitAnswers = new HashMap<Long, List<TestUnitAnswer>>();
		for (TestUnit testUnit : testUnitList) {
			this.testUnitAnswers.put(testUnit.getTestUnitId(), new ArrayList<TestUnitAnswer>());
		}
	}
	
	public void addTestUnitAnswer(Long testUnitId, TestUnitAnswer testUnitAnswer) {
		List<TestUnitAnswer> testUnitAnswers = this.testUnitAnswers.get(testUnitId);
		testUnitAnswers.add(testUnitAnswer);
	}
	
	public void addTestUnitAnswerList(Long testUnitId, List<TestUnitAnswer> testUnitAnswer) {
		this.testUnitAnswers.put(testUnitId, testUnitAnswer);
	}
	
	public String getIdsAsString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\"removedTestUnitIds\":[");
		for (TestUnit testUnit : testUnitList) {
			builder.append("{\"testUnitId\":\"");
			builder.append(testUnit.getTestUnitId());
			builder.append("\"},");
		}
		if (testUnitList.size() > 0) {
			builder.deleteCharAt(builder.length() - 1);
		}
		builder.append("]}");
		return builder.toString();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\"modifiedTestUnits\":[");
		for (TestUnit testUnit : testUnitList) {
			builder.append("{\"testUnitId\":\"");
			builder.append(testUnit.getTestUnitId());
			builder.append("\",\"testUnitNumber\":\"");
			builder.append(testUnit.getNumber());
			builder.append("\",\"testUnitCode\":\"");
			builder.append(testUnit.getCode());
			builder.append("\",\"testUnitSpecializationId\":\"");
			builder.append(testUnit.getSpecializationId());
			builder.append("\",\"testUnitText\":\"");
			builder.append(testUnit.getQuestionText());
			builder.append("\",\"testUnitType\":\"");
			builder.append(testUnit.getQuestionType());
			builder.append("\",\"testUnitDLFileEntryId\":\"");
			builder.append(testUnit.getQuestionDlFileEntryId());
			builder.append("\",\"testUnitCreateDate\":\"");
			builder.append(testUnit.getCreateDate());
			builder.append("\",\"testUnitModifiedDate\":\"");
			builder.append(testUnit.getModifiedDate());
			builder.append("\",\"testUnitAnswers\":");
			builder.append("[");
			for (TestUnitAnswer testUnitAnswer : this.testUnitAnswers.get(testUnit.getTestUnitId())) {
				builder.append("{\"testUnitAnswerId\":\"");
				builder.append(testUnitAnswer.getTestUnitAnswerId());
				builder.append("\",\"testUnitId\":\"");
				builder.append(testUnit.getTestUnitId());
				builder.append("\",\"testUnitAnswerText\":\"");
				builder.append(testUnitAnswer.getAnswerText());
				builder.append("\",\"testUnitAnswerType\":\"");
				builder.append(testUnitAnswer.getAnswerType());
				builder.append("\",\"testUnitAnswerDLFileEntryId\":\"");
				builder.append(testUnitAnswer.getAnswerDlFileEntryId());
				builder.append("\",\"testUnitAnswerIsCorrect\":\"");
				builder.append(testUnitAnswer.getIsCorrent());
				builder.append("\"},");
			}
			if (this.testUnitAnswers.get(testUnit.getTestUnitId()).size() > 0) {
				builder.deleteCharAt(builder.length() - 1);
			}
			builder.append("]},");
		}
		if (testUnitList.size() > 0) {
			builder.deleteCharAt(builder.length() - 1);
		}
		builder.append("]}");
		return builder.toString();
	}
}
