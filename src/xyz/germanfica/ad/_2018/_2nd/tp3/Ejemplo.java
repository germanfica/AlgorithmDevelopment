package xyz.germanfica.ad._2018._2nd.tp3;

import xyz.germanfica.util.MatrizEntero;

public class Ejemplo {
	public static void main(String[] args) {
		// Declaraci�n de variables
		int[][] matrizTraspuesta;

		// Inicializaci�n de variables
		int[][] matriz = {{-1,2,5},{-2,3,7}};
		
		// Transponemos la matriz
		matrizTraspuesta = MatrizEntero.trasponer(matriz);
		
		// Mostramos la matriz transpuesta
		MatrizEntero.mostrar(matrizTraspuesta);
	}
}