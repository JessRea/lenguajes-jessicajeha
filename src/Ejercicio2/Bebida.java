
package Ejercicio2;

/**
 *
 * @author T-107
 */
public class Bebida {
    String tipo;
    String [] bebidas;

    public String[] obtenerRecomendaciones(){
        if(tipo.equals("alcoholicas")){
    String []alcohol={"cerveza","vino","whisky","Pulque", "Rompope"};
        return alcohol;
        }
        else
        {
    String []sinalcohol={"Agua","Coca-cola","Red-Bull","Jugo","Agua de sabor"};
        return sinalcohol;
    }
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getBebidas() {
        return bebidas;
    }

    public void setBebidas(String[] bebidas) {
        this.bebidas = bebidas;
    }
    

}

