
package calculabo;

import calculabo.Gui.ventana;
import javax.swing.JFrame;
import calculabo.Aritmetica.*;
import calculabo.Convertidor.*;


public class CalcuLabo {


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