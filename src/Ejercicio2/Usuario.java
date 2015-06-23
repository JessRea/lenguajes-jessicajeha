
package Ejercicio2;


public class Usuario {
    
    private String nombre;
    private int edad;
    private String email;
    private Direccion direccion;
    
  public Usuario(){
  }
  public Usuario(String nombre, int edad, String email, Direccion direccion)
  {
  
  
    this.edad=edad;
    this.nombre=nombre;
    this. email=email;
    this.direccion=direccion;
          }

    public Direccion getDireccion() {
        return direccion;
    }
    
    public void setDireccion(Direccion direccion){
    this.direccion=direccion;
    }
    
   
    
  

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
