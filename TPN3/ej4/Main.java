package main;

public class Main {
    public static void main(String[] args) {

        Veterinario V1 = new Veterinario("Ulises");
        Veterinario V2 = new Veterinario("Joako");
        Veterinario V3 = new Veterinario("Licha");

        Animal A1 = new Perro("Rocco", "2022");
        Animal A2 = new Gato("Luna", "2023");
        Animal A3 = new Perro("Simba", "2019");
        Animal A4 = new Gato("Oliver", "2021");
        Animal A5 = new Perro("Mora", "2020");

        V1.agregarAnimal(A1); 
        V1.agregarAnimal(A2);
        V1.agregarAnimal(A3);

        V2.agregarAnimal(A1);
        V2.agregarAnimal(A4);
        V2.agregarAnimal(A5);

        V3.agregarAnimal(A1); 
        V3.agregarAnimal(A2);
        V3.agregarAnimal(A3);

        V1.atenderAnimales();
        V2.atenderAnimales();
        V3.atenderAnimales();
    }
}