package main;
import java.util.*;

public class ejercicio13 {
    public static void main(String[] args) {

        String[] noms = {"Juan", "Ana", "Luis", "Maria"};
        double[] nots = {7.5, 5, 6, 3};
        
        for (int i = 0; i < noms.length; i++) {

            if (nots[i] >= 6) {
                System.out.println(noms[i] + " - Aprobado");
            } else {
                System.out.println(noms[i] + " - Reprobado");
            }
        }
    }
}
