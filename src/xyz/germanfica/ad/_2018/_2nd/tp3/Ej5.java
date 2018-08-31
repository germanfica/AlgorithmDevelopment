package xyz.germanfica.ad._2018._2nd.tp3;

import java.util.Scanner;

import xyz.germanfica.mensaje.Mensaje;
import xyz.germanfica.util.MatrizCaracter;
import xyz.germanfica.util.NumeroEntero;

/*
 * 5. Diseñar un algoritmo que cargue una matriz
 * a partir de un arreglo de 150 caracteres.
 * 
 * La matriz debe ser de tamaño 10x15.
 * La matriz se debe llenar por fila.
 * 
 * Una vez completa, la primera fila se debe continuar
 * por la segunda y así sucesivamente.
 */
public class Ej5 {
	public static Scanner sc;
	
	/*
	 * [1] Cargar matriz manualmente
	 */
	public static void cargarManualmente(char[][] matriz, char[] arreglo) {
		int posIniArreglo=0;
		// MÓDULO
		char ch; // Caracter
		
		// Carga del arreglo
		for (int i = 0; i <= arreglo.length-1; i++) {
			sc = new Scanner(System.in);
			System.out.println("["+i+"]"+" Ingrese su caracter:");
			ch = sc.next().charAt(0);
			arreglo[i] = ch;
		}
		
		// Carga de la matriz apartir del arreglo de 150 caracteres
		for (int i = 0; i <= matriz.length-1; i++) {
			for (int j = 0; j <= matriz[0].length-1; j++) {
				matriz[i][j]=arreglo[posIniArreglo];
				posIniArreglo++;
			}
		}
		// FIN MÓDULO
	}
	
	/*
	 * [2] Cargar automáticamente
	 */
	public static void cargarAutomaticamente(char[][] matriz, char[] arreglo) {
		// Declaración de variables
		int valorMin, valorMax, posIniArreglo;
		
		// Inicilización de variables
		valorMin=33;
		valorMax=126;
		posIniArreglo=0;
		
		// MÓDULO
		// Carga del arreglo
		for (int i = 0; i <= arreglo.length-1; i++) {
			arreglo[i] = (char)NumeroEntero.aleatorio(valorMin, valorMax);
		}
		
		// Carga de la matriz apartir del arreglo de 150 caracteres
		for (int i = 0; i <= matriz.length-1; i++) {
			for (int j = 0; j <= matriz[0].length-1; j++) {
				matriz[i][j]=arreglo[posIniArreglo];
				posIniArreglo++;
			}
		}
		// FIN MÓDULO
	}
	
	/*
	 * Este módulo se encarga de mostrar los carteles del menu
	 */
	public static void mostrarCartelesPanelOpcionesA() {
		System.out.print("[0] Salir (IMPLEMENTADO)\n"
				+ "[1] Cargar matriz manualmente (IMPLEMENTADO)\n"
				+ "[2] Cargar automáticamente (IMPLEMENTADO)\n"
				);
	}
	
	/*
	 * Este módulo se encarga de mostrar los carteles del menu
	 */
	public static void mostrarCartelesPanelOpcionesB() {
		System.out.print("[0] Salir (IMPLEMENTADO)\n"
				+ "[1] Cargar matriz manualmente (IMPLEMENTADO)\n"
				+ "[2] Cargar automáticamente (IMPLEMENTADO)\n"
				+ "[3] Mostrar matriz (IMPLEMENTADO)\n"
				);
	}
	
	public static boolean[] panelOpcionesA(char[][] matriz, char[] arreglo) {
		// Declaración de variables
		boolean[] condiciones;
		boolean salir = false, estaCargada=false;
		int opcion;
		
		// Inicialización de variables
		condiciones = new boolean[2];
		
		// Mostrar cartel con las opciones
		mostrarCartelesPanelOpcionesA();
		
		// Leer opcion del menu principal
		sc = new Scanner(System.in);
		opcion = sc.nextInt();
		switch (opcion) {
		case 0: salir = true; break;
		// [1] Cargar matriz manualmente
		case 1: cargarManualmente(matriz, arreglo);estaCargada=true;break; // Opcion 1
		// [2] Cargar automáticamente
		case 2: cargarAutomaticamente(matriz, arreglo);estaCargada=true;break; // Opcion 1
		default: System.err.println(Mensaje.leer(1)); break;
		}
		condiciones[0] = salir;
		condiciones[1] = estaCargada;
		
		return condiciones;
	}
	
	public static boolean panelOpcionesB(char[][] matriz, char[] arreglo) {
		// Declaración de variables
		boolean salir=false;
		int opcion;
		
		// Mostrar cartel con las opciones
		mostrarCartelesPanelOpcionesB();
		
		// Leer opcion del menu principal
		sc = new Scanner(System.in);
		opcion = sc.nextInt();
		switch (opcion) {
		case 0: salir = true; break;
		// [1] Cargar matriz manualmente
		case 1: cargarManualmente(matriz, arreglo);break; // Opcion 1
		// [2] Cargar automáticamente
		case 2: cargarAutomaticamente(matriz, arreglo);break; // Opcion 1
		// [3] Mostrar matriz
		case 3: MatrizCaracter.mostrar(matriz);break; // Opcion 1
		default: System.err.println(Mensaje.leer(1)); break;
		}
		return salir;
	}
	
	/*
	 * Mostrar el menu de la aplicacion
	 * Nota: los modulos no deben ocupar mas de una pantalla
	 */
	public static void mostrarMenu(char[][] matriz, char[] arreglo) {
		boolean[] condiciones;
		boolean salir = false, estaCargada=false;
		
		// Mensaje de bienvenida
		System.out.println(Mensaje.leer(0));
		
		while(!salir) {
			if(!estaCargada) {
				condiciones = panelOpcionesA(matriz, arreglo);
				salir = condiciones[0]; // Panel de opciones A
				estaCargada = condiciones[1];
			}else {
				salir = panelOpcionesB(matriz, arreglo); // Panel de opciones B
			}
		}
	}
	
	public static void main(String[] args) {
		// Declaración de variables
		char[][] matriz;
		char[] arreglo;
		int cantFilasMatriz, cantColumnasMatriz, longitudArreglo;
		
		// Inicialización de variables
		cantFilasMatriz = 10;
		cantColumnasMatriz = 15;
		longitudArreglo = 150;
		arreglo = new char[longitudArreglo];
		matriz = new char[cantFilasMatriz][cantColumnasMatriz];
		
		// Mostrar menú
		mostrarMenu(matriz, arreglo);
	}
}
