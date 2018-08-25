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
	/**
	 * Verifica si existe el num solicitado en el arreglo
	 * enviado por parametro
	 * @param num
	 * @param enteros
	 * @return
	 */
	public static boolean existeElNum(int num, int[] enteros) {
		boolean existeElNum;
		existeElNum=false;
		for (int i = 0; i <= enteros.length-1; i++) {
			if(enteros[i]==num) {
				existeElNum=true;
			}
		}
		return existeElNum;
	}
	public static void mostrarExisteElNum(int num, int[] enteros) {
		System.out.println(existeElNum(num, enteros));
	}
	/**
	 * Me devuelve el menor numero del arreglo
	 * @param enteros
	 * @return
	 */
	public static int posDelMenorNumAlmacenado(int[] enteros) {
		int menorNum = enteros[0];
		for (int i = 1; i <= enteros.length-1; i++) {
			if(enteros[i]<menorNum) {
				menorNum = enteros[i];
			}
		}
		return menorNum;
	}
	public static void mostrarPosDelMenorNumAlmacenado(int[] enteros) {
		System.out.println(posDelMenorNumAlmacenado(enteros));
	}
	public static int mayorNumAlmacenado(int[] enteros) {
		int mayorNum = enteros[0];
		for (int i = 1; i <= enteros.length-1; i++) {
			if(enteros[i]>mayorNum) {
				mayorNum = enteros[i];
			}
		}
		return mayorNum;
	}
	
	public static void mostrarMayorNumAlmacenado(int[] enteros) {
		System.out.println(mayorNumAlmacenado(enteros));
	}
	
	public static double promedio(int[] enteros) {
		return sumatoria(enteros)/(double)enteros.length;
	}
	public static void mostrarPromedio(int[] enteros) {
		System.out.println(promedio(enteros));		
	}
	public static void mostrarMayorPromDeLasMitades() {
		
	}
	public static double mayorPromDeLasMitades(int[] enteros) {
		// Declaración de variables
		int longitud = enteros.length;
		double promPrimeraMitad, promSegundaMitad, mayorProm;
		
		// Inicialización de variables
		promPrimeraMitad=longitud/2;
		promSegundaMitad=longitud-promPrimeraMitad;
		
		for (int i = 0; i <= longitud-1; i++) {
			System.out.println(longitud/2);
		}
		
		if(promPrimeraMitad>promSegundaMitad) {
			mayorProm=promPrimeraMitad;
		}else {
			mayorProm=promSegundaMitad;
		}
		
		return mayorProm;
	}
}
