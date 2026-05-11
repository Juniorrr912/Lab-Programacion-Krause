package ej5;

public class Main {
    public static void main(String[] args) {
        Cocinero unCocinero = new Cocinero("Junior");

        MenuVegano plato1 = new MenuVegano("Lunes", 450, 20);

        MenuCeliaco plato2 = new MenuCeliaco("Martes", 500, "Certificado Nacional A-101");

        MenuVegano platomal = new MenuVegano("Miércoles", -100, 15);

        unCocinero.agregarMenu(plato1);
        unCocinero.agregarMenu(plato2);
        unCocinero.agregarMenu(platomal);

        System.out.println("Cocinero a cargo: " + unCocinero.getNombre());
        System.out.println("Menú 1: " + plato1.getDiaSemana() + " Calorías: " + plato1.getCaloriasTotales());
        System.out.println("Menú 2: " + plato2.getDiaSemana() + " Certificado: " + plato2.getCertificadoSinTACC());
        System.out.println("Menú 3: " + platomal.getDiaSemana() + " Calorías corregidas: " + platomal.getCaloriasTotales());
    }
}