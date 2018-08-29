package xyz.germanfica.ad._2018._2nd.tp3;

import xyz.germanfica.util.MatrizCaracter;

public class Test {
	private static final String ARCHIVO = "src/xyz/germanfica/ad/_2018/_2nd/tp3/Test.txt"; // Ruta del archivo

	public static void main(String[] args){
		// Declaración de variables
		char[][] matriz; // Es la matriz de caracteres
		
		// Inicialización de variables
		matriz = MatrizCaracter.cargaDesdeArchivo(ARCHIVO);
		MatrizCaracter.mostrar(matriz);
		System.out.println("Cantidad de filas: " + matriz.length);
		System.out.println("Cantidad de columnas: " + matriz[0].length);
	}
}