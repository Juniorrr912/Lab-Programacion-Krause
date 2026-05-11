package ej4;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nombre;
    private String genero;
    private List<Cancion> canciones;

    public Playlist(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
        this.canciones = new ArrayList<>();
    }

    public void agregarCancion(Cancion cancion) {
        this.canciones.add(cancion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }
}