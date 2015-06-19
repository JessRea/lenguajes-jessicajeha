
package MiPrimeraExcepcion;

public class ValidarEdad {
    //preparate porque va a haber una excepcion: throws
    public static void validar(int edad)throws MenorEdadException{
          
        if(edad<18) throw new MenorEdadException();
    }
    
}
