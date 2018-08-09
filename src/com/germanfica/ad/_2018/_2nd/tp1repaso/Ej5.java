package com.germanfica.ad._2018._2nd.tp1repaso;

import java.util.Scanner;

/*
 * 5) Diseñar un algoritmo que busque la palabra más larga
 * en una frase leída por teclado y la muestre, en
 * caso de haber varias palabras con la longitud máxima puede
 * mostrar solo la primera. Suponga que el separador entre
 * las palabras es un único espacio en blanco.
 */
public class Ej5 {
	private static Scanner sc;
	
	public static String palabraMásLarga(String palabra) {
		// Declaración de variables
		String másLarga;
		
		// Inicialización de variables
		másLarga = "";
		sc = new Scanner(palabra); // Asignación de tarea al scanner para analizar el contenido del archivo
		
		sc.useDelimiter("\\s* \\s*"); // Esto clasifica los colores cuando se encuntra una coma
		
		// Objetivo: almacenar el contenido en la lista de texto
		while(sc.hasNext()) {
			String aux = sc.next();
			if(aux.length()>másLarga.length())
				másLarga = aux;
		}
		
		return másLarga;
	}
	
	public static void main(String[] args) {
		// Declaración de variables
		String palabra;
		
		// Inicializar variables
		palabra = " asdjqhwkejhqwkejhqweCalifragilisticoesxpialidozo     Holaa soy un T3XtO asd   laksjdsds laksjdsds   laksjdsds";
		
		System.out.println("La palabra más larga dentro de la oración es: " + palabraMásLarga(palabra));
	}
}
