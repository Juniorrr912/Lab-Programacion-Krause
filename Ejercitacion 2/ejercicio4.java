package main;
import java.util.*;


public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();

        int[] numeros = new int[n];
        int suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número: ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }

        double promedio = (double) suma / n;

        System.out.println("El promedio es: "+ promedio);

        scanner.close();
    }
}

