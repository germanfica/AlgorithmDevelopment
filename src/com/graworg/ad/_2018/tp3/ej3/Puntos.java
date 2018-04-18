package com.graworg.ad._2018.tp3.ej3;

public class Puntos {
	private String nombre;
	private int puntos;
	
	// MOstrar no tiene que ir en el objecto
	
	/*
	 * Constructor: Inicializar puntos en 0
	 */
	public Puntos(String nom) {
		nombre = nom;
		puntos = 0;
	}
	
	// Observadores
	public String getNombre() {
		return nombre;
	}
	
	public int getPuntos() {
		return puntos;
	}
	
	public String toString() {
		return nombre + puntos;
	}
	
	public boolean equals(Puntos p) {
		return p.getNombre()==nombre && p.getPuntos()==puntos;
	}
	
	// Modificadores
	
	/**
	 * Cambia el nombre
	 */
	public void setNombre(String n) {
		nombre = n;
	}
	
	/**
	 * Cambia los puntos por d
	 */
	public void setPuntos(int d) {
		puntos = d;
	}
	
	// Propias del tipo
	
	/**
	 * Suma el valor al atributo puntos
	 * @param mas
	 */
	public void sumarPuntos(int mas) {
		puntos = puntos + mas;
	}
	
	/**
	 * Resta el valor del parámetro al atributo
	 * puntos, devuelve true si se pudo efectuar
	 * la operación.
	 */
	public boolean canjearPuntos(int canje) {
		int num;
		boolean respuesta;
		
		respuesta = false;
		
		num = canje - puntos;
		
		if(num>0){
			respuesta = true;
		}
		
		return respuesta;
	}
}
