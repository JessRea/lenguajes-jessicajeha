/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiPrimeraExcepcion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-107
 */
public class ProbarValidaciones {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int edad=19;
        System.out.println("vamos a validar tu edad");
        try {
            
            ValidarEdad.validar(edad);
            System.out.println("si tu te vez no se lanzó la excepcion y eres mayor");
            
        } 
        catch (MenorEdadException ex) {
            System.out.println(ex.getMessage());
        }
          catch (NumberFormatException ex){
              System.out.println("metiste letras, tonto");
         }
    }
    
}
