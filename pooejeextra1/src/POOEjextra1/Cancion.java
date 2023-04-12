/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOEjextra1;

/**
 *
 * @author Leo
 */
public class Cancion {
//atributos
    public String autor;
    public String titulo;
    
    
    public void Cancion(){
        
    }
   public Cancion(String autor, String titulo){
       this.autor = autor;
       this.titulo = titulo;        
       
   }
   
   public String getAutor(){
       return autor;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
   public void setAutor(String autor){
      this.autor = autor;





    
}

