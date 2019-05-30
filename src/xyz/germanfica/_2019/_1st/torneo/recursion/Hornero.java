package xyz.germanfica._2019._1st.torneo.recursion;

/**
 * Torneo Recursion 2019
 * 
 * @author germa
 *
 */
public class Hornero {

	/**
	 * La secuencia 0 1 1 2 3 5 8 ... se le conoce con el nombre de Fibonacci, donde
	 * se parte de los valores 0 y 1. El resto de los valores se calculan como: la
	 * suma de los dos anteriores.
	 * 
	 * En base a esto, se pide, dado un valor, devolver el número de la sucesión de
	 * Fibonacci que ocupa esa posición. Por ejemplo si es numero es 5, debería
	 * devolver (escribir) EL VALOR 3
	 */
	public static int fibo(int pos) {
		int num;
		if (pos == 1) {
			num = 0;
		} else if (pos == 2) {
			num = 1;
		} else {
			num = fibo(pos - 1) + fibo(pos - 2);
		}
		// System.out.println(num);

		return num;
	}

	/**
	 * Para un número N, entre 0 y 99999, devolver la suma de sus dígitos.
	 */
	public static int sumaDig(int num) {
		int suma;
		int resto = num % 10;
		if (num >= 0 && num <= 99999) {
			if (num > 0) {
				suma = sumaDig(num / 10) + resto;
			} else {
				suma = 0;
			}
		} else {
			suma = -1;
		}

		return suma;
	}

	/**
	 * Dada una cadena, devolver la misma invertida. Ejemplo: entrada "abcde" ,
	 * salida "edcba" - entrada "1ertu9zk" salida "kz9utre1"
	 * 
	 */
	public static String reverso(String cadena, int i) {
		String rev;

		if (i <= cadena.length() - 1) {
			rev = reverso(cadena, i + 1) + cadena.charAt(i);
		} else {
			rev = "";
		}

		return rev;

	}

	public static boolean esPalindromo(String palabra) {
		int i = 0;
		int j = palabra.length() - 1;
		boolean es = true;

		while (i <= j && es) {
			if (palabra.charAt(i) != palabra.charAt(j)) {
				es = false;
			}
			i++;
			j--;
		}

		return es;
	}

	/**
	 * Palíndromos son las palabras que se leen igual al derecho que al revés.
	 * 
	 * Dada una oración, determinar cuántas palabras de la misma son palíndromo.
	 * 
	 * Considere que las palabras están separadas por un "_".
	 * 
	 * Ejemplo: Para la entrada:"sos_un_gran_programador_php" la salida es:2. Para
	 * la entrada:"sos_de_neuquen_sos_de_la_patagonia", la salida es:3.
	 */
	public static int cantPalindromo(String oracion) {
		String palabra;
		int cantPalin;
		int posGuionBajo = oracion.indexOf("_");

		if (posGuionBajo != -1) {
			String nuevOracion = oracion.substring(posGuionBajo + 1, oracion.length());
			palabra = oracion.substring(0, posGuionBajo);
			if (esPalindromo(palabra)) {
				cantPalin = cantPalindromo(nuevOracion) + 1;
			} else {
				cantPalin = cantPalindromo(nuevOracion) + 0;
			}
		} else {
			palabra = oracion;
			if (esPalindromo(palabra)) {
				cantPalin = 1;
			} else {
				cantPalin = 0;
			}
		}

		return cantPalin;

	}

	public static void main(String[] args) {
		// System.out.println(fibo(1));
		// System.out.println(sumaDig(9999985));
		// System.out.println(reverso("hola german", 0));
		// System.out.println(fibo(50)); fobo 50 nunca ejecuta
		// System.out.println(fibo(49));
		// System.out.println(fibo(50));
		// System.out.println(esPalindromo("neuquen"));
		System.out.println(cantPalindromo("sos_un_gran_programador_php"));
		System.out.println(cantPalindromo("sos_de_neuquen_sos_de_la_patagonia"));
	}
}
