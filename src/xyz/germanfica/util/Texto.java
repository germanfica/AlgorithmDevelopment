package xyz.germanfica.util;

import java.util.Scanner;

public class Texto {
	private String texto;
	
	public Texto(String texto) {
		this.texto = texto;
	}
	
	public String getTexto() {
		return this.texto;
	}
	
	/**
	 * Determina la cantidad de filas que deber�a tener un arreglo de texto
	 * cantidad de filas y columnas.
	 * 
	 * @param contenidoDelArchivo es el contenido del archivo. Para obtener
	 * el contenido del archivo s�lo basta con llamar al m�dulo
	 * Archivo.Leer(ARCHIVO), siendo ARCHIVO (la ruta)+(nombre del
	 * archivo con su extensi�n), ejemplo: 
	 * ARCHIVO = "src/xyz/germanfica/ad/_2018/_2nd/tp3/Ej2.txt".
	 * @return Devuelve las dimensiones que tiene la matriz del archivo
	 */
	private int cantidadFilas(String texto) {
		// Declaraci�n de variables
		Scanner sc = new Scanner(texto); // Le digo al scanner que me analice el texto
		int cantFilas;
		
		// Inicializaci�n de variables
		cantFilas = 0;
		
		// Delimitar b�squeda para el Scanner
		sc.useDelimiter("\\s*;\\s*"); // Busca los punto y coma del texto
		
		
		// Almacenar los elementos uno por uno
		while(sc.hasNext()) {
			sc.next();
			cantFilas++;
		}

		return cantFilas;
	}
	
	public String[] toArray() {
		Scanner sc = new Scanner(this.texto); // Le digo al scanner que me analice el texto
		String[] textos = new String[cantidadFilas(this.texto)]; // Creo una lista din�mica
		int i = 0;
		
		// Delimitar b�squeda para el Scanner
		sc.useDelimiter("\\s*;\\s*"); // Busca los punto y coma del texto
		
		
		// Almacenar los elementos uno por uno
		while(sc.hasNext()) {
			textos[i] = sc.next();
			i++;
		}
		
		return textos;
	}
}
