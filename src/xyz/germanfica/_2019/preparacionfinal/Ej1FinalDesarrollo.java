<<<<<<< HEAD:src/xyz/germanfica/_2019/trailend/Ej1FinalDesarrollo.java
package xyz.germanfica._2019.trailend;
=======
package xyz.germanfica._2019.preparacionfinal;
>>>>>>> aa7053f22433a98639ef4a27764a9b8d55132e95:src/xyz/germanfica/_2019/preparacionfinal/Ej1FinalDesarrollo.java

public class Ej1FinalDesarrollo {
	/**
	 * Determina la cantidad de palindromos
	 * @param palabras
	 * @return
	 */
	public static int cantPalindromos(String[] palabras) {
		int res = 0;
		for (int i = 0; i <= palabras.length - 1; i++) {
			if (esPalindromo(palabras[i].toLowerCase())) {
				res++;
			}
		}
		return res;
	}

	/**
	 * Determina la longitud de la palabra con mayor cantidad de caracteres
	 */
	public static int mayorCh(String[] palabras) {
		int mayor = -1;
		for (int i = 0; i <= palabras.length - 1; i++) {
			if (palabras[i].length() > mayor) {
				mayor = palabras[i].length();
			}
		}

		return mayor;
	}

	/**
	 * 
	 * @param palabras
	 * @return
	 */
	public static int mayorPalin(String[] palabras) {
		int mayor = -1;
		for (int i = 0; i <= palabras.length - 1; i++) {
			if (palabras[i].length() > mayor && esPalindromo(palabras[i])) {
				mayor = palabras[i].length();
			}
		}

		return mayor;
	}

	/**
	 * Determina si una palabra ingresada es palindromo
	 * 
	 * @param palabra es la palabra que se quiere analizar
	 * @return devuelve verdadero si la palabra ingresada es palindromo
	 */
	public static boolean esPalindromo(String palabra) {
		boolean res = true;
		int izq = 0;
		int der = palabra.length() - 1;
		while (izq < der && res) {
			if (palabra.charAt(izq) != palabra.charAt(der)) {
				res = false;
			}
			izq++;
			der--;
		}
		return res;
	}

	/*
	 * Carga arreglo + Algoritmo principal que llama las anteriores funcionalidades
	 */
	public static void main(String[] args) {
		String[] palabras = { "hola", "correr", "saltar", "neuquen", "Neuquen", "asdasda54874" };
		System.out.println("(1) Hay " + cantPalindromos(palabras) + " palindromos.");
		System.out.println("(2) Longitud de la palabra con mayor cantidad de vocales: " + mayorCh(palabras) + ".");
		System.out.println(
				"(3) Longitud de la palabra palindromo con mayor cantidad de vocales: " + mayorPalin(palabras) + ".");
	}
}
