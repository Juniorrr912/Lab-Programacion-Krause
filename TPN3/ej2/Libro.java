package ej2 ;
public class Libro {
    private String titulo;
    private String isbn;

    public Libro(String titulo, String isbn) {
    	this.titulo = titulo;
    	this.isbn = isbn;
    }

    public void mostrar() {
        System.out.println("Libro: " + titulo);
        System.out.println("ISBN: " + isbn);
    }
}