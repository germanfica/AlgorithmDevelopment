package xyz.germanfica._2019._1st.recursion;

import xyz.germanfica.util.ArregloEntero;

/**
 * Ejercicio 3
 * 
 * Programe un método recursivo que:
 * 
 * - Transforme un número expresado en notación binaria a un número entero.
 * (LISTO)
 * 
 * - Luego programe un método recursivo que transforme un número entero positivo
 * a notación binaria. (LISTO)
 * 
 * - Muestre los arreglos resultantes con un algoritmo recursivo. (?)
 * 
 * @author germa
 *
 */
public class EjObligatorioRecursion {

	/**
	 * De binario a decimal
	 */
	public static int bide(int binario, int i) {
		int aux;
		int resto = binario % 10;

		if (binario / 10 <= 0) {
			// Caso base
			aux = (int) Math.pow(2, i) * resto;
		} else {
			// Caso recursivo
			aux = (int) Math.pow(2, i) * resto + bide(binario / 10, i + 1);
		}

		return aux;
	}

	/**
	 * De decimal a binario
	 */
	public static int debi(int num, int i) {
		int aux;
		int resto = num % 2;

		if (num / 2 <= 0) {
			// Caso base
			aux = (int) Math.pow(10, i) * resto;
		} else {
			// Caso recursivo
			aux = debi(num / 2, i + 1) + (int) Math.pow(10, i) * resto;
		}

		return aux;
	}

	/**
	 * Arreglo de binarios a otro arreglo de enteros
	 */
	public static int[] arrBide(int[] binarios, int i) {

		if (i <= binarios.length - 2) {
			// Caso recursivo
			binarios[i] = bide(binarios[i], 0);
			arrBide(binarios, i + 1);
		} else {
			// Caso base
			binarios[i] = bide(binarios[i], 0);
		}

		return binarios;
	}

	/**
	 * Arreglo de enteros a otro arreglo de binarios
	 */
	public static int[] arrDebi(int[] enteros, int i) {

		if (i <= enteros.length - 2) {
			// Caso recursivo
			enteros[i] = debi(enteros[i], 0);
			arrDebi(enteros, i + 1);
		} else {
			// Caso base
			enteros[i] = debi(enteros[i], 0);
		}

		return enteros;
	}

	public static void main(String[] args) {
		int[] binarios = { 1110, 10101, 111101, 111011, 10101 };
		int[] enteros = { 61, 70, 23, 50, 19 };

		int binario = 111101;
		int num = 61;

		System.out.println(bide(binario, 0));
		System.out.println(debi(num, 0));

		System.out.println("Arreglo de binarios a enteros: ");
		ArregloEntero.mostrar(arrBide(binarios, 0));
		System.out.println();
		System.out.println("Arreglo de enteros a binarios: ");
		ArregloEntero.mostrar(arrDebi(enteros, 0));
	}
}
