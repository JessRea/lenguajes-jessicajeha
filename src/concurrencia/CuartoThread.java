
package concurrencia;

/**
 *
 * @author jess
 */
public class CuartoThread extends Thread{
    
    public void run(){
    
        while(true){
        
        try{
        Thread.sleep(1000);
        System.out.println("Soy el cuarto Thread");
        }
        catch(Exception ex){
        
        
        }
        
        }
    
    
    
    
    }
    
   
    
}
