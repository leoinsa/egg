/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Leo
 */
public class Rectangulo {
    // Atributos
    private double lado1;
    private double lado2;
    
    // Constructor
    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    // Método para calcular el área del rectángulo
    public double calcularArea() {
        return lado1 * lado2;
    }

}
