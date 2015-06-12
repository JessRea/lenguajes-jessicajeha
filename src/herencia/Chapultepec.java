
package herencia;

/**
 *
 * @author T-107
 */
public class Chapultepec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Vamos a crear animalitos
        Pollo p1=new Pollo();
        p1.setNombre("Toto");
        
        Leon l1=new Leon();
        l1.setNombre("Simba");
        
        Leon l2=new Leon();
        l2.setNombre("Mufasa");
        
        Delfin d1=new Delfin();
        d1.setNombre("Flipper");
        
        Tortuga t1=new Tortuga();
        t1.setNombre("Verne");
        
        ComportamientoRuido animales[]=new ComportamientoRuido[4];
        animales [0]=p1;
        animales [1]=l1;
        animales [2]=l2;
        animales [3]=d1;
        
      for (ComportamientoRuido algo:animales){
          System.out.println (algo.hacerRuido());

    }
        
    }
    
    
}
