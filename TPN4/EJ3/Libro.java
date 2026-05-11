package ej3;

public class Libro extends Productos {
    private String autor;

    public Libro(String codigo, double precio, String autor) {
        super(codigo, precio);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
		this.autor = autor;
	}
}