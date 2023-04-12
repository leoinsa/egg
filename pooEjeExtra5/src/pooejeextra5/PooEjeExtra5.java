/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejeextra5;

import entidad.Cuenta;

/**
 *
 * @author Leo
 */
public class PooEjeExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("Juan Perez");
        System.out.println("Titular de la cuenta: " + cuenta.getTitular());
        System.out.println("Saldo inicial de la cuenta: " + cuenta.getSaldo());
        cuenta.retirar_dinero();
        System.out.println("Saldo actual de la cuenta: " + cuenta.getSaldo());
    }
}
    
}
