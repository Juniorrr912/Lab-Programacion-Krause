package main;

import java.util.*;

public class ejercicio6 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Random random = new Random();
       
       int numsec = random.nextInt(100) + 1;

       int inte = 0;

       System.out.println("Adivina el número (entre 1 y 100):");

       while (inte!= numsec) {
           System.out.print("Ingresa tu número: ");
           inte = scanner.nextInt();

           if (inte < numsec) {
               System.out.println("El número es MAYOR");
           } else if (inte > numsec) {
               System.out.println("El número es MENOR");
           } else {
               System.out.println("¡Correcto! Adivinaste el número 🎉");
           }
       }

       scanner.close();
   }
}


