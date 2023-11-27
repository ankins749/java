/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;
/**
 *
 * @author anaki
 */
import ev3.clases.Datos;
import java.util.ArrayList;

public class Listadatos {
    static ArrayList<Datos> listaDatos = new ArrayList<>();
    
    public static void main(String[] args) {
        for (Datos detalle : listaDatos) {
            System.out.println(detalle.toString());
        }
    }
    public static void agregar(Datos dato) {
        listaDatos.add(dato);
        System.out.println("dato anadido");
    }

    public static ArrayList<Datos> getListaDatos() {
        return listaDatos;
    }
    public static void eliminardatos(Datos dato){
        listaDatos.remove(dato);
        System.out.println("dato removido");
    }
    public static void datrecorer(){
            for (Datos dato : listaDatos) {
                System.out.println(dato.toString());
        }
    }
    public static void setListaDatos(ArrayList<Datos> nuevaListaDatos) {
        listaDatos = nuevaListaDatos;
        System.out.println("Lista de datos actualizada");
    }
}
    


