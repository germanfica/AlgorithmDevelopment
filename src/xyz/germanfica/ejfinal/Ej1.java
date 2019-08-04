package xyz.germanfica.ejfinal;

public class Ej1 {

	public static int cantNumPares(int[] arr, int n) {
		int cant;

		if (n == 1) {
			if (arr[n - 1] % 2 == 0) {
				cant = 1;
			} else {
				cant = 0;
			}
		} else {
			if (arr[n - 1] % 2 == 0) {
				cant = cantNumPares(arr, n - 1) + 1;
			} else {
				cant = cantNumPares(arr, n - 1) + 0;
			}
		}

		return cant;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 6 };
		System.out.println("Cantidad de números pares: " + cantNumPares(arr, arr.length));
	}
}
