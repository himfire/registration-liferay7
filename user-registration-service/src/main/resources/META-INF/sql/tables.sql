create table FOO_Registration (
	uuid_ VARCHAR(75) null,
	registrationId LONG not null primary key,
	name VARCHAR(300) null,
	email VARCHAR(300) null,
	phone VARCHAR(75) null,
	address VARCHAR(500) null,
	city VARCHAR(300) null,
	country LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);