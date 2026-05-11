package ej2;

public class Main {

    public static void main(String[] args) {

        Gerente G1 = new Gerente(101, 250000, 50000);


        Operarios O1 = new Operarios(202, 180000, 3500);

        System.out.println("GERENTE");
        G1.mostrarDatos();

        System.out.println();

        System.out.println("OPERARIO");
        O1.mostrarDatos();
    }
}