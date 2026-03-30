package main;
import java.util.*;


public class ejercicio3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos números vas a ingresar?: ");
        int n = teclado.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un número: ");
            nums[i] = teclado.nextInt();
        }

        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        System.out.println("El número minimo es: " + min);
    }
}
