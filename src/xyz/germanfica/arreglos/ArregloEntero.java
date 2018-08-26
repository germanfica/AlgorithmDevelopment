package xyz.germanfica.arreglos;

import java.util.Scanner;

import xyz.germanfica.numeros.NumeroReal;
import xyz.germanfica.numeros.Paridad;

public class ArregloEntero {
	private static Scanner sc;
	
	/**
	 * Carga de de n elementos a un arreglo de enteros
	 * 
	 * @param longitud la longitud del que va a tener el arreglo
	 * @param mensaje es el mensaje que se muestra por cada iteracion
	 * @return
	 */
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
	
	/**
	 * Suma todos los elementos del arreglo
	 * @param enteros
	 * @return
	 */
	public static int sumatoria(int[] enteros) {
		int sumatoria=0;
		for (int i = 0; i <= enteros.length-1; i++) {
			sumatoria = sumatoria + enteros[i];
		}
		return sumatoria;
	}
	
	/**
	 * Suma los elementos desde una posición inicial dada
	 * hasta la posición final solicitada
	 * @param enteros
	 * @param desde
	 * @param hasta
	 * @return
	 */
	public static int sumatoria(int[] enteros, int desde, int hasta) {
		int sumatoria=0;
		for (int i = desde; i <= hasta-1; i++) {
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
	
	public static void mostrarMayorPromDeLasMitades(int[] enteros) {
		System.out.println(mayorPromDeLasMitades(enteros));
	}
	
	/**
	 * Devuelve el mayor promedio de las mitades
	 * @param enteros
	 * @return
	 */
	public static double mayorPromDeLasMitades(int[] enteros) {
		// Declaración de variables
		double[] promDeLasMitades;
		double promPrimeraMitad, promSegundaMitad, mayorProm;
		
		// Inicialización de variables
		promDeLasMitades = promDeLasMitades(enteros);
		promPrimeraMitad = promDeLasMitades[0]; // Promedio de la primera mitad
		promSegundaMitad = promDeLasMitades[1]; // Promedio de la segunda mitad
		
		// Cual es el mayor de todos
		if(promPrimeraMitad>promSegundaMitad) {
			mayorProm=promPrimeraMitad;
		}else {
			mayorProm=promSegundaMitad;
		}
		
		return mayorProm;
	}
	
	/**
	 * Devuelve el promedio de las mitades
	 * @param enteros
	 * @return
	 */
	public static double[] promDeLasMitades(int[] enteros) {
		// Declaración de variables
		double[] promDeLasMitades = new double[2];
		int longitud = enteros.length;
		int longPrimeraMitad, longSegundaMitad;
		double sumPrimeraMitad, sumSegundaMitad;
		
		// Inicialización de variables
		sumPrimeraMitad = 0;
		sumSegundaMitad = 0;
		longPrimeraMitad=longitud/2;
		longSegundaMitad=longitud-longPrimeraMitad;
		
		// Sumatoria de las mitades
		sumPrimeraMitad = (double)sumatoria(enteros, 0, longPrimeraMitad); // Desde 0 hasta la longitud de la primera mitad 
		sumSegundaMitad = (double)sumatoria(enteros, longPrimeraMitad, longPrimeraMitad+longSegundaMitad); // Desde la longitud de la primera mitad hasta la longitud de la segunda mitad
		
		// Promedio
		promDeLasMitades[0] = NumeroReal.promedio(sumPrimeraMitad, longPrimeraMitad); // Promedio de la primera mitad
		promDeLasMitades[1] = NumeroReal.promedio(sumSegundaMitad, longSegundaMitad); // Promedio de la segunda mitad
		
		return promDeLasMitades;
	}
}
