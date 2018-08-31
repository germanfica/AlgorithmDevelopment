package xyz.germanfica.ad._2018._2nd.tp3;

import java.util.Scanner;

import xyz.germanfica.mensaje.Mensaje;
import xyz.germanfica.util.NumeroEntero;

/*
 * 5. Dise�ar un algoritmo que cargue una matriz
 * a partir de un arreglo de 150 caracteres.
 * 
 * La matriz debe ser de tama�o 10x15.
 * La matriz se debe llenar por fila.
 * 
 * Una vez completa, la primera fila se debe continuar
 * por la segunda y as� sucesivamente.
 */
public class Ej5 {
	public static Scanner sc;
	
	public static void cargaManual(char[][] matriz, char[] arreglo) {
		// M�DULO
		char ch; // Caracter
		
		// Carga del arreglo
		for (int i = 0; i <= arreglo.length-1; i++) {
			sc = new Scanner(System.in);
			System.out.println("Ingrese su caracter:");
			ch = sc.next().charAt(0);
			arreglo[i] = ch;
		}
		
		// Carga de la matriz apartir del arreglo de 150 caracteres
		for (int i = 0; i <= matriz.length-1; i++) {
			
		}
		// FIN M�DULO
	}
	
	public static void cargaAuto(char[][] matriz, char[] arreglo) {
		// Declaraci�n de variables
		int valorMin, valorMax, posIniArreglo;
		
		// Inicilizaci�n de variables
		valorMin=33;
		valorMax=126;
		posIniArreglo=0;
		
		// M�DULO
		// Carga del arreglo
		for (int i = 0; i <= arreglo.length-1; i++) {
			arreglo[i] = (char)NumeroEntero.aleatorio(valorMin, valorMax);
		}
		
		// Carga de la matriz apartir del arreglo de 150 caracteres
		for (int i = 0; i <= matriz.length-1; i++) {
			for (int j = 0; j < arreglo.length; j++) {
				matriz[i][j]=arreglo[posIniArreglo];
				posIniArreglo++;
			}
		}
		// FIN M�DULO
	}
	
	/*
	 * Este m�dulo se encarga de mostrar los carteles del menu
	 */
	public static void mostrarCartelesPanelOpcionesA() {
		System.out.print("[0] Salir (IMPLEMENTADO)\n"
				+ "[1] Cargar matriz\n"
				+ "[2] Cargar autom�ticamente\n"
				);
	}
	
	/*
	 * Este m�dulo se encarga de mostrar los carteles del menu
	 */
	public static void mostrarCartelesPanelOpcionesB() {
		System.out.print("[0] Salir (IMPLEMENTADO)\n"
				+ "[1] Cargar matriz\n"
				+ "[2] Cargar autom�ticamente\n"
				+ "[3] Mostrar matriz\n"
				);
	}
	
	public static boolean panelOpcionesA(boolean salir) {
		// Declaraci�n de variables
		int opcion;
		
		// Mostrar cartel con las opciones
		mostrarCartelesPanelOpcionesA();
		
		// Leer opcion del menu principal
		sc = new Scanner(System.in);
		opcion = sc.nextInt();
		switch (opcion) {
		case 0: salir = true; break;
		// [1] Cargar manual
		case 1: ;break; // Opcion 1
		// [2] Cargar autom�ticamente
		case 2: ;break; // Opcion 1
		default: System.err.println(Mensaje.leer(1)); break;
		}
		return salir;
	}
	
	public static boolean panelOpcionesB(boolean salir) {
		// Declaraci�n de variables
		int opcion;
		
		// Mostrar cartel con las opciones
		mostrarCartelesPanelOpcionesB();
		
		// Leer opcion del menu principal
		sc = new Scanner(System.in);
		opcion = sc.nextInt();
		switch (opcion) {
		case 0: salir = true; break;
		// [1] Cargar manual
		case 1: ;break; // Opcion 1
		// [2] Cargar autom�ticamente
		case 2: ;break; // Opcion 1
		// [3] Mostrar matriz
		case 3: ;break; // Opcion 1
		default: System.err.println(Mensaje.leer(1)); break;
		}
		return salir;
	}
	
	/*
	 * Mostrar el menu de la aplicacion
	 * Nota: los modulos no deben ocupar mas de una pantalla
	 */
	public static void mostrarMenu(char[][] matriz, char[] arreglo) {
		boolean salir = false, estaCargada=false;
		
		// Mensaje de bienvenida
		System.out.println(Mensaje.leer(0));
		
		while(!salir) {
			if(!estaCargada) {
				salir = panelOpcionesA(salir); // Panel de opciones A
			}else {
				salir = panelOpcionesB(salir); // Panel de opciones B
			}
		}
	}
	
	public static void main(String[] args) {
		// Declaraci�n de variables
		char[][] matriz;
		char[] arreglo;
		int cantFilasMatriz, cantColumnasMatriz, longitudArreglo;
		
		// Inicializaci�n de variables
		cantFilasMatriz = 10;
		cantColumnasMatriz = 15;
		longitudArreglo = 150;
		arreglo = new char[longitudArreglo];
		matriz = new char[cantFilasMatriz][cantColumnasMatriz];
		
		// Mostrar men�
		mostrarMenu(matriz, arreglo);
	}
}
