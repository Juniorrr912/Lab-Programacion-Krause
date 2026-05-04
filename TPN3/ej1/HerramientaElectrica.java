package ej1;

public class HerramientaElectrica extends Herramienta {

    // Atributo
    private int voltaje;

    // Constructor (cambié el orden de parámetros)
    public HerramientaElectrica(String marca, int codigo, int voltaje) {
        super(marca, codigo);
        this.voltaje = voltaje;
    }

    // Método principal primero
    @Override
    public void operar() {
        conectar();
        usar();
        mostrarVoltaje();
        devolver();
    }

    // Métodos auxiliares
    private void mostrarVoltaje() {
        System.out.println("Voltaje: " + voltaje);
    }

    public void conectar() {
        System.out.println("Conectando a " + voltaje + "V");
    }
}
