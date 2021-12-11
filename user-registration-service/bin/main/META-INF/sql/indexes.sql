create index IX_B50E9534 on FOO_Registration (email[$COLUMN_LENGTH:300$]);
create index IX_D6F0D295 on FOO_Registration (name[$COLUMN_LENGTH:300$], email[$COLUMN_LENGTH:300$]);
create index IX_AA71970C on FOO_Registration (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_54C708E on FOO_Registration (uuid_[$COLUMN_LENGTH:75$], groupId);