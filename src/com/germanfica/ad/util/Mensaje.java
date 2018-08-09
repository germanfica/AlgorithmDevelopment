package com.germanfica.ad.util;

import java.util.Scanner;

public class Mensaje {
    private static final String NOMBRE_ARCHIVO = "src/com/germanfica/ad/mensaje/Mensaje.txt"; // Ruta del archivo Mensaje.txt
    private static Scanner sc;
    
	public static String[] leer() {
		String[] arreglo = new String[1];;
		String contenidoDelArchivo = Archivo.leer(NOMBRE_ARCHIVO, true);
		
		sc = new Scanner(contenidoDelArchivo); // Asignación de tarea al scanner para analizar el contenido del archivo
		
		sc.useDelimiter("\\s*,\\s*"); // Esto clasifica los colores cuando se encuntra una coma
		
		int i = 0;
		// Objetivo: almacenar el contenido en un arreglo de texto
		while(sc.hasNext()) {
			arreglo[i] = sc.next();
			i=i+1;
		}
		
		return arreglo;
	}
}
