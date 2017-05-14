package ru.dokstudio.med.parser.api;

import java.io.File;

public interface TestFileParserApi {
	public void uploadNewSpecializationTest(long specializationId, File testFile);
}