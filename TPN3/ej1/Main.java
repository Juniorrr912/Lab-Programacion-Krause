package main;

public class Main {
    public static void main(String[] args) {

        Herramienta[] herramientas = new Herramienta[5];

        // Herramientas Eléctricas (ID, Marca, Voltaje)
        herramientas[0] = new HerramientaElectrica(1, "Black+Decker", 220);
        herramientas[1] = new HerramientaElectrica(2, "Skill", 110);

        // Herramientas Manuales (ID, Marca, Material del mango)
        herramientas[2] = new HerramientaManual(3, "Truper", "Madera");
        herramientas[3] = new HerramientaManual(4, "Pretul", "Goma");
        herramientas[4] = new HerramientaManual(5, "Generic", "Plástico");

        for (int i = 0; i < herramientas.length; i++) {
            System.out.println("\n--- HERRAMIENTA " + (i + 1) + " ---");
            if (herramientas[i] != null) {
                herramientas[i].operar();
            }
        }
    }
}