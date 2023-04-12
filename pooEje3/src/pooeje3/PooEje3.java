/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeje3;

import entidad.Operacion;

/**
 *
 * @author Leo
 */
public class PooEje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion cuentas = new Operacion();
     // Scanner leer = new Scanner(System.in);
       cuentas.CrearOperacion();
      System.out.println("El resultado de la suma es igual a " + cuentas.Sumar() );
      System.out.println("El resultado de la resta es igual a " + cuentas.Restar() );      
      //cuentas.Multiplicar();
      cuentas.Dividir();
    }
    }
    

