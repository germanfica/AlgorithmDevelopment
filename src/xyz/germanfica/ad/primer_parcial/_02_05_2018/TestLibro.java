package xyz.germanfica.ad.primer_parcial._02_05_2018;

import xyz.germanfica.util.MatrizTexto;

public class TestLibro {

	public static boolean sinEjemplaresSala(Libro[] libros) {
		boolean sinEjemplaresSala = false;
		int i = 0;

		while (i <= libros.length - 1 && !sinEjemplaresSala) {
			if (libros[i].getEjemplares() == 0) {
				sinEjemplaresSala = true;
			}
			i++;
		}

		return sinEjemplaresSala;
	}

	public static boolean renovarStock(Libro[] libros) {
		int sinEjemplaresSala = 0;

		for (int i = 0; i < libros.length; i++) {
			if (libros[i].getEjemplares() == 0) {
				sinEjemplaresSala++;
			}
		}

		// libros.lengh 100%
		// sinEjemplaresSala x
		return (sinEjemplaresSala * 100 / libros.length) >= 15;
	}

	// Retorna un arreglo cargado de libros
	public static Libro[] cargaLibros() {
		Libro[] libros = new Libro[5];
		libros[0] = new Libro("A5748W", "Harry Potter 1");
		libros[0].setEjemplares(0);
		libros[0].setAutor("     Ramirez; Joaquín");

		libros[1] = new Libro("A2738G", "Harry Potter 2");
		libros[1].setEjemplares(5);
		libros[1].setAutor("     Rozas; Laura");

		libros[2] = new Libro("V222SV", "Harry Potter 3");
		libros[2].setEjemplares(6);
		libros[2].setAutor("     Rodriguez Mesa; Pablo Andrés");

		libros[3] = new Libro("B186RT", "El Señor de los Anillos");
		libros[3].setEjemplares(10);
		libros[3].setAutor("Sanchez Pal; Lautaro      ");

		libros[4] = new Libro("H009JQ", "El Alquimista");
		libros[4].setEjemplares(10);
		libros[4].setAutor("  Lopez; Julián     ");

		return libros;
	}

	public static String[][] matrizAutor(Libro[] libros) {
		// Dos columnas y n filas
		String[][] matrizAutor = new String[libros.length][2];

		for (int i = 0; i <= matrizAutor.length - 1; i++) {
			String autor = libros[i].getAutor();
			matrizAutor[i][0] = modificaAutor2(autor); // Columna 0
			matrizAutor[i][1] = autor; // Columna 1
		}

		return matrizAutor;
	}

	/**
	 * Modifica un autor
	 * 
	 * @param autor nombre y apellido del autor
	 * @return Devuelve autor modificado
	 */
	public static String modificaAutor2(String autor) {
		String autorMod = autor.toUpperCase().trim(); // Autor pero modificado

		String nomAutorMod = autorMod.substring(0, autorMod.indexOf(';')); // IndexOf es la clave! para este ejercicio
		char apeAutorMod = autorMod.charAt(autorMod.indexOf(';') + 2); // IndexOf es la clave! para este ejercicio

		return nomAutorMod + ", " + apeAutorMod + ".";
	}

	public static void main(String[] args) {
		Libro[] libros = cargaLibros();

		// (2)
		System.out.println("Libros sin ejemplares: " + sinEjemplaresSala(libros));

		// (3)
		System.out.println("Renovar stock: " + renovarStock(libros));

		// (4) Matriz
		// System.out.println(modificaAutor1(libros[0].getAutor()));
		// System.out.println(modificaAutor2(libros[0].getAutor()));
		MatrizTexto.mostrarConEspacio(matrizAutor(libros));
	}

	/**
	 * Modifica un autor usando charAt
	 * 
	 * Yo usaría en la vida real este while i++; while (autorMod.charAt(i) == ' ') {
	 * i++; }
	 * 
	 * @param autor nombre y apellido del autor
	 * @return Devuelve autor modificado
	 */
	/*
	 * public static String modificaAutor1(String autor) { boolean salir = false;
	 * int i = 0; String nomAutorMod = ""; String apeAutorMod = ""; String autorMod
	 * = autor.toUpperCase().trim();
	 * 
	 * while (!salir && i <= autor.length() - 1) { if (autorMod.charAt(i) == ';') {
	 * apeAutorMod = apeAutorMod + autorMod.charAt(i + 2); salir = true; } else {
	 * nomAutorMod = nomAutorMod + autorMod.charAt(i); } i++; }
	 * 
	 * autorMod = nomAutorMod + ", " + apeAutorMod + ".";
	 * 
	 * return autorMod; }
	 */
}
