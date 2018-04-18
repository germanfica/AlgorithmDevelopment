package com.graworg.ad._2018_tp3.ej2;

public class Ingrediente {
	private String ingrediente;
	private double cantidad;
	private String unidadDeMedida;
	
	// Constructor
	
	public Ingrediente(){
		ingrediente = null;
		cantidad = 0.0;
		unidadDeMedida = null;
	}
	
	// Interfaz
	
	public String getIngrediente() {
		return this.ingrediente;
	}
	
	public double getCantidad() {
		return this.cantidad;
	}
	
	public String getUnidadDeMedida() {
		return this.unidadDeMedida;
	}
	
	
	public void setIngrediente(String ing) {
		this.ingrediente = ing;
	}
	
	public void setCantidad(int r){
		this.cantidad = r;
	}
	
	public void setUnidadDeMedida(String unid) {
		this.unidadDeMedida = unid;
	}
	
	// Propias del tipo
	
	public void muestraIngrediente() {
		System.out.print("Ingrediente:" + this.ingrediente);
		System.out.print(" Cantidad: " + this.cantidad);
		System.out.println("" + this.unidadDeMedida);
	}
}
