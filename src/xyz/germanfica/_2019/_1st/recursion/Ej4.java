package xyz.germanfica._2019._1st.recursion;

public class Ej4 {
	/**
	 * 4. Trabajando con arreglos bidimensionales. Dise�ar e implementar algoritmos
	 * recursivos para:
	 * 
	 * a. Obtener el n�mero mayor de una matriz num�rica.
	 * 
	 * b. Dada una matriz y un elemento retornar verdadero si el mismo se encuentra
	 * como uno de los elementos de la matriz.
	 */

	/**
	 * 1ro: arm� el recorrido recursivo. Simulando un for pero de manera recursiva.
	 * 2do: pens� c�mo verificar si es mayor el n�mero.
	 * 
	 * @param enteros
	 * @param i
	 * @param j
	 * @param numMayor
	 * @return
	 */
	public static int mayor(int[][] enteros, int i, int j, int numMayor) {
		int aux;

		if (i <= enteros.length - 1) {
			if (j <= enteros[i].length - 1) {
				// System.out.println(enteros[i][j]);
				// Preguntar si es m�s grande
				if (enteros[i][j] > numMayor) {
					aux = enteros[i][j];
				} else {
					aux = numMayor;
				}
				aux = mayor(enteros, i, j + 1, aux);
			} else {
				aux = mayor(enteros, i + 1, 0, numMayor);
			}
		} else {
			aux = numMayor;
		}

		return aux;
	}

	public static boolean coincidencia(int[][] enteros, int i, int j, int num) {
		boolean aux;

		if (i <= enteros.length - 1) {
			if (j <= enteros[i].length - 1) {
				// Preguntar si hay coincidencia
				if (enteros[i][j] == num) {
					aux = true;
				} else {
					aux = coincidencia(enteros, i, j + 1, num);
				}
			} else {
				aux = coincidencia(enteros, i + 1, 0, num);
			}
		} else {
			aux = false;
		}

		return aux;
	}

	public static void main(String[] args) {
		int[][] enteros = { { 5, 7, 6 }, { 1, 2, 3 }, { 23, 15 }, { 5, 7, 8 } };
		System.out.println("num mayor: " + mayor(enteros, 0, 0, enteros[0][0]));
		int num = 8;
		System.out.println("coincidencia con " + num + ": " + coincidencia(enteros, 0, 0, num));
	}
}
