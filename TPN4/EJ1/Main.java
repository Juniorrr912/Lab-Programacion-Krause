package ej1;

public class Main {

    public static void main(String[] args) {

        Socios S1 = new Socios(100, "Junior");
        Socios S2 = new Socios(200, "Joako");

        Reserva R1 = new Reserva("14/1/2026", "Futbol");
        Reserva R2 = new Reserva("09/12/2026", "Futbol");

        S1.anadirReserva(R1);
        S2.anadirReserva(R2);
    }
}