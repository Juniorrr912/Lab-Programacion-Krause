package main;

import java.util.*;

public class ejercicio8 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Random random = new Random();

       String[] pals = {"java", "codigo", "computadora", "teclado", "pantalla"};
       String pal = pals[random.nextInt(pals.length)];

       char[] progreso = new char[pal.length()];

       for (int i = 0; i < progreso.length; i++) {
           progreso[i] = '_';
       }

       int letrasCorrectas = 0;

       while (letrasCorrectas < pal.length()) {

           System.out.print("Palabra: ");
           for (int i = 0; i < progreso.length; i++) {
               System.out.print(progreso[i] + " ");
           }
           System.out.println();

           System.out.print("Ingresa una letra: ");
           char letra = scanner.next().charAt(0);

           boolean acierto = false;

           for (int i = 0; i < pal.length(); i++) {
               if (pal.charAt(i) == letra && progreso[i] == '_') {
                   progreso[i] = letra;
                   letrasCorrectas++;
                   acierto = true;
               }
           }

           if (!acierto) {
               System.out.println("Incorrecto");
           }
       }

       System.out.println("Ganaste La palabra era: " + pal);

       scanner.close();
   }
}


