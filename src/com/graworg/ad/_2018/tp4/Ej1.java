package com.graworg.ad._2018.tp4;

import java.util.Scanner;

import com.graworg.ad._2018.tp3.ej3.Cliente;
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
	 * (3) Carga a un arreglo de String todos los colores de un determinado archivo.
	 * 
	 * @see Ahora suponga que los colores usados son provistos en un archivo de texto.
	 * Realice la carga de un arreglo de Strings a partir del archivo y muestre el color
	 * con los códigos numéricos asociados a cada uno.
	 * @return
	 */
	public static void mostrarContenidoDelArchivo() {
		sc = new Scanner(Archivo.leer(NOMBRE_ARCHIVO));
		
		sc.useDelimiter("\\s*,\\s*"); // Me clasifica los colores cuando encuntra la coma
		
		// Objetivo: es almacenar los colores uno por uno
		while(sc.hasNext()) {
			System.out.println("Color: " + sc.next() + "; Código: " + sc.next());
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
	 * Mostrar menú de opciones
	 */
	public static void mostrarMenú() {
		// Crear variables
		String[] colores = new String[tamArrgelo];
		String[] códigos = new String[tamArrgelo];
		boolean salir;
		int opción;
		
		// Inicializar variables
		salir = false;
		
		System.out.println("Bienvenido a la consola de la aplicación");
		
		while(!salir)
		{
			sc = new Scanner(System.in);
			
			// Mostrar cartel de opciones
			System.out.print(
					"[0] Salir (IMPLEMENTADO)\n" +
					"[1] Volver a cargar los clientes del archivo clientes.txt (IMPLEMENTADO)\n" + // Ahorra mucho tiempo.
					"[2] Guardar todos los cambios recientes en el archivo clientes.txt (IMPLEMENTADO)\n" +
					"[3] Modificar la cantidad máxima de puntos logrables (IMPLEMENTADO)\n" +
					// Observadoras
					"[4] Mostrar nombre del cliente (IMPLEMENTADO)\n" +
					"[5] Mostrar puntos del cliente (IMPLEMENTADO)\n" +
					"[6] Mostrar cliente con su puntaje (IMPLEMENTADO)\n" +
					"[7] Mostrar si dos clientes son iguales (IMPLEMENTADO)\n" +
					// Modificadoras
					"[8] Modificar nombre al cliente (IMPLEMENTADO)\n" +
					"[9] Modificar el puntaje de un cliente (IMPLEMENTADO)\n" +
					// Propias del tipo
					"[10] Sumar puntos al cliente (IMPLEMENTADO)\n" +
					"[11] Canjear puntos al cliente (IMPLEMENTADO)\n" +
					"[12] Mostrar el cliente de mayor puntaje logrado (IMPLEMENTADO)\n" +
					"[13] Mostrar si hay clientes que no tienen puntos actualmente (IMPLEMENTADO)\n" // Boolean
					);
			
			// Leer opción del menú principal
			opción = sc.nextInt();
			
			switch (opción) {
			case 0:
				salir = true;
				break;
			case 1:
				break;
			default:
				System.err.println("Esta opción no está definida. Seleccione una de las siguientes opciones: ");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		//Archivo.guardar(pasarAMayúsculas(Archivo.leer(NOMBRE_ARCHIVO)), NOMBRE_ARCHIVO); // Guardar los cambios
		
		//System.out.println(Archivo.leer(NOMBRE_ARCHIVO));
		
		mostrarContenidoDelArchivo();
		
		
		//cantidadDeElementosDelArreglo(coloresDesdeArchivo());
				
		//cantidadDeColores = cantidadDeElementosDelArreglo(coloresDesdeArchivo());
		
		//System.out.println("El precio del trabajo de segunda calidad es: $" + segundaCalidad(cantidadDeColores) * precioBase +".-");
	}
}