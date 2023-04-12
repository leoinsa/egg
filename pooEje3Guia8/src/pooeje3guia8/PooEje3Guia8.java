/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeje3guia8;
import entidades.Persona;
import servicio.PersonaServicio;
/**
 *
 * @author Leo
 */
public class PooEje3Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio personaServicio = new PersonaServicio();

        // Crear 4 objetos Persona con distintos valores
        Persona persona1 = new Persona("Juan", 25, 'H', 70.0, 1.8);
        Persona persona2 = new Persona("María", 30, 'M', 55.0, 1.6);
        Persona persona3 = new Persona("Pedro", 17, 'H', 80.0, 1.9);
        Persona persona4 = new Persona("Ana", 40, 'M', 65.0, 1.7);
    }
    
}
