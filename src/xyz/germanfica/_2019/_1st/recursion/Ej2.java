package xyz.germanfica._2019._1st.recursion;

public class Ej2 {
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
	public static int numeroInvertido(int num, int cantDig) {
		int cociente = divisionRestaSucesiva(num, 10);
		int resto = num % 10;
		int numInv;

		if (cociente > 0) {
			// Caso recursivo
			numInv = (int) (resto * Math.pow(10, cantDig-1) + numeroInvertido(cociente, cantDig-1));
		} else {
			// Caso base
			numInv = resto;
		}

		return numInv;
	}

	// Suma los dígitos de un número
	public static int sumaDigNum(int num) {
		int suma; // Nunca se inicializa la variable de retorno en recursividad
		int cociente = num / 10;
		int resto = num % 10;

		if (cociente > 0) {
			suma = sumaDigNum(cociente) + resto;
		} else {
			suma = resto;
		}

		return suma;
	}

	public static boolean esPar(int num) {
		return num % 2 == 0;
	}

	// Contar cuantos digitos pares tiene un numero
	public static int cuentaDigPares(int num) {
		int cantDigPares;
		int cociente = num / 10;
		int resto = num % 10;

		if (cociente > 0) {
			if (esPar(resto)) {
				cantDigPares = cuentaDigPares(cociente) + 1;
			} else {
				cantDigPares = cuentaDigPares(cociente);
			}
		} else {
			cantDigPares = 0;
		}

		return cantDigPares;
	}

	public static void main(String[] args) {
		// System.out.println(divisionRestaSucesiva(8, 4));
		// System.out.println(numeroInvertido(4321));
		System.out.println(numeroInvertido(7814,4));
		// System.out.println(sumaDigNum(5376));
		// System.out.println(cuentaDigPares(5276));
	}
}
