create index IX_1046ECAF on gmt_TestItemAnswer (questionId);
create index IX_BE768E9A on gmt_TestItemAnswer (uuid_[$COLUMN_LENGTH:75$]);

create index IX_9DF6A92 on gmt_TestItemAttempt (questionId);
create index IX_B7E9AED7 on gmt_TestItemAttempt (uuid_[$COLUMN_LENGTH:75$]);

create index IX_8F1AAB05 on gmt_TestItemQuestion (questionNumber);
create index IX_514A0CF2 on gmt_TestItemQuestion (uuid_[$COLUMN_LENGTH:75$]);