/*

--datos personales

NOMBRE 
rut     
giro
DIRECCION
comuna
ciudad
contacto
fecha_emision
tipo_de_compra

---detalle de la factura
codigo
descripcion 
cantidad 
PRECIO
descuento --opcional 
valor

forma_de_pago 


--precio
monto_neto
i.v.a 19% 
impuesto adicional opcional
total
*/
--------------------------------------------------------------------  
CREATE DATABASE IF NOT EXISTS facturas;
USE facturas;
CREATE TABLE datos_personales (
    rut VARCHAR(20) PRIMARY KEY,
    nombre VARCHAR(100),
    giro VARCHAR(255),
    direccion VARCHAR(255),
    comuna VARCHAR(100),
    ciudad VARCHAR(100),
    contacto VARCHAR(20),
    fecha_emision DATE,
    tipo_de_compra VARCHAR(50)
);
CREATE TABLE detalle_factura (
    id INT auto_increment PRIMARY KEY,
    rut_cliente VARCHAR(20),
    codigo_producto VARCHAR(20),              
    cantidad INT,
    descuento DECIMAL(5, 2),
    valor INT,
    forma_de_pago VARCHAR(40),     
    monto_neto INT,
    iva INT,
    impuesto_adicional INT,
    total INT,
    FOREIGN KEY (rut_cliente) REFERENCES datos_personales(rut)
);
create table producto(
    codigo_producto int PRIMARY KEY,
    descripcion_producto VARCHAR(255),
    precios_producto int 

);
