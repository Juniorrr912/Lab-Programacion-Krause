package ej2;

public class Operarios extends Empleados {

    private double valorHoraExtra;

    public Operarios(int legajo, double sueldoBase, double valorHoraExtra) {
        super(legajo, sueldoBase);
        this.valorHoraExtra = valorHoraExtra;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Valor Hora Extra:" + valorHoraExtra);
    }
}