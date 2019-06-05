package xyz.germanfica._2019._1st.recursion;

public class Ej4 {
	/**
	 * 4. Trabajando con arreglos bidimensionales. Diseñar e implementar algoritmos
	 * recursivos para:
	 * 
	 * a. Obtener el número mayor de una matriz numérica.
	 * 
	 * b. Dada una matriz y un elemento retornar verdadero si el mismo se encuentra
	 * como uno de los elementos de la matriz.
	 */

	/**
	 * 1ro: armé el recorrido recursivo. Simulando un for pero de manera recursiva.
	 * 2do: pensé cómo verificar si es mayor el número.
	 * 
	 * @param enteros
	 * @param i
	 * @param j
	 * @param numMayor
	 * @return
	 */
	public static int mayor(int[][] enteros, int i, int j) {
		int num;

		if (i <= enteros.length - 1) {
			if (j <= enteros[i].length - 1) {
				num = enteros[i][j];
				// Preguntar si es más grande
				if (num > mayor(enteros, i, j + 1)) {
					num = enteros[i][j];
				} else {
					num = mayor(enteros, i, j + 1);
				}
			} else {
				num = mayor(enteros, i + 1, 0);
			}
		} else {
			num = -1;
		}

		return num;
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
		// int[][] enteros = { { 5, 7, 6 }, { 1, 2, 3 }, { 23, 15 }, { 5, 7, 8 } };
		// int[][] enteros = { { 5 } };
		int[][] enteros = { { 23, 2, 3 }, { 45, 6, 8 } };

		System.out.println("num mayor: " + mayor(enteros, 0, 0));
		int num = 8;
		System.out.println("coincidencia con " + num + ": " + coincidencia(enteros, 0, 0, num));
	}
}
