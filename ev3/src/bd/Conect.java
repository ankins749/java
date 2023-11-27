package bd;

import ev3.clases.Datos;
import ev3.clases.Detallefact;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;
import listas.Listadatos;

public class Conect {

    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "";
    private static final String BD = "facturas"; 
    
    public static Connection obtenerConexion() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/" + BD + "?characterEncoding=utf8";
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Error al conectar a la base de datos");
        }
        return conexion;
    }

    public static void cerrarConexion(Connection conexion) {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexión cerrada");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al cerrar la conexión");
        }
    }

    public static boolean verificarConexion() {
        Connection conexion = obtenerConexion();
        if (conexion != null) {
            cerrarConexion(conexion);
            return true;
        } else {
            return false;
        }
    }
    public void comprobar(){   
        if (verificarConexion()) {
            System.out.println("La conexión es correcta.");
        } else {
            System.out.println("La conexión es incorrecta.");
        }
    }
    public static void insertardatosp(String rut, String nombre, String giro, String direccion, String comuna, String ciudad,String contacto, String fechaEmision, String tipoCompra){
        try (Connection conexcion=obtenerConexion()){
                String query = "INSERT INTO datos_personales (rut, nombre, giro, direccion, comuna, ciudad, contacto, fecha_emision, tipo_de_compra) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                
            try (var pstmt = conexcion.prepareStatement(query)) {
                pstmt.setString(1, rut);
                pstmt.setString(2, nombre);
                pstmt.setString(3, giro);
                pstmt.setString(4, direccion);
                pstmt.setString(5, comuna);
                pstmt.setString(6, ciudad);
                pstmt.setString(7, contacto);
                pstmt.setString(8, fechaEmision);
                pstmt.setString(9, tipoCompra);

                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "datos ingresados a la base de datos");
                System.out.println("Datos personales insertados correctamente");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al insertar datos personales");
        }
        }
     public static void insertarDetalleFactura(String codigoProducto, int cantidad, 
        int descuento, int valor, String formaDePago, int montoNeto, int iva, int impuestoAdicional, int total) {
    
    try (Connection conexion = obtenerConexion()) {
        String query = "INSERT INTO detalle_factura (codigo_producto, cantidad, descuento, valor, forma_de_pago, monto_neto, iva, impuesto_adicional, total) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (var pstmt = conexion.prepareStatement(query)) {
            pstmt.setString(1, codigoProducto); 
            pstmt.setInt(2, cantidad);
            pstmt.setInt(3, descuento);
            pstmt.setInt(4, valor);
            pstmt.setString(5, formaDePago);
            pstmt.setInt(6, montoNeto);
            pstmt.setInt(7, iva);
            pstmt.setInt(8, impuestoAdicional);
            pstmt.setInt(9, total);

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Detalle de factura ingresado a la base de datos");
            System.out.println("Detalle de factura insertado correctamente");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al insertar detalle de factura");
    }
}


    public static void insertarProducto(int codigoProducto, String descripcionProducto, int precioProducto) {
        try (Connection conexion = obtenerConexion()) {
            String query = "INSERT INTO producto (codigo_producto, descripcion_producto, precios_producto) VALUES (?, ?, ?)";

            try (var pstmt = conexion.prepareStatement(query)) {
                pstmt.setInt(1, codigoProducto);
                pstmt.setString(2, descripcionProducto);
                pstmt.setInt(3, precioProducto);

                pstmt.executeUpdate();
                System.out.println("Producto insertado correctamente");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al insertar producto");
        }
    }
    public static void borrarDatosPersonales(String rut) {
    try (Connection conexion = obtenerConexion()) {
        String query = "DELETE FROM datos_personales WHERE rut = ?";

        try (var pstmt = conexion.prepareStatement(query)) {
            pstmt.setString(1, rut);

            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Datos personales eliminados de la base de datos");
                System.out.println("Datos personales eliminados correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron datos personales con el rut proporcionado");
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al borrar datos personales");
    }
}

    public static void borrarTotal(int id) {
        try (Connection conexion = obtenerConexion()) {
            String query = "DELETE FROM total WHERE id = ?";

            try (var pstmt = conexion.prepareStatement(query)) {
                pstmt.setInt(1, id);

                int filasAfectadas = pstmt.executeUpdate();
                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(null, "Total eliminado de la base de datos");
                    System.out.println("Total eliminado correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró total con el id proporcionado");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al borrar total");
        }
}

    public static void borrar(int rut) {
        try (Connection conexion = obtenerConexion()) {
            String query = "DELETE FROM producto WHERE detalle_factura = ?";

            try (var pstmt = conexion.prepareStatement(query)) {
                pstmt.setInt(1, rut);

                int filasAfectadas = pstmt.executeUpdate();
                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(null, "factura eliminada");
                    System.out.println("factura eliminada");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró la factura ");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al borrar producto");
        }
}
        public static ArrayList<Datos> obtenerDatosDesdeBD() {
        ArrayList<Datos> listaDatosBD = new ArrayList<>();

        try (Connection conexion = obtenerConexion()) {
            String query = "SELECT * FROM datos_personales";

            try (Statement stmt = conexion.createStatement()) {
                ResultSet resultSet = stmt.executeQuery(query);

                while (resultSet.next()) {
                    int rut = resultSet.getInt("rut");
                    String nombre = resultSet.getString("nombre");
                    String giro = resultSet.getString("giro");
                    String direccion = resultSet.getString("direccion");
                    String comuna = resultSet.getString("comuna");
                    String ciudad = resultSet.getString("ciudad");
                    String contacto = resultSet.getString("contacto");
                    String fechaem = resultSet.getString("fecha_emision");
                    String tipcompra = resultSet.getString("tipo_de_compra");

                    Datos datos = new Datos(nombre, rut, giro, direccion, comuna, ciudad, contacto, fechaem, tipcompra);
                    listaDatosBD.add(datos);
                }
                return listaDatosBD;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al obtener datos desde la base de datos");
        }

        return null;
    }
public static ArrayList<Detallefact> obtenerDatosfact() {
    ArrayList<Detallefact> listaFacturas = new ArrayList<>();

    try (Connection conexion = obtenerConexion()) {
        String query = "SELECT * FROM detalle_factura";

        try (Statement stmt = conexion.createStatement()) {
            ResultSet resultSet = stmt.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String codigoProducto = resultSet.getString("codigo_producto");
                int cantidad = resultSet.getInt("cantidad");
                double descuento = resultSet.getDouble("descuento");
                int valor = resultSet.getInt("valor");
                String formaDePago = resultSet.getString("forma_de_pago");
                int montoNeto = resultSet.getInt("monto_neto");
                int iva = resultSet.getInt("iva");
                int impuestoAdicional = resultSet.getInt("impuesto_adicional");
                int total = resultSet.getInt("total");

                Detallefact factura = new Detallefact();
                factura.setCodigo(codigoProducto);
                factura.setDescripcion(""); 
                factura.setCantidad(String.valueOf(cantidad)); 
                factura.setPrecio(String.valueOf(valor)); 
                factura.setDescuento(String.valueOf(descuento)); 
                factura.setValor(String.valueOf(valor)); 
                factura.setFormapago(formaDePago);
                factura.setMontonet(montoNeto);
                factura.setIva(iva);
                factura.setImpad(impuestoAdicional); 
                factura.setTotal(total);
               

                listaFacturas.add(factura);
            }
            return listaFacturas;
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al obtener datos desde la base de datos");
    }

    return null;
}


        
}








