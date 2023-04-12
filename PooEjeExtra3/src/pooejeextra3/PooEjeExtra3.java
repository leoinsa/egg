/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejeextra3;

import entidad.Juego;

/**
 *
 * @author Leo
 */
public class PooEjeExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.iniciarJuego();
        System.out.println("Jugador 1 ganó " + juego.jugador1_ganadas + " veces.");
        System.out.println("Jugador 2 ganó " + juego.jugador2_ganadas + " veces.");
    }
}
    }
    
}
