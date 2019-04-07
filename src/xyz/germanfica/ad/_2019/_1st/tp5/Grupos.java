package xyz.germanfica.ad._2019._1st.tp5;

import java.util.Scanner;

import xyz.germanfica.util.ArregloCaracter;
import xyz.germanfica.util.Caracter;
import xyz.germanfica.util.MatrizCaracter;

public class Grupos {
	private static final String ARCHIVO = "src/xyz/germanfica/ad/_2019/_1st/tp5/grupos.txt"; // Ruta del archivo

	public static void main(String[] args) {
		String[] escuelas = { "Los Patos", "Marabunta", "RRC", "NRC", "ARC" };
		String[] categorias = { "M4", "M6", "M7", "M8", "M10" };
		char[][] matrizGrupo = MatrizCaracter.cargaDesdeArchivo(ARCHIVO);
		char[] grupos = cadenaGrupos(matrizGrupo);
		boolean salir = false;
		int opcion = -1;

		while (!salir) {
			mostrarOpciones();
			opcion = new Scanner(System.in).nextInt();

			switch (opcion) {
			case 0:
				MatrizCaracter.mostrar(matrizGrupo);
				salir = true;
				break;
			case 1:
				mostrarLetrasEscuela(matrizGrupo, escuelas, new Scanner(System.in).next());
				break;
			case 2:
				System.out.println(correspondeEscuela(matrizGrupo, categorias, "M4", 'B'));
				break;
			case 3:
				ArregloCaracter.mostrar(grupos);
				break;
			case 4:

				MatrizCaracter.mostrarConEspacio(espiral(grupos, escuelas.length, categorias.length));
				break;
			case 5:
				MatrizCaracter.mostrar(ganadores(matrizGrupo));
				break;
			default:
				System.out.println("Opción inválido");
				break;
			}
		}
	}

	public static void mostrarLetrasEscuela(char[][] matrizGrupo, String[] escuelas, String escuela) {

		for (int j = 0; j < matrizGrupo.length; j++) {
			System.out.println(matrizGrupo[posicionEscuela(escuelas, escuela)][j]);
		}
	}

	public static int posicionEscuela(String[] escuelas, String escuela) {
		int i = 0;
		int pos = -1;
		boolean salir = false;

		while (!salir && i <= escuelas.length - 1) {
			if (escuela == escuelas[i]) {
				pos = i;
				salir = true;
			}
			i++;
		}
		return pos;
	}

	public static char[][] ganadores(char[][] matrizGrupo) {
		int cantFilas = matrizGrupo.length;
		int cantColumnas = matrizGrupo[0].length;
		char[][] matrizPremio = new char[cantFilas][cantColumnas];

		for (int i = 0; i <= cantFilas - 1; i++) {
			for (int j = 0; j <= cantColumnas - 1; j++) {
				matrizPremio[i][j] = matrizGrupo[i][j];
				if (Caracter.esVocal(matrizGrupo[i][j])) {
					matrizPremio[i][j] = '*';
				}
			}
		}
		return matrizPremio;
	}

	public static int posicionCategoria(String[] categorias, String categoria) {
		int i = 0;
		int pos = -1;
		boolean salir = false;

		while (!salir && i <= categorias.length - 1) {
			if (categoria == categorias[i]) {
				pos = i;
				salir = true;
			}
			i++;
		}
		return pos;
	}

	public static boolean correspondeEscuela(char[][] matrizGrupo, String[] categorias, String categoria, char letra) {
		int i = 0;
		int posCategoria = posicionCategoria(categorias, categoria);
		boolean rta = false; // respuesta
		boolean salir = false;

		if (posCategoria == -1) {
			rta = false;
		} else {
			while (!salir && i <= matrizGrupo.length - 1) {
				if (letra == matrizGrupo[i][posCategoria]) {
					rta = true;
					salir = true;
				}
				i++;
			}
		}

		return rta;
	}

	public static char[] cadenaGrupos(char[][] matrizGrupo) {
		int cantFilas = matrizGrupo.length;
		int cantColumnas = matrizGrupo[0].length;
		char[] grupos = new char[cantFilas * cantColumnas];
		int posArr = 0;

		for (int i = 0; i <= cantFilas - 1; i++) {
			for (int j = 0; j <= cantColumnas - 1; j++) {
				grupos[posArr] = matrizGrupo[i][j];
				posArr++;
			}
		}
		return grupos;
	}

	public static char[][] espiral(char[] grupos, int cantFilas, int cantColumnas) {
		char[][] matrizEspiral = new char[cantFilas][cantColumnas];

		int izquierda = 0;
		int derecha = cantColumnas - 1;

		int arriba = 0;
		int abajo = cantFilas - 1;

		int contador = 0;
		boolean salir = false;

		while (!salir) {
			salir = izquierda > derecha;
			for (int i = izquierda; i <= derecha; i++) {
				matrizEspiral[arriba][i] = grupos[contador];
				contador++;
			}
			arriba++;

			salir = arriba > abajo;
			for (int i = arriba; i <= abajo; i++) {
				matrizEspiral[i][derecha] = grupos[contador];
				contador++;
			}
			derecha--;

			salir = izquierda > derecha;
			for (int i = derecha; i >= izquierda; i--) {
				matrizEspiral[abajo][i] = grupos[contador];
				contador++;
			}
			abajo--;

			salir = arriba > abajo;
			for (int i = abajo; i >= arriba; i--) {
				matrizEspiral[i][izquierda] = grupos[contador];
				contador++;
			}
			izquierda++;
		}

		return matrizEspiral;
	}

	public static char[][] leerMatrizCaracter(int cantFilas, int cantColumnas) {
		char[][] matrizCaracter = new char[cantFilas][cantColumnas];

		for (int i = 0; i <= cantFilas - 1; i++) {
			for (int j = 0; j <= cantColumnas - 1; j++) {
				matrizCaracter[i][j] = new Scanner(System.in).next().charAt(0);
			}
		}

		return matrizCaracter;
	}

	public static void mostrarOpciones() {
		System.out.println("[0] Salir (IMPLEMENTADO)");
		System.out.println("[1] Ingresar una escuela y mostrar las letras asignadas a los grupos de esa escuela. (IMPLEMENTADO)");
		System.out.println(
				"[2] Dada una categoría, y una letra, indicar si corresponde a alguna escuela. ¿Puede averiguar "
						+ "a qué escuela corresponde con una operación/instrucción (esto es sin recorrer el arreglo)?");
		System.out.println("[3] Generar una cadena con todos los grupos, ordenado por escuela. (IMPLEMENTADO)");
		System.out.println("[4] Mostrar los elementos de la matriz realizando un recorrido en espiral. (IMPLEMENTADO)");
		System.out.println("[5] Los grupos a los que les tocó una vocal se han ganado un premio. Identificarlos y "
				+ "reemplazar las vocales por '*' (IMPLEMENTADO)");
	}
}
