
package calculabo.Convertidor;

import calculabo.AbstractFactory;
import calculabo.Aritmetica.Aritmetica;


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
