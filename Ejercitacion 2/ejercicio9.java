package main;

import java.util.*;

public class ejercicio9{
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n = 5;
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = random.nextInt(9) + 1;
        }

        System.out.print("Memoriza: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        Thread.sleep(3000);

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        boolean correcto = true;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el numero en la posicion " + (i + 1) + ": ");
            int intento = scanner.nextInt();

            if (intento != nums[i]) {
                correcto = false;
            }
        }

        if (correcto) {
            System.out.println("Ganaste");
        } else {
            System.out.println("Perdiste");
            System.out.print("La secuencia era: ");
            for (int i = 0; i < n; i++) {
                System.out.print(nums[i] + " ");
            }
        }

        scanner.close();
    }
}


