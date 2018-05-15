package com.graworg.ad.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {

	/**
	 * Guarda los cambios hechos en un arreglo a un archivo de texto. El contenido
	 * del archivo debe ser traducido a un string (cadena de carácteres).
	 * Es necesario poner el texto plano para poder pasarlo al archivo.
	 * 
	 * @param BDColores
	 */
	public static void guardar(String contenido, String NOMBRE_ARCHIVO) {
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {
			fw = new FileWriter(NOMBRE_ARCHIVO);
			bw = new BufferedWriter(fw);
			bw.write(contenido);

			System.out.println("Listo.");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace(); // Error al leer o escribir en el archivo
			}
		}
	}
}
