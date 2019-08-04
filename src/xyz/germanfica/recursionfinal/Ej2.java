package xyz.germanfica.recursionfinal;

public class Ej2 {

	public static int cantNumImp(int[][] arr, int i, int j) {
		int cant;

		if (i == 0 && j == 0) {
			if (arr[i][j] % 2 == 0) {
				cant = 0;
			} else {
				cant = 1;
			}
		} else {
			System.out.println("j: " + j);
			if (j == 0) {
				if (arr[i][j] % 2 == 0) {
					cant = cantNumImp(arr, i - 1, arr[i - 1].length - 1) + 0;
				} else {
					cant = cantNumImp(arr, i - 1, arr[i - 1].length - 1) + 1;
				}
			} else {
				if (arr[i][j] % 2 == 0) {
					cant = cantNumImp(arr, i, j - 1) + 0;
				} else {
					cant = cantNumImp(arr, i, j - 1) + 1;
				}
			}
		}

		return cant;
	}

	public static void main(String[] args) {
		int[][] arr = { { 3, 2 }, { 7, 4 }, { 1, 5 } };
		System.out.println(arr.length - 1);
		System.out.println(arr[0].length - 1);
		System.out.println("Cantidad de números impares: " + cantNumImp(arr, arr.length - 1, arr[0].length - 1));
	}
}
