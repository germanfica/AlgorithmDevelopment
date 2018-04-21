package com.graworg.ad._2018.tp3.ej3;

/*
 * Actualizaciones:
 *  - Nombre de la clase "Puntos" a "Cliente", por lo que ahora tiene más sentido
 *    que el cliente tenga puntos y no al revés.
 *  - Nombres más descriptivos a los parámetros.
 */
// Nota: los métodos de objetivo mostrar cartel no tienen que ir en el objecto/clase.
public class Cliente {
	private String nombre;
	private int puntos;
	
	// Constructores
	
	public Cliente(String nombre) {
		this.nombre = nombre;
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
		return "Cliente: " + nombre + "\nPuntaje: " + puntos;
	}
	
	public boolean equals(Cliente cliente) {
		return cliente.getNombre()==nombre && cliente.puntos==this.puntos;
	}
	
	// Modificadores
	
	/**
	 * Cambiar nombre del cliente
	 */
	/*
	 * Actualización del día 21 de Abril del 2018 a las 12:31:
	 *  - Nombre del parámetro "n" por "nombre"
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Cambiar el puntaje
	 */
	/*
	 * Actualización del día 21 de Abril del 2018 a las 12:35:
	 *  - Nombre del parámetro "d" por "puntos"
	 */
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	// Propias del tipo
	
	/**
	 * Sumar más puntos
	 * @param mas
	 */
	public void sumarPuntos(int mas) {
		puntos = puntos + mas;
	}
	
	/**
	 * Canjear los puntos. Resta el valor del parámetro al atributo puntos, devuelve
	 * true si se pudo efectuar la operación.
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
