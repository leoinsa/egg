/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class Operacion {
Scanner sc = new Scanner(System.in);
    private int nro1 , nro2 ;
    
    public void Operacion(){

}
 
    public void Operacion(int nro1 , int nro2){
        this.nro1 = nro1;
        this.nro2 = nro2;
    }
    
    public int getnro1(){
        return nro1;
    }
    public void setnro1(int nro1){
        this.nro1 = nro1;
    }
    
    public int getnro2(){
        return nro2;
    }
    public void setnro2(int nro2){
        this.nro2 = nro2 ;
    }
            public void CrearOperacion(){
                Scanner leer = new Scanner(System.in);
                System.out.println("Ingrese los numeros para realizar la operación");
                this.nro1 = leer.nextInt();                
                this.nro2= leer.nextInt();
            }
            
     public int Sumar(){
         return nro1 + nro2 ;
     }      
     
     public int Restar(){
         return nro1 - nro2 ;
     }  
     /*
     public void  Multiplicar(){ 
        do{
            
        
         if (nro1==0 || nro2 == 0) {
             System.out.println("Uno de los numeros es igual a 0 por ende el resultado es 0");
             System.out.println("ingrese nuevos numeros");
             nro1 = sc.nextInt();
             nro2 = sc.nextInt();
         }else {
             System.out.println("El resultado de la multiplicación es igual a " + (nro1 * nro2));
         }
         
        } while (nro1*nro2==0); 
     }
     */
     public void Dividir(){   
         
         do{
         if (nro2 == 0) {
             System.out.println("Error , no se puede dividir por 0 ");
             System.out.println("ingrese nuevos numeros");
             nro1 = sc.nextInt();
             nro2 = sc.nextInt();
             
         } else {
             System.out.println("El resultado de la división es igual a " + (nro1 / nro2));
         }
           
        }while (nro1/nro2==0); 
      System.out.println("El resultado de la división es igual a " + (nro1 / nro2));
     }
     

