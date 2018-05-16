package com.graworg.ad._2018.tp4;

import java.util.Scanner;

import com.graworg.ad.util.Archivo;

public class Ej1 {
	// Constantes
    private static final String NOMBRE_ARCHIVO = "src/com/graworg/ad/_2018/tp4/Colores.txt"; // Ruta del archivo
	private static final int precioBase = 100; // $100.-
	private static final int tamArrgelo = 20;
	// Scanner
	private static Scanner sc;
	
	/**
	 * (1) Retorna la sumatoria de un número dado.
	 * 
	 * @see Dada la cantidad de colores usados, determina el factor resultante de sumar
	 * los códigos de orden. Este trabajo de impresión se define como de 2da calidad.
	 * @param n
	 * @return
	 */
	public static int segundaCalidad(int n) {
		// Declaración de variables
		int sumatoria;
		
		if (n > 1) {
			sumatoria = segundaCalidad(n - 1) + n; // Composición
		} else {
			sumatoria = 1; // Caso base
		}
			 
		return sumatoria ; // Retorna la sumatoria de un número dado
	}
	
	/**
	 * (2) Retorna el factorial de un número dado.
	 * 
	 * @see Para ciertos trabajos que requieren una calidad de impresion muy superior, se
	 * utiliza un factor distinto, resultante de calcular el factorial de la cantidad
	 * de colores usados. Calcule el factor para esta calidad de trabajo. Este trabajo
	 * de impresión se define como de 1ra calidad.
	 * @param n
	 * @return
	 */
	public static int primeraCalidad(int n) {
		// Declaración de variables
		int factorial;
		
		if (n > 1) {
			factorial = primeraCalidad(n - 1) * n; // Composición
		} else {
			factorial = 1; // Caso base
		}
			 
		return factorial ; // Retorna el factorial de un número dado
	}
	
	/**
	 * (3.1) Carga de un determinado archivo a un arreglo de String todos los colores
	 * con sus respectivos códigos asociados.
	 * 
	 * @see Ahora suponga que los colores usados son provistos en un archivo de texto.
	 * Realice la carga de un arreglo de Strings a partir del archivo.
	 * @return
	 */
	public static String[] cargaDesdeArchivo(int longitud) {
		String[] arreglo = new String[longitud];
		String contenidoDelArchivo = Archivo.leer(NOMBRE_ARCHIVO);
		
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
	
	/**
	 * (3.2) Mostrar todos los colores con sus respectivos códigos asociados.
	 * 
	 * @see Muestre el color con los códigos numéricos asociados a cada uno.
	 */
	public static void mostrarColores(String[] colores) {
		int i = 0;
		while(i<=colores.length-1 && colores[i]!=null){
			System.out.println("Color: " + colores[i] + "; Código: " + colores[i+1]);
			i=i+2;
		}
	}
	
	/**
	 * (4) Convierte a mayúsculas todos los colores que están en minúscula.
	 * 
	 * @see Todos los colores usados y recuperados del archivo de texto están en
	 * minúscula. Lo mejor es guardarlos en mayúscula, entonces antes de cargar el
	 * arreglo deben ser convertidos. Realizar un algoritmo que convierta en mayúscula
	 * el color dado en minúscula. Probarlo en el algoritmo hecho en 3.
	 * @param args
	 */
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
	
	/**
	 * (5) Cambia las vocales a un '*' en las impresiones de 2da calidad.
	 * 
	 * @see La máquina de impresión de 2da calidad tiene una falla: No entiende las
	 * vocales. Para usarla antes de convertir a mayúscula, hay que cambiar las vocales
	 * a un ‘*’. La información es provista por el mismo archivo de texto del punto 3.
	 */
	public static String cambioAVocales(String contenido){
		String nuevoContenido = "";
		char c;
		
		for(int i = 0; i<=contenido.length()-1 ;i++){
			c = contenido.charAt(i);
			
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				nuevoContenido = nuevoContenido + "*";
				//nuevoContenido = contenido.substring(0,i) + '*' + contenido.substring(i+1) + nuevoContenido;
			}else {
				nuevoContenido = nuevoContenido + c;
			}
		}
		
		return nuevoContenido;
	}
	
	public static String cambioAVocales2(String contenido){
		char c;
		
		for(int i = 0; i<=contenido.length()-1 ;i++){
			c = contenido.charAt(i);
			
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				contenido = contenido.substring(0,i) + '*' + contenido.substring(i+1);
			}
		}
		
		return contenido;
	}
	
	
	/**
	 * (6)
	 * 
	 * @see  Realizar un algoritmo que permita decir si un color determinado es usado en la
	 * impresión. Para esto debe recorrer el arreglo de colores, considere que la
	 * impresión a realizar es de 1ra calidad (no tiene cambiadas las vocales por “*”).
	 * ¿Cómo lo resolverías para ambos casos?
	 */
	
	
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
		colores = cargaDesdeArchivo(tamArrgelo);
		
		System.out.println("Bienvenido a la consola de la aplicación");
		
		while(!salir)
		{
			sc = new Scanner(System.in);
			
			// Mostrar el cartel de las opciones
			System.out.print(
					"[0] Salir (IMPLEMENTADO)\n" +
					"[1] Mostrar precio del trabajo de segunda calidad (IMPLEMENTADO)\n" +
					"[2] Mostrar el precio del trabajo de primera calidad (IMPLEMENTADO)\n" +
					"[3] Obtener los nuevos datos del archivo Colores.txt (IMPLEMENTADO)\n" +
					"[4] Mostrar colores (IMPLEMENTADO)\n" +
					"[5] Impresión de 2da calidad\n"
					);
			
			// Leer opción para el menú principal
			opción = sc.nextInt();
			
			switch (opción) {
			case 0:
				salir = true;
				break;
			case 1:
				System.out.println("El precio del trabajo de segunda calidad es: $" + segundaCalidad(4) * precioBase +".-");
				break;
			case 2:
				System.out.println("El precio del trabajo de primera calidad es: $" + primeraCalidad(4) * precioBase +".-");
				break;
			case 3:
				colores = cargaDesdeArchivo(tamArrgelo);
				break;
			case 4:
				mostrarColores(colores);
				break;
			case 5:
				System.out.println(cambioAVocales(Archivo.leer(NOMBRE_ARCHIVO)));
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