
package calculabo.Gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import calculabo.Aritmetica.*;
import calculabo.Convertidor.*;
import calculabo.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ventana extends JPanel{
    
    AbstractFactory calc;
    
    public int WIDTH = 350, HEIGHT= 400;
    public int widthTF= 50, heightTF=30;
    public int widthBT = 75, heightBT=75;
    public int widthBT1 = 75, heightBT1 = 30;
    public int widthLB = 200, heightLB= 30;
    
    JButton sum = new JButton();
    JButton res= new JButton();
    JButton mul = new JButton();
    JButton div = new JButton();
    JButton bin = new JButton();
    JLabel label1,label2;
    JTextField texto1, texto2,texto3;
    
    public ventana(){
        sum = new JButton("Sumar");
        res = new JButton("Restar");
        mul = new JButton("Multiplicar");
        div = new JButton("Dividir");
        bin = new JButton("Binario");
        texto1= new JTextField();
        texto2 = new JTextField();
        texto3=new JTextField();
        label1 = new JLabel("Operacion Aritmetica:");
        label1.setBounds(0, 0, widthLB, heightLB);
        label2= new JLabel("Decimal a Binario:");
        label2.setBounds(0, 270, widthLB, heightLB);
        texto1.setBounds(120, 225, widthTF, heightTF);
        texto2.setBounds(190, 225, widthTF, heightTF);
        texto3.setBounds(155, 340, widthTF, heightTF);
        sum.setBounds(70, 30, widthBT, heightBT);
        res.setBounds(200, 30, widthBT, heightBT);
        mul.setBounds(70, 130, widthBT, heightBT);
        div.setBounds(200, 130, widthBT, heightBT);
        bin.setBounds(140, 295, widthBT1, heightBT1);
        
        sum.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                calc = FactoryProducer.getFactory("aritmetica");
                JOptionPane.showMessageDialog(null, "La suma es: "+calc.getAritmetica("suma").operar(Double.parseDouble(texto1.getText()), Double.parseDouble(texto2.getText())));
            }
        });
        
        res.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                calc = FactoryProducer.getFactory("aritmetica");
                JOptionPane.showMessageDialog(null, "La resta es: "+calc.getAritmetica("resta").operar(Double.parseDouble(texto1.getText()), Double.parseDouble(texto2.getText())));
            }
        });
        
        mul.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                calc = FactoryProducer.getFactory("aritmetica");
                JOptionPane.showMessageDialog(null, "La multiplicación es: "+calc.getAritmetica("multiplicacion").operar(Double.parseDouble(texto1.getText()), Double.parseDouble(texto2.getText())));

            }
        });
        
        div.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                calc = FactoryProducer.getFactory("aritmetica");
                JOptionPane.showMessageDialog(null, "La división es: "+calc.getAritmetica("division").operar(Double.parseDouble(texto1.getText()), Double.parseDouble(texto2.getText())));
            }
        });
        
        bin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                calc = FactoryProducer.getFactory("convertor");
                JOptionPane.showMessageDialog(null, "El numero binario es: "+calc.getConvertor("binario").convertir(Integer.parseInt(texto3.getText())));
            }
        });
        
    texto1.setEditable(true);
    texto2.setEditable(true);
    add(sum);
    add(label1);
    add(label2);
    add(res);
    add(mul);
    add(div);
    add(bin);
    add(texto1);
    add(texto3);
    setLayout(null);
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    add(texto2);
}
}
