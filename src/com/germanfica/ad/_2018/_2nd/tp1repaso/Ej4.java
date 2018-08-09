package com.germanfica.ad._2018._2nd.tp1repaso;

public class Ej4 {
/*
 * 4) Diseñar un algoritmo que lea una palabra y cuente la
 * cantidad de veces que aparece una letra dada en la palabra.
 * Implementar en Java y realizar traza para verificar la solución.
 */
	
	public static int letraOcurrencia(String palabra, char letra) {
		// Declaración de variables
		int cantidad;

		// Inicialización de variables
		cantidad = 0;
		
		for(int i=0; i<=palabra.length()-1 ;i++) {
			if(palabra.toLowerCase().charAt(i)==letra){
				cantidad++;
			}
		}
		
		return cantidad;
	}
	/*
	 * 4) Diseñar un algoritmo que lea una palabra y cuente la
	 * cantidad
	 * de veces que aparece una letra dada
en la palabra. Implementar en Java y realizar traza para
verificar la solución.
	 */
	public static void main(String[] args) {
		// Declaración de variables
		char letra;
		String palabra;
		
		// Inicialización de variables
		palabra = "Holo";
		letra = 'o';
		
		System.out.println("La letra " + letra + " se repite " + letraOcurrencia(palabra, letra) + " veces en " + palabra + ".");
	}
}
