
package com.mycompany.vuelo;

import javax.swing.JOptionPane;

public class Vuelo {

    public static void main(String[] args) {


        
        int opcion = 0;
        Persona p1 = new Persona();
        ReservaDeVuelo rv = new ReservaDeVuelo();

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese\n1. para registrar  persona\n2. para realizar reserva\n3. consultar reserva \n4. para cancelar reserva\n5. para cobrar\n0. salir "));
            switch (opcion) {
                case 1:
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
                    String documento = JOptionPane.showInputDialog("Ingrese el documento: ");
                    p1 = new Persona(nombre, documento);
                    break;
                case 2:
                    
                    JOptionPane.showMessageDialog(null, "Hacer reserva");
                    
                    String origen = JOptionPane.showInputDialog("Ingrese el origen: ");
                    String destino = JOptionPane.showInputDialog("Ingrese el destino: ");
                    Integer distancia = Integer.valueOf(JOptionPane.showInputDialog("Ingresa la distancia en m"));
                    Integer tiempo = Integer.valueOf(JOptionPane.showInputDialog("Ingresa el tiempo"));
                    Integer costo = Integer.valueOf(JOptionPane.showInputDialog("Ingresa el costo"));

                    rv = new ReservaDeVuelo (costo,origen,  destino,  distancia,  tiempo);
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null, rv.toString());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, rv.cobrar());
                    break;
                case 5:
                    rv = new ReservaDeVuelo();
                    JOptionPane.showMessageDialog(null, "Usted cancelo reserva");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Usted salió");
            }
            
        } while (opcion != 0);
        

    }
}
