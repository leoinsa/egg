/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra6datosporconsola;

import entidad.Empleado;
import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class PooExtra6datosPorConsola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nombre del empleado: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese edad del empleado: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese salario del empleado: ");
        double salario = sc.nextDouble();

        Empleado empleado = new Empleado(nombre, edad, salario);
        empleado.calcularAumento();

        System.out.println("El nuevo salario de " + empleado.getNombre() + " es: " + empleado.getSalario());
    }
      
}
