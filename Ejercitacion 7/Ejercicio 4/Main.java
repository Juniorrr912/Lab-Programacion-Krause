package Matrices;

public class Main {
    public static void main(String[] args) {
        String[][] datos = {
            // Argentina
            {"Emiliano Martinez", "Arquero", "33", "Aston Villa", "true"},
            {"Cristian Romero", "Defensor", "28", "Tottenham", "true"},
            {"Nicolas Otamendi", "Defensor", "38", "Benfica", "true"},
            {"Nahuel Molina", "Defensor", "28", "Atletico Madrid", "true"},
            {"Enzo Fernandez", "Mediocampista", "25", "Chelsea", "true"},
            {"Rodrigo De Paul", "Mediocampista", "32", "Inter Miami", "true"},
            {"Alexis Mac Allister", "Mediocampista", "27", "Liverpool", "true"},
            {"Lionel Messi", "Delantero", "39", "Inter Miami", "true"},
            {"Julian Alvarez", "Delantero", "26", "Atletico Madrid", "true"},
            {"Lautaro Martinez", "Delantero", "29", "Inter Milan", "true"},
            {"Paulo Dybala", "Delantero", "33", "Roma", "false"},
            // Francia
            {"Mike Maignan", "Arquero", "31", "Milan", "true"},
            {"William Saliba", "Defensor", "25", "Arsenal", "true"},
            {"Theo Hernandez", "Defensor", "29", "Milan", "true"},
            {"Jules Kounde", "Defensor", "28", "Barcelona", "true"},
            {"Aurelien Tchouameni", "Mediocampista", "26", "Real Madrid", "true"},
            {"Eduardo Camavinga", "Mediocampista", "24", "Real Madrid", "true"},
            {"Adrien Rabiot", "Mediocampista", "31", "Marseille", "true"},
            {"Kylian Mbappe", "Delantero", "28", "Real Madrid", "true"},
            {"Ousmane Dembele", "Delantero", "29", "PSG", "true"},
            {"Marcus Thuram", "Delantero", "29", "Inter Milan", "true"},
            {"Antoine Griezmann", "Delantero", "35", "Atletico Madrid", "false"}
        };
        Jugador[] jugadores = new Jugador[datos.length];
        Seleccion seleccion1 = new Seleccion();

        for (int i = 0; i < datos.length; i++) {
            String nombre = datos[i][0];
            String posicion = datos[i][1];
            int edad = Integer.parseInt(datos[i][2]);
            String club = datos[i][3];
            boolean convocado = Boolean.parseBoolean(datos[i][4]);

            jugadores[i] = new Jugador(nombre, posicion, edad, club, convocado);
        }
        for (Jugador j : jugadores) {
            seleccion1.agregarJugador(j);
        }
        System.out.println("                    GESTIÓN DEL PLANTEL - MUNDIAL                         ");

        seleccion1.mostrarConvocados();
        System.out.println();
        seleccion1.mostrarNoConvocados();

        seleccion1.contarPorPosicion();
        seleccion1.contarPorSeleccion();
        System.out.printf("Promedio de edad del plantel: %.2f años\n", seleccion1.promedioEdad());

        System.out.println("Jugador más Joven: " + seleccion1.jugadorMasJoven());
        System.out.println("Jugador más Veterano: " + seleccion1.jugadorMasVeterano());

        seleccion1.buscarPorPosicion("Arquero");
        seleccion1.buscarPorEquipo("Real Madrid");
        seleccion1.estaConvocado("Lionel Messi");
        seleccion1.estaConvocado("Paulo Dybala");
        seleccion1.eliminarJugador("Antoine Griezmann");
        seleccion1.ordenarPorEdad();
    }
}