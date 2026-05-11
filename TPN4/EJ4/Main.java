package ej4;

public class Main {
    public static void main(String[] args) {
        Cancion c1 = new Cancion("Ji Ji Ji", 5.34);
        Cancion c2 = new Cancion("En La Ciudad de la Furia", 5.45);
        Cancion c3 = new Cancion("Hablando de la Libertad", 6.09);

        Playlist miLista = new Playlist("Rock Nacional", "Rock");

        miLista.agregarCancion(c1);
        miLista.agregarCancion(c2);
        miLista.agregarCancion(c3);
        System.out.println("Playlist: " + miLista.getNombre());
        System.out.println("Género: " + miLista.getGenero());
        System.out.println("Lista de temas:");
        
        for (Cancion c : miLista.getCanciones()) {
            System.out.println("- " + c.getTitulo() + " (" + c.getDuracion() + " min)");
        }
    }
}