DROP TABLE IF EXISTS Almacenes; 
DROP TABLE IF EXISTS Cajas;

CREATE TABLE Almacenes (
Codigo INT AUTO_INCREMENT,
Lugar VARCHAR(100),
Capacidad int,
PRIMARY KEY(Codigo)
);

INSERT INTO Almacenes (Lugar,Capacidad) VALUES ('Barcelona',100);
INSERT INTO Almacenes (Lugar,Capacidad) VALUES ('Madrid',200);
INSERT INTO Almacenes (Lugar,Capacidad) VALUES ('Jaen',300);
INSERT INTO Almacenes (Lugar,Capacidad) VALUES ('Valencia',400);
INSERT INTO Almacenes (Lugar,Capacidad) VALUES ('Galicia',500);



CREATE TABLE Cajas(
NumReferencia INT AUTO_INCREMENT PRIMARY KEY,
Contenido VARCHAR(100),
Valor INT,
Almacen INT,
FOREIGN KEY (Almacen) REFERENCES Almacenes (Codigo)
);

INSERT INTO Cajas(Contenido,Valor,Almacen) VALUES ('Caja1',100,1);
INSERT INTO Cajas(Contenido,Valor,Almacen) VALUES ('Caja2',200,11);
INSERT INTO Cajas(Contenido,Valor,Almacen) VALUES ('Caja3',300,21);
INSERT INTO Cajas(Contenido,Valor,Almacen) VALUES ('Caja4',400,31);
INSERT INTO Cajas(Contenido,Valor,Almacen) VALUES ('Caja5',500,41);