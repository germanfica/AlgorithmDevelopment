package com.graworg.ad._2018.tp3.ej3;

public class Puntos {
	private String nombre;
	private int puntos;
	
	// MOstrar no tiene que ir en el objecto
	
	//Constructor
	public Puntos(String nom){
		nombre = nom;
		puntos = 0;
	}
	
	// Observadores
	public String getNombre(){
		return nombre;
	}
	
	public int getPuntos(){
		return puntos;
	}
	
	public String toString(){
		return nombre + puntos;
	}
	
	public boolean equals(Puntos p){
		if(p.getNombre()==nombre && p.getPuntos()==puntos){
			
		}
		return p.equals(p);
	}
	
	// Modificadores
	
	/**
	 * Cambia el nombre
	 */
	public void setNombre(String n){
		
	}
	
	/**
	 * Cambia los puntos por d
	 */
	public void setPuntos(int d){
		
	}
	
	// Propias del tipo
	
	/**
	 * Suma el valor al atributo puntos
	 * @param mas
	 */
	public void sumarPuntos(int mas){
		
	}
	
	/**
	 * Resta el valor del parámetro al atributo
	 * puntos, devuelve true si se pudo efectuar
	 * la operación.
	 */
	public void canjearPuntos(){
		
	}
}
