package xyz.germanfica._2019._1st.recursion;

public class Ej3 {

	// Obtener el número mayor de un vector numérico
	public static int elemMayor(int[] arr, int i) {
		int mayor;

		if (i <= arr.length - 1) {
			mayor = elemMayor(arr, i + 1);
			System.out.println(mayor);
			if (arr[i] > mayor) {
				mayor = arr[i];
			}
		} else {
			mayor = arr[arr.length - 1];
		}

		return mayor;
	}

	// Dado un arreglo de caracteres y un caracter
	// indicar si este pertenece al arreglo dado
	public static boolean perteneceCaract(char[] caracteres, int i, char ch) {
		boolean pertenece;

		if (i <= caracteres.length - 1) {
			System.out.println(caracteres[i]);
			if (caracteres[i] == ch) {
				pertenece = true;
			} else {
				pertenece = perteneceCaract(caracteres, i + 1, ch);
			}
		} else {
			pertenece = false;
		}

		System.out.println(i);

		return pertenece;
	}

	// Dado un arreglo de palabras mostrar la longitud
	// e inicial de cada palabra
	public static void mostrarLongPalInicial(String[] palabras, int i) {
		if (i <= palabras.length - 1) {
			int longPalab = palabras[i].length();
			char palabIni = palabras[i].charAt(0);
			System.out.println("Cantidad de palabras: " + longPalab + "; Inicial: " + palabIni);
			mostrarLongPalInicial(palabras, i + 1);
		}
	}

	public static void main(String[] args) {
		// int[] arr = { 5, 2, 7, 6 };
		// System.out.println(elemMayor(arr, 0));
		char[] caracteres = { 'a', 'b', 'c', 'd', 'f' };
		System.out.println(perteneceCaract(caracteres, 0, 'c'));
		// String[] palabras = { "hola como estas", "soy ger", "que onda si", "GG otra
		// vez" };
		// mostrarLongPalInicial(palabras, 0);
	}
}
