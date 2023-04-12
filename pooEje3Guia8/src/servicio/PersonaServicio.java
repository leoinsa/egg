/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;
import entidades.Persona;
import java.util.Scanner;
/**
 *
 * @author Leo
 */
public class PersonaServicio {
    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }

    public void crearPersona(Persona persona) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre:");
        persona.setNombre(scanner.nextLine());

        System.out.println("Ingrese la edad:");
        persona.setEdad(scanner.nextInt());

        System.out.println("Ingrese el sexo (H/M/O):");
        char sexo = scanner.next().charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("Sexo incorrecto, ingrese H, M o O:");
            sexo = scanner.next().charAt(0);
        }
        persona.setSexo(sexo);

        System.out.println("Ingrese el peso en kg:");
        persona.setPeso(scanner.nextDouble());

        System.out.println("Ingrese la altura en metros:");
        persona.setAltura(scanner.nextDouble());
    }

    public int calcularIMC(Persona persona) {
        double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
}

