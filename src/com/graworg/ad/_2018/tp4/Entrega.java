package com.graworg.ad._2018.tp4;

import com.graworg.ad.util.Archivo;
import java.util.Scanner;

public class Entrega {
	// Constantes
    private static final String COLORES_ARCHIVO = "src/com/graworg/ad/_2018/tp4/Colores.txt"; // Ruta del archivo Colorex.txt
	private static final int tamArrgelo = 20;
	// Scanner
	private static Scanner sc;
	
	/**
	 * (5) Cambia las vocales a un '*' en las impresiones de 2da calidad.
	 * 
	 * @see La máquina de impresión de 2da calidad tiene una falla: No entiende las
	 * vocales. Para usarla antes de convertir a mayúscula, hay que cambiar las vocales
	 * a un ‘*’. La información es provista por el mismo archivo de texto del punto 3.
	 */
	public static String cambioEnVocales(String contenido, int i){
		// Declaración de variables
		char c;
		
		// Inicialización de variables
		c = ' ';
		
		if(i == contenido.length()-1) {
			return contenido;
		}else {
			c = contenido.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') { c = '*'; }
			
			return c + cambioEnVocales(contenido, i+1);
		}
	}
	
	/**
	 * (6) Verificar si el color solicitado es usado en la impresión
	 * 
	 * @see  Realizar un algoritmo que permita decir si un color determinado es usado en la
	 * impresión. Para esto debe recorrer el arreglo de colores, considere que la
	 * impresión a realizar es de 1ra calidad (no tiene cambiadas las vocales por “*”).
	 * ¿Cómo lo resolverías para ambos casos?
	 */
	public static void verificarColorImpresión(String[] colores) {
		sc = new Scanner(System.in);
		
		System.out.println("Ingrese el color: ");
		
		if(hayColor(colores, sc.next())) {
			System.out.println("Hay");
		}else {
			System.out.println("No hay");
		}
	}
	
	public static boolean hayColor(String[] colores, String color) {
		// Declaración de variables
		boolean respuesta = false;
		int i;
		
		// Inicialización de variables
		i = 0;
		
		do {
			if(colores[i].equals(color.toUpperCase())) {
				respuesta = true;
			}
			i = i + 2;
		}while(i<=colores.length-1 && !respuesta && colores[i]!=null);
		
		return respuesta;
	}
	
	
	/**
	 * Mostrar menú de opciones
	 */
	public static void mostrarMenú() {
		// Declaración de las variables
		String[] colores;
		boolean salir;
		int opción;
		
		// Inicialización de las variables
		salir = false;
		colores = cargaColoresDesdeArchivo(tamArrgelo);
		
		
		System.out.println("Bienvenido a la consola de la aplicación");
		
		while(!salir)
		{
			sc = new Scanner(System.in);
			
			// Mostrar el cartel de las opciones
			System.out.print(
					"[0] Salir (IMPLEMENTADO)\n" +
					"[5] Cambiar las vocales a un '*' en las impresiones de 2da calidad.\n" +
					"[6] Verificar si el color solicitado es usado en la impresión\n"
					);
			
			// Leer opción para el menú principal
			opción = sc.nextInt();
			
			switch (opción) {
			case 0:
				salir = true;
				break;
			case 5:
				System.out.println(cambioEnVocales(Archivo.leer(COLORES_ARCHIVO), 0));
				break;
			case 6:
				verificarColorImpresión(colores);
				break;
			default:
				System.err.println("Esta opción no está definida. Seleccione una de las siguientes opciones: ");
				break;
			}
		}
	}
	
	public static String[] cargaColoresDesdeArchivo(int longitud) {
		String[] arreglo = new String[longitud];
		String contenidoDelArchivo = Archivo.leer(COLORES_ARCHIVO);
		
		// Converción a mayúsculas antes de realizar la carga al arreglo
		contenidoDelArchivo = pasarAMayúsculas(contenidoDelArchivo);
		
		sc = new Scanner(contenidoDelArchivo); // Asignación de tarea al scanner para analizar el contenido del archivo
		
		sc.useDelimiter("\\s*,\\s*"); // Clasifica los colores cuando encuntra una coma
		
		int i = 0;
		
		// Objetivo: almacenar los colores uno por uno
		while(sc.hasNext()) {
			arreglo[i] = sc.next();
			i=i+1;
		}
		
		return arreglo;
	}
	
	public static String pasarAMayúsculas(String contenido) {
		String nuevoContenido = "";
		
		sc = new Scanner(contenido);
		
		sc.useDelimiter("\\s*,\\s*");
		
		nuevoContenido = nuevoContenido + sc.next().toUpperCase();
		
		while(sc.hasNext()) {
			nuevoContenido = nuevoContenido + ", " + sc.next().toUpperCase();
		}
		
		return nuevoContenido;
	}
	
	public static void main(String[] args) {
		mostrarMenú();
	}
}