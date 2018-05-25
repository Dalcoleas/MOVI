
package calculabo;

import calculabo.Aritmetica.Aritmetica;
import calculabo.Convertidor.Convertidor;


public interface AbstractFactory {
    Aritmetica getAritmetica(String type);
    Convertidor getConvertor(String type);
    
}
