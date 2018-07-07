/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebamov;

import java.awt.Color; 
import java.awt.Graphics; 
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.awt.event.KeyEvent; 
import java.awt.event.KeyListener;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame; 
import javax.swing.JPanel; 
import javax.swing.Timer;

/**
 *
 * @author Daniel Alcoleas <your.name at your.org>
 */
public class PruebaMov  extends JPanel implements ActionListener, KeyListener{
    Timer t = new Timer(5, this);
    int x = 0, y = 0, velx =0, vely =0;
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    Image image1 = toolkit.getImage("right.gif");
    Image image2 = toolkit.getImage("left.gif");
    Image image = image1;
    
    boolean readyToFire, shot = false;
    
    public PruebaMov (){
        t.start(); 
        addKeyListener(this); 
        setFocusable(true); 
        setFocusTraversalKeysEnabled(false); 
    }
    
        
    public void paintComponent(Graphics g) {
        //Toolkit t = Toolkit.getDefaultToolkit();
        //Image i = t.getImage("right.gif"); 
        super.paintComponent(g);
        //g.setColor(Color.RED); 
        //g.fillRect(x,y,50,30); 
        g.drawImage(image, x, y, this);
    } 
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(x < 0) { 
            velx=0; x = 0; 
        } 
        if(x > 530) { 
            velx=0; x = 530; 
        } 
        if(y < 0) { 
            vely=0; y = 0; 
        }
        if(y > 330) { 
            vely=0; y = 330; 
        } 
        x += velx; 
        y += vely; 
        repaint();
    }
    
     @Override
    public void keyTyped(KeyEvent e) { 
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode(); 
        if (code == KeyEvent.VK_DOWN){ 
            vely = 10; 
            velx = 0;
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        } 
        if (code == KeyEvent.VK_UP){ 
            vely = -10; velx = 0;
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        } 
        if (code == KeyEvent.VK_LEFT){     
            vely = 0; velx = -10; 
            System.out.println("x: " + x);
            System.out.println("y: " + y);
            image = image2;
        } 
        if (code == KeyEvent.VK_RIGHT){ 
            vely = 0; velx = 10;
            System.out.println("x: " + x);
            System.out.println("y: " + y);
            image = image1;
        }
        
        if (code == KeyEvent.VK_X){
            System.out.println("Shoot");
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        velx=0; 
        vely=0;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame(); 
        PruebaMov p = new PruebaMov(); 
        f.add(p); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f.setSize(600,400); 
        f.setVisible(true); 
    }
    
}



