/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejeextra4;

import entidad.Cocina;
import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class PooEjeExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cocina cocina = new Cocina();
        cocina.mostrar_recetas();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la receta a buscar: ");
        String nombre_receta = scanner.nextLine();
        int posicion = cocina.encontrar_receta(nombre_receta);
        if (posicion != -1) {
            System.out.println("La receta '" + nombre_receta + "' se encuentra en la posición " + (posicion + 1));
        } else {
            System.out.println("La receta '" + nombre_receta + "' no se encuentra en la lista.");
        }
    }
}
        

