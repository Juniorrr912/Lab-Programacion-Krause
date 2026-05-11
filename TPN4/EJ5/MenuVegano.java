package ej5;

public class MenuVegano extends Menu {
    private int proteinaVegetal;

    public MenuVegano(String diaSemana, int caloriasTotales, int proteinaVegetal) {
        super(diaSemana, caloriasTotales);
        this.proteinaVegetal = proteinaVegetal;
    }

    public int getProteinaVegetal() {
        return proteinaVegetal;
    }
    public void setProteinaVegetal(int proteinaVegetal) {
		this.proteinaVegetal = proteinaVegetal;
	}
}