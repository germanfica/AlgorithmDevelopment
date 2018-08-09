package com.germanfica.ad._2018._1st.test3;

import java.util.Scanner;

/**
 * Implementar un módulo en JAVA que dada una martiz de caracteres, de NxN,
 * verifique si todos los caracteres en las celdas ubicados en la diagonal
 * secundaria son iguales.
 * Ejemplo: para la siguiente matriz, el método deberá devolver verdadero.
 * 
 * Tengo que generar dos matrices, probablemente.
 * Es decir, comparar dos matrices.
 * 
 * @author German Fica
 *
 */
public class Matriz {
	private static Scanner sc;
	
	public static char[][] cargaDeElementos(int cantidadDeFilas, int cantidadDeColumnas) {
		char[][] matriz = new char[cantidadDeFilas][cantidadDeColumnas];
		char carácter;
		
		System.out.println("Ingrese los elementos de la matriz a continuación: ");
		
		for(int i = 0;i<=matriz.length-1;i++) {
			for(int j = 0;j<=matriz[0].length-1;j++) {
				System.out.println("Elemento ubicado en " + "(" + i + ", " + j + "):");
				sc = new Scanner(System.in);
				// Leer valores
				carácter = sc.next().charAt(0);
				matriz[i][j] = carácter;
			}
		}
		
		return matriz;
	}
	
	public static char[][] matrizDeCaracteres() {
		char[][] matriz;
		int cantidadDeFilas, cantidadDeColumnas;
		
		// Leer cantidad de filas
		sc = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de filas: ");
		cantidadDeFilas = sc.nextInt();
		
		// Leer la cantidad de columnas
		sc = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de columnas: ");
		cantidadDeColumnas = sc.nextInt();
		
		// Crear y cargar de elementos a la matriz
		matriz = cargaDeElementos(cantidadDeColumnas, cantidadDeFilas);
		
		return matriz;
	}
	
	public static void mostrarElementosDeLaMatrizDeCaracteres(char[][] matriz) {
		int i, j;
		
		//Inicializar variables
		i = 0;
		j = 0;
		System.out.println("----------");
		for(i = 0;i<=matriz.length-1;i++) {
			for(j = 0;j<=matriz[0].length-1;j++) {
				System.out.println("(" + i + ", " + j + "): " + matriz[i][j]);
			}
		}
		System.out.println("----------");
	}
	
	public static void mostrarMenú() {
		char[][] matriz;
		int opción;
		boolean salir;
		
		// Inicializar variables
		salir = false;
		
		// Inicializar matriz
		matriz = matrizDeCaracteres();
		
		System.out.println("Bienvenido!");
		
		while(!salir) {
			// Crear Scanner
			sc = new Scanner(System.in);
			
			// Mostrar cartel de opciones
			System.out.print(
					"[0] Salir\n" +
					"[1] Mostrar todos los elementos de la matriz de carácteres.\n"
					);
			
			// Leer opción
			opción = sc.nextInt();
			
			switch (opción) {
			case 0:
				salir = true;
				System.err.println("Aplicación cerrada.");
				break;
			case 1:
				mostrarElementosDeLaMatrizDeCaracteres(matriz);
				break;
			default:
				System.err.println("Esta opción no está definida. Seleccione una de las siguientes opciones: ");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		mostrarMenú();
	}
}
