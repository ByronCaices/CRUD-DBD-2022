insert into administrador (email,clave,nombre ,apellido)
values
('kennetherickson@outlook.edu ','Kenneth12Erickson','Kenneth '  , 'Erickson'),
('grahamyang4286@aol.org ','Graham21 ', 'Graham ', 'Yang '),
('josephchandler@yahoo.com ','Garrisone43','Joseph  ', 'Chandler ' ),
('maconmoody@google.edu', 'Osbornñd11','Macon ', 'Osborn' ),
('dalekidd8121@outlook.edu','Dale3223    ', 'Dale', 'Kidd ' );


insert into cliente ( nombre, apellido,clave,email,direccion,fecha_nacimiento)
values
('Brady ', 'Goodwin', 'Goodwin23', 'bradygoodwin@icloud.edu', '958-7267 Sed Street', '2001-01-01 '),
('Ivan ', 'Schwartz', 'Schwartz21', 'ivanschwartz5703@google.org', 'Ap #681-5323 Posuere Av.', '2001-01-01 '),
('Matthew ', 'Garrison', 'Garrison43', 'matthewgarrison@icloud.ca', '690-5820 Proin Avenue', '2001-01-01 '),
('Macon ', 'Osborn', 'Osborn11', 'maconosborn9133@google.ca', '789-8196 Lobortis Rd', '2001-01-01 '),
('Elliott', ' Aguirre', ' Aguirre654', 'elliottaguirre6280@outlook.org', 'Ap #305-7123 In St.', '2001-01-01 '),
('Brandon ', 'Donovan', 'Donovan43', 'brandondonovan3055@yahoo.ca', 'Ap #868-8541 Sit Rd.', '2001-01-01 '),
('Leo ', 'Rivera', 'Rivera543', 'leorivera@yahoo.edu', '585-3044 Ante Avenue', '2001-01-01 '),
('Flynn', 'Mccoy', 'Mccoy432', 'flynnmccoy@protonmail.org', 'Ap #248-8985 Eu, Street', '2011-01-01 '),
('Tobias ', 'Garcia', 'Garcia432', 'tobiasgarcia@aol.ca', '4910 Nec, St.', '2002-05-01 '),
('Gregory ', 'Bryan', 'Bryan432', 'gregorybryan8737@hotmail.couk', '321-8798 Ac Ave', '2001-01-01 ');

insert into Ranking (nombre_empresa,lugar)
values	
('Empresa1',2),
('Empresa2',1),
('Empresa3',3),
('Empresa4',4),
('Empresa5',5);


insert into Metodo_de_pago(nombre_metodo)
values
('debito'),
('credito'),
('efectivo'),
('Puntos'),
('GifCard'),
('Paypal'),
('Cripto');


insert into carrito(cantidad_productos,total)
values 
(7,34030),
(11,65890),
(3,7550),
(5,50000),
(1,1990);


insert into empresa(nombre_empresa,clave,mail,direccion,id_ranking)
VALUES
  ('Empresa1','14R!0QZHub','nunc.nulla@google.com','622-6447 Et S',2),
  ('Empresa2','tX0&S@eC17','hendrerit@yahoo.com','Ap #191-6966 Parturient Avenue',3),
  ('Empresa3','s&V2WZh71i','pellentesque@outlook.com','P.O. Box 416, 5030 Maecenas Street',5),
  ('Empresa4','50m3%7Ox@8','nisl.sem@icloud.com','Ap #869-8811 Porta Rd.',1),
  ('Empresa5','4566SR1to','elit.elit.fermentum@google.com','P.O. Box 120 2174 Integer Avenue',4);

  
insert into empresa_administrador(id_empresa,id_administrador)
values
(4,2),
(1,5),
(3,3),
(2,1),
(5,4);

insert into valoracion(puntuacion,opinion,favoritos,id_cliente,id_empresa)
values
(5,'muy rapidos','false',2,3),
(7,'los mejores de todos','true',5,1),
(2,'pesima atencion','false',2,5),
(6,'buenos productos','false',4,1),
(7,'muy buena atencion','true',1,1);

insert into pago(monto,id_tipopago,id_empresa)
values
(54000,3,3),
(104000,2,1),
(150200,7,1),
(12350,1,5),
(4300,5,2),
(65440,1,2);

insert into boleta(id_pago,detalle_compra)
values
(1,'Productos de aseo'),
(2,'Productos de casa'),
(3,'Muebleria'),
(4,'Bebidad alcholicas'),
(5,'Ropa'),
(6,'Ropa');

INSERT INTO tienda(nombre,edad_minima,ciudad,tipo_empresa,id_empresa)
VALUES
  ('Falaferia',0,'Santiago','Ropa y accesorios',1),
  ('Baris',0,'Santiago','Ropa y accesorios',2),
  ('Rapley',0,'Rancagua','Ropa y accesorios',3),
  ('MexShop',18,'Concepcion','Articulos Picantes',2),
  ('Oaclei',0,'Concepcion','Articulos Picantes',3),
  ('AdansApple',18,'Santiago','Articulos Picantes',3);

INSERT INTO categoria(nombre,descripcion,id_tienda)
VALUES
  ('Ropa Hombre','Encuentra ropa comoda para hombre',1),
  ('Ropa Invierno','Encuentra ropa de invierno',2),
  ('Ropa  Verano ','Encuentra ropa delgada ',3),
  ('Ropa  Mujer','Encuentra ropa comoda para mujer',4),
  ('Ropa Hombre','Encuentra ropa comoda para hombre',5);

insert into pedido(subtotal,tipo_entrega,ubicacion,id_pago)
values
(54000,'Presencial','',1),
(104000,'Envio','5737 Pede Avenue',2),
(150200,'Presencial','',3),
(12350,'Envio','3249 Amet Av',4),
(4300,'Envio','4394 Tincidunt, Rd.',5),
(65440,'Envio','418-4624 Mauris. Rd.',6);

INSERT INTO productocategoria(nombre,descripcion,precio,stock_inicial,stock_actual,id_empresa,id_categoria)
VALUES 
  ('Pantalon Fibra Malla','Disponible en tallas S y M',5990,60,33,1,1),
  ('Polera Manga Larga','Disponible en tallas XL y L',4990,50,35,2,2),
  ('Pulsera BadBunny','nada que agregar uvst',4690,100,55,2,2),
  ('Zapatillas Blancas','Zapatillas marca Adid@s',59990,100,69,1,5);

insert into Oferta(descripcion,stock_oferta,fecha_inicio,fecha_final,id_prod)
values

('2x1',100,'2021-09-01','2022-09-01',1),
('2x1',200,'2021-08-01','2023-09-01',2),
('3x1',300,'2021-09-01','2022-09-01',3),
('2x1',100,'2021-08-01','2023-09-01',4),
('3x1',550,'2021-08-01','2023-09-01',1);

insert into cliente_tienda(id_cliente,id_tienda,edad_minima)
values
(1, 1, 18),
(2, 2,18),
(3, 3, 18),
(4, 4,18),
(5, 5, 18);

insert into productocarrito(nombre,cantidad,comentario,precio,id_carrito,id_prod)
values
  ('Pulsera BadBunny',3,'nada que agregar1',4690,1,3),
  ('Polera Manga Larga',4,'nada que agregar2',4990,1,2),
  ('Pantalon Fibra Malla',11,'nada que agregar3',5990,2,1);

INSERT INTO administrador_categoria_empresa(id_admin,id_categoria)
VALUES
(1,1),
(2,2),
(3,3),
(4,4),
(5,5);

INSERT INTO  Carrito_ProductoCarrito(id_item_carrito,id_carrito)
VALUES
(1,5),
(1,3),
(3,3),
(1,5),
(3,4),
(1,2),
(2,4);


INSERT INTO Cliente_ProductoCategoria(id_cliente,id_prod)
VALUES
(1,1),
(3,2),
(3,1),
(7,1),
(4,2);


INSERT INTO tienda_admin(id_admin,id_tienda)
VALUES
(3,2),
(4,2),
(3,1),
(1,1),
(2,3);