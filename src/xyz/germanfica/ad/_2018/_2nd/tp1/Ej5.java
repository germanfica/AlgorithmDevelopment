package xyz.germanfica.ad._2018._2nd.tp1;

import java.util.Scanner;

/*
 * 5) Diseñar un algoritmo que busque la palabra mas larga
 * en una frase leída por teclado y la muestre, en
 * caso de haber varias palabras con la longitud maxima puede
 * mostrar solo la primera. Suponga que el separador entre
 * las palabras es un único espacio en blanco.
 */
public class Ej5 {
	private static Scanner sc;

	public static String palabraMasLarga(String palabra) {
		// Declaracion de variables
		String masLarga;

		// Inicializacion de variables
		masLarga = "";
		sc = new Scanner(palabra); // Asignacion de tarea al scanner para analizar el contenido del archivo

		sc.useDelimiter("\\s* \\s*"); // Esto clasifica los colores cuando se encuntra una coma

		// Objetivo: almacenar el contenido en la lista de texto
		while (sc.hasNext()) {
			String aux = sc.next();
			if (aux.length() > masLarga.length())
				masLarga = aux;
		}

		return masLarga;
	}

	public static String palabraMasLargaConString(String palabra) {
		// Declaracion de variables
		String masLarga, aux = "", auxAnterior = "";
		char ch;
		int posIni = 0, posFin = 0;

		// Inicializacion de variables
		masLarga = "";

		// Objetivo: almacenar el contenido en la lista de texto
		for (int i = 0; i <= palabra.length() - 1; i++) {
			ch = palabra.charAt(i);
			if (ch == ' ') {
				posIni = i;
			}
			if (ch != ' ') {
				posFin = i;
				aux = palabra.substring(posIni+1, posFin + 1);
			}
			/*
			 * Si se forma una nueva palabra, lo voy a saber ya que las longitudes van a
			 * ser distinta
			 */
			if (aux.length() < auxAnterior.length()) {
				// Acá verifico la palabra más larga
				if (auxAnterior.length() > masLarga.length())
					masLarga = auxAnterior;
				System.out.println("Mi sería mi palabra completa: " + auxAnterior);
			}
			auxAnterior = aux; // Almaceno la palabra anterior
		}

		return masLarga;
	}

	public static void main(String[] args) {
		// Declaracion de variables
		String palabra;

		// Inicializar variables
		palabra = " asdjqhwkejhqwkejhqweCalifragilisticoesxpialidozo     Holaa soy un T3XtO asd   laksjdsds laksjdsds   laksjdsds";

		// System.out.println("La palabra mas larga dentro de la oracion es: " +
		// palabraMasLarga(palabra));
		System.out.println("La palabra mas larga dentro de la oracion es: " +
		palabraMasLargaConString(palabra));
	}
}
