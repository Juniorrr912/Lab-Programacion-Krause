package main;
import java.util.*;

public class ejercicio10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] palabras = {"java", "codigo", "teclado", "pantalla", "mouse"};
        String palabra = palabras[random.nextInt(palabras.length)];

        char[] prog = new char[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            if (i == 0) {
                prog[i] = palabra.charAt(i);
            } else {
                prog[i] = '_';
            }
        }

        int letrasCorrectas = 1;

        while (letrasCorrectas < palabra.length()) {

            System.out.print("Palabra: ");
            for (int i = 0; i < prog.length; i++) {
                System.out.print(prog[i] + " ");
            }
            System.out.println();

            System.out.print("Ingresa una letra: ");
            char letra = scanner.next().charAt(0);

            boolean acierto = false;

            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra && prog[i] == '_') {
                    prog[i] = letra;
                    letrasCorrectas++;
                    acierto = true;
                }
            }

            if (!acierto) {
                System.out.println("Incorrecto");
            }
        }

        System.out.println("Ganaste, La palabra era: " + palabra);

        scanner.close();
    }
}
