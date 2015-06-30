
package Evaluacion;


public class ModeloEvaluacion {
   
    public float evaluar(ExamenParcial cParcial, ExamenFinal cFinal) throws PorcentajesException{

        float pParcial=cParcial.getPorcentaje();
        float pFinal=cFinal.getPorcentaje();
        
        if((pParcial+pFinal)!=1.0f) throw new PorcentajesException(); //si es igual a 1.0 flotante sigue con lo demás, si no ve a "porcentajes Excepcion"
        
        float calificacionFinal=cParcial.getCalificacion()*cParcial.getPorcentaje()+cFinal.getCalificacion()*cFinal.getPorcentaje();
    
        return calificacionFinal;
        
        
    }
    
}
