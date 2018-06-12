package com.graworg.ad._2018.ordenamiento;

import java.util.Scanner;

import com.graworg.ad.util.Archivo;

public class Menu {
	private static final String NOMBRE_ARCHIVO = "src/com/graworg/ad/_2018/ordenamiento/arreglo.txt"; // Ruta del archivo
	private static Scanner sc;
	
	public static int longitud(String contenidoDelArchivo) {
		int resultado;
		
		sc = new Scanner(contenidoDelArchivo); // Asignación de tarea al scanner para analizar el contenido del archivo
		
		sc.useDelimiter("\\s*,\\s*"); // Esto clasifica los colores cuando se encuntra una coma
		
		int i = 0;
		
		// Objetivo: contar la cantidad de elementos del archivo
		while(sc.hasNext()) {
			sc.nextInt();
			i=i+1;
		}
		
		resultado = i;
		
		return resultado;
	}
	
	/**
	 * Cargar desde el archivo los elementos correspondientes
	 * @param ruta
	 * @param longitud
	 * @return
	 */
	public static int[] cargaDesdeArchivo(String ruta) {
		String contenidoDelArchivo = Archivo.leer(ruta);
		int[] arreglo = new int[longitud(contenidoDelArchivo)];
		
		sc = new Scanner(contenidoDelArchivo); // Asignación de tarea al scanner para analizar el contenido del archivo
		
		sc.useDelimiter("\\s*,\\s*"); // Esto clasifica los colores cuando se encuntra una coma
		
		int i = 0;
		
		// Objetivo: contar la cantidad de elementos del archivo
		while(sc.hasNext()) {
			arreglo[i] = sc.nextInt();
			i=i+1;
		}
		
		return arreglo;
	}
	
	/**
	 * Muestra los elementos de un arreglo de enteros
	 * @param arreglo
	 */
	public static void mostrarElementos(int[] arreglo) {
		// Declaración de variables
		int i;
		
		// Inicialización de variables
		i = 0;
		
		while(i<=arreglo.length-1) {
			System.out.println(arreglo[i]);
			i++;
		}
	}
	
	/**
	 * Mostrar menú de opciones
	 */
	public static void mostrar() {
		// Declaración de las variables
		int[] arreglo;
		boolean salir;
		int opción;
		
		// Inicialización de las variables
		salir = false;
		arreglo = cargaDesdeArchivo(NOMBRE_ARCHIVO);
		
		System.out.println("Bienvenido a la consola de la aplicación");
		
		while(!salir)
		{
			sc = new Scanner(System.in);
			
			// Mostrar el cartel de las opciones
			System.out.print(
					"[0] Salir (IMPLEMENTADO)\n" +
					"[1] Método burbuja\n" +
					"[2] Método burbuja mejorado\n"
					);
			
			// Leer opción para el menú principal
			opción = sc.nextInt();
			
			switch (opción) {
			case 0:
				salir = true;
				break;
			case 1:
				Ordenamiento.burbuja(arreglo, arreglo.length);
				mostrarElementos(arreglo);
				break;
			case 2:
				Ordenamiento.burbujaMejorado(arreglo, arreglo.length);
				mostrarElementos(arreglo);
				break;			
			default:
				System.err.println("Esta opción no está definida. Seleccione una de las siguientes opciones: ");
				break;
			}
		}
	}
}
