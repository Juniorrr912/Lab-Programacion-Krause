package Matrices;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> inventario = new ArrayList<Libro>();

    public void añadirLibro(Libro l) {
        inventario.add(l);
    }

    public void listarLibros() {
        System.out.println("LISTA DE LIBROS EN LA BIBLIOTECA");
        for (Libro l : inventario) {
            System.out.println("ISBN: " + l.getIsbn() + " Título: " + l.getTitulo() + " Páginas: " + l.getCantidadPaginas());
        }
    }

    public int obtenerCantidadLibros() {
        return inventario.size();
    }
}