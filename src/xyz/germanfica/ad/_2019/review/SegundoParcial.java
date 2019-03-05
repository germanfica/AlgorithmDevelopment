package xyz.germanfica.ad._2019.review;

/*
 * SEGUNDO PARCIAL 14/06/2018 � Desarrollo de Algoritmos
 */
public class SegundoParcial {
	private static int contador = 0;
	/*
	 * 1- Dada un arreglo de enteros, desarrolle un m�todo recursivo que verifique
	 * que todos los elementos existentes en el arreglo se encuentren ordenados de
	 * forma decreciente. RECURSIVO
	 * 
	 * i es el �ndixe (index) el n es el tope, la cantidad de veces
	 */

	/**
	 * Cuando deja de cumplirse la condici�n de (j <= elementos.length - 2), sucede
	 * que j ahora pasa a ser j = elementos.length - 2 + 1. Por esa raz�n, si se
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
	private static boolean ordenado(int i, int j, int[] elementos, Runnable callback) {
		if (i <= elementos.length - 2) {
			// A
			if (j <= elementos.length - 2) {
				// B
				contador++;
				System.out.println(contador);
				System.out.println("i: " + i);
				System.out.println("j: " + j);
				System.out.println("element: " + elementos[j]);

				ordenado(i, j + 1, elementos, callback);
			} else {
				// C
				// System.out.println("�ndice: " + i);
				ordenado(i + 1, 0, elementos, callback);
			}
		} else {
			// FIN
			callback.run();
		}

		return false;
	}

	public static void main(String[] args) {
		final int[] elementos = { 5, 5, 8, 7, 9, 6 };
		boolean ordenados = ordenado(0, 0, elementos, new Runnable() {
			@Override
			public void run() {
				// Running callback
				System.out.println("HOLAAA");
			}
		});

		System.out.println("�Est�n los elementos ordenados? " + ordenados);
	}
}
