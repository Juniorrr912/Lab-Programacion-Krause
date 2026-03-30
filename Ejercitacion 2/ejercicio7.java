package main;

import java.util.*;

public class ejercicio7 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Random random = new Random();
       
       System.out.println("1: Piedra");
       System.out.println("2: Papel");
       System.out.println("3: Tijeras");
       System.out.print("Elige una opción: ");
       int us = scanner.nextInt();

       int comp = random.nextInt(3) + 1;

       System.out.println("La computadora eligió: " + comp);

       if (us == comp) {
           System.out.println("Empate");
       } else if (
           (us == 1 && comp == 3) ||
           (us == 2 && comp == 1) ||
           (us == 3 && comp == 2)
       ) {
           System.out.println("Ganaste");
       } else if (us >= 1 && us <= 3) {
           System.out.println("Perdiste");
       } else {
           System.out.println("Opción inválida");
       }

       scanner.close();
   }
}


