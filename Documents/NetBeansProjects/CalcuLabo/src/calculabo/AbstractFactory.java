/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculabo;

import calculabo.Aritmetica.Aritmetica;
import calculabo.Convertidor.Convertidor;

/**
 *
 * @author LN710Q
 */
public interface AbstractFactory {
    Aritmetica getAritmetica(String type);
    Convertidor getConvertor(String type);
    
}
