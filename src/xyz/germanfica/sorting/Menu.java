package xyz.germanfica.sorting;

import java.util.Scanner;

import xyz.germanfica.util.Archivo;

public class Menu {
	private static final String NOMBRE_ARCHIVO = "src/xyz/germanfica/ordenamiento/arreglo.txt"; // Ruta del archivo
	private static Scanner sc;
	
	public static int longitud(String contenidoDelArchivo) {
		int resultado;
		
		sc = new Scanner(contenidoDelArchivo); // Asignacion de tarea al scanner para analizar el contenido del archivo
		
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
		
		sc = new Scanner(contenidoDelArchivo); // Asignacion de tarea al scanner para analizar el contenido del archivo
		
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
		// Declaracion de variables
		int i;
		
		// Inicializacion de variables
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
		// Declaracion de las variables
		int[] arreglo;
		boolean salir;
		int opcion;
		
		// Inicializacion de las variables
		salir = false;
		arreglo = cargaDesdeArchivo(NOMBRE_ARCHIVO);
		
		System.out.println("Bienvenido a la consola de la aplicacion");
		
		while(!salir)
		{
			sc = new Scanner(System.in);
			
			// Mostrar el cartel de las opciones
			System.out.print(
					"[0] Salir (IMPLEMENTADO)\n" +
					"[1] Método burbuja (IMPLEMENTADO)\n" +
					"[2] Método burbuja mejorado (IMPLEMENTADO)\n" +
					"[3] Método insercion (IMPLEMENTADO)\n" +
					"[4] Método seleccion (IMPLEMENTADO)\n" +
					"_______________________\n" +
					"[5] Búsqueda secuencial (IMPLEMENTADO)\n" +
					"[6] Búsqueda binaria (IMPLEMENTADO)\n"
					);
			
			// Leer opcion para el menú principal
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 0:
				salir = true;
				break;
			case 1:
				arreglo = cargaDesdeArchivo(NOMBRE_ARCHIVO); // Arreglo por defecto
				Ordenamiento.burbuja(arreglo, arreglo.length);
				mostrarElementos(arreglo);
				break;
			case 2:
				arreglo = cargaDesdeArchivo(NOMBRE_ARCHIVO); // Arreglo por defecto
				Ordenamiento.burbujaMejorado(arreglo, arreglo.length);
				mostrarElementos(arreglo);
				break;
			case 3:
				arreglo = cargaDesdeArchivo(NOMBRE_ARCHIVO); // Arreglo por defecto
				Ordenamiento.insercion(arreglo, arreglo.length);
				mostrarElementos(arreglo);
				break;
			case 4:
				arreglo = cargaDesdeArchivo(NOMBRE_ARCHIVO); // Arreglo por defecto
				Ordenamiento.seleccion(arreglo, arreglo.length);
				mostrarElementos(arreglo);
				break;
			case 5:
				arreglo = cargaDesdeArchivo(NOMBRE_ARCHIVO); // Arreglo por defecto
				System.out.println("Esta en la posicion: " + Ordenamiento.busquedaSecuencial(arreglo, arreglo.length));
				break;
			case 6:
				arreglo = cargaDesdeArchivo(NOMBRE_ARCHIVO); // Arreglo por defecto
				System.out.println("Esta en la posicion: " + Ordenamiento.busquedaBinaria(arreglo));
				break;
			default:
				System.err.println("Esta opcion no esta definida. Seleccione una de las siguientes opciones: ");
				break;
			}
		}
	}
}
