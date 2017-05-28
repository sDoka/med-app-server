package ru.dokstuduio.med.rest.synchronization.model;

import java.util.List;

import ru.dokstrudio.med.srv.model.TestUnitSpecialization;
import ru.dokstrudio.med.srv.model.UserAccount;

public class UserAccountList {
	private List<UserAccount> userAccountList;
	
	public UserAccountList(List<UserAccount> userAccountList) {
		this.userAccountList = userAccountList;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\"userAccounts\":[");
		for (UserAccount userAccount : userAccountList) {
			builder.append("{\"userAccountId\":\"");
			builder.append(userAccount.getAccountTypeId());
			builder.append("\",\"activationDate\":\"");
			builder.append(userAccount.getActivationDate());
			builder.append("\",\"expirationDate\":\"");
			builder.append(userAccount.getExpirationDate());
			builder.append("\"},");
		}
		if (userAccountList.size() > 0) {
			builder.deleteCharAt(builder.length() - 1);
		}
		builder.append("]}");
		return builder.toString();
	}
}
