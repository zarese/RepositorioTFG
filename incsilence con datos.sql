
drop database incsilence
create database incsilence



create table clientes(
	id_cliente int primary key auto_increment,
    dni_cif varchar(10) unique not null,
	nombre varchar(20) not null,
	apellidos varchar (25) not null,
	email varchar(20) not null,
	direccion_cliente varchar(30) not null,
	direccion2_cliente varchar(30) null,
	telefono int not null
);
create table trabajadores(
	id_trabajador int primary key auto_increment,
	nombre varchar(20) not null,
	dni varchar(10) unique not null,
	puesto varchar(20) not null,
	apellidos varchar (25) not null,
	email varchar(30) not null,
    estado varchar(20) not null,
	telefono int not null
);
create table suelos(
	id_suelo int primary key auto_increment,
	tipo varchar(30) not null,
	instalacion varchar(20) not null,
	compatibilidad_rad varchar(2) not null,
	color varchar(20) not null,
	material varchar(20) not null,
	acabado varchar(20) not null,
	precio double not null,
	img varchar(60)
);
create table pinturas(
	id_pintura int primary key auto_increment,
    color varchar(20) not null,
    tipo varchar(20) not null,
    lugar varchar(35) not null,
    stock int not null,
    precio double not null,
    img varchar(60)
);
create table rodapies(
    id_rodapie int primary key auto_increment,
    color varchar(30) not null,
    acabado varchar(30) not null,
    medidas varchar(20) not null,
    precio int not null,
    stock int not null,
    img varchar(60)
);
create table administradores(
	id_admin int primary key auto_increment,
    username varchar(10) not null unique,
    password varchar (70) not null,
    trabajador_id int not null
);
create table citas(
id_citas int primary key auto_increment,
trabajador_id int not null,
cliente_id int not null,
motivo varchar(700) not null,
direccion int not null,
interes_pintura int,
interes_suelo int,
interes_rodapie int,
fecha date not null
);

/*------------------------------------------------------------------------------------------------------------------------------------------------------------*/

alter table citas add constraint fk_trabajador_id foreign key (trabajador_id) references trabajadores(id_trabajador);
alter table citas add constraint fk_cliente_id foreign key (cliente_id) references clientes(id_cliente);
alter table citas add constraint fk_suelo_id foreign key (interes_suelo) references suelos(id_suelo);
alter table citas add constraint fk_pintura_id foreign key (interes_pintura) references pinturas(id_pintura);
alter table citas add constraint fk_rodapie_id foreign key (interes_rodapie) references rodapies(id_rodapie);
alter table administradores add constraint fk_administrador_trabajador foreign key (trabajador_id) references trabajadores(id_trabajador);

/*------------------------------------------------------------------------------------------------------------------------------------------------------------*/

insert into clientes (dni_cif, nombre, apellidos, email, direccion_cliente, direccion2_cliente, telefono) values('04648001x','Manolo','Sanz de la Serna','manolo@gmail.com','calle Flora Tristán 3, 9B','',601091042);
insert into clientes (dni_cif, nombre, apellidos, email, direccion_cliente, direccion2_cliente, telefono) values('03075162Y','Manuel','Ruiz Pérez','manuel@gmail.co','calle de la Unanimidad 12, 2C','calle de la Dulzura 2, 3B',696091042);
insert into clientes (id_cliente,dni_cif, nombre, apellidos, email, direccion_cliente, direccion2_cliente, telefono) values(3,'03764023V','Alba','Rubio Urquijo','albus@gmail.com','calle Carmen de Burgos 5, 4A','',601052042);
update clientes set direccion2_cliente='calle Miraflores 2,3D' where id_cliente = 3;
insert into clientes (dni_cif, nombre, apellidos, email, direccion_cliente, direccion2_cliente, telefono) values('09845204X','Claudia','Urbina Gómez','claurbi@gmail.com','calle Carmen de Burgos 5, 2B','',698246832);
insert into clientes (dni_cif, nombre, apellidos, email, direccion_cliente, direccion2_cliente, telefono) values('05821328x','Celia','Gómez Benito','celigo@gmail.com','calle de la Alianza 8,3BB','',722658234);
delete from clientes where id_cliente=6;
insert into clientes (id_cliente,dni_cif, nombre, apellidos, email, direccion_cliente, direccion2_cliente, telefono) values(6,'08529135Z','Martín','Pérez Castro','martin@gmail.com','calle de la Concordia 15,3B','',658458234);
/*------------------------------------------------------------------------------------------------------------------------------------------------------------*/

insert into trabajadores ( nombre, apellidos, dni, puesto, email, estado, telefono) values ('Pablo','Sánchez Roldán','02592690S','propietario/jefe','pablosanrol@gmail.com','activo', 619114217);
insert into trabajadores ( nombre, apellidos, dni, puesto, email, estado, telefono) values ('Antonio','del Castillo Collado','04834860A','jefe de reformas','antoca@gmai.com','activo', 637511781 );
insert into trabajadores ( nombre, apellidos, dni, puesto, email, estado, telefono) values ('María del Carmen','Martín González','05397486W','gestora del almacén','marimartin@gmail.com','activo',711116371 );
insert into trabajadores ( nombre, apellidos, dni, puesto, email, estado, telefono) values ('Milagros','Castro Urbina','03685428D','obrero','milurba@gmail.com','activo', 693411121 );
insert into trabajadores ( nombre, apellidos, dni, puesto, email, estado, telefono) values ('Ignacio','Rodríguez de la Villa','09812452G','obrero','nachovi@gmail.com','de baja', 614682181 );

/*------------------------------------------------------------------------------------------------------------------------------------------------------------*/

insert into pinturas (color, tipo, lugar,stock,precio,img) values('azul polinesia','impermeabilizante','piscinas',72,22.90,'./../../assets/pinturas/id_1_color.png') ;
insert into pinturas (color, tipo, lugar,stock,precio,img) values('rojo','impermeabilizante','terrazas',22,84.90,'./../../assets/pinturas/id_2_color.png') ;
insert into pinturas (color, tipo, lugar,stock,precio,img) values('blanco','impermeabilizante','terrazas',82,84.90,'./../../assets/pinturas/id_3_color.png') ;
insert into pinturas (color, tipo, lugar,stock,precio,img) values('rojo','normal','suelos exteriores e interiores',72,85.90,'./../../assets/pinturas/id_4_color.png') ;
insert into pinturas (color, tipo, lugar,stock,precio,img) values('gris','impermeabilizante','suelos exteriores e interiores',15,80.71,'./../../assets/pinturas/id_5_color.png') ;
insert into pinturas (color, tipo, lugar,stock,precio,img) values('verde','normal','suelos',115,180.71,'./../../assets/pinturas/id_6_color.png') ;
insert into pinturas (color, tipo, lugar,stock,precio,img) values('blanco mate','antimanchas','paredes',8,108.50,'./../../assets/pinturas/id_7_color.png') ;
insert into pinturas (color, tipo, lugar,stock,precio,img) values('azul cielo','antimanchas','paredes',98,85.50,'./../../assets/pinturas/id_8_color.png') ;
insert into pinturas (color, tipo, lugar,stock,precio,img) values('gris','antimanchas','paredes',64,85.50,'./../../assets/pinturas/id_9_color.png') ;
insert into pinturas (color, tipo, lugar,stock,precio,img) values('blanco plastico','impermeabilizante','fachadas',64,85.50,'./../../assets/pinturas/id_10_color.png') ;

/*------------------------------------------------------------------------------------------------------------------------------------------------------------*/

INSERT INTO suelos(tipo,instalacion,compatibilidad_rad,color,material,acabado,precio,img) VALUES('parquet','clic o cola blanc','si','marrón oscuro','roble','aceitado',5.99,'./../../assets/suelos/id_1_suelo.png');

INSERT INTO suelos(tipo,instalacion,compatibilidad_rad,color,material,acabado,precio,img) VALUES('parquet','clic o cola blanc','si','negro','roble','aceitado',5.99,'./../../assets/suelos/id_2_suelo.png');
update suelos set compatibilidad_rad ='no' where id_suelo=2;

INSERT INTO suelos(tipo,instalacion,compatibilidad_rad,color,material,acabado,precio,img) VALUES('vinilo','clic','si','negro','pizarra','mate',8.99,'./../../assets/suelos/id_3_suelo.png');
INSERT INTO suelos(tipo,instalacion,compatibilidad_rad,color,material,acabado,precio,img) VALUES('laminado','clic','si','blanco','pino','semi-mate',5.99,'./../../assets/suelos/id_4_suelo.png');
INSERT INTO suelos(tipo,instalacion,compatibilidad_rad,color,material,acabado,precio,img) VALUES('laminado','clic','si','marrón oscuro','roble','mate',6.99,'./../../assets/suelos/id_5_suelo.png');
INSERT INTO suelos(tipo,instalacion,compatibilidad_rad,color,material,acabado,precio,img) VALUES('laminado','clic','si','beige','pino','mate',4.99,'./../../assets/suelos/id_6_suelo.png');
INSERT INTO suelos(tipo,instalacion,compatibilidad_rad,color,material,acabado,precio,img) VALUES('vinilo','clic','si','gris claro','cemento','mate',5.99,'./../../assets/suelos/id_7_suelo.png');
INSERT INTO suelos(tipo,instalacion,compatibilidad_rad,color,material,acabado,precio,img) VALUES('vinilo','clic','si','madera natural','castaño','mate',7.99,'./../../assets/suelos/id_8_suelo.png');
delete from suelos where id_suelo=9;
INSERT INTO suelos(tipo,instalacion,compatibilidad_rad,color,material,acabado,precio,img) VALUES('vinilo','clic','si','madera natural','roble','mate',8.99,'./../../assets/suelos/id_9_suelo.png');
INSERT INTO suelos(tipo,instalacion,compatibilidad_rad,color,material,acabado,precio,img) VALUES('vinilo','clic','si','gris claro','cemento','semi-mate',8.99,'./../../assets/suelos/id_10_suelo.png');

/*------------------------------------------------------------------------------------------------------------------------------------------------------------*/

INSERT INTO rodapies(color,acabado,medidas,precio,stock,img)VALUES('roble','revestido de melamina','2240x70x10mm',4.70,110,'./../../assets/rodapies/id_1_rodapie.png');
INSERT INTO rodapies(color,acabado,medidas,precio,stock,img)VALUES('sanremo','revestido de melamina','2240x70x10mm','6.70',110,'./../../assets/rodapies/id_2_rodapie.png');
INSERT INTO rodapies(color,acabado,medidas,precio,stock,img)VALUES('sapelly','revestido de melamina','2240x70x10mm',4.50,110,'./../../assets/rodapies/id_3_rodapie.png');
INSERT INTO rodapies(color,acabado,medidas,precio,stock,img)VALUES('roble palo','revestido de melamina','2240x70x11mm',4.70,110,'./../../assets/rodapies/id_4_rodapie.png');
INSERT INTO rodapies(color,acabado,medidas,precio,stock,img)VALUES('nogal','revestido de melamina','2240x70x11mm',8.00,110,'./../../assets/rodapies/id_5_rodapie.png');
INSERT INTO rodapies(color,acabado,medidas,precio,stock,img)VALUES('roble claro','revestido de melamina','2200x80x10mm',6.80,110,'./../../assets/rodapies/id_6_rodapie.png');
INSERT INTO rodapies(color,acabado,medidas,precio,stock,img)VALUES('roble seco','revestido de melamina','2200x80x10mm',4.70,110,'./../../assets/rodapies/id_7_rodapie.png');
INSERT INTO rodapies(color,acabado,medidas,precio,stock,img)VALUES('blanco','revestido de melamina','2240x70x10mm',4.50,110,'./../../assets/rodapies/id_8_rodapie.png');
INSERT INTO rodapies(color,acabado,medidas,precio,stock,img)VALUES('blanco','revestido de melamina','2240x70x10mm',6.20,110,'./../../assets/rodapies/id_9_rodapie.png');

/*------------------------------------------------------------------------------------------------------------------------------------------------------------*/

INSERT INTO administradores(username,password,trabajador_id) VALUES('admin','ywefuasdvfkwvfgwvfjgwvejfygvwjegfvahjsdcaqgvchkacqefqdeq',1);
INSERT INTO administradores(username,password,trabajador_id) VALUES('jefe','wbflwbefiweflkbwelfbwefbwhbfwwwelfwhbehj%&&%$ffFGRDDFFFF',2);
INSERT INTO administradores(username,password,trabajador_id) VALUES('gestora','wbflwbefiweflkbwelfbwefbwhbfwwwelfwhbehjvahjsdcaqgqefqdeq',3);

/*------------------------------------------------------------------------------------------------------------------------------------------------------------*/

INSERT INTO citas(trabajador_id,cliente_id,motivo,direccion,interes_pintura,interes_suelo,interes_rodapie,fecha)VALUES(1,1,'el cliente necesita tapar una mancha en la pared y cambiar el suelo',1,1,1,1,31/11/2021);
INSERT INTO citas(trabajador_id,cliente_id,motivo,direccion,interes_pintura,interes_suelo,interes_rodapie,fecha)VALUES(1,2,'cambio de suelo de la cocina, el cliente pide que sean balsosas, ya que las anteriores estan levantadas por el paso del tiempo y la humedad, la sperficie a rellena es de 22 m2',1,null,3,1,25/10/2021)
