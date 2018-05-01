/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Daniel Alcoleas <your.name at your.org>
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] numeros = {3,5,10,11,-2,-3};
        int resultado = 0;
        
        for (Integer num:numeros){
            resultado += (num > 0) ? -num:num;
            
        }
        
        resultado = resultado/numeros.length;
        System.out.println(resultado);        
             
    }
    
}
