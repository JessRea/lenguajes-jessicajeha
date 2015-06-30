
package Evaluacion;

//en abstract no se puede crear un objeto a partir de el 
public abstract class Examen {
    int calificacion;
    //encapsulacion getters and setter
    float porcentaje ;

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }
}
