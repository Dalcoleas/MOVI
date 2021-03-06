
package calculabo;

import calculabo.Aritmetica.FactoryAritmetica;
import calculabo.Convertidor.FactoryConverter;


public class FactoryProducer {
    
    public static AbstractFactory getFactory(String type){
        switch (type){
            case "aritmetica":
                return new FactoryAritmetica();
            case "convertor":
                return new FactoryConverter();
        }
        return null;
    }
        
    }
