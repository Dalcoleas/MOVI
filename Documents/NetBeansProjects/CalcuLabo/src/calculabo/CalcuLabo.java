/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculabo;

import calculabo.Gui.ventana;
import javax.swing.JFrame;
import calculabo.Aritmetica.*;
import calculabo.Convertidor.*;

/**
 *
 * @author LN710Q
 */
public class CalcuLabo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame ventana = new JFrame("Calculadora");
       ventana.setContentPane(new ventana());
       ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ventana.setResizable(false);
       ventana.pack();
       ventana.setVisible(true);
       ventana.setLocationRelativeTo(null);
    }
}