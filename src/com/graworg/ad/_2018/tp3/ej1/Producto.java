package com.graworg.ad._2018.tp3.ej1;

public class Producto {
	private int código;
	private String descripción;
	private float precioUnitario;
	private int cantidadDeStock;
	
	public int getCódigo(){return código;}
	public String getDescripción(){return descripción;}
	public float getPrecioUnitario(){return precioUnitario;}
	public int getCantidadDeStock(){return cantidadDeStock;}
	
	public void setCódigo(int códigoInicial) {
		código = códigoInicial;
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
}
