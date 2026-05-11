package ej2;

public class Gerente extends Empleados {

    // Atributo propio
    private double bonoResponsabilidad;

    // Constructor
    public Gerente(int legajo, double sueldoBase, double bonoResponsabilidad) {
        super(legajo, sueldoBase);
        this.bonoResponsabilidad = bonoResponsabilidad;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Bono Responsabilidad: " + bonoResponsabilidad);
    }
}