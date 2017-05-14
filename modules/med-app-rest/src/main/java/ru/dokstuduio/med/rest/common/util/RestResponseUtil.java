package ru.dokstuduio.med.rest.common.util;

import ru.dokstuduio.med.rest.common.constants.ResponseCodes;

public class RestResponseUtil {

	private static final String SUCCESS_STATUS = "success";
	private static final String ERROR_STATUS = "error";
	
	private long responseCode;
	private String responseStatus;
	private String responseBody;
	
	private RestResponseUtil(long responseCode, String responseStatus, String responseBody) {
		this.responseCode = responseCode;
		this.responseStatus = responseStatus;
		this.responseBody = responseBody;
	}
	
	public static String createSuccessResponse(String responseBody) {
		return new RestResponseUtil(ResponseCodes.OK, SUCCESS_STATUS, responseBody).toString();
	}
	
	public static String createErrorResponse(long errorCode, String responseBody) {
		return new RestResponseUtil(errorCode, ERROR_STATUS, responseBody).toString();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\"responseCode\":\"");
		builder.append(responseCode);
		builder.append("\",\"responseStatus\":\"");
		builder.append(responseStatus);
		builder.append("\",\"responseBody\":\"");
		builder.append(responseBody);
		builder.append("\"}");
		return builder.toString();
	}
	
	
}
