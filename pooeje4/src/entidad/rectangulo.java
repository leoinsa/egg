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
public class rectangulo {
    //atributos
    
    private int base;
    private int altura;
    
    public void rectangulo(){
        
    }
    public void crearRectangulo() {    
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la base");
        base = sc.nextInt();
        System.out.println("ingrese la altura");
        altura = sc.nextInt();

    }
            
    public int calcSuperficie(){
        return base*altura;       
        
    }
    
    public int calcPerimetro(){
        return (base+altura)*2;        
    }
    
    public void dibujarRectangulo(){
        
        for (int i=1; i <= altura; i++){
            for (int j=1; j <= base; j++){
                if (i==1 || j==1 || i==altura || j==base)
                    System.out.print("+");
                   else 
                    System.out.print(" ");       
                            
        }
            System.out.println(""); 
                
    }
    }

