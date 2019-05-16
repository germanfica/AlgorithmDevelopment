package xyz.germanfica.primer_parcial._02_05_2018;

public class Ej2 {
	/**
	 * Para todas las filas, [fila i]elem >= suma([columna i]elem)
	 */
	public static boolean matrizValida(int[][] enteros) {
		boolean esValida = false;
		boolean salir = false;
		int sumFila;
		int sumaColm;
		int i = 0;

		while (!salir && i <= enteros.length - 1) {
			// Sumo los elementos de la fila
			sumFila = 0;
			for (int j = 0; j <= enteros[i].length - 1; j++) {
				sumFila = sumFila + enteros[i][j];
			}
			// Sumo los elementos de la columna
			sumaColm = 0;
			for (int j = 0; j <= enteros.length - 1; j++) {
				sumaColm = sumaColm + enteros[j][i];
			}
			// Comparo si sumFila es mayor igual a sumColm
			if (sumFila >= sumaColm) {
				esValida = true;
			} else {
				esValida = false;
				salir = true;
			}
			i++;
		}
		return esValida;
	}

	public static void main(String[] args) {
		// int[][] enteros = {{7,5,3,-1},{2,0,2,-8}, {1,1,7,2}};
		int[][] enteros = { { 2, 0, 1 }, { 0, 1, 1 } };
		System.out.println("Bienvenido!");
		System.out.println(matrizValida(enteros));
	}
}
