/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ev3.clases;

/**
 *  fechaem = fecha de emision 
 *
 * @author anaki
 */
public class Datos {
private String nombre,  giro, direccion, comuna, ciudad, contacto, fechaem, tipcompra;
private int rut;
    public Datos() {
    }



public Datos(String nombre, int rut, String giro, String direccion, String comuna, String ciudad, String contacto, String fechaem, String tipcompra) {
    this.nombre = nombre;
    this.rut = rut;
    this.giro = giro;
    this.direccion = direccion;
    this.comuna = comuna;
    this.ciudad = ciudad;
    this.contacto = contacto;
    this.fechaem = fechaem;
    this.tipcompra = tipcompra;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public int getRut() {
    return rut;
}

public void setRut(int rut) {
    this.rut = rut;
}

public String getGiro() {
    return giro;
}

public void setGiro(String giro) {
    this.giro = giro;
}

public String getDireccion() {
    return direccion;
}

public void setDireccion(String direccion) {
    this.direccion = direccion;
}

public String getComuna() {
    return comuna;
}

public void setComuna(String comuna) {
    this.comuna = comuna;
}

public String getCiudad() {
    return ciudad;
}

public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
}

public String getContacto() {
    return contacto;
}

public void setContacto(String contacto) {
    this.contacto = contacto;
}

public String getFechaem() {
    return fechaem;
}

public void setFechaem(String fechaem) {
    this.fechaem = fechaem;
}

public String getTipcompra() {
    return tipcompra;
}

public void setTipcompra(String tipcompra) {
    this.tipcompra = tipcompra;
}
/*public void datos (){
    System.out.println("nombre: "+this.nombre);
    System.out.println("rut: "+this.rut);
    System.out.println("giro: "+this.giro);
    System.out.println("direccion: "+this.direccion);
    System.out.println("comuna: "+this.comuna);
    System.out.println("ciudad: "+this.ciudad);
    System.out.println("contacto; "+this.contacto);
    System.out.println("fecha de emision: "+this.fechaem);
    System.out.println("tipo de compra: "+this.tipcompra);
}
*/    
    @Override
    public String toString() {
        return "Datos{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", giro='" + giro + '\'' +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", contacto='" + contacto + '\'' +
                ", fecha de emision='" + fechaem + '\'' +
                ", tipcompra='" + tipcompra + '\'' +
                '}';
    }  
    

}
