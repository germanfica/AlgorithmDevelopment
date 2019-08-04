package xyz.germanfica.ejfinal;

public class Ej29 {

	public static boolean codigoValido(int n) {
		boolean esValido;
		if (n < 9) {
			// Caso base
			esValido = true;
		} else {
			// Caso recursivo
			esValido = codigoValido(n/10) && (n%10)>(n/10)%10;
		}
		return esValido;
	}

	public static void main(String[] args) {
		System.out.println("Es valido? " + codigoValido(2349));
		System.out.println("Es valido? " + codigoValido(3492));
		System.out.println("Es valido? " + codigoValido(7489));
	}
}
