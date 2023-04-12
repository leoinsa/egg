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
public class Cafetera {
    
    private final int cantmax;
    private int cantactual;

    public Cafetera(int cantmax, int cantactual) {
        this.cantmax = cantmax;
        this.cantactual = cantactual;
    }

    public Cafetera() {
        this.cantmax=3;
    }


    public int getCantmax() {
        return cantmax;
    }

    public int getCantactual() {
        return cantactual;
    }

    public void setCantactual(int cantactual) {
        this.cantactual = cantactual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "cantmax=" + cantmax + ", cantactual=" + cantactual + '}';
    }
    
    
}
