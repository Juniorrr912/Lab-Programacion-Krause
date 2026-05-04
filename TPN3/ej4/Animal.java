package ej4;
public class Animal {
	protected String fechaNacimiento;
    protected String nombre;

    public Animal(String fechaNacimiento, String nombre) {
    	this.fechaNacimiento = fechaNacimiento;
    	this.nombre = nombre;
    }

    public void atender() {
        System.out.println("Animal: " + nombre);
        System.out.println("Nacimiento: " + fechaNacimiento);
    }
}