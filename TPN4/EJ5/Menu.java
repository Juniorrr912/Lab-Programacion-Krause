package ej5;

public class Menu {
    private String diaSemana;
    private int caloriasTotales;

    public Menu(String diaSemana, int caloriasTotales) {
        this.diaSemana = diaSemana;
        setCaloriasTotales(caloriasTotales);
    }

    public int getCaloriasTotales() {
        return caloriasTotales;
    }

    public void setCaloriasTotales(int caloriasTotales) {
        if (caloriasTotales < 0) {
            this.caloriasTotales = 0;
        } else {
            this.caloriasTotales = caloriasTotales;
        }
    }

    public String getDiaSemana() {
        return diaSemana;
    }
}