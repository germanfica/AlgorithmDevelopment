package com.graworg.ad._2018.tp3.ej1;

public class Test {
	public static void main(String[] args) {
		Producto producto = new Producto();
		producto.setDescripción("asd");
		producto.asd();
		System.out.println(producto.toString());
		System.out.println(producto.getDescripción().toString());
		producto.setFeg();
		System.out.println(producto.getDescripción());
	}
}
