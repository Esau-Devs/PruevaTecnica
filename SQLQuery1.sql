CREATE DATABASE tienda;

USE tienda


CREATE TABLE categoria (
    categoriaId INT PRIMARY KEY,
    nombre VARCHAR(100)
);

CREATE TABLE producto (
    productoId INT PRIMARY KEY,
    nombre VARCHAR(100),
    categoriaId INT,
    FOREIGN KEY (categoriaId) REFERENCES categoria(categoriaId)
);




CREATE TABLE venta (
    ventaId INT PRIMARY KEY,
    productoId INT,
    fechaVenta DATE,
    cantidad INT,
    FOREIGN KEY (productoId) REFERENCES producto(productoId)
);


INSERT INTO categoria (categoriaId, nombre) VALUES
(1, 'Electrónica'),
(2, 'Hogar'),
(3, 'Juguetes'),
(4, 'Ropa'),
(5, 'Alimentos'),
(6, 'Libros'),
(7, 'Deportes'),
(8, 'Salud'),
(9, 'Automotriz'),
(10, 'Mascotas');


INSERT INTO producto (productoId, nombre, categoriaId) VALUES
(1, 'Televisor LG 50"', 1),
(2, 'Silla ergonómica', 2),
(3, 'Muñeca Barbie', 3),
(4, 'Camisa Polo', 4),
(5, 'Caja de cereales', 5),
(6, 'Novela "El Hobbit"', 6),
(7, 'Balón de fútbol', 7),
(8, 'Multivitamínico', 8),
(9, 'Aceite para motor', 9),
(10, 'Comida para perro', 10);


INSERT INTO venta (ventaId, productoId, fechaVenta, cantidad) VALUES
(1, 1, '2019-01-15', 2),
(2, 2, '2019-03-10', 1),
(3, 3, '2020-05-22', 3),
(4, 4, '2019-07-05', 1),
(5, 5, '2018-12-20', 4),
(6, 6, '2019-11-30', 2),
(7, 7, '2020-01-01', 1),
(8, 8, '2019-06-17', 2),
(9, 9, '2021-02-14', 5),
(10, 10, '2019-09-03', 3);
