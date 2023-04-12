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
public class Cocina {
   private String[] recetas;

    public Cocina() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de recetas: ");
        int num_recetas = scanner.nextInt();
        scanner.nextLine();
        this.recetas = new String[num_recetas];
        for (int i = 0; i < num_recetas; i++) {
            System.out.print("Ingrese el nombre de la receta " + (i + 1) + ": ");
            String nombre_receta = scanner.nextLine();
            this.recetas[i] = nombre_receta;
        }
    }

    public int encontrar_receta(String nombre_receta) {
        for (int i = 0; i < this.recetas.length; i++) {
            if (this.recetas[i].equals(nombre_receta)) {
                return i;
            }
        }
        return -1;
    }

    public void mostrar_recetas() {
        for (int i = 0; i < this.recetas.length; i++) {
            System.out.println(i + 1 + ". " + this.recetas[i]);
        }
    }
