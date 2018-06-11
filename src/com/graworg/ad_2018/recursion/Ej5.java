package com.graworg.ad_2018.recursion;

public class Ej5 {
	
	public static int esMayor(int[] vector, int i){
		// Declaración de variables
		int númeroMayor;
		
		// Inicialización de variables
		númeroMayor = vector[0];
		
		// Recorrer el vector por lo tanto tiene longitud 2
		
		// Caso base vector[i]>=númeroMayor &&
		if(i>=2){
			
		}else{
			// Caso recursivo
			if(númeroMayor>=vector[i]){
				númeroMayor = vector[0];
			}else{
				númeroMayor = esMayor(vector, i+1);
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
