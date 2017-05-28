create index IX_8CB0FF6F on med_ApplicationUsage (deviceId);

create index IX_A5F7C280 on med_TestUnit (isActual, modifiedDate, specializationId);
create index IX_75777491 on med_TestUnit (number_, specializationId);
create index IX_830351A9 on med_TestUnit (specializationId);

create index IX_37EAC132 on med_TestUnitAnswer (testUnitId);

create index IX_E241226D on med_TestUnitAttempt (testUnitAnswerId);
create index IX_9DCA675D on med_TestUnitAttempt (userId, submitTime);

create index IX_5739450F on med_UserAccount (userId);