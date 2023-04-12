/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeje4;

import entidad.rectangulo;

public class Pooeje4{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rectangulo calculo = new rectangulo();
        calculo.crearRectangulo();
        System.out.println("la superficie es "+calculo.calcSuperficie());
        System.out.println("el perimetro es "+calculo.calcPerimetro());
        calculo.dibujarRectangulo();
    }
    
}
