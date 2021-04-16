create database comsatelbasictodo;
use comsatelbasictodo;

create table tarea(
	id		int				auto_increment,
    tarea	varchar(300)	not null,
    estado	int				not null,
    PRIMARY KEY (id)
);



