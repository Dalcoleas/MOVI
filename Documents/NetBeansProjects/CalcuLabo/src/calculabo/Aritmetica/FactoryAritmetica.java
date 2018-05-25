
package calculabo.Aritmetica;

import calculabo.AbstractFactory;
import calculabo.Convertidor.Convertidor;


public class FactoryAritmetica implements AbstractFactory{
    
   @Override
    public Convertidor getConvertor(String tipo) {
        return null;
    }
    
    @Override
    public Aritmetica getAritmetica(String tipo) {
        switch (tipo) {
            case "suma":
                return new Suma();
            case "resta":
                return new Resta();
            case "multiplicacion":
                return new Multiplicacion();
            case "division":
                return new Division();
        }
        return null;
    }
    
}
