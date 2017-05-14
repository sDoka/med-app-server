create table gmt_TestItemAnswer (
	uuid_ VARCHAR(75) null,
	answerId LONG not null primary key,
	questionId LONG,
	answer VARCHAR(800) null,
	isCorrect BOOLEAN
);

create table gmt_TestItemAttempt (
	uuid_ VARCHAR(75) null,
	attemptId LONG not null primary key,
	questionId LONG,
	answerId LONG,
	isSuccessAttempt BOOLEAN,
	attemptDate DATE null
);

create table gmt_TestItemQuestion (
	uuid_ VARCHAR(75) null,
	questionId LONG not null primary key,
	questionNumber LONG,
	question VARCHAR(800) null,
	modifiedDate DATE null
);