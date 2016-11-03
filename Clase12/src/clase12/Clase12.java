/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase12;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */import javax.swing.*;
public class Clase12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "¿Cual es tu nombre?");
        
        int choice = JOptionPane.showConfirmDialog(null, "¿Te gusta el paste, " + name + "?");
        
        if (choice == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Claro, ¿A quien no?");
        } else {
            JOptionPane.showMessageDialog(null, "Bueno, estoy en desacuerdo");
        }
    }
    
}
