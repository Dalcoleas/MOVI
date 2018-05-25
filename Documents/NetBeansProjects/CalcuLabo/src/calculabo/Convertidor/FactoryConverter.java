/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculabo.Convertidor;

import calculabo.AbstractFactory;
import calculabo.Aritmetica.Aritmetica;

/**
 *
 * @author Daniel Alcoleas <your.name at your.org>
 */
public class FactoryConverter implements AbstractFactory {
    
    @Override
    public Aritmetica getAritmetica(String tipo) {
        return null;
    }
    
    @Override
    public Convertidor getConvertor(String tipo) {
        switch (tipo) {
            case "binario":
                return new Binario();
        }
        return null;
    }
}
