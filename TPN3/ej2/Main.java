package main;

public class Main {
    public static void main(String[] args) {

        Libro L1 = new Libro("978-84-12345-01", "Madrid");
        Libro L2 = new Libro("978-84-12345-02", "Barcelona");
        Libro L3 = new Libro("978-01-41392-36", "It");
        Libro L4 = new Libro("978-01-56030-41", "El Principito");
        Libro L5 = new Libro("978-35-22177-83", "Momo");

        Socio S1 = new Socio("Junior", 9);
        Socio S2 = new Socio("Licha", 1);
        Socio S3 = new Socio("Ulises", 2);
        S1.agregarLibro(L1);
        S1.agregarLibro(L2);

        S2.agregarLibro(L3);
        S2.agregarLibro(L4);

        S3.agregarLibro(L5);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarSocio(S1);
        biblioteca.agregarSocio(S2);
        biblioteca.agregarSocio(S3);

        biblioteca.mostrarTodo();
    }
}