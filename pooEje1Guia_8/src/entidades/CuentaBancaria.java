/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Leo
 */

package Servicios;
import Entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {
    private Scanner scanner = new Scanner(System.in);
    private CuentaBancaria cuentaBancaria;

    public void crearCuenta() {
        cuentaBancaria = new CuentaBancaria();

        System.out.print("Ingrese el número de cuenta: ");
        cuentaBancaria.setNumeroCuenta(scanner.nextInt());

        System.out.print("Ingrese el DNI del cliente: ");
        cuentaBancaria.setDniCliente(scanner.nextLong());

        System.out.print("Ingrese el saldo actual: ");
        cuentaBancaria.setSaldoActual(scanner.nextDouble());
    }

    public void ingresar(double cantidad) {
        cuentaBancaria.setSaldoActual(cuentaBancaria.getSaldoActual() + cantidad);
        System.out.println("Se ha ingresado " + cantidad + " a la cuenta.");
    }

    public void retirar(double cantidad) {
        if (cuentaBancaria.getSaldoActual() >= cantidad) {
            cuentaBancaria.setSaldoActual(cuentaBancaria.getSaldoActual() - cantidad);
            System.out.println("Se ha retirado " + cantidad + " de la cuenta.");
        } else {
            System.out.println("La cuenta no tiene suficiente saldo para retirar " + cantidad);
            System.out.println("Se retirará el saldo máximo posible para dejar la cuenta en 0.");
            double maximoRetiro = cuentaBancaria.getSaldoActual();
            cuentaBancaria.setSaldoActual(0);
            System.out.println("Se ha retirado " + maximoRetiro + " de la cuenta.");
        }
    }

    public void extraccionRapida() {
        double maximoRetiro = cuentaBancaria.getSaldoActual() * 0.2;
        System.out.print("Ingrese la cantidad que desea retirar (máximo " + maximoRetiro + "): ");
        double cantidad = scanner.nextDouble();

        if (cantidad <= maximoRetiro) {
            cuentaBancaria.setSaldoActual(cuentaBancaria.getSaldoActual() - cantidad);
            System.out.println("Se ha retirado " + cantidad + " de la cuenta.");
        } else {
            System





























public void consultarSaldo() {
        System.out.println("El saldo disponible en la cuenta es: " + cuentaBancaria.getSaldoActual());
    }

    public void consultarDatos() {
        System.out.println("Número de cuenta: " + cuentaBancaria.getNumeroCuenta());
        System.out.println("DNI del cliente: " + cuentaBancaria.getDniCliente());
        System.out.println("Saldo actual: " + cuentaBancaria.getSaldoActual());
    }
}