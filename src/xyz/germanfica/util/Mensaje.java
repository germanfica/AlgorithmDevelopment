package xyz.germanfica.util;

import java.util.ArrayList;
import java.util.Scanner;

public class Mensaje {
    private static final String NOMBRE_ARCHIVO = "src/xyz/germanfica/ad/mensaje/Mensaje.txt"; // Ruta del archivo Mensaje.txt
    private static Scanner sc;
	private static ArrayList<String> lista;
    
	private static ArrayList<String> lista() {
		lista = new ArrayList<String>();
		String contenidoDelArchivo = Archivo.leer(NOMBRE_ARCHIVO, true);
		
		sc = new Scanner(contenidoDelArchivo); // Asignacion de tarea al scanner para analizar el contenido del archivo
		
		sc.useDelimiter("\\s*,\\s*"); // Esto clasifica los colores cuando se encuntra una coma
		
		// Objetivo: almacenar el contenido en la lista de texto
		while(sc.hasNext()) {
			lista.add(sc.next());
		}
		
		return lista;
	}
	
	/**
	 * Retorna un mensaje desde el archivo Mensaje.txt
	 * 
	 * @param index indice del mensaje solicitado
	 * @return Mensaje solicitado
	 */
	public static String leer(int index) {
		return lista().get(index);
	}
}
