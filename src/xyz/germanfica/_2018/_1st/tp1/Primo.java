package xyz.germanfica._2018._1st.tp1;

public class Primo {
	/**
	 * Determina si un número es primo
	 * 
	 * @param num es el número a determinar
	 * @return devuelve verdadero si es primo sino falso
	 */
	public static boolean esPrimo1(int num) {
		boolean es = true; // Resultado que determina si es primo
		int i = 2; // Es parte de la sucesión de posibles números primos
		int cantDiv = 0; // La cantidad de divisores de i

		while (es && i <= Math.sqrt(num)) {
			// Determina la cantidad de divisores de i
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					cantDiv++;
				}
			}
			// Si la cantidad de divisores de i es 1 entonces i es primo
			if (cantDiv == 1) {
				// Si existe un primo tal que divida al número, entonces el numero no es primo
				if (num % i == 0) {
					es = false;
				}
			}
			cantDiv = 0;
			i++;
		}

		return es;
	}

	public static boolean esPrimo(int num) {
		boolean es = true; // Resultado que determina si es primo
		int i = 2; // Es parte de la sucesión de posibles números primos
		int cantDiv = 0; // La cantidad de divisores de i

		while (es && i <= Math.sqrt(num)) {
			// Determina la cantidad de divisores de i
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					cantDiv++;
				}
			}
			es = !(cantDiv == 1 && num % i == 0); // Determina si es primo
			cantDiv = 0; // Reinicio del contador
			i++;
		}

		return es;
	}

	public static boolean esPrimoMartin(int numero) {
		// este modulo bla bla bla
		// declaracion e inicializacion de variables
		boolean siEsPrimo;
		int num2, resto;
		num2 = numero - 1;
		siEsPrimo = true;

		if (numero == 1) {// por convencion, el 1 es primo
			return siEsPrimo;
		}

		// si el resto es cero, quiere decir que hay mas de 2
		// numeros que son divisibles por lo tanto es un num compuesto.
		while (num2 > 1) {
			resto = numero % num2;

			if (resto == 0) {
				siEsPrimo = false;
			}
			num2--;
		}
		return siEsPrimo;
	}

	public static void main(String[] args) {
		// Eficiencia de 4 segundos con el numero 2147309137
		long start = System.currentTimeMillis();
		// System.out.println("Es primo: " + esPrimo(2147309137));

		System.out.println("Bienvenido! Porfavor espere...");
		// System.out.println("Es primo: " + esPrimo(7));
		System.out.println("Es primo: " + esPrimoMartin(2147309137));

		// calcular tiempo transcurrido
		long end = System.currentTimeMillis();
		long res = end - start;
		System.out.println("Segundos: " + res / 1000);
	}
}
