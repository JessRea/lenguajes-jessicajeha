package encapsulamiento;


public class Usuario {
    //1.- regla de encanpsulamiento, poner los atributos privado
private String nombre;
private int edad;

public void setNombre(String nombre){
this.nombre=nombre;
}

public void setEdad(int edad){
this.edad=edad;
}

public String getNombre(){
return nombre;
        }
public int getEdad(){
return edad;
        }

}
