package ru.dokstuduio.med.rest.synchronization.model;

import java.util.List;

import ru.dokstrudio.med.srv.model.TestUnitSpecialization;

public class SpecializationList {
	private List<TestUnitSpecialization> specializationList;
	
	public SpecializationList(List<TestUnitSpecialization> specializationList) {
		this.specializationList = specializationList;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\"specializations\":[");
		for (TestUnitSpecialization specialization : specializationList) {
			builder.append("{\"specializationId\":\"");
			builder.append(specialization.getSpecializationId());
			builder.append("\",\"nameLocalizationKey\":\"");
			//TODO: get localization by key
			builder.append(specialization.getNameLocalizationKey());
			builder.append("\",\"specializationIcon\":\"");
			builder.append(specialization.getSpecializationIcon());
			builder.append("\"},");
		}
		if (specializationList.size() > 0) {
			builder.deleteCharAt(builder.length() - 1);
		}
		builder.append("]}");
		return builder.toString();
	}
}
