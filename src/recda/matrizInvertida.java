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
		
		// Crear scanner
		sc = new Scanner(System.in);
		
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
	
	public static void mostrarMenú() {
		// Declaracion de variables
		int opcion;
		boolean salir;
		
		// Inicializacion de variables
		opcion = 1;
		salir = false;
		
		switch (opcion) {
		case 0:
			salir = true;
			break;
		case 1:
			System.out.println("Ingrese la cantidad de filas: ");
			//sc
			//cargaMatriz(cantFilas, canColumnas)
			break;
		default:
			break;
		}
		
		System.out.println("Bienvenido a la consola");
		
	}
	
	public static void main(String[] args) {
		cargaMatriz(3,3);
		matrizInversa();
	}
}
