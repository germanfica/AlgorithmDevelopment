package xyz.germanfica.ad.util;

import java.util.ArrayList;
import java.util.Scanner;

public class Mensaje {
    private static final String NOMBRE_ARCHIVO = "src/com/germanfica/ad/mensaje/Mensaje.txt"; // Ruta del archivo Mensaje.txt
    private static Scanner sc;
	private static ArrayList<String> lista;
    
	public static ArrayList<String> leer() {
		lista = new ArrayList<String>();
		String contenidoDelArchivo = Archivo.leer(NOMBRE_ARCHIVO, true);
		
		sc = new Scanner(contenidoDelArchivo); // Asignación de tarea al scanner para analizar el contenido del archivo
		
		sc.useDelimiter("\\s*,\\s*"); // Esto clasifica los colores cuando se encuntra una coma
		
		// Objetivo: almacenar el contenido en la lista de texto
		while(sc.hasNext()) {
			lista.add(sc.next());
		}
		
		return lista;
	}
}
