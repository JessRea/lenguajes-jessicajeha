
package collection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author T-107
 */
public class GeneradorDeUsuarios {
    
    private List<Usuario>usuarios;

    public GeneradorDeUsuarios(){
    Usuario u1=new Usuario ("juan",42,"jc@gmail.com");
    Usuario u2=new Usuario ("Ana",43,"ana@gmail.com");
    Usuario u3=new Usuario ("Pedro",42,"pedro@gmail.com");
    
    usuarios=new ArrayList<Usuario>();
    
    }
    
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
}
