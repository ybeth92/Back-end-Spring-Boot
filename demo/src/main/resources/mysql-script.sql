create database comsatelbasictodo;
use comsatelbasictodo;

create table tarea(
    id		int				auto_increment,
    tarea	varchar(300)	not null,
    estado	varchar(100)	not null,
    PRIMARY KEY (id)
);

insert into tarea (tarea, estado) value('Reunión Diearia | 5:40', 'FINALIZADO');


