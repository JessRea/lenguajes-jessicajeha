
package Ejercicio2;

public class Direccion {
   private String calle;
   private int numero ;
   private String colonia;
   private  int cp;
   private  String Municipio;

   public Direccion(int cp){
   this.cp=cp;
   }
   
   public Direccion (int cp,String municipio){
   this.cp=cp;
   this.Municipio=municipio;
   
   }
   
   
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle the calle to set
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the colonia
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * @param colonia the colonia to set
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * @return the cp
     */
    public int getCp() {
        return cp;
    }

    /**
     * @param cp the cp to set
     */
    public void setCp(int cp) {
        this.cp = cp;
    }

    /**
     * @return the Municipio
     */
    public String getMunicipio() {
        return Municipio;
    }

    /**
     * @param Municipio the Municipio to set
     */
    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }
}
