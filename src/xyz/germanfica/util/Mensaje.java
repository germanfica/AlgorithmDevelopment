package xyz.germanfica.util;

/**
 * Copyright 2018 German Fica
 * 
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge,
 * publish, distribute, sublicense, and/or sell copies of the Software,
 * and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 * @author German Fica
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Mensaje {
    private static final String NOMBRE_ARCHIVO = "src/xyz/germanfica/mensaje/Mensaje.txt"; // Ruta del archivo Mensaje.txt
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
