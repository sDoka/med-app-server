package ru.dokstuduio.med.rest.synchronization.model;

import java.util.List;

import ru.dokstrudio.med.srv.model.TestUnit;
import ru.dokstrudio.med.srv.model.TestUnitAttempt;

public class TestUnitAttemptList {
	private List<TestUnitAttempt> testUnitAttemptList;
	
	public TestUnitAttemptList(List<TestUnitAttempt> testUnitAttemptList) {
		this.testUnitAttemptList = testUnitAttemptList;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\"testUnitAttempts\":[");
		for (TestUnitAttempt testUnitAttempt : testUnitAttemptList) {
			builder.append("{\"testUnitAttemptId\":\"");
			builder.append(testUnitAttempt.getTestUnitAttemptId());
			builder.append("\",\"testUnitId\":\"");
			builder.append(testUnitAttempt.getTestUnitId());
			builder.append("\",\"testUnitAnswerId\":\"");
			builder.append(testUnitAttempt.getTestUnitAnswerId());
			builder.append("\",\"testUnitAttemptSubmitTime\":\"");
			builder.append(testUnitAttempt.getSubmitTime().getTime()/1000);
			builder.append("\"},");
		}
		if (testUnitAttemptList.size() > 0) {
			builder.deleteCharAt(builder.length() - 1);
		}
		builder.append("]}");
		return builder.toString();
	}
}
