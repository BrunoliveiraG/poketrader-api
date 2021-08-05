create table trade (
	id serial bigint not null primary key,
	exp_difference bigint not null,
	verdict varchar(15) not null
);