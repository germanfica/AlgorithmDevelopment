package xyz.germanfica.ad._2018._2nd.tp3;

import java.util.Scanner;

import xyz.germanfica.mensaje.Mensaje;
import xyz.germanfica.util.ArregloEntero;
import xyz.germanfica.util.Matriz;
import xyz.germanfica.util.MatrizEntero;

/*
 * 6. Diseñar un algoritmo para recorrer una matriz de enteros de
 * nxn previamente cargada, mostrando su contenido recorriéndola
 * en espiral:
 */
public class Ej6 {
	private static final String ARCHIVO = "src/xyz/germanfica/ad/_2018/_2nd/tp3/Ej6.txt"; // Ruta del archivo
	public static Scanner sc;
	
	// Function print matrix in spiral form
		static void espiral(int matriz[][], int cantFilas, int cantColumnas) {
			int i, k = 0, l = 0;
			/*
			 * k - starting row index m - ending row index l - starting column index n -
			 * ending column index i - iterator
			 */

			while (k < cantFilas && l < cantColumnas) {
				// Print the first row from the remaining rows
				for (i = l; i < cantColumnas; ++i) {
					System.out.print(matriz[k][i] + " ");
				}
				k++;

				// Print the last column from the remaining columns
				for (i = k; i < cantFilas; ++i) {
					System.out.print(matriz[i][cantColumnas - 1] + " ");
				}
				cantColumnas--;

				// Print the last row from the remaining rows */
				if (k < cantFilas) {
					for (i = cantColumnas - 1; i >= l; --i) {
						System.out.print(matriz[cantFilas - 1][i] + " ");
					}
					cantFilas--;
				}

				// Print the first column from the remaining columns */
				if (l < cantColumnas) {
					for (i = cantFilas - 1; i >= k; --i) {
						System.out.print(matriz[i][l] + " ");
					}
					l++;
				}
			}
		}
	
	public static int[] arregloEspiral(int[][] matriz) {
		// Declaración de variables
		int[] arregloEspiral;
		int cantFilas, cantColumnas;
		
		// Inicialización de variables
		cantFilas = matriz.length;
		cantColumnas = matriz[0].length;
		arregloEspiral = new int[cantFilas*cantColumnas];
		
		// Cambiar la disposición de los elementos
		int jPosInv; // La posición inversa pero de j, es decir la pos inversa de la columna actual. 
		
		if(Matriz.esCuadrada(cantFilas, cantColumnas)) {
			for (int i = 0; i <= cantFilas-1; i++) {
				for (int j = 0; j <= cantColumnas-1; j++) {
					// Recore las columnas
					if(i==0 && j<=cantFilas-1) {
						arregloEspiral(matriz)[i] = matriz[i][j];	
					}
					if(i!=0 && j==cantColumnas-1) {
						arregloEspiral[i] = matriz[i][j];
					}
					
					// Hacer el cambio acá
				}
			}	
		}else {
			System.err.println("Su matriz no es cuadrada. Porfavor modifique el archivo e ingrese una matriz de órden nxn.");
			System.exit(0);
		}
		
		return arregloEspiral;
	}
	
	/*
	 * Este modulo se encarga de mostrar los carteles del menu
	 */
	public static void mostrarCartelDeOpciones() {
		System.out.print("[0] Salir (IMPLEMENTADO)\n"
				+ "[1] Mostrar matriz original (IMPLEMENTADO)\n"
				+ "[2] Mostrar matriz pero recorriéndola en espiral\n"
				);
	}
	
	/*
	 * Mostrar el menu de la aplicacion
	 * Nota: los modulos no deben ocupar mas de una pantalla
	 */
	public static void mostrarMenu(int[][] matriz) {
		boolean salir = false;
		int opcion;
		
		// Mensaje de bienvenida
		System.out.println(Mensaje.leer(0));
		
		while(!salir) {
			// Mostrar cartel con las opciones
			mostrarCartelDeOpciones();
			
			// Leer opcion del menu principal
			sc = new Scanner(System.in);
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 0: salir = true; break;
			// [1] Mostrar matriz original
			case 1: MatrizEntero.mostrar(matriz);break; // Opcion 1
			// [2] Mostrar matriz pero recorriéndola en espiral
			case 2: espiral(matriz, matriz.length, matriz[0].length); break; // Opcion 2
			default: System.err.println(Mensaje.leer(1)); break;
			}
		}
	}
	
	public static void main(String[] args) {
		// Declaración de variables
		int[][] matriz; // Matriz de enteros
		
		// Inicilización de variables
		matriz = MatrizEntero.cargaDesdeArchivo(ARCHIVO);
		
		// Mostrar menú
		mostrarMenu(matriz);
		
	}
}
