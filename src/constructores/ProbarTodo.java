
package constructores;

import javax.swing.JFrame;


public class ProbarTodo {

    
    public static void main(String[] args) {
        Test1 objeto1=new Test1(6);
        Test1 objeto2=new Test1();
        
        JFrame ventana=new JFrame("Mi ventanita ^-^");
               ventana.setSize(400, 400);
               ventana.setVisible(true);
    }
    
}
