package xyz.germanfica.arreglos;

import java.util.Scanner;

import xyz.germanfica.matematicas.Paridad;

public class ArregloEntero {
	private static Scanner sc;
	public static int[] carga(int longitud, String mensaje) {
		// Declaracion de variables
		int[] arregloEnteros;
		int num; // Caracter
		int i;

		// Inicializacion de variables
		arregloEnteros = new int[longitud];
		i = 0;

		// Agregar elementos al arreglo
		while (i <= arregloEnteros.length - 1) {
			System.out.println(mensaje);
			sc = new Scanner(System.in);
			num = sc.nextInt();
			arregloEnteros[i] = num;
			i++;
		}
		return arregloEnteros;
	}
	public static int[] carga(int longitud) {
		return carga(longitud,"");
	}
	public static int cantNumPares(int[] enteros) {
		int cantNumPares=0;
		for (int i = 0; i <= enteros.length-1; i++) {
			if(Paridad.esPar(enteros[i])) {
				cantNumPares++;
			}
		}
		return cantNumPares;
	}
	public static void mostrarCantNumPares(int[] enteros) {
		System.out.println(cantNumPares(enteros));
	}
	public static int sumatoria(int[] enteros) {
		int sumatoria=0;
		for (int i = 0; i <= enteros.length-1; i++) {
			sumatoria = sumatoria + enteros[i];
		}
		return sumatoria;
	}
	public static void mostrarSumatoria(int[] enteros) {
		System.out.println(sumatoria(enteros));
	}
	
	public static boolean existeElNum(int num, int[] enteros) {
		return false;
	}
	public static void mostrarExisteElNum(int num, int[] enteros) {
		System.out.println(existeElNum(num, enteros));
	}
}
