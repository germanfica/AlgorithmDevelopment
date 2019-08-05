package xyz.germanfica.recursionfinal;

public class Ej5v2 {
	/*
	 * public static String camCad(String cadena, int n, int i) { return
	 * cadena.replace('a', '*'); }
	 */

	public static String camCad(String cadena, int n, int i) {
		String res;
		int posVocal = "aeiou".indexOf(cadena.toLowerCase().charAt(i));
		if (i == n - 1) {
			if (posVocal == -1) {
				res = cadena;
			} else {
				res = cadena.substring(0, i) + '*' + cadena.substring(i + 1, n);
			}
		} else {
			if (posVocal == -1) {
				res = camCad(cadena, n, i + 1);
			} else {
				res = camCad(cadena.substring(0, i) + '*' + cadena.substring(i + 1, n), n, i + 1);
			}
		}

		return res;
	}

	public static void main(String[] args) {
		String cadena = "aabi";
		System.out.println(camCad(cadena, cadena.length(), 0));
	}
}
