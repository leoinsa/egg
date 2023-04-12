/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeje1guia_8;
import entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;
/**
 *
 * @author Leo
 */
public class PooEje1Guia_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     CuentaBancariaServicio cuentaBancariaServicio = new CuentaBancariaServicio();

    // Crear cuenta
    cuentaBancariaServicio.crearCuenta();

    // Ingresar dinero
    cuentaBancariaServicio.ingresar(100);

    // Retirar dinero
    cuentaBancariaServicio.retirar(50);

    // Extracción rápida
    cuentaBancariaServicio.extraccionRapida();

    // Consultar saldo
    cuentaBancariaServicio.consultarSaldo();

    // Consultar datos de la cuenta
    cuentaBancariaServicio.consultarDatos();
}
}