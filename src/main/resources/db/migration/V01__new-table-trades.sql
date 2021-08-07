create table trade (
	id integer GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	exp_difference integer not null,
	first_list text not null,
	second_list text not null,
	user_name varchar(20) not null,
	verdict varchar(15) not null
);