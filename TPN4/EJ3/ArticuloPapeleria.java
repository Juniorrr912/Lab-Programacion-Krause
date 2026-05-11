package ej3;

public class ArticuloPapeleria extends Productos {
    private String tipoMaterial;
    
    public ArticuloPapeleria(String codigo, double precio, String tipoMaterial) {
        super(codigo, precio);
        this.tipoMaterial = tipoMaterial;
    }
    
    @Override
    public double calcularPrecioFinal() {
        return getPrecio();
    }

    public String getTipoMaterial() { return tipoMaterial; }
}