package xyz.germanfica._2019.ordenamiento;

import xyz.germanfica.util.ArregloEntero;

public class Ordenamiento {
	public static void ordSel(int[] arr) {
		int actual;
		int posMenor = 1;
		int aux;

		for (int i = 1; i <= arr.length - 1; i++) {
			for (int j = i; j <= arr.length - 1; j++) {
				actual = arr[j];
				if (actual < arr[posMenor]) {
					posMenor = j;
				}
			}
			aux = arr[i - 1];
			arr[i - 1] = arr[posMenor];
			arr[posMenor] = aux;
			posMenor = i;
		}
	}

	public static void ordIns(int[] arr) {
		int aux;
		int posMenor;
		for (int i = 1; i <= arr.length-1; i++) {
			posMenor = i;
			for (int j = 0; j <= i; j++) {
				if(arr[i] <= arr[posMenor]) {
					posMenor = i;
				}
				System.out.print(arr[j] + " ");
			}
			aux = arr[i];
			arr[i] = arr[posMenor];
			posMenor = aux;
			System.out.println("  " + arr[i]);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// int[] arr = { 3, 7, 1, 9 };
		int[] arr = { 5, 3, 4, 1 };
		// int[] arr = { 3, 7, 1, 9,121,5,35,18,46,78,44,14,44,11,33 };
		// ordSel(arr);
		ordIns(arr);
		ArregloEntero.mostrar(arr);
	}
}
