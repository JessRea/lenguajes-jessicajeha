/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unchekedexceptions;

/**
 *
 * @author T-107
 */
public class ProbarExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ////EXAMEN !!!!!
        //int a=5;
        float a=5;
        int b=0;
        
        //en los flotantes si se puede dividir 
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a-b);
        
        ///////////////////////////////////////////////////////////
       Integer i=new Integer("5");
       // Integer i=new Integer("otro"); number format exception
        int otro=5;
      //  System.out.println(i+otro);
        
        int []m={2,5,6,7
        };
        
        //System.out.println(m[4]); //es porque no hay 4 espacio array
    }
    
}
