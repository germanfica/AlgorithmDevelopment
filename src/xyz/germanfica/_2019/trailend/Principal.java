//<<<<<<< HEAD:src/xyz/germanfica/_2019/trailend/Principal.java
package xyz.germanfica._2019.trailend;
//=======
//package xyz.germanfica._2019.preparacionfinal;
//>>>>>>> aa7053f22433a98639ef4a27764a9b8d55132e95:src/xyz/germanfica/_2019/preparacionfinal/Principal.java

import java.text.DecimalFormat;
import java.util.Scanner;
import xyz.germanfica.util.ArregloEntero;

/**
 * @authors [GERMAN LUIS GUILLERMO FICA, GONZALO DARIO OLMOS]
 *
 */
public class Principal {
	/**
	 * Este algoritmo convierte un arreglo de objetos aleatorios en un arreglo de
	 * enteros.
	 * 
	 * @param arr
	 * @return devuelve un arreglo de enteros.
	 */
	public static int[] toIntArray(Aleatorio[] arr) {
		int[] nuevoArreglo = new int[arr.length];

		for (int i = 0; i <= arr.length - 1; i++) {
			nuevoArreglo[i] = arr[i].getNumAleatorio();
		}
		return nuevoArreglo;
	}

	/**
	 * Clona un arreglo de objetos aleatorios.
	 * 
	 * @param arr es el arreglo a clonar
	 * @return devuelve un arreglo clon.
	 */
	public static Aleatorio[] clonarArreglo(Aleatorio[] arr) {
		Aleatorio[] nuevoArreglo;
		nuevoArreglo = new Aleatorio[arr.length];
		for (int i = 0; i <= arr.length - 1; i++) {
			nuevoArreglo[i] = arr[i].clonar();
		}
		return nuevoArreglo;
	}

	/**
	 * Carga un arreglo de objetos aleatorios.
	 * 
	 * @param arr es el arreglo de objetos aleatorios a ser cargado
	 */
	public static void cargaArreglo(Aleatorio[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Aleatorio();
		}
	}

	/**
	 * Verifica si un arreglo de objetos aleatorios está ordenado de forma
	 * decreciente.
	 * 
	 * @param arr es el arreglo de objetos aleatorios a verificar.
	 * @return devuelve verdadero si está ordenado de forma decreciente.
	 */
	public static boolean esDecreciente(Aleatorio[] arr, int n) {
		boolean esDecreciente = true;
		int i = 0;

		while (esDecreciente == true && i <= n - 1) {
			if (arr[i].compareTo(arr[i + 1]) == -1) {
				esDecreciente = false;
			}
			i++;
		}
		return esDecreciente;
	}

	/**
	 * Ordena un arreglo de enteros de forma decreciente.
	 * 
	 * @param arr es el arreglo a ordenar
	 */
	public static void ordSel(int[] arr, int n) {
		int actual;
		int posMenor = 1;
		int aux;

		for (int i = 1; i <= n - 1; i++) {
			for (int j = i; j <= n - 1; j++) {
				actual = arr[j];
				if (actual > arr[posMenor]) {
					posMenor = j;
				}
			}
			aux = arr[i - 1];
			arr[i - 1] = arr[posMenor];
			arr[posMenor] = aux;
			posMenor = i;
		}
	}

	/**
	 * Ordena un arreglo de enteros de forma decreciente.
	 * 
	 * @param arreglo es el arreglo a ordenar
	 */
	public static void burbujaMejorado(int[] arreglo, int n) {
		int auxiliar, i;
		boolean ordenado;

		ordenado = false;
		i = 0;

		while (i <= (n - 1) && ordenado == false) {
			ordenado = true;

			for (int j = 0; j <= (n - i - 2); j++) {
				if (arreglo[j] < arreglo[j + 1]) {
					ordenado = false;
					auxiliar = arreglo[j];
					arreglo[j] = arreglo[j + 1];
					arreglo[j + 1] = auxiliar;
				}
			}
			i++;
		}
	}

	/**
	 * Ordena un arreglo de enteros de forma decreciente.
	 * 
	 * @param arreglo es el arreglo a ordenar
	 */
	public static void insercion(int[] arreglo, int n) {
		int auxiliar, j;

		for (int i = 1; i <= n - 1; i++) {
			j = i;
			auxiliar = arreglo[j];

			while (j > 0 && arreglo[j - 1] < auxiliar) {
				arreglo[j] = arreglo[j - 1];
				j--;
			}
			arreglo[j] = auxiliar;
		}
	}

	/**
	 * Lee una opcion para el menu de la app.
	 * 
	 * @return devuelve un numero entero
	 */
	public static int leerOpcion() {
		return new Scanner(System.in).nextInt();
	}
	
	public static void pruebas() {
		int[] arr = {3,2};
		
		insercion(arr, arr.length);
		
		ArregloEntero.mostrar(arr);
	}

	/**
	 * Muestra las opciones disponibles en el menu de la app
	 */
	public static void mostrarOpciones() {
		System.out.println("Bienvenido!");
		System.out.println("[0] Salir.");
		System.out.println("[1] Clonar el arreglo creado.");
		System.out.println("[2] Verificar si el arreglo está ordenado de forma decreciente.");
		System.out.println("[3] Metodo burbuja.");
		System.out.println("[4] Metodo inserción");
		System.out.println("[5] Metodo selección");
		System.out.println("[6] Test de la clase Aleatorio.");
		System.out.println("[7] Pruebas.");
	}

	/**
	 * Muestra los numeros aleatorios de una arreglo de objetos aleatorios.
	 * 
	 * @param arr es el arreglo de objetos aleatorios.
	 */
	public static void mostrarNumAleatorios(Aleatorio[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getNumAleatorio() + " ");
		}
	}

	/**
	 * Calcula el tiempo total en segundos dado un tiempo inicial y tiempo final.
	 * 
	 * @param startTime es el tiempo inicial
	 * @param endTime   es el tiempo final
	 * @return devuelve tiempo en segundos
	 */
	public static double totalTimeInSecond(long startTime, long endTime) {
		return (double) (endTime - startTime) / 1_000_000_000;
	}

	/*
	 * El algoritmo principal tiene que ser el cerebro el que maneja y da las
	 * ordenes de qué hacer.
	 */
	public static void main(String[] args) {
		Aleatorio[] arregloAleatorios = new Aleatorio[1000];
		int[] arregloEnteros = new int[1000];
		boolean salir = false;
		DecimalFormat df = new DecimalFormat("#.00000000");
		long startTime;
		long endTime;

		cargaArreglo(arregloAleatorios); // Carga del arreglo

		while (!salir) {
			mostrarOpciones(); // Muestra las opciones del menu

			switch (leerOpcion()) {
			case 0:
				salir = true;
				break;
			case 1:
				mostrarNumAleatorios(clonarArreglo(arregloAleatorios)); // Clonar arreglo);
				break;
			case 2:
				System.out.println("está ordenado de forma decreciente: "
						+ esDecreciente(arregloAleatorios, arregloAleatorios.length));
				break;
			case 3:
				arregloEnteros = toIntArray(arregloAleatorios);

				startTime = System.nanoTime(); // Tiempo inicial
				burbujaMejorado(arregloEnteros, arregloEnteros.length); // Algoritmo
				endTime = System.nanoTime(); // Tiempo final
				System.out.println("Tiempo total: " + df.format(totalTimeInSecond(startTime, endTime)) + " segundos.");

				ArregloEntero.mostrar(arregloEnteros);
				break;
			case 4:
				arregloEnteros = toIntArray(arregloAleatorios);

				startTime = System.nanoTime(); // Tiempo inicial
				insercion(arregloEnteros, arregloEnteros.length); // Algoritmo
				endTime = System.nanoTime(); // Tiempo final
				System.out.println("Tiempo total: " + df.format(totalTimeInSecond(startTime, endTime)) + " segundos.");

				ArregloEntero.mostrar(arregloEnteros);
				break;
			case 5:
				arregloEnteros = toIntArray(arregloAleatorios);

				startTime = System.nanoTime(); // Tiempo inicial
				ordSel(arregloEnteros, arregloEnteros.length); // Algoritmo
				endTime = System.nanoTime(); // Tiempo final
				System.out.println("Tiempo total: " + df.format(totalTimeInSecond(startTime, endTime)) + " segundos.");

				ArregloEntero.mostrar(arregloEnteros);
				break;
			case 6:
				// Test de la clase Aleatorio
				Aleatorio _aleatorio = new Aleatorio();
				System.out.println("Pertenece a fibo?: " + _aleatorio.getPerteneceFibo());
				System.out.println("Tiene num gemelos: " + _aleatorio.tieneGem(55132));
				System.out.println("Original: " + _aleatorio.getNumAleatorio());
				System.out.println("Copia clon: " + _aleatorio.clonar().getNumAleatorio());
				break;
			case 7:
				System.out.println("Pruebas:");
				pruebas();
				break;
			default:
				System.out.println("Opción inválida");
			}
		}
	}
}
