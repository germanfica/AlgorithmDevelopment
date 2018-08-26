package xyz.germanfica.util;

public class NumeroEntero {
	public static int[] intercambio(int x, int y) {
		int[] vector = new int[2];
		// Restar el primer numero al segundo
		x = x - y;

		// Sumar el primer numero por el segundo numero
		y = x + y;

		// El primer numero es el segundo menos el primero
		x = y - x;
		
		vector[0]=x;
		vector[1]=y;
		
		return vector;
	}
	
	/**
	 * Calcula el promedio de un número
	 * @param cantidad
	 * @return
	 */
	public static int promedio(int sumatoria, int cantidad){
		return sumatoria/cantidad;
	}
}
