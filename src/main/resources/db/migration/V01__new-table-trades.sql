create table trade (
	id bigint auto_increment not null,
	exp_difference bigint not null,
	first_list text not null,
	second_list text not null,
	user_name varchar(20) not null,
	verdict varchar(15) not null,

	primary key (id)
);