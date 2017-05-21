package ru.dokstuduio.med.rest.common.constants;

public enum AccountTypes {
	FREE_ACCOUNT(0, "free-account"), PREMIUM_ACCOUNT(1, "premium-account");

	int accountTypeId;
	String localizationKey;

	private AccountTypes(int accountTypeId, String localizationKey) {
		this.accountTypeId = accountTypeId;
		this.localizationKey = localizationKey;
	}

	public int getAccountTypeId() {
		return accountTypeId;
	}

	public String getLocalizationKey() {
		return localizationKey;
	}

	public AccountTypes getAccountTypeById(int accountTypeId) {

		for (AccountTypes accountType : AccountTypes.values()) {
			if (accountType.getAccountTypeId() == accountTypeId) {
				return accountType;
			}
		}
		return FREE_ACCOUNT;
	}
}
