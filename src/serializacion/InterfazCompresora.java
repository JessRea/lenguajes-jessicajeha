
package serializacion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-107
 */
public class InterfazCompresora {
    public static void main(String[] args) {
        //Primero crearemos un animalirijillo
    Animal a=new Animal();
    a.setNombre("Leon");
    a.setCarnivoro(true);
    ModeloPersistenciaAnimal modelo=new ModeloPersistenciaAnimal();
        try {
            modelo.guardar(a);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    
    }
}
