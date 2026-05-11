package ej1;

import java.util.List;
import java.util.ArrayList;

public class Socios {

    private int numSocio;
    private String nombre;

    private List<Reserva> reservas;

    public Socios(int numSocio, String nombre) {
        this.numSocio = numSocio;
        this.nombre = nombre;

        reservas = new ArrayList<>();
    }

    public void anadirReserva(Reserva R) {
        reservas.add(R);

        System.out.println("Reserva añadida para " + nombre);
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}