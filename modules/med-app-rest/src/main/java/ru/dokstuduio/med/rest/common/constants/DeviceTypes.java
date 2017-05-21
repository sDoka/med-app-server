package ru.dokstuduio.med.rest.common.constants;

public enum DeviceTypes {
	SMART_PHONE(0, "smartphone"), TABLET(1, "tablet");

	int deviceTypeId;
	String localizationKey;

	private DeviceTypes(int deviceTypeId, String localizationKey) {
		this.deviceTypeId = deviceTypeId;
		this.localizationKey = localizationKey;
	}

	public int getDeviceTypeId() {
		return deviceTypeId;
	}

	public String getLocalizationKey() {
		return localizationKey;
	}

	public DeviceTypes getDeviceTypeById(int deviceTypeId) {

		for (DeviceTypes deviceType : DeviceTypes.values()) {
			if (deviceType.getDeviceTypeId() == deviceTypeId) {
				return deviceType;
			}
		}
		return SMART_PHONE;
	}
}
