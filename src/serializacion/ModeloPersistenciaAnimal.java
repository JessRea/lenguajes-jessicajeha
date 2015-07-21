
package serializacion;

/**
 *
 * @author T-107
 */
import java.io.*;
public class ModeloPersistenciaAnimal {
    public void guardar(Animal animal) throws Exception
    {
        //paso1 crear el archivo donde se guardara el animal
        File file=new File("D:\\animalitos.xxx");
        
        FileOutputStream fos=new FileOutputStream(file); //el tubito
        ObjectOutputStream oos=new ObjectOutputStream(fos); //la clase compresora
        oos.writeObject(animal);
        System.out.println("Animalito comprimido con exito");
    
    }
}
