package ej2;

public class Main {
    public static void main(String[] args) {
        Libro L1 = new Libro("978-84-12345-01", "Madrid");
        Libro L2 = new Libro("978-84-12345-02", "Barcelona");
        Libro L3 = new Libro("978-01-41392-36", "It");
        Libro L4 = new Libro("978-01-56030-41", "El Principito");
        Libro L5 = new Libro("978-35-22177-83", "Momo");

        Libro L6 = new Libro("978-11-11111-11", "Harry Potter");
        Libro L7 = new Libro("978-22-22222-22", "El Hobbit");
        Libro L8 = new Libro("978-33-33333-33", "1984");
        Libro L9 = new Libro("978-44-44444-44", "Don Quijote");
        Libro L10 = new Libro("978-55-55555-55", "Cien Años de Soledad");

        Libro L11 = new Libro("978-66-66666-66", "La Odisea");
        Libro L12 = new Libro("978-77-77777-77", "Hamlet");
        Libro L13 = new Libro("978-88-88888-88", "Fahrenheit 451");
        Libro L14 = new Libro("978-99-99999-99", "Drácula");
        Libro L15 = new Libro("978-00-00000-00", "Orgullo y Prejuicio");

        Socio S1 = new Socio("Junior", 9);
        Socio S2 = new Socio("Licha", 1);
        Socio S3 = new Socio("Ulises", 2);

        S1.agregarLibro(L1);
        S1.agregarLibro(L2);
        S1.agregarLibro(L3);
        S1.agregarLibro(L4);
        S1.agregarLibro(L5);

        S2.agregarLibro(L6);
        S2.agregarLibro(L7);
        S2.agregarLibro(L8);
        S2.agregarLibro(L9);
        S2.agregarLibro(L10);

        S3.agregarLibro(L11);
        S3.agregarLibro(L12);
        S3.agregarLibro(L13);
        S3.agregarLibro(L14);
        S3.agregarLibro(L15);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarSocio(S1);
        biblioteca.agregarSocio(S2);
        biblioteca.agregarSocio(S3);

        biblioteca.mostrarTodo();
    }
}