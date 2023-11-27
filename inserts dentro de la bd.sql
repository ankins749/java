
INSERT INTO datos_personales (rut, nombre, giro, direccion, comuna, ciudad, contacto, fecha_emision, tipo_de_compra)
VALUES
('123456789', 'Juan Pérez', 'Tienda de electrónicos', 'Calle 123', 'Providencia', 'Santiago', '987654321', '2023-11-21', 'Contado'),
('987654321', 'María Gómez', 'Librería La Sabiduría', 'Avenida 456', 'Las Condes', 'Santiago', '123456789', '2023-11-21', 'Crédito');

INSERT INTO detalle_factura (rut_cliente, codigo_producto, cantidad, descuento, valor, forma_de_pago, monto_neto, iva, impuesto_adicional, total)
VALUES
('123456789', '001', 2, 0.1, 5000, 'Efectivo', 9000, 1350, 50, 10350),
('987654321', '002', 3, 0.05, 8000, 'Tarjeta', 24000, 3600, 120, 27720);

INSERT INTO producto (codigo_producto, descripcion_producto, precios_producto)
VALUES
('001', 'Laptop HP', 2500),
('002', 'Libro "Historia del Arte"', 3000);
