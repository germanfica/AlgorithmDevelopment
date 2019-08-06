package xyz.germanfica.recursionfinal;

public class Ej30 {
	public static int busqBin(int[] arr, int ini, int fin, int numBusc) {
		int medio = (ini + fin) / 2;
		int posNumBusc;

		if (ini > fin) {
			posNumBusc = -1;

		} else if (arr[medio] == numBusc) {
			posNumBusc = medio;
		} else if (numBusc > arr[medio]) {
			posNumBusc = busqBin(arr, medio + 1, fin, numBusc);
		} else {
			posNumBusc = busqBin(arr, ini, medio - 1, numBusc);
		}

		return posNumBusc;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int numBusc = 5;
		System.out.println("Posición: " + busqBin(arr, 0, arr.length - 1, numBusc));
	}
}
