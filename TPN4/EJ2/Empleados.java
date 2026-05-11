package ej2;

public class Empleados {

    protected int legajo;
    protected double sueldoBase;

    public Empleados(int legajo, double sueldoBase) {
        this.legajo = legajo;
        this.sueldoBase = sueldoBase;
    }


    public void mostrarDatos() {
        System.out.println("Legajo: " + legajo);
        System.out.println("Sueldo Base:" + sueldoBase);
    }
}