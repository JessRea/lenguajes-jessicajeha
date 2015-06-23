/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author T-107
 */
public class Antro {

   
    public static void main(String[] args) {
        
        //Direccion d1=new Direccion(55555,"Ecatepec");
        
        //Usuario u1=new Usuario("Juan",42,"jacampos@gmail.com",); 
        
        Usuario u1=new Usuario( "Juan",42,"jacampos@gmail.com",new Direccion(44233,"Ecatepec"));
        System.out.println(u1.getDireccion().getMunicipio());
        }
    }
    

