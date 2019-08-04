package xyz.germanfica._2019.trailend;

public class Primo {

	private static boolean esPrimo(int num) {
		boolean esPrimo = true; // Resultado que determina si es primo
		int divisor = 2; // Divisor

		while (esPrimo && divisor <= Math.sqrt(num)) {
			esPrimo = !(num % divisor == 0); // Determina si es primo
			divisor++;
		}
		return esPrimo;
	}

	public static void main(String[] args) {
		System.out.println("Bienvenido!");
		// Eficiencia de 4 segundos con el numero 2147309137
		long start = System.currentTimeMillis();
		System.out.println("Es primo: " + esPrimo(2147309137));
		// calcular tiempo transcurrido
		long end = System.currentTimeMillis();
		long res = end - start;
		System.out.println("Segundos: " + res / 1000);
	}
}