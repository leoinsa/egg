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
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int numPaginas;

    // Constructor vacío
    public Libro() {
    }

    // Constructor con todos los atributos
    public Libro(String isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    // Método para cargar un libro
    public void cargarLibro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número ISBN: ");
        this.isbn = scanner.nextLine();
        System.out.println("Introduce el título del libro: ");
        this.titulo = scanner.nextLine();
        System.out.println("Introduce el autor del libro: ");
        this.autor = scanner.nextLine();
        System.out.println("Introduce el número de páginas: ");
        this.numPaginas = scanner.nextInt();
    }

    // Método para mostrar los detalles del libro
    public void mostrarDetalles() {
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numPaginas);
    }
}
