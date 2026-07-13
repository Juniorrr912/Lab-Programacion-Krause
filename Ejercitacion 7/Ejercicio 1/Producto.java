package Matrices;

public class Producto {
	private String nombre;
	private String codigo;
	private int precio;
	
	public Producto(String nombre, String codigo, int intPrecio) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = intPrecio;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public int getPrecio() {
		return precio;
	}
}