/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;
import ev3.clases.Datos;
import ev3.clases.Detallefact;
import ev3.clases.Detallefact;

/**
 *
 * @author anaki
 */
import java.util.ArrayList;

public class Lista {
    static ArrayList<Detallefact> listaDetalles = new ArrayList<>();
    public static void main(String[] args) 
    {
    for (Detallefact detalle : listaDetalles) {
            System.out.println(detalle.toString());
    }
    }  
    public static void agregarfa(Detallefact detalle) {
        listaDetalles.add(detalle);
        System.out.println("factura anadida");
    }

    public static ArrayList<Detallefact> getListaDetalles() {
        return listaDetalles;
    }
    public static void eliminardet(Detallefact detalle){
    
        listaDetalles.remove(detalle);
        System.out.println("detalle removido");
    
    }
    public static void mostrarinformacion(){
    
            for (Detallefact detalle : listaDetalles) {
                System.out.println(detalle.toString());
        }
    }
    }
    


