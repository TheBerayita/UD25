DROP TABLE IF EXISTS ARTICULO;
DROP TABLE IF EXISTS FABRICANTE;

CREATE TABLE FABRICANTE (
Codigo INT AUTO_INCREMENT PRIMARY KEY,
Nombre VARCHAR(100));

INSERT INTO FABRICANTE (Nombre) VALUES ('Fabricante Sergio');
INSERT INTO FABRICANTE (Nombre) VALUES ('Fabricante Javier');
INSERT INTO FABRICANTE (Nombre) VALUES ('Fabricante Matías');
INSERT INTO FABRICANTE (Nombre) VALUES ('Fabricante Laura');
INSERT INTO FABRICANTE (Nombre) VALUES ('Fabricante Tatiana');

CREATE TABLE ARTICULO (
Codigo INT AUTO_INCREMENT PRIMARY KEY,
Nombre VARCHAR(100),
Precio INT(20),
Codigo_Fabricante INT,
FOREIGN KEY (Codigo) REFERENCES FABRICANTE (Codigo) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO ARTICULO (Nombre, Precio, Codigo_Fabricante) VALUES ('Articulo1', 20, 1);
INSERT INTO ARTICULO (Nombre, Precio, Codigo_Fabricante)  VALUES ('Articulo2', 20, 2);
INSERT INTO ARTICULO (Nombre, Precio, Codigo_Fabricante)  VALUES ('Articulo3', 20, 3);
INSERT INTO ARTICULO (Nombre, Precio, Codigo_Fabricante)  VALUES ('Articulo4', 20, 4);
INSERT INTO ARTICULO (Nombre, Precio, Codigo_Fabricante)  VALUES ('Articulo5', 20, 5);