DROP table IF EXISTS departamentos;

create table departamentos(
    codigo int auto_increment primary key,
    nombre varchar(250),
    presupuesto int
);

DROP table IF EXISTS empleado;

create table empleado(
    id int auto_increment primary key,
    nombre varchar(250),
    apellido varchar(250),
    dni varchar(9),
    departamento int,
    FOREIGN KEY (departamento) REFERENCES departamentos(codigo)
);
insert into departamentos(nombre,presupuesto) values('departamento1',500);
insert into departamentos(nombre,presupuesto) values('departamento2',300);
insert into departamentos(nombre,presupuesto) values('departamento3',700);
insert into departamentos(nombre,presupuesto) values('departamento4',1200);
insert into departamentos(nombre,presupuesto) values('departamento5',1500);

insert into empleado (nombre, apellido,dni,departamento) values('Jose','Marin',123456789,1);
insert into empleado (nombre, apellido,dni,departamento) values('Juan','Lopez',122222222,2);
insert into empleado (nombre, apellido,dni,departamento) values('Pedro','Guillem',123333333, 3);
insert into empleado (nombre, apellido,dni,departamento) values('Jordi','Martin',123444444, 4);
insert into empleado (nombre, apellido,dni,departamento) values('Jonatan','Vicente',123455555, 5);