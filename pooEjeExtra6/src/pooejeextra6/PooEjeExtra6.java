/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejeextra6;

import entidad.Empleado;

/**
 *
 * @author Leo
 */
public class PooEjeExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Juan", 35, 5000.0);
    emp1.calcularAumento();
    System.out.println("El nuevo salario de " + emp1.getNombre() + " es: " + emp1.getSalario());

    }
    
}
