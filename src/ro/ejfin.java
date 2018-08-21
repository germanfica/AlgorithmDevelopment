package ro;

public class ejfin {
	public static boolean esPar(int num) {
		// Declaración de variables
		boolean esPar;
		
		// Determina si el num es par (num % 2 == 0)
		if(num % 2 == 0) {
			esPar=true;
		}else {
			esPar=false;
		}
		return esPar;
	}

	/*
	 * Digito numérico
	 * Ej, 7478
	 */
	public static void main(String[] args) {
		// Declaración de variables
		int num, cantPares, n, mod, div;
		
		// Inicialización de variables
		num = 74789288;
		cantPares = 0;
		String longitudNum = ""+num;
		mod = 10;
		div = 1;
		// Primero 10 y 1
		// Segundo 100 y 10

		for (int i = 0; i <= longitudNum.length()-1; i++) {
			int digito = num % mod / div;
			if (esPar(digito)) {
				System.out.print("Es par");
				cantPares++;
			} else {
				System.out.print("No par");
			}
			System.out.print(digito);
			System.out.println();
			mod = mod * 10; // Al multiplicar por 10 corro la coma 1 lugar a la izquierda
			div = div * 10;

		}

		System.out.println("La cantida de pares es: " + cantPares);

	}
}
