package xyz.germanfica.ad._2019.review;

/*
 * SEGUNDO PARCIAL 14/06/2018 – Desarrollo de Algoritmos
 */
public class SegundoParcial {
	private static int contador = 0;
	/*
	 * 1- Dada un arreglo de enteros, desarrolle un método recursivo que verifique
	 * que todos los elementos existentes en el arreglo se encuentren ordenados de
	 * forma decreciente. RECURSIVO
	 * 
	 * i es el índixe (index) el n es el tope, la cantidad de veces
	 */

	/**
	 * Este módulo verifica que todos los elementos del arreglo estén ordenados de
	 * menor a mayor.
	 * 
	 * Nota: cuando deja de cumplirse la condición de (j <= elementos.length - 2),
	 * sucede que j ahora pasa a ser j = elementos.length - 2 + 1.
	 * 
	 * @param i
	 *            iterador i
	 * @param j
	 *            iterador j
	 * @param elementos
	 *            arreglo de enteros
	 * @return
	 */
	private static boolean ordenado(int i, int j, int[] elementos) {
		boolean respuesta = true;
		if (i <= elementos.length - 2 && respuesta) {
			if (j <= elementos.length - 2) {
				int a = elementos[i]; // Elemento A
				int b = elementos[j + 1]; // Elemento B

				contador++;
				System.out.println(contador);
				// System.out.println("i: " + i);
				// System.out.println("j: " + j);
				System.out.println("element: " + a);
				System.out.println("element: " + b);

				// Verificar si es menor
				if (a > b) {
					respuesta = false;
					System.out.println(respuesta);
				} else {
					respuesta = ordenado(i, j + 1, elementos);
				}
			} else {
				respuesta = ordenado(i + 1, i + 1, elementos);
			}
		}

		return respuesta;
	}

	public static void main(String[] args) {
		boolean ordenados;
		final int[] arregloA = { 5, 5, 8, 7, 9, 6 };
		final int[] arregloB = { 1, 2, 3, 4, 5, 6 };

		ordenados = ordenado(0, 0, arregloA);
		System.out.println("¿Están los elementos ordenados? " + ordenados);
		ordenados = ordenado(0, 0, arregloB);
		System.out.println("¿Están los elementos ordenados? " + ordenados);
	}
}
