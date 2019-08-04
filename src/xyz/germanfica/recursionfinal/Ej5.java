package xyz.germanfica.recursionfinal;

public class Ej5 {

	public static String modCad(String cadena, int n, int i) {
		String res;
		char ch = cadena.toLowerCase().charAt(i);

		if (i == n - 1) {
			// Caso base
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				res = "*";
			} else {
				res = "" + cadena.charAt(i);
			}
		} else {
			// Caso recursivo
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				res = "*" + modCad(cadena, n, i + 1);
			} else {
				res = cadena.charAt(i) + modCad(cadena, n, i + 1);
			}
		}

		return res;

	}

	public static void main(String[] args) {
		String cadena = "abce";
		System.out.println("Nueva cadena: " + modCad(cadena, cadena.length(), 0));
	}
}
