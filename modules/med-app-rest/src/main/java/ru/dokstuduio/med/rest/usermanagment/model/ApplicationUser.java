package ru.dokstuduio.med.rest.usermanagment.model;

import java.util.Date;

import com.liferay.portal.kernel.model.User;

public class ApplicationUser {

	long userId;
	String email;
	String userName;
	int userAccountTypeId;
	long actualDeviceId;
	Date lastSynchronizationDate;
	
	public ApplicationUser(User user) {
		this.userId = user.getUserId();
		this.userName = user.getFirstName();
		this.email = user.getEmailAddress();
		//TODO implement device binding and synchronization upd
		this.actualDeviceId = 1;
		this.lastSynchronizationDate = new Date();
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
		builder.append(lastSynchronizationDate);
		builder.append("\"}");
		return builder.toString();
	}
	
}
