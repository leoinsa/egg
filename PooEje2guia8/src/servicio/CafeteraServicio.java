/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Cafetera;

/**
 *
 * @author Leo
 */
public class CafeteraServicio {
    public void llenarCafetera(Cafetera service){
        service.setCantactual(service.getCantmax());
        System.out.println("Cafetera llena.");
    }
    
    public Cafetera crearCafetera(){
      return new Cafetera();
          
    }

    public void servirTaza(int cantCafe, Cafetera small){
        if (cantCafe <= small.getCantactual()){
            small.setCantactual(small.getCantactual()-cantCafe);
            System.out.println("la cantidad de cafe alcanzo");
        }else{
            System.out.println("no hay suficiente cantidad de cafe. Te sirvo"+small.getCantactual());
            small.setCantactual(0);
        }
    }
    
    public void agregarCafe(int reponerCafe, Cafetera agregar){
        if(reponerCafe<=agregar.getCantmax()-agregar.getCantactual())
            agregar.setCantactual(agregar.getCantactual()+reponerCafe);
        System.out.println("Se agregaron " +reponerCafe + " ml de café a la cafetera.");
    }
        public void vaciarCafetera(Cafetera limpiar){
        limpiar.setCantactual(0);     
        System.out.println("Cafetera vacía.");
        }
        
 }


/*public void agregarCafe(int cantidad) {
        int nuevaCantidad = cafetera.getCantidadActual() + cantidad;
        if (nuevaCantidad <= cafetera.getCapacidadMaxima()) {
            cafetera.setCantidadActual(nuevaCantidad);
            System.out.println("Se agregaron " + cantidad + " ml de café a la cafetera.");
        } else {
            int cafeExtra = nuevaCantidad - cafetera.getCapacidadMaxima();
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
            System.out.println("Se agregaron " + (cantidad - cafeExtra) + " ml de café a la cafetera. No se pudieron agregar " + cafeExtra + " ml porque exceden la capacidad máxima.");
*/