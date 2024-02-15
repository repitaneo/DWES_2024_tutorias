insert into curso (nombre) values ('1A');
insert into curso (nombre) values ('1B');
insert into curso (nombre) values ('2A');
insert into curso (nombre) values ('2B');
insert into curso (nombre) values ('3A');
insert into curso (nombre) values ('3B');
insert into curso (nombre) values ('4A');


insert into plan (nombre) values ('P2023-2024-1A');
insert into plan (nombre) values ('P2023-2024-1B');
insert into plan (nombre) values ('P2023-2024-2A');
insert into plan (nombre) values ('P2023-2024-2B');
insert into plan (nombre,FK_CURSO) values ('P2023-2024-3A','1A');
insert into plan (nombre,FK_CURSO) values ('P2023-2024-3B','1B');

insert into tutor (nombre,email) values ('Marcos','marcos@educastur.org');
insert into tutor (nombre,email) values ('Javier','javier@educastur.org');
insert into tutor (nombre,email,plan) values ('Maria','maria@educastur.org',3);
insert into tutor (nombre,email,plan) values ('Marta','marta@educastur.org',4);
insert into tutor (nombre,email,plan) values ('Pedro','pedro@educastur.org',5);
insert into tutor (nombre,email,plan) values ('Lucia','lucia@educastur.org',6);

insert into usuario (usuario,password) values ('marcos','$2a$12$3fP2T8dyuujgKtm9Qi.W7.zMN510cFRL0jAdtZkK9IfUr8SMMF6ia');
insert into usuario (usuario,password) values ('ana','$2a$12$dNT6qgMwF69SG05oY6PKR.QYtMN366c0yllke4d6n9wwuEtg4JcPS');

insert into actividad (obligatoria,nombre,descripcion) values (true,'Presentación','Enseñar a presentarse');
insert into actividad (obligatoria,nombre,descripcion) values (true,'Despedida','Enseñar a despedirse');
insert into actividad (obligatoria,nombre,descripcion) values (true,'Jugar','Enseñar a jugar');
insert into actividad (obligatoria,nombre,descripcion) values (true,'Pintar','Enseñar a pintar');

insert into enmarca (plan_id, actividad_id,fecha) values (1,1,'hoy');
insert into enmarca (plan_id, actividad_id,fecha) values (1,2,'hoy');
insert into enmarca (plan_id, actividad_id,fecha) values (2,1,'hoy');
insert into enmarca (plan_id, actividad_id,fecha) values (2,2,'hoy');








