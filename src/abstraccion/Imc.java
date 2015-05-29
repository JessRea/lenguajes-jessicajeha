/*

To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor. */ package abstraccion;
/**
*

@author T-107
*/
public class Imc {
private float peso;
private float altura;
private boolean flaco;
public void setFlaco(boolean flaco){
this.flaco=flaco;
}
public boolean isFlaco(){
return flaco;
}

public void setpeso(float peso){ 
this.peso=peso;
}
public void setaltura(float altura){
this.altura=altura;
}
public float getPeso(){
return peso;
}
public float getAltura(){
return altura;
} 
public Imc(){ 

}
public Imc (float p, float a){
peso=p;
altura=a;
}

public String calcular(){
float imc=peso/(altura*altura);
return "Tu imc es:"+imc;
}
}