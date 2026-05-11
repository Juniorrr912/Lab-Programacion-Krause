package ej5;
import java.util.ArrayList;
import java.util.List;

public class Cocinero {
    private String nombre;
    private List<Menu> listaDeMenus;

    public Cocinero(String nombre) {
        this.nombre = nombre;
        this.listaDeMenus = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void agregarMenu(Menu m) {
        listaDeMenus.add(m);
    }
}