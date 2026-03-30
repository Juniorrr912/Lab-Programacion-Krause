package main;
import java.util.*;

public class ej2_1 {
	    public static void main(String[] args) {

	        Scanner teclado = new Scanner(System.in);

	        System.out.print("¿Cuántos números vas a ingresar?: ");
	        int n = teclado.nextInt();

	        int[] numeros = new int[n];
	        int suma = 0;

	        for (int i = 0; i < n; i++) {
	            System.out.print("Ingrese un número: ");
	            numeros[i] = teclado.nextInt();
	        }

	        for (int i = 0; i < n; i++) {
	            suma = suma + numeros[i];
	        }

	        System.out.println("La suma total es: " + suma);
	    }
	}


