package xyz.germanfica._2019._1st.tp6;

public class Item {
	private String nombre;
	private String descripcion;
	private double costo;
	private double importe;
	private int stock;
	
	public Item(String nombre, String descripcion, double costo, int stock) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.costo = costo;
		this.importe = costo + (costo * 0.5); // Con una ganancia del 50%
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getCosto() {
		return costo;
	}

	public double getImporte() {
		return importe;
	}

	public int getStock() {
		return stock;
	}
	
	public String toString() { 
        return "{\n"
            + "   nombre: " + "\"" +this.nombre + "\""
            + ", \n   descripcion: " + "\"" + this.descripcion + "\""
            + ", \n   costo: " + this.costo
            + ", \n   importe: " + this.importe
            + ", \n   stock: " + this.stock
            + "\n }"; 
    }

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Item aumentarImporte(double porcentaje) {
		double nuevoImporte = this.importe * porcentaje;
		this.importe = nuevoImporte;
		return this;
	}
}
