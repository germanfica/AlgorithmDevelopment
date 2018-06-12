package com.graworg.ad_2018.recursion;

public class Ej5 {
	
	/**
	 * Retorna el mayor número de un vector
	 * @param vector
	 * @param i
	 * @return
	 */
	public static int esMayor(int[] vector, int i){
		// Declaración de variables
		int númeroMayor, longitud;
		
		// Inicialización de variables
		númeroMayor = vector[0];
		longitud = 2;
		
		if(i<longitud){
			if(vector[i]>númeroMayor){
				// Caso base
				númeroMayor = vector[i];
			}else{
				// Caso recursivo
				númeroMayor = esMayor(vector, i+1);
			}
		}
		
		return númeroMayor;
	}
	
	/**
	 * Retorna el mayor número de un vector
	 * @param vector
	 * @param i
	 * @return
	 */
	public static int elMayorEnUnArregloDeEnteros(int[] arreglo, int i){
		// Declaración de variables
		int númeroMayor, longitud;
		
		// Inicialización de variables
		númeroMayor = arreglo[0];
		longitud = 2;
		
		if(i<longitud){
			if(arreglo[i]>númeroMayor){
				// Caso base
				númeroMayor = arreglo[i];
			}else{
				// Caso recursivo
				númeroMayor = esMayor(arreglo, i+1);
			}
		}
		
		return númeroMayor;
	}
	
	public static void main(String[] args) {
		// Declaración de variables
		int[] vector = new int[2];
		
		// Inicialización de variables
		vector[0] = 2;
		vector[1] = 12;
		
		System.out.println("El mayor de todos es " + esMayor(vector, 0));
	}
}
