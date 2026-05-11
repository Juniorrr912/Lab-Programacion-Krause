package ej3;

public class Main {
    public static void main(String[] args) {
        
        Libro libro1 = new Libro("LIB67", 1500.0, "Junior");
        ArticuloPapeleria papel1 = new ArticuloPapeleria("PAP-12", 200.0, "Papel");

        System.out.println("PRODUCTO: Libro " + libro1.getCodigo() + " de " + libro1.getAutor() + 
                           " Total:" + libro1.calcularPrecioFinal());

        System.out.println("PRODUCTO: Articulo de " + papel1.getTipoMaterial() + 
                           " Total:" + papel1.calcularPrecioFinal());
    }
}