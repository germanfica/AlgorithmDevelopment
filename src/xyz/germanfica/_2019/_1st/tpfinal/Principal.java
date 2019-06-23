package xyz.germanfica._2019._1st.tpfinal;

import java.util.Scanner;

import xyz.germanfica.util.ArregloEntero;

public class Principal {

	/**
	 * Este algoritmo clona y convierte un arreglo de objetos a un arreglo de
	 * enteros.
	 * 
	 * @param arreglo
	 * @return
	 */
	public static int[] clonarArreglo(Aleatorio[] arreglo) {
		int[] nuevoArreglo = new int[arreglo.length];

		for (int i = 0; i <= arreglo.length - 1; i++) {
			nuevoArreglo[i] = arreglo[i].getNumAleatorio();
		}
		return nuevoArreglo;
	}

	public static void generarArregloAleatorio(Aleatorio[] arreglo) {
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = new Aleatorio();
		}
	}

	public static boolean verificaArregloDecreciente(Aleatorio[] arregloAleatorio) {
		boolean esDecreciente = true;
		int i = 0;

		while (esDecreciente == true) {
			if (arregloAleatorio[i].compareTo(arregloAleatorio[i + 1]) == -1) {
				esDecreciente = false;
			}
			i++;
		}
		return esDecreciente;
	}

	public static void ordSel(int[] arr) {
		int actual;
		int posMenor = 1;
		int aux;

		for (int i = 1; i <= arr.length - 1; i++) {
			for (int j = i; j <= arr.length - 1; j++) {
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

	public static void burbujaMejorado(int[] arreglo) {
		int auxiliar, i;
		boolean ordenado;

		ordenado = false;
		i = 0;

		while (i <= arreglo.length - 1 && ordenado == false) {
			ordenado = true;

			for (int j = 0; j <= (arreglo.length - i - 2); j++) {
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

	public static void insercion(int[] arreglo) {
		int auxiliar, j;

		for (int i = 1; i <= arreglo.length - 1; i++) {
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
	 * Lee una opcion
	 * 
	 * @return devuelve un numero entero
	 */
	public static int leerOpcion() {
		return new Scanner(System.in).nextInt();
	}

	public static void mostrarOpciones() {
		System.out.println("Bienvenido!");
		System.out.println("[0] Salir.");
		System.out.println("[1] Clonar el arreglo creado.");
		System.out.println("[2] Verificar si el arreglo est� ordenado de forma decreciente.");
		System.out.println("[3] Metodo burbuja.");
		System.out.println("[4] Metodo inserci�n");
		System.out.println("[5] Metodo selecci�n");
		System.out.println("[6] Test de la clase Aleatorio.");
	}

	/*
	 * El algoritmo principal tiene que ser el cerebro el que maneja y da las
	 * ordenes de qu� hacer.
	 */
	public static void main(String[] args) {
		Aleatorio[] arregloAleatorio = new Aleatorio[1000];
		int[] arregloEnteros = new int[1000];
		boolean salir = false;

		generarArregloAleatorio(arregloAleatorio); // Genera un arreglo de enteros

		while (!salir) {
			mostrarOpciones(); // Muestra las opciones del menu

			switch (leerOpcion()) {
			case 0:
				salir = true;
				break;
			case 1:
				clonarArreglo(arregloAleatorio); // Clonar arreglo
				break;
			case 2:
				System.out
						.println("est� ordenado de forma decreciente: " + verificaArregloDecreciente(arregloAleatorio));
				break;
			case 3:
				arregloEnteros = clonarArreglo(arregloAleatorio);
				burbujaMejorado(arregloEnteros);
				ArregloEntero.mostrar(arregloEnteros);
				break;
			case 4:
				arregloEnteros = clonarArreglo(arregloAleatorio);
				insercion(arregloEnteros);
				ArregloEntero.mostrar(arregloEnteros);
				break;
			case 5:
				arregloEnteros = clonarArreglo(arregloAleatorio);
				ordSel(arregloEnteros);
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
			default:
				System.out.println("Opci�n inv�lida");
			}
		}
	}
}