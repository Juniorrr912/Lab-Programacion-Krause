package ej1;

public class Main {
    public static void main(String[] args) {

        Herramienta[] herramientas = new Herramienta[5];

        herramientas[0] = new HerramientaElectrica("Black+Decker",1, 220);
        herramientas[1] = new HerramientaElectrica("Skill",2, 110);


        herramientas[2] = new HerramientaManual(3, "Truper", "Madera");
        herramientas[3] = new HerramientaManual(4, "Pretul", "Goma");
        herramientas[4] = new HerramientaManual(5, "Generic", "Plástico");

        for (int i = 0; i < herramientas.length; i++) {
            System.out.println("\nHERRAMIENTA " + (i + 1));
            if (herramientas[i] != null) {
                herramientas[i].operar();
            }
        }
    }
}
