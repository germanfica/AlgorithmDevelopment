package xyz.germanfica._2019._1st.recursividad;

public class Ej1 {
	public static int divisionRestaSucesiva(int dividendo, int divisor) {
		int contador;
		dividendo = dividendo - divisor;
		if (dividendo >= 0) {
			// Caso recursivo
			contador = divisionRestaSucesiva(dividendo, divisor) + 1;
		} else {
			// Caso base
			contador = 0;
		}
		return contador;
	}

	// Ingreso: 4321
	// y quiero obtener: 1234
	// 1 x 10 = 10 + 2 = 12
	// 12 x 100 = 120 + 3 = 123
	// 123 x 1000 = 1230 + 4 = 1234
	public static int numeroInvertido(int num) {
		int cociente = divisionRestaSucesiva(num, 10);
		int resto = num % 10;
		int numInv;

		if (cociente > 0) {
			// Caso recursivo
			numInv = (int) (resto * Math.pow(10, resto) + numeroInvertido(cociente));
		} else {
			// Caso base
			numInv = resto;
		}

		return numInv;
	}

	public static void main(String[] args) {
		// System.out.println(divisionRestaSucesiva(8, 4));
		// System.out.println(numeroInvertido(4321));
		System.out.println(numeroInvertido(4321));
	}
}
