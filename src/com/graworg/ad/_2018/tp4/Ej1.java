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
	 * (3 Parte 1) Carga a un arreglo de String todos los colores de un determinado archivo.
	 * 
	 * @see Ahora suponga que los colores usados son provistos en un archivo de texto.
	 * Realice la carga de un arreglo de Strings a partir del archivo.
	 * @return
	 */
	public static String[] cargaDeColores(int longitud) {
		String[] contenido = new String[longitud];
		
		sc = new Scanner(Archivo.leer(NOMBRE_ARCHIVO));
		
		sc.useDelimiter("\\s*,\\s*"); // Me clasifica los colores cuando encuntra la coma
		
		int i = 0;
		
		// Objetivo: almacenar los colores uno por uno
		while(sc.hasNext()) {
			contenido[i] = sc.next();
			i=i+1;
		}
		
		return contenido;
	}
	
	/**
	 * (3 Parte 2)
	 * 
	 * @see Muestre el color con los códigos numéricos asociados a cada uno.
	 */
	public static void mostrarElContenidoDelArreglo(String[] colores) {
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
	 * (5) Cambia las vocales a un '*' en las impresiones de primera calidad.
	 * 
	 * @see La máquina de impresión de 2da calidad tiene una falla: No entiende las vocales. Para usarla
	 * antes de convertir a mayúscula, hay que cambiar las vocales a un ‘*’. La información es provista
	 * por el mismo archivo de texto del punto 3.
	 */
	public static String cambiarVocales(String contenido){
		String nuevoContenido = "";
		
		for(int i = 0; i<=contenido.length()-1 ;i++){
			switch (contenido.charAt(i)) {
			case 'A':
				contenido= contenido.substring(0,i) + '*' + contenido.substring(i+1);
				break;
			case 'E':
				contenido= contenido.substring(0,i) + '*' + contenido.substring(i+1);
				break;
			case 'I':
				contenido= contenido.substring(0,i) + '*' + contenido.substring(i+1);
				break;
			case 'O':
				contenido= contenido.substring(0,i) + '*' + contenido.substring(i+1);
				break;
			case 'U':
				contenido= contenido.substring(0,i) + '*' + contenido.substring(i+1);
				break;
			default:
				break;
			}
		}
		
		return nuevoContenido;
	}
	
	
	/**
	 * (6)
	 * 
	 * @see  Realizar un algoritmo que permita decir si un color determinado es usado en la impresión. Para
	 * esto debe recorrer el arreglo de colores, considere que la impresión a realizar es de 1ra calidad
	 * (no tiene cambiadas las vocales por “*”). ¿Cómo lo resolverías para ambos casos?
	 */
	
	public static void mostrarMenú(){
		String[] colores;
		
		// (1)
		System.out.println("El precio del trabajo de segunda calidad es: $" + segundaCalidad(4) * precioBase +".-");
		
		// (2)
		System.out.println("El precio del trabajo de primera calidad es: $" + primeraCalidad(4) * precioBase +".-");
		
		// Cambiar mínuculas
		//Archivo.guardar(cambiarVocales(Archivo.leer(NOMBRE_ARCHIVO)), NOMBRE_ARCHIVO);
		
		// (4) Guardar los cambios
		Archivo.guardar(pasarAMayúsculas(Archivo.leer(NOMBRE_ARCHIVO)), NOMBRE_ARCHIVO);
		
		String hola = Archivo.leer(NOMBRE_ARCHIVO);
		System.out.println(hola);
		
		
		// (3 Parte 1)
		colores = cargaDeColores(tamArrgelo);
		
		// (3 Parte 2)
		mostrarElContenidoDelArreglo(colores);
		
		// (5)
		
	}
	
	public static void main(String[] args) {
		mostrarMenú();
	}
	
	/**
	 * Mostrar el contenido del archivo
	 */
	public static void mostrarContenidoDelArchivo() {
		sc = new Scanner(Archivo.leer(NOMBRE_ARCHIVO));
		
		sc.useDelimiter("\\s*,\\s*"); // Me clasifica los colores cuando encuntra la coma
		
		// Objetivo: almacenar los colores uno por uno
		while(sc.hasNext()) {
			System.out.println("Color: " + sc.next() + "; Código: " + sc.next());
		}
	}
}