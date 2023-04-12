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
public class Cuenta {
        //atributos
    private String titular;
    private double saldo;

    //constructor con atributos
    public Cuenta(String titular) {
        this.titular = titular;
        this.saldo = 100000.0; // Saldo inicial de 100000
    }
        //metodo para retirar dinero
    public void retirar_dinero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad a retirar: ");
        double cantidad = scanner.nextDouble();
        if (cantidad <= this.saldo) {
            this.saldo -= cantidad;
            System.out.println("Retiro exitoso.");
        } else {
            System.out.println("No se puede retirar esa cantidad. Saldo insuficiente.");
        }
        if (this.saldo < 0) {
            this.saldo = 0;
            System.out.println("El saldo ha quedado en 0 debido a la transacción.");
        }
        scanner.close();
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
