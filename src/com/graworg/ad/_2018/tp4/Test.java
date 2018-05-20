package com.graworg.ad._2018.tp4;

import com.graworg.ad.util.Archivo;
import java.util.Scanner;

public class Test {
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
	// Intentar resolverlo con el substring. I MADEEE IT!! :D
	public static String cambioEnLasVocales(String contenido){
		// Declaración de variables
		char c;
		
		// Inicialización de variables
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
	 * @see 8. Modificar la solución del ejercicio 2 (dos):
	 *  - Mostrar la formula de cálculo del factor de forma inversa por pantalla
	 *  - Mostrar el resultado del factorial al final.
	 * Esto es: 6 * 5 * 4 * 3 * 2 * 1 = 72
	 */
	public static int primeraCalidad(int n) {
		// Declaración de variables
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
	 * promoción.
	 * 
	 * La forma de identificarlos es darles un nombre especial (creado por la imprenta)
	 * que es palíndromo.
	 * 
	 * A partir del punto 4 agregue la funcionalidad para identificar qué colores son palíndromos.
	 * 
	 * Def. palíndromo: palabra o expresión que es igual si se lee de izquierda a derecha que
	 * de derecha a izquierda. Es decir, Un palíndromo es una palabra, un número u otra
	 * secuencia de caracteres que se lee de la misma manera hacia atrás y hacia adelante,
	 * como "madam" o "racecar".
	 */
	// Intentar resolverlo con el substring,
	public static boolean esPalíndromo(String oración, String nuevaOración, int i) {
		/*
		 * To do:
		 * - Guardar la oración que se lee de derecha a izquierda (original).
		 * - Reconstruir la oración de izquierda a derecha y luego compararla con la
		 * original (sería la de derecha a izquierda).
		 */
		char c = ' ';
		
		if(oración.length()-1<i) {
			// Nota: trim() no funciona.
			if(nuevaOración.replaceAll("\\s","").equals(oración.replaceAll("\\s",""))) {
				return true;
			}else {
				return false;
			}
		}else {
			c = oración.charAt(i);
			nuevaOración = c + nuevaOración;
			
			return esPalíndromo(oración, nuevaOración, i+1);
		}
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
					"[5] Cambiar las vocales a un '*' en las impresiones de 2da calidad. (IMPLEMENTADO)\n" +
					"[6] Verificar si el color solicitado es usado en la impresión (IMPLEMENTADO)\n" +
					"[8] Mostrar factor (IMPLEMENTADO)\n" +
					"[9] Determinar palindromidad (IMPLEMENTADO)\n"
					);
			
			// Leer opción para el menú principal
			opción = sc.nextInt();
			
			switch (opción) {
			case 0:
				salir = true;
				break;
			case 5:
				System.out.println(cambioEnLasVocales(Archivo.leer(COLORES_ARCHIVO)));
				break;
			case 6:
				verificarColorImpresión(colores);
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
				System.out.println("Ingrese la oración a analizar: ");
				String oración = sc.nextLine();
				System.out.println(esPalíndromo(oración, "", 0));
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