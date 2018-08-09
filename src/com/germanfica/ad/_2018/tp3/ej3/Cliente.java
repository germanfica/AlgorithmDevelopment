package com.germanfica.ad._2018.tp3.ej3;

/*
 * Actualizaciones:
 *  - Nombre de la clase "Puntos" a "Cliente", por lo que ahora tiene más sentido
 *    que el cliente tenga puntos y no al revés.
 *  - Nombres más descriptivos a los parámetros.
 *  - Se agregaron comentarios, a excepción del constructor para reforzar el
 *  entendimiento de los mismos.
 */
// Nota: los métodos de objetivo mostrar cartel no deben ir en el objecto/clase.
public class Cliente {
	private String nombre;
	private int puntos;
	public static int cantidadMáximaDePuntosLogrables = 5000;
	
	// Constructores
	
	public Cliente(String nombre) {
		this.nombre = nombre;
		puntos = 0;
	}
	
	// Observadores
	
	/**
	 * Retorna el nombre del cliente
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Retorna la cantidad de puntos acumulados por el cliente
	 * @return puntos
	 */
	public int getPuntos() {
		return puntos;
	}
	
	/**
	 * Retorna en texto plano todos los atributos del cliente
	 */
	public String toString() {
		return "Cliente: " + nombre + "\nPuntaje: " + puntos;
	}
	
	/**
	 * Verifica si el cliente actual es igual al cliente enviado por parámetro
	 * @param cliente
	 * @return
	 */
	public boolean equals(Cliente cliente) {
		return cliente.getNombre()==nombre && cliente.puntos==this.puntos;
	}
	
	// Modificadores
	
	/**
	 * Cambiar nombre del cliente
	 * @param nombre
	 */
	/*
	 * Actualización del día 21 de Abril del 2018 a las 12:31:
	 *  - Nombre del parámetro "n" por "nombre"
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Cambiar el puntaje del cliente
	 * @param puntos
	 */
	/*
	 * Actualización del día 21 de Abril del 2018 a las 12:35:
	 *  - Nombre del parámetro "d" por "puntos"
	 */
	public void setPuntos(int puntos) {
		if(puntos<cantidadMáximaDePuntosLogrables) {
			this.puntos = puntos;
		}else {
			this.puntos = cantidadMáximaDePuntosLogrables;
		}
	}
	
	// Propias del tipo
	
	/**
	 * Sumar más puntos al cliente pero con una cantidad máxima de puntos logrables
	 * @param mas
	 */
	public void sumarPuntos(int mas) {
		if(mas<cantidadMáximaDePuntosLogrables) {
			puntos = puntos + mas;
		}else {
			puntos = cantidadMáximaDePuntosLogrables;
		}
	}
	
	/**
	 * Canjear los puntos del cliente. Resta el valor del parámetro al atributo puntos,
	 * devuelve true si se pudo efectuar la operación.
	 * @param canje
	 * @return
	 */
	public boolean canjearPuntos(int canje) {
		int número;
		boolean respuesta;
		
		respuesta = false;
		
		número = puntos - canje;
		
		if(número>0){
			puntos = puntos - canje;
			respuesta = true;
		}
		
		return respuesta;
	}
}
