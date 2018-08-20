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
		while(sc.hasNext()) {
			String aux = sc.next();
			if(aux.length()>masLarga.length())
				masLarga = aux;
		}
		
		return masLarga;
	}
	
	public static void main(String[] args) {
		// Declaracion de variables
		String palabra;
		
		// Inicializar variables
		palabra = " asdjqhwkejhqwkejhqweCalifragilisticoesxpialidozo     Holaa soy un T3XtO asd   laksjdsds laksjdsds   laksjdsds";
		
		System.out.println("La palabra mas larga dentro de la oracion es: " + palabraMasLarga(palabra));
	}
}
