package ej4;

public class Main {
    public static void main(String[] args) {

        Veterinario V1 = new Veterinario("Ulises");
        Veterinario V2 = new Veterinario("Joako");
        Veterinario V3 = new Veterinario("Licha");

        Animal A1 = new Perro("Leo", "2014");
        Animal A2 = new Perro("Gitana", "2012");
        Animal A3 = new Perro("Mora", "2023");
        Animal A4 = new Gato("Mike", "2025");
        Animal A5 = new Gato("Michi", "2024");
        Animal A6 = new Gato("Tico", "2020");
        Animal A7 = new Perro("Kira", "2022");

        V1.agregarAnimal(A1); 
        V1.agregarAnimal(A2);
        V1.agregarAnimal(A3);

        V2.agregarAnimal(A4);
        V2.agregarAnimal(A5);
        V2.agregarAnimal(A3);

        V3.agregarAnimal(A6); 
        V3.agregarAnimal(A7);
        V3.agregarAnimal(A3);

        V1.atenderAnimales();
        V2.atenderAnimales();
        V3.atenderAnimales();
    }
}