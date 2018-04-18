package com.graworg.ad._2018.tp3.ej1;

import java.util.Scanner;

public class Producto {
	private int código;
	private String descripción;
	private float precioUnitario;
	private int cantidadDeStock;
	
	public int getCódigo(){return código;}
	public String getDescripción(){return descripción;}
	public float getPrecioUnitario(){return precioUnitario;}
	public int getCantidadDeStock(){return cantidadDeStock;}
	
	public void setCódigo(int código) {
		this.código = código;
	}
	public void setDescripción(String descripciónInicial) {
		descripción = descripciónInicial;
	}
	public void setPrecioUnitario(float precioUnitarioInicial) {
		precioUnitario = precioUnitarioInicial;
	}
	public void setCantidadDeStock(int cantidadDeStockInicial) {
		cantidadDeStock = cantidadDeStockInicial;
	}
	
	/*
	 * Los siguientes métodos son solo una prueba de la clase teoríca del 18/04/18
	 */
	
	// ERROR CONCEPTURAL
	public void asd()
	{
		System.out.println(descripción);
	}
	// ERROR CONCEPTURAL
	public void setFeg() {
		Scanner sc = new Scanner(System.in);
		descripción = sc.next();
	}
}
