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

	/**
	 * Palíndromos son las palabras que se leen igual al derecho que al revés.
	 * 
	 * Dada una oración, determinar cuántas palabras de la misma son palíndromo.
	 * 
	 * Considere que las palabras están separadas por un "_".
	 * 
	 * Ejemplo:
	 * Para la entrada:"sos_un_gran_programador_php" la salida es:2.
	 * Para la entrada:"sos_de_neuquen_sos_de_la_patagonia", la salida es:3.
	 */
	public static int palindromo(String oracion, String palabra, ) {
		int cantPalin;
		String palabra = oracion.substring(0, oracion.indexOf("_"));
		
		if(oracion.length()>0) {
			if() {
				
			}
		}else {
			cantPalin = 0;
		}
		
		
		return cantPalin;
		
		
	}

	public static void main(String[] args) {
		// System.out.println(fibo(1));
		// System.out.println(sumaDig(9999985));
		System.out.println(reverso("hola german", 0));
	}
}
