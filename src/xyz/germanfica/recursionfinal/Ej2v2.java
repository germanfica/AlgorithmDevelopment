package xyz.germanfica.recursionfinal;

public class Ej2v2 {
	public static int cantImp(int[][] mat, int i, int j) {
		int cant;

		if (i == mat.length - 1 && j == mat[i].length - 1) {
			if (mat[i][j] % 2 == 0) {
				cant = 0;
			} else {
				cant = 1;
			}
		} else {
			if (j == mat[i].length - 1) {
				if (mat[i][j] % 2 == 0) {
					cant = cantImp(mat, i + 1, 0) + 0;
				} else {
					cant = cantImp(mat, i + 1, 0) + 1;
				}
			} else {
				if (mat[i][j] % 2 == 0) {
					cant = cantImp(mat, i, j + 1) + 0;
				} else {
					cant = cantImp(mat, i, j + 1) + 1;
				}
			}
		}

		return cant;
	}

	public static void main(String[] args) {
		// int[][] mat = { { 3, 2 }, { 7, 4 }, { 1, 5 } };
		int[][] mat = { { 2, 5 }, { 1, 2 }, { 3, 4 } };
		System.out.println(mat.length - 1);
		System.out.println(mat[0].length - 1);
		System.out.println("Cantidad de números impares: " + cantImp(mat, 0, 0));
	}
}
