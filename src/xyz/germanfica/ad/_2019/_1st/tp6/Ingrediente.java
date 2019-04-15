package xyz.germanfica.ad._2019._1st.tp6;

public class Ingrediente {
	private String nombre;
	private int cantidad;
	private String unidadDeMedida;
	
	public Ingrediente(String nombre, int cantidad, String unidadDeMedida) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.unidadDeMedida = unidadDeMedida;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}
	
	public String getUnidadDeMedida() {
		return this.unidadDeMedida;
	}
	
	public String toString() {
		return this.nombre + ", " + this.cantidad + ", " + this.unidadDeMedida;
	}
}
