package xyz.germanfica._2019._1st.recursividad;

public class Ej3 {

	// Obtener el número mayor de un vector numérico
	public static int mayorElem(int[] arr, int i) {
		int mayor;

		if (i <= arr.length - 1) {
			mayor = mayorElem(arr, i + 1);
			System.out.println(mayor);
			if (arr[i] > mayor) {
				mayor = arr[i];
			}
		} else {
			mayor = arr[arr.length - 1];
		}

		return mayor;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 2, 7, 6 };
		System.out.println(mayorElem(arr, 0));
	}
}
