package ej1;

public class Herramienta {

    protected String marca;
    protected int codigo;

    public Herramienta(String marca, int codigo) {
        this.marca = marca;
        this.codigo = codigo;
    }

    public void operar() {
        usar();
        devolver();
    }

    public void usar() {
        System.out.println("Usando herramienta");
    }

    public void devolver() {
        System.out.println("Devolviendo herramienta");
    }
}