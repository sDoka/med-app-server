package ru.dokstuduio.med.rest.usermanagment.model;

import com.liferay.portal.kernel.model.User;

public class ApplicationUser {

	long userId;
	String email;
	String userName;
	int userAccountTypeId;
	// stub fields
	long actualDeviceId = 1;
	long lastSynchronizationDateTime = 0;
	
	public ApplicationUser(User user) {
		this.userId = user.getUserId();
		this.userName = user.getFirstName();
		this.email = user.getEmailAddress();
		//TODO implement device binding and synchronization upd
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\"userId\":\"");
		builder.append(userId);
		builder.append("\",\"email\":\"");
		builder.append(email);
		builder.append("\",\"userName\":\"");
		builder.append(userName);
		builder.append("\",\"userAccountTypeId\":\"");
		builder.append(userAccountTypeId);
		builder.append("\",\"actualDeviceId\":\"");
		builder.append(actualDeviceId);
		builder.append("\",\"lastSynchronizationDate\":\"");
		builder.append(lastSynchronizationDateTime);
		builder.append("\"}");
		return builder.toString();
	}
	
}
