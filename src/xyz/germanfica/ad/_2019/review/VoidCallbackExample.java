package xyz.germanfica.ad._2019.review;

import xyz.germanfica.util.VoidCallback;

//interface VoidCallback{
//void run();
//}

/*
 * SEGUNDO PARCIAL 14/06/2018 – Desarrollo de Algoritmos
 */
public class VoidCallbackExample {
	private static int contador = 0;
	/*
	 * 1- Dada un arreglo de enteros, desarrolle un método recursivo que verifique
	 * que todos los elementos existentes en el arreglo se encuentren ordenados de
	 * forma decreciente. RECURSIVO
	 * 
	 * i es el índixe (index) el n es el tope, la cantidad de veces
	 */

	/**
	 * Cuando deja de cumplirse la condición de (j <= elementos.length - 2), sucede
	 * que j ahora pasa a ser j = elementos.length - 2 + 1. Por esa razón, si se
	 * requiere evaluar j en C es recomendable setear una variable que se llame jC.
	 * Es decir, jC = elementos.length - 2; // j sin el incremento
	 * 
	 * @param i
	 *            iterador i
	 * @param j
	 *            iterador j
	 * @param elementos
	 *            arreglo de enteros
	 * @return
	 */
	private static boolean ordenado(int i, int j, int[] elementos, VoidCallback onEnd) {
		if (i <= elementos.length - 2) {
			// A
			if (j <= elementos.length - 2) {
				// B
				contador++;
				System.out.println(contador);
				System.out.println("i: " + i);
				System.out.println("j: " + j);
				System.out.println("element: " + elementos[j]);

				ordenado(i, j + 1, elementos, onEnd);
			} else {
				// C
				// System.out.println("Índice: " + i);
				ordenado(i + 1, 0, elementos, onEnd);
			}
		} else {
			// FIN
			onEnd.run();
		}

		return false;
	}

	public static void main(String[] args) {
		final int[] elementos = { 5, 5, 8, 7, 9, 6 };
		boolean ordenados = ordenado(0, 0, elementos, new VoidCallback() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("HOLAA");
			}
		});

		System.out.println("¿Están los elementos ordenados? " + ordenados);
	}
}
