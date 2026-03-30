package main;
import java.util.*;

public class ejercicio12 {
   public static void main(String[] args) {

       int[] nums = {15, 2, 8, 99, 23, 7, 1, 50};

       int mayor = nums[0];
       int menor = nums[0];

       for (int i = 1; i < nums.length; i++) {
           
           if (nums[i] > mayor) {
               mayor = nums[i];
           }

           if (nums[i] < menor) {
               menor = nums[i];
           }
       }

       System.out.println("El número mayor es: " + mayor);
       System.out.println("El número menor es: " + menor);
   }
}
