create table trade (
	id bigint auto_increment not null,
	exp_difference bigint not null,
	verdict varchar(15) not null,

	primary key (id)
);