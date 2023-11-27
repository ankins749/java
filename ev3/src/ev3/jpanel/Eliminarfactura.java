/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ev3.jpanel;
import ev3.clases.Datos;
import ev3.clases.Detallefact;
import java.awt.Component;
import listas.Lista;
import listas.Listadatos;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import bd.Conect;
/**
 
 * @author v-tokyo
 */
public class Eliminarfactura extends javax.swing.JFrame {
   static ArrayList<Datos>listaDatos=new ArrayList<>();
   static ArrayList<Detallefact>listaDetalles=new ArrayList<>();
   private JTextArea textArea;
    /**
     * Creates new form Eliminarfactura
     */
public Eliminarfactura() {
        initComponents();
        this.setLocationRelativeTo(null); //datos 
        cargarDatosDesdeBD();
        mostrarInformacion(Listadatos.getListaDatos(),"lista datos: ");
        populatePanelWithData();
        mostrarInformacion(Conect.obtenerDatosDesdeBD(),"lista bd: ");
        populatePanelWithData();
        jScrollPane1.revalidate();
        jScrollPane1.repaint();  
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jButton = new javax.swing.JButton();
        jText2332 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 650, 420));

        jButton.setBackground(new java.awt.Color(204, 204, 204));
        jButton.setText("Eliminar");
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, 80, -1));

        jText2332.setBackground(new java.awt.Color(255, 255, 204));
        jText2332.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText2332ActionPerformed(evt);
            }
        });
        getContentPane().add(jText2332, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 320, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Eliminar Factura");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("ingresa el rut");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, -1, 30));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, -1, -1));

        jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pago-facturas-planificacion-presupuesto-adquirir-riqueza-generada-ia.jpg"))); // NOI18N
        getContentPane().add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 697, 567));

        pack();
    }// </editor-fold>//GEN-END:initComponents

       public JTextField getText2332() {
        return jText2332;
    }

 

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        super.dispose();
        new Menuprincipal().setVisible(false);  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jText2332ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText2332ActionPerformed
        // TODO add your handling code here  
    }//GEN-LAST:event_jText2332ActionPerformed

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
        // TODO add your handling code here:
            int rutb = Integer.parseInt(jText2332.getText());
            for (Datos dato : Listadatos.getListaDatos()) {
                if (rutb == dato.getRut()) {
                    for (Component componente : jPanel1.getComponents()) {
                        if (componente instanceof JLabel) {
                            JLabel label = (JLabel) componente;
                            if (label.getText().contains(String.valueOf(rutb))) {
                                jPanel1.remove(componente);
                                eliminarrut(dato);
                                Conect.borrarDatosPersonales(Integer.toString(rutb));
                                mostrarInformacion(Listadatos.getListaDatos(), "Información de Facturas");
                                jScrollPane1.revalidate();
                                jScrollPane1.repaint();
                            }
                }
            }
        }
    }
 
    }//GEN-LAST:event_jButtonActionPerformed
 private void EliminarfacturaBtnActionPerformed(java.awt.event.ActionEvent evt) {
        int rutb = Integer.parseInt(jText2332.getText());
        System.out.println(Listadatos.getListaDatos());
        for (Datos dato : Listadatos.getListaDatos()) {
            if (rutb==dato.getRut()){
                eliminarrut(dato);
                bd.Conect.borrarDatosPersonales(Integer.toString(rutb));
                System.out.println("dato eliminado");
                for (Component componente : jPanel1.getComponents()) {
                if (componente instanceof JLabel) {
                    JLabel label = (JLabel) componente;
                    if (label.getText().contains(String.valueOf(rutb))) {
                        jPanel1.remove(componente);
                jScrollPane1.revalidate();
                jScrollPane1.repaint();
            }
        }      
 }
            mostrarInformacion(Listadatos.getListaDatos(), "Información de Facturas");
            }}
 }

    private void jTextFieldBusquedaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        try {
            int rut = Integer.parseInt(jText2332.getText()); 
            for (int i = 0; i < listaDatos.size(); i++) {
                Datos dato = listaDatos.get(i);
                if (dato.getRut() == rut) {
                    
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa un número de rut válido");
        }
        }
    
    public static void eliminarrut(Datos dato) {
        Listadatos.eliminardatos(dato);
        
    }
    private void mostrarInformacion(ArrayList<?> lista, String titulo) {
        System.out.println("Mostrando información: " + titulo);
        JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        textArea.append(titulo + "\n\n");
        textArea.setForeground(new java.awt.Color(0, 0, 0));

        for (Object objeto : lista) {
            if (objeto instanceof Datos) {
                Datos datos = (Datos) objeto;
                textArea.append("Nombre: " + datos.getNombre() + "\n");
                textArea.append("RUT: " + datos.getRut() + "\n");
                textArea.append("----------------------------\n");
            } else if (objeto instanceof Detallefact) {
                Detallefact detalle = (Detallefact) objeto;
                textArea.append("Código: " + detalle.getCodigo() + "\n");
            }
        }
    }
    private void populatePanelWithData() {
        jPanel1.removeAll();  // Clear existing components

        for (Datos dato : Listadatos.getListaDatos()) {
            JLabel label = new JLabel();
            label.setText("Nombre: " + dato.getNombre() + ", RUT: " + dato.getRut());  
            jPanel1.add(label);
        }

        jScrollPane1.revalidate();
        jScrollPane1.repaint();
}
    private static void cargarDatosDesdeBD() {
    // Consultar datos desde la base de datos y agregarlos a la lista
    ArrayList<Datos> datosDesdeBD = Conect.obtenerDatosDesdeBD();
    Listadatos.setListaDatos(datosDesdeBD);
}

    private void mostrarInformacionBaseDeDatos() {
        ArrayList<Datos> datosDesdeBD = Conect.obtenerDatosDesdeBD();
        mostrarInformacion(datosDesdeBD, "Información de la Base de Datos");
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextField jText2332;
    // End of variables declaration//GEN-END:variables
}
