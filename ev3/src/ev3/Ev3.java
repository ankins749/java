/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ev3;
import ev3.jpanel.Menuprincipal;
import bd.Conect;


/**
 *
 * @author anaki
 */
public class Ev3 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    // TODO code application logic here
        Conect bd = new Conect();
        bd.comprobar();
        Menuprincipal menuprincipal = new Menuprincipal();
        menuprincipal.setVisible(true);        
        menuprincipal.setLocationRelativeTo(null);
       
}
}

