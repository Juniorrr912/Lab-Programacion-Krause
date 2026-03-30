package main;
import java.util.*;

public class ejercicio11 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int[] nums = new int[5];

       for (int i = 0; i < 5; i++) {
           System.out.print("Ingresa el número " + (i + 1) + ": ");
           nums[i] = scanner.nextInt();
       }

       System.out.println("Números en orden inverso:");
       for (int i = 4; i >= 0; i--) {
           System.out.print(nums[i] + " ");
       }

       scanner.close();
   }
}

