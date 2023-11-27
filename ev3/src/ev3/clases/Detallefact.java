/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ev3.clases;

import ev3.clases.Datos;

/**
 * variable descuento y impad son opcionales a revisar
 * impad impuesto adicional
 * @author anaki
 */
public class Detallefact {
    private Datos datosCliente; // Referencia a la clase Datos
    private String codigo, descripcion, cantidad, precio, descuento, valor, formapago;
    private int montonet, iva, impad, total;

public Detallefact() {
}

public Detallefact(Datos datosCliente, String codigo, String descripcion, String cantidad, String precio, String descuento, String valor, String formapago, int montonet, int iva, int impad, int total) {
    this.datosCliente = datosCliente;
    this.codigo = codigo;
    this.descripcion = descripcion;
    this.cantidad = cantidad;
    this.precio = precio;
    this.descuento = descuento;
    this.valor = valor;
    this.montonet = montonet;
    this.iva = iva;
    this.impad = impad;
    this.total = total;
    this.formapago=formapago;
    }




public String getCodigo() {
    return codigo;
}

public void setCodigo(String codigo) {
    this.codigo = codigo;
}

public String getDescripcion() {
    return descripcion;
}

public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}

public String getCantidad() {
    return cantidad;
}

public void setCantidad(String cantidad) {
    this.cantidad = cantidad;
}

public String getPrecio() {
    return precio;
}

public void setPrecio(String precio) {
    this.precio = precio;
}

public String getDescuento() {
    return descuento;
}

public void setDescuento(String descuento) {
    this.descuento = descuento;
}

public String getValor() {
    return valor;
}

public void setValor(String valor) {
    this.valor = valor;
}

public int getMontonet() {
    return montonet;
}

public void setMontonet(int montonet) {
    this.montonet = montonet;
}

public int getIva() {
    return iva;
}

public void setIva(int iva) {
    this.iva = iva;
}

public int getImpad() {
    return impad;
}

public void setImpad(int impad) {
    this.impad = impad;
}

public int getTotal() {
    return total;
}

public void setTotal(int total) {
    this.total = total;
}

public Datos getDatosCliente() {
    return datosCliente;
}

public void setDatosCliente(Datos datosCliente) {
    this.datosCliente = datosCliente;
}

public String getFormapago() {
    return formapago;
}

public void setFormapago(String formapago) {
    this.formapago = formapago;
}

@Override
public String toString() {
    return "Detallefact{" +
            "datosCliente=" + datosCliente +
            ", codigo='" + codigo + '\'' +
            ", descripcion='" + descripcion + '\'' +
            ", cantidad='" + cantidad + '\'' +
            ", precio='" + precio + '\'' +
            ", descuento='" + descuento + '\'' +
            ", valor='" + valor + '\'' +
            ", monto neto=" + montonet +
            ", I.V.A=" + iva +
            ", Impuesto adicional=" + impad +
            ", total=" + total +
            ", Total con I.V.A=" + (montonet+iva) +
            '}';
}


}
    
    
    
    

