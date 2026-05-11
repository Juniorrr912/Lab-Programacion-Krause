package ej3;

public abstract class Productos {
    protected String codigo; 
    private double precio;    

    public Productos(String codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public double calcularPrecioFinal() {
        return this.precio * 1.21;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCodigo() {
        return codigo;
    }
}