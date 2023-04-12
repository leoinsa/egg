/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println ("ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println ("ingrese otro numero");
        int num2 = leer.nextInt();
        //int suma = num1 + num2;
        //double division = num1 / num2;
        //boolean logico = num2 < num1;
        //num1++;
        int r = num1 + num2;    
        System.out.println ("el resultado es"+ r);




}

}