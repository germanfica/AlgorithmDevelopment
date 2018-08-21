package xyz.germanfica.ad._2018._1st.tp4;

import java.util.Scanner;

import xyz.germanfica.util.Archivo;

public class Entrega {
	// Constantes
    private static final String COLORES_ARCHIVO = "src/com/graworg/ad/_2018/tp4/Colores.txt"; // Ruta del archivo Colorex.txt
	private static final int tamArrgelo = 20;
	// Scanner
	private static Scanner sc;
	
	/**
	 * (5) Cambia las vocales a un '*' en las impresiones de 2da calidad.
	 * 
	 * @see La maquina de impresion de 2da calidad tiene una falla: No entiende las
	 * vocales. Para usarla antes de convertir a mayuscula, hay que cambiar las vocales
	 * a un ‘*’. La informacion es provista por el mismo archivo de texto del punto 3.
	 */
	public static String cambioEnLasVocales(String contenido, int i) {
		// Declaracion de variables
		String nuevoContenido;
		char c;
		
		// Inicializacion de variables
		nuevoContenido = "";
		c = ' ';
		
		if(i == contenido.length()) {
			// Caso base
			
		}else {
			c = contenido.charAt(i);
			
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				c = '*';
			}
			
			// Caso recursivo
			nuevoContenido = c + cambioEnLasVocales(contenido, i+1);
		}
		
		return nuevoContenido;
	}
	
	/**
	 * (6) Verificar si el color solicitado es usado en la impresion
	 * 
	 * @see  Realizar un algoritmo que permita decir si un color determinado es usado en la
	 * impresion. Para esto debe recorrer el arreglo de colores, considere que la
	 * impresion a realizar es de 1ra calidad (no tiene cambiadas las vocales por "*").
	 * ¿Como lo resolverias para ambos casos?
	 * 
	 * ACORDATEE GERMAAN DE CREAR, UN MODULO QUE LEA LOS DATOS Y  OTRO QUE LOS MUESTRE.
	 * BIEN LO HABIAS IMPLEMENTADO.
	 * 
	 * Lo habias charlado con Natalia, pero estaba bien jaja
	 */
	public static void verificarColorImpresion(String[] colores) {
		sc = new Scanner(System.in);
		
		System.out.println("Ingrese el color: ");
		
		if(hayColor(colores, sc.next().toUpperCase(), 0, false)) {
			System.out.println("Hay");
		}else {
			System.out.println("No hay");
		}
	}
	
	public static boolean hayColor(String[] colores, String color, int i, boolean respuesta) {
		
		if(colores[i]==null || i==colores.length || respuesta==true) {
			// Caso base
			
		}else {
			if(colores[i].equals(color.toUpperCase())) {
				respuesta = true; // Oh te encontré :D
			}
			
			// Caso recursivo
			respuesta = hayColor(colores, color, i+2, respuesta);
		}
		
		return respuesta;
	}
	
	/**
	 * (8)
	 * 
	 * @see 8. Modificar la solucion del ejercicio 2 (dos):
	 *  - Mostrar la formula de calculo del factor de forma inversa por pantalla
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
			 
		return factorial ; // Retorna el factorial de un numero dado
	}
	
	/**
	 * (9)
	 * 
	 * @see Hay colores que son muy dificiles de lograr en la imprenta y que estan en
	 * promocion.
	 * 
	 * La forma de identificarlos es darles un nombre especial (creado por la imprenta)
	 * que es palindromo.
	 * 
	 * A partir del punto 4 agregue la funcionalidad para identificar qué colores son palindromos.
	 * 
	 * Def. palindromo: palabra o expresion que es igual si se lee de izquierda a derecha que
	 * de derecha a izquierda. Es decir, Un palindromo es una palabra, un numero u otra
	 * secuencia de caracteres que se lee de la misma manera hacia atras y hacia adelante,
	 * como "madam" o "racecar".
	 */
	public static boolean esPalindromo(String oracion, String nuevaOracion, int i) {
		/*
		 * To do:
		 * - Guardar la oracion que se lee de derecha a izquierda (original).
		 * - Reconstruir la oracion de izquierda a derecha y luego compararla con la
		 * original (seria la de derecha a izquierda).
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
			
			return esPalindromo(oracion, nuevaOracion, i+1);
		}
	}
	
	/**
	 * Mostrar menu de opciones
	 */
	public static void mostrarMenu() {
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
			
			// Leer opcion para el menu principal
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 0:
				salir = true;
				break;
			case 5:
				System.out.println(cambioEnLasVocales(Archivo.leer(COLORES_ARCHIVO), 0));
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
				System.out.println(esPalindromo(oracion, "", 0));
				break;
			default:
				System.err.println("Esta opcion no esta definida. Seleccione una de las siguientes opciones: ");
				break;
			}
		}
	}
	
	public static String[] cargaColoresDesdeArchivo(int longitud) {
		String[] arreglo = new String[longitud];
		String contenidoDelArchivo = Archivo.leer(COLORES_ARCHIVO);
		
		// Convercion a mayusculas antes de realizar la carga al arreglo
		contenidoDelArchivo = pasarAMayusculas(contenidoDelArchivo);
		
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
	
	public static String pasarAMayusculas(String contenido) {
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
		mostrarMenu();
	}
}