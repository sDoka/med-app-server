create table med_ApplicationAccount (
	accountTypeId LONG not null primary key,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	durationDays LONG
);

create table med_ApplicationUsage (
	applicationUserId LONG not null primary key,
	userId LONG,
	ipAddress VARCHAR(75) null,
	deviceId LONG,
	actionType INTEGER,
	actionTime DATE null
);

create table med_TestUnit (
	testUnitId LONG not null primary key,
	number_ LONG,
	code_ VARCHAR(75) null,
	specializationId LONG,
	questionText VARCHAR(2000) null,
	questionType INTEGER,
	questionDlFileEntryId LONG,
	isActual BOOLEAN,
	createDate DATE null,
	modifiedDate DATE null
);

create table med_TestUnitAnswer (
	testUnitAnswerId LONG not null primary key,
	testUnitId LONG,
	answerText VARCHAR(2000) null,
	answerType INTEGER,
	answerDlFileEntryId LONG,
	isCorrent BOOLEAN
);

create table med_TestUnitAttempt (
	testUnitAttemptId LONG not null primary key,
	userId LONG,
	testUnitId LONG,
	testUnitAnswerId LONG,
	submitTime DATE null
);

create table med_TestUnitSpecialization (
	specializationId LONG not null primary key,
	nameLocalizationKey VARCHAR(75) null,
	specialiationIcon VARCHAR(75) null
);

create table med_UserAccount (
	userId LONG not null,
	accountTypeId LONG not null,
	activationDate DATE null,
	expirationDate DATE null,
	primary key (userId, accountTypeId)
);

create table med_UserDevice (
	deviceId LONG not null primary key,
	userId LONG,
	deviceTypeId INTEGER,
	deviceKey VARCHAR(75) null,
	operatingSystem VARCHAR(75) null
);