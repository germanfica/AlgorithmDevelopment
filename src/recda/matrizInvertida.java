package recda;

import java.util.Scanner;

public class matrizInvertida {
	private static Scanner sc;
	
	/**
	 * Carga de elementos a una matriz de enteros
	 * 
	 * @param cantFilas
	 * @param canColumnas
	 * @return
	 */
	public static int[][] cargaMatriz(int cantFilas, int canColumnas) {
		int[][] matriz = new int[cantFilas][canColumnas];
		
		for(int i = 0; i<=cantFilas-1 ;i++){
			for(int j = 0; j<=canColumnas-1 ;j++){
				matriz[i][j] = sc.nextInt();
			}
		}
		
		return matriz;
	}
	
	public static int[][] matrizInversa() {
		int[][] matriz = new int[3][3];
		
		
		
		return matriz;
	}
	
	public static void main(String[] args) {
		cargaMatriz(3,3);
		matrizInversa();
	}
}
