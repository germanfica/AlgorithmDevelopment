package xyz.germanfica.ad._2018._1st.tp4;

import java.util.Scanner;

import xyz.germanfica.util.Archivo;

public class Test {
	// Constantes
    private static final String COLORES_ARCHIVO = "src/com/graworg/ad/_2018/tp4/Colores.txt"; // Ruta del archivo Colorex.txt
	private static final int tamArrgelo = 20;
	// Scanner
	private static Scanner sc;
	
	/**
	 * (5) Cambia las vocales a un '*' en las impresiones de 2da calidad.
	 * 
	 * @see La máquina de impresion de 2da calidad tiene una falla: No entiende las
	 * vocales. Para usarla antes de convertir a mayúscula, hay que cambiar las vocales
	 * a un ‘*’. La informacion es provista por el mismo archivo de texto del punto 3.
	 */
	// Intentar resolverlo con el substring. I MADEEE IT!! :D
	public static String cambioEnLasVocales(String contenido){
		// Declaracion de variables
		char c;
		
		// Inicializacion de variables
		c = ' ';
		
		if(contenido.length()-1 < 1) {
			return contenido;
		}else {
			c = contenido.charAt(contenido.length()-1);
			
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
				c = '*';
			}
			
			return "" + cambioEnLasVocales(contenido.substring(0, contenido.length()-1)) + c;
		}
	}
	
	/**
	 * (6) Verificar si el color solicitado es usado en la impresion
	 * 
	 * @see  Realizar un algoritmo que permita decir si un color determinado es usado en la
	 * impresion. Para esto debe recorrer el arreglo de colores, considere que la
	 * impresion a realizar es de 1ra calidad (no tiene cambiadas las vocales por "*").
	 * ¿Como lo resolverías para ambos casos?
	 */
	public static void verificarColorImpresion(String[] colores) {
		sc = new Scanner(System.in);
		
		System.out.println("Ingrese el color: ");
		
		if(hayColor(colores, sc.next().toUpperCase(), 0)) {
			System.out.println("Hay");
		}else {
			System.out.println("No hay");
		}
	}
	
	// Intentar resolverlo con el substring,
	// casi que podría, ya que los elementos que ya no uso los hago null
	// para ir verificando hasta llegar al elemento que está en la fila 0
	// Parece que no se puede recorrer un arreglo sin el índice como parámetro.
	// Considerese a "pos" como i, index, pos es el índice.
	// Hay un manera que es copiando el arreglo y bla bla bla, es mejor
	// pasar por parámetro la posicion
	/*
	 * I came up with this for my Java 2 class.  Essentially you just give it the array and the starting point you want to add from (usually 0).  It doesn't require the CopyOfRange method either.
	 * public static int recurSum(int[] array, int n) {
	 * 	int sum = array[n];
	 * 	if (n+1 < array.length) {
	 * 	  sum += recurSum(array, n+1);
	 * 	}
	 * 	return sum;
	 * }﻿
	 */
	public static boolean hayColor(String[] colores, String color, int pos) {
		// Mientras no sea nulo todo bien
		if(colores[pos]!=null) {
			if(pos>=colores.length-1) {
				return false; // No hubieron coincidencias(:
			}else {
				if(colores[pos].equals(color.toUpperCase())) {
					return true; // Oh te encontré :D
				}
				return hayColor(colores, color, pos+2);
			}
		}else {
			return false;
		}
	}
	
	/**
	 * (8)
	 * 
	 * @see 8. Modificar la solucion del ejercicio 2 (dos):
	 *  - Mostrar la formula de cálculo del factor de forma inversa por pantalla
	 *  - Mostrar el resultado del factorial al final.
	 * Esto es: 6 * 5 * 4 * 3 * 2 * 1 = 72
	 */
	public static int primeraCalidad(int n) {
		// Declaracion de variables
		int factorial;
	
		if (n > 1) {
			System.out.print(n + " * ");
			factorial = primeraCalidad(n - 1) * n;
		} else {
			System.out.print(n);
			factorial = 1;
		}
			 
		return factorial ; // Retorna el factorial de un número dado
	}
	
	/**
	 * (9)
	 * 
	 * @see Hay colores que son muy difíciles de lograr en la imprenta y que están en
	 * promocion.
	 * 
	 * La forma de identificarlos es darles un nombre especial (creado por la imprenta)
	 * que es palíndromo.
	 * 
	 * A partir del punto 4 agregue la funcionalidad para identificar qué colores son palíndromos.
	 * 
	 * Def. palíndromo: palabra o expresion que es igual si se lee de izquierda a derecha que
	 * de derecha a izquierda. Es decir, Un palíndromo es una palabra, un número u otra
	 * secuencia de caracteres que se lee de la misma manera hacia atrás y hacia adelante,
	 * como "madam" o "racecar".
	 */
	// Intentar resolverlo con el substring,
	public static boolean esPalíndromo(String oracion, String nuevaOracion, int i) {
		/*
		 * To do:
		 * - Guardar la oracion que se lee de derecha a izquierda (original).
		 * - Reconstruir la oracion de izquierda a derecha y luego compararla con la
		 * original (sería la de derecha a izquierda).
		 */
		char c = ' ';
		
		if(oracion.length()-1<i) {
			// Nota: trim() no funciona.
			if(nuevaOracion.replaceAll("\\s","").equals(oracion.replaceAll("\\s",""))) {
				return true;
			}else {
				return false;
			}
		}else {
			c = oracion.charAt(i);
			nuevaOracion = c + nuevaOracion;
			
			return esPalíndromo(oracion, nuevaOracion, i+1);
		}
	}
	
	/**
	 * Mostrar menú de opciones
	 */
	public static void mostrarMenú() {
		// Declaracion de las variables
		String[] colores;
		boolean salir;
		int opcion;
		
		// Inicializacion de las variables
		salir = false;
		colores = cargaColoresDesdeArchivo(tamArrgelo);
		
		System.out.println("Bienvenido a la consola de la aplicacion");
		
		while(!salir)
		{
			sc = new Scanner(System.in);
			
			// Mostrar el cartel de las opciones
			System.out.print(
					"[0] Salir (IMPLEMENTADO)\n" +
					"[5] Cambiar las vocales a un '*' en las impresiones de 2da calidad. (IMPLEMENTADO)\n" +
					"[6] Verificar si el color solicitado es usado en la impresion (IMPLEMENTADO)\n" +
					"[8] Mostrar factor (IMPLEMENTADO)\n" +
					"[9] Determinar palindromidad (IMPLEMENTADO)\n"
					);
			
			// Leer opcion para el menú principal
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 0:
				salir = true;
				break;
			case 5:
				System.out.println(cambioEnLasVocales(Archivo.leer(COLORES_ARCHIVO).getTexto()));
				break;
			case 6:
				verificarColorImpresion(colores);
				break;
			case 8:
				sc = new Scanner(System.in);
				System.out.println("Ingrese la cantidad de colores a usar: ");
				int cantColores = sc.nextInt();
				// Mostrar el resultado del factorial al final
				System.out.println(" = " + primeraCalidad(cantColores)/10);
				break;
			case 9:
				sc = new Scanner(System.in);
				System.out.println("Ingrese la oracion a analizar: ");
				String oracion = sc.nextLine();
				System.out.println(esPalíndromo(oracion, "", 0));
				break;
			default:
				System.err.println("Esta opcion no está definida. Seleccione una de las siguientes opciones: ");
				break;
			}
		}
	}
	
	public static String[] cargaColoresDesdeArchivo(int longitud) {
		String[] arreglo = new String[longitud];
		String contenidoDelArchivo = Archivo.leer(COLORES_ARCHIVO).getTexto();
		
		// Convercion a mayúsculas antes de realizar la carga al arreglo
		contenidoDelArchivo = pasarAMayúsculas(contenidoDelArchivo);
		
		sc = new Scanner(contenidoDelArchivo); // Asignacion de tarea al scanner para analizar el contenido del archivo
		
		sc.useDelimiter("\\s*,\\s*"); // Esto clasifica los colores cuando se encuntra una coma
		
		int i = 0;
		
		// Objetivo: almacenar los colores de a uno por uno
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