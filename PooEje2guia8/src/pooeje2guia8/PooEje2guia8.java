/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeje2guia8;
import entidad.Cafetera;
import java.util.Scanner;
import servicio.CafeteraServicio;
/**
 *
 * @author Leo
 */
public class PooEje2guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteraServicio servicio = new CafeteraServicio();
        Cafetera caf = servicio.crearCafetera();
        Scanner scanner = new Scanner(System.in);
        
         int opcion = 0;
        do {
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar café");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
        
        switch (opcion) {
                case 1:
                    servicio.llenarCafetera(caf);
                    break;
                case 2:
                    System.out.print("Ingrese el tamaño de la taza : ");
                    int tamanoTaza = scanner.nextInt();
                    servicio.servirTaza(tamanoTaza, caf);
                    break;
                case 3:
                    servicio.vaciarCafetera(caf);
                    break;
                case 4:
                    System.out.print("Ingrese la cantidad de café a agregar (ml): ");
                    int cantidadCafe = scanner.nextInt();
                    servicio.agregarCafe(cantidadCafe, caf);
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
            System.out.println();
        } while (opcion != 5);
    }

}
   
    
