
package serializacion;

/**
 *
 * @author T-107
 */
import java.io.*;
import java.util.ArrayList;
public class ModeloPersistenciaAnimal {
    
    String ruta="D:\\animalitos.xxx";
    ArrayList<Animal> animales;
    public ModeloPersistenciaAnimal(){
    animales=new ArrayList<Animal>();
    }
    
    public void guardar(Animal animal) throws Exception
    {
        //paso1 crear el archivo donde se guardara el animal
        File file=new File(ruta);
        if(file.exists()){
        animales= buscarTodos();
        }
        FileOutputStream fos=new FileOutputStream(file); //el tubito
        ObjectOutputStream oos=new ObjectOutputStream(fos); //la clase compresora
       animales.add(animal);
        oos.writeObject(animales);
        System.out.println("Animalito comprimido con exito");
    
    }
    public ArrayList<Animal> buscarTodos() throws Exception{
    Animal a=new Animal();
    File f=new File(ruta);
    FileInputStream fis=new FileInputStream(f);
    ObjectInputStream ois=new ObjectInputStream(fis);
         animales=(ArrayList<Animal>) ois.readObject();
          return animales;
    }
}
