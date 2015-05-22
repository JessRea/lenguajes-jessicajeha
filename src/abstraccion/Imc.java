
package abstraccion;


public class Imc {
float peso;
float altura;

public Imc(float p,float a){
    peso=p;
    altura=a;


}

public String calcular(){
float imc=peso/(altura*altura);
return "Tu imc es " +imc;
        }
}
