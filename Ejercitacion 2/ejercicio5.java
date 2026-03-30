package main;

import java.util.*;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        int contPar = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número: ");
            nums[i] = scanner.nextInt();

            if (nums[i] % 2 == 0) {
                contPar++;
            }
        }

        System.out.println("Cantidad de números pares: " + contPar);

        scanner.close();
    }
}


