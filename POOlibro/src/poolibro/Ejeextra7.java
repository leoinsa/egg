/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeextra7;

import entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class Ejeextra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear el objeto rectangulo1 con lados de 4 y 6
    //Rectangulo rectangulo1 = new Rectangulo(4, 6);
    
    // Calcular y mostrar el área del rectángulo
    //double area = rectangulo1.calcularArea();
    //System.out.println("El área del rectángulo es: " + area);

//de esta manera lo calculamos ingresando los lados por consola
    
    
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor del lado 1:");
        double lado1 = sc.nextDouble();
        System.out.println("Ingrese el valor del lado 2:");
        double lado2 = sc.nextDouble();

        Rectangulo rectangulo1 = new Rectangulo(lado1, lado2);
        System.out.println("El área del rectángulo es: " + rectangulo1.calcularArea());
    
    }
    
}
