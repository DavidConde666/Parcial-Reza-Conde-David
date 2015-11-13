create table reservacion(
id_reservacion integer primary key auto_increment, 
nombre varchar(120), 
apellido_paterno varchar(120),
email varchar(120)
);

create table destino(
id_destino integer primary key auto_increment,
id_reservacion integer,
ciudad varchar(120),
hotel varchar(120),
num_personas int,
constraint fk_id_reservacion foreign key (id_reservacion) references reservacion(id_reservacion)
);

create table tarjeta(
id_tarjeta integer primary key auto_increment,
id_reservacion integer,
nombre_tarjeta varchar (120),
saldo float,
numero_tarjeta integer,
constraint fk_id_reservacion_tarjeta foreign key (id_reservacion) references reservacion(id_reservacion)
);
