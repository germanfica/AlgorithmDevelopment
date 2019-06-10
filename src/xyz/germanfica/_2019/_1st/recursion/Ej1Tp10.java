package xyz.germanfica._2019._1st.recursion;

/**
 * Programar un algoritmo recursivo que muestre el número menor de una matriz.
 * Luego genere otro algoritmo recursivo para encontrar el mayor.
 * 
 * @author germa
 *
 */
public class Ej1Tp10 {

	/**
	 * Devuelve el ultimo
	 * 
	 * @param numA un numero a
	 * @param numB un numero b
	 * @return devuelve numero mayor
	 */
	public static int numMayor(int numA, int numB) {
		int numMayor;

		if (numA > numB) {
			numMayor = numA;
		} else {
			numMayor = numB;
		}

		return numMayor;
	}

	/**
	 * Devuelve el mayor de los elementos de una matriz
	 * 
	 * @param enteros matriz de enteros
	 * @param i       indice fila
	 * @param j       indice columna
	 * @return el mayor entero de una matriz de enteros
	 */
	public static int mayor(int[][] enteros, int i, int j) {
		int numActual, numMayor;
		int filaFinal = enteros.length - 1;
		int columnaFinal = enteros[0].length - 1;

		if (i <= filaFinal) {
			if (j <= enteros[i].length - 1) {
				numActual = enteros[i][j];
				// Caso recursivo
				numMayor = numMayor(numActual, mayor(enteros, i, j + 1));
			} else {
				numActual = enteros[i][j - 1]; // Le resto -1
				// Caso recursivo
				numMayor = numMayor(numActual, mayor(enteros, i + 1, 0));
			}
		} else {
			// Caso base
			numMayor = enteros[filaFinal][columnaFinal];
		}

		return numMayor;
	}

	public static void main(String[] args) {
		int[][] enteros = { { 9, 2, 3 }, { 4, 25, 6 }, { 1, 22, 23 } };
		System.out.println(mayor(enteros, 0, 0));

	}

}
