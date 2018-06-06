package com.graworg.ad._2018.entrega.ordenamiento;

import java.util.Scanner;

import com.graworg.ad.util.Archivo;

public class Entrega {
	private static Scanner sc;
	
	/**
	 * (2) Método de selección
	 * 
	 * @return
	 */
	public static int[] métodoDeSelección() {
		// Declaración de las variables
		int[] arreglo;
		int i, posiciónDelMenor;
		
		// Inicialización de las variables
		i = 0;
		posiciónDelMenor = 0;
		arreglo = cargaDesdeArchivo("src/com/graworg/ad/_2018/entrega/ordenamiento/arreglo_01.txt", 10);
		
		// Recorrer el arreglo para ordenar los elementos uno a uno
		for(i=0;i<=arreglo.length-1;i++) {
			
		}
		
		return arreglo;
	}
	
	public static void mostrarElementos(int[] arreglo) {
		// Declaración de variables
		int i;
		
		// Inicialización de variables
		i = 0;
		
		while(i<=arreglo.length-1) {
			System.out.println(arreglo[i]);
		}
	}
	
	public static int[] cargaDesdeArchivo(String ruta, int longitud) {
		int[] arreglo = new int[longitud];
		String contenidoDelArchivo = Archivo.leer(ruta);
		
		sc = new Scanner(contenidoDelArchivo); // Asignación de tarea al scanner para analizar el contenido del archivo
		
		sc.useDelimiter("\\s*,\\s*"); // Esto clasifica los colores cuando se encuntra una coma
		
		int i = 0;
		
		// Objetivo: almacenar los colores de a uno por uno
		while(sc.hasNext()) {
			arreglo[i] = sc.nextInt();
			i=i+1;
		}
		
		return arreglo;
	}
	
	/**
	 * Mostrar menú de opciones
	 */
	public static void mostrarMenú() {
		// Declaración de las variables
		int[] arreglo;
		boolean salir;
		int opción;
		
		// Inicialización de las variables
		salir = false;
	
		
		System.out.println("Bienvenido a la consola de la aplicación");
		
		while(!salir)
		{
			sc = new Scanner(System.in);
			
			// Mostrar el cartel de las opciones
			System.out.print(
					"[0] Salir (IMPLEMENTADO)\n" +
					"[1] Aplicar el método de inserción\n" +
					"[2] Aplicar el método selección\n"
					);
			
			// Leer opción para el menú principal
			opción = sc.nextInt();
			
			switch (opción) {
			case 0:
				salir = true;
				break;
			case 2:
				arreglo = métodoDeSelección();
				mostrarElementos(arreglo);
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
