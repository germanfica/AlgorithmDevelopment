package xyz.germanfica._2018._1st.tp4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import xyz.germanfica.util.Archivo;

/*
 * Notas:
 * Los codigos de colores solo identifican un orden en el uso de colores, en una
 * impresion determinada.
 */
public class Ej1 {
	// Constantes
    private static final String COLORES_ARCHIVO = "src/com/graworg/ad/_2018/tp4/Colores.txt"; // Ruta del archivo Colorex.txt
    private static final String IMPRESIONES_ARCHIVO = "src/com/graworg/ad/_2018/tp4/Impresiones.txt"; // Ruta del archivo Impresiones.txt
	private static final int precioBase = 100; // $100.-
	private static final int tamArrgelo = 20;
	// Scanner
	private static Scanner sc;
	private static Scanner scI;
	private static Scanner scJ;
	
	/**
	 * (1) Retorna la sumatoria de un número dado.
	 * 
	 * @see Dada la cantidad de colores usados, determina el factor resultante de sumar
	 * los codigos de orden. Este trabajo de impresion se define como de 2da calidad.
	 * @param n
	 * @return
	 */
	public static int segundaCalidad(int n) {
		// Declaracion de variables
		int sumatoria;
		
		if (n > 1) {
			sumatoria = segundaCalidad(n - 1) + n; // Composicion
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
	 * de impresion se define como de 1ra calidad.
	 * @param n
	 * @return
	 */
	public static int primeraCalidad(int n) {
		// Declaracion de variablesscJ
		int factorial;
		
		if (n > 1) {
			factorial = primeraCalidad(n - 1) * n; // Composicion
		} else {
			factorial = 1; // Caso base
		}
			 
		return factorial ; // Retorna el factorial de un número dado
	}
	
	/**
	 * (3.1) Carga de un determinado archivo a un arreglo de String todos los colores
	 * con sus respectivos codigos asociados.
	 * 
	 * @see Ahora suponga que los colores usados son provistos en un archivo de texto.
	 * Realice la carga de un arreglo de Strings a partir del archivo.
	 * @return
	 */
	public static String[] cargaColoresDesdeArchivo(int longitud) {
		String[] arreglo = new String[longitud];
		String contenidoDelArchivo = Archivo.leer(COLORES_ARCHIVO).getTexto();
		
		// Convercion a mayúsculas antes de realizar la carga al arreglo
		contenidoDelArchivo = pasarAMayúsculas(contenidoDelArchivo);
		
		sc = new Scanner(contenidoDelArchivo); // Asignacion de tarea al scanner para analizar el contenido del archivo
		
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
	 * (3.2) Mostrar todos los colores con sus respectivos codigos asociados.
	 * 
	 * @see Muestre el color con los codigos numéricos asociados a cada uno.
	 */
	public static void mostrarColores(String[] colores) {
		int i = 0;
		while(i<=colores.length-1 && colores[i]!=null){
			System.out.println("Color: " + colores[i] + "; Codigo: " + colores[i+1]);
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
	 * @see La máquina de impresion de 2da calidad tiene una falla: No entiende las
	 * vocales. Para usarla antes de convertir a mayúscula, hay que cambiar las vocales
	 * a un '*'. La informacion es provista por el mismo archivo de texto del punto 3.
	 */
	public static String cambioAVocales(String contenido){
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
		
		if(hayColor(colores, sc.next())) {
			System.out.println("Hay");
		}else {
			System.out.println("No hay");
		}
	}
	
	public static boolean hayColor(String[] colores, String color) {
		// Declaracion de variables
		boolean respuesta = false;
		int i;
		
		// Inicializacion de variables
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
	 * (7) 
	 * 
	 * @see Se han guardado las impresiones realizadas en el mes en una matriz numérica.
	 * Las columnas representan a los colores y las filas a las impresiones hechas en el mes.
	 * Recorrer recursivamente la matriz de impresiones por fila y mostrar la suma (factor
	 * de impresion de 2da calidad).
	 * 
	 * Esto es solo una nota adicional: los codigos de orden no están ordenados por fila, ya
	 * que no todas las impresiones usaron los mismo colores.
	 */
	
	public static int[][] cargaImpresionesDesdeArchivo(int longitudFila, int longitudColumna) {
		int[][] matriz = new int[longitudFila][longitudColumna];
		String contenidoDelArchivo = Archivo.leer(IMPRESIONES_ARCHIVO).getTexto();
		
		// Convercion a mayúsculas antes de realizar la carga al arreglo
		contenidoDelArchivo = pasarAMayúsculas(contenidoDelArchivo);
		BufferedReader buff;
		try {
			buff = new BufferedReader(new FileReader(IMPRESIONES_ARCHIVO));
			scI = new Scanner(buff); // Asignacion de tarea al scanner para analizar el contenido del archivo

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Obtener los datos que están en el archivo de texto
		//scI.useDelimiter("\\s*,\\s*");
		
		//int i = 0;
		//int j = 0;
		
		while(scI.hasNextLine()) {
			System.out.println(scI.nextLine());
			System.out.println("h");
			
		}
		
		/*
		// Objetivo: almacenar los colores uno por uno
		while(scI.hasNextLine()) {
			scJ = new Scanner(scI.next());
			
			scJ.useDelimiter("\\s*,\\s*"); // Clasifica los colores cuando encuntra una coma
			
			while(scJ.hasNext()){
				matriz[i][j] = scI.nextInt();
				System.out.println();
				j=j+1;
			}
			i=i+1;
		}
		*/
		
		return matriz;
	}
	
	/**
	 * Mostrar menú de opciones
	 */
	public static void mostrarMenú() {
		// Declaracion de las variables
		int[][] matrizColores;
		String[] colores;
		boolean salir;
		int opcion;
		
		// Inicializacion de las variables
		salir = false;
		colores = cargaColoresDesdeArchivo(tamArrgelo);
		System.out.println("Carga de la matriz");
		matrizColores = cargaImpresionesDesdeArchivo(5, tamArrgelo);
		
		
		System.out.println("Bienvenido a la consola de la aplicacion");
		
		while(!salir)
		{
			sc = new Scanner(System.in);
			
			// Mostrar el cartel de las opciones
			System.out.print(
					"[0] Salir (IMPLEMENTADO)\n" +
					"[1] Mostrar precio del trabajo de segunda calidad (IMPLEMENTADO)\n" +
					"[2] Mostrar el precio del trabajo de primera calidad (IMPLEMENTADO)\n" +
					"[3] Obtener nuevos datos del archivo Colores.txt (IMPLEMENTADO)\n" +
					"[4] Mostrar colores (IMPLEMENTADO)\n" +
					"[5] Impresion de 2da calidad (IMPLEMENTADO)\n" +
					"[6] Verificar si un color determinado es usado en la impresion (IMPLEMENTADO)\n"
					);
			
			// Leer opcion para el menú principal
			opcion = sc.nextInt();
			
			switch (opcion) {
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
				colores = cargaColoresDesdeArchivo(tamArrgelo);
				break;
			case 4:
				mostrarColores(colores);
				break;
			case 5:
				System.out.println(cambioAVocales(Archivo.leer(COLORES_ARCHIVO).getTexto()));
				break;
			case 6:
				verificarColorImpresion(colores);
				break;
			default:
				System.err.println("Esta opcion no está definida. Seleccione una de las siguientes opciones: ");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		mostrarMenú();
	}
}