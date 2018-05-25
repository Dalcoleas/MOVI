/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculabo.Convertidor;

/**
 *
 * @author Daniel Alcoleas <your.name at your.org>
 */
public class Binario implements Convertidor{
    @Override
    public String convertir(int a){
        String b = " ";
        if (a >0){
            while ( a > 0){
                if (a % 2 == 0){
                    b = "0" + b;
                }else{
                    b = "1" + b;
                }
                a = (int)a/2;
            }
        }
        else if (a == 0){
            b = "0";
        }
        else {
            b = "No se pudo convertir";
        }
        return b;
    } 
}
