package ej4;

import java.util.ArrayList;

public class Veterinario {

    private String nombre;
    private ArrayList<Animal> animales;

    public Veterinario(String nombre) {
        this.nombre = nombre;
        this.animales = new ArrayList<>();
    }

    public void agregarAnimal(Animal a) {
        if (animales.size() < 3) {
            animales.add(a);
        } else {
            System.out.println(nombre + " ya tiene 3 animales");
        }
    }

    public void atenderAnimales() {
        System.out.println("Veterinario: " + nombre);

        for (Animal a : animales) {
            a.atender();
        }
    }
}