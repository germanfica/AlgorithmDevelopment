package xyz.germanfica.ad._2019._1st.tp5;

import java.util.Scanner;
import xyz.germanfica.util.MatrizEntero;

public class Cantidades {
	private static final String ARCHIVO = "src/xyz/germanfica/ad/_2019/_1st/tp5/cantidades.txt"; // Ruta del archivo

	public static void main(String[] args) {
		String[] escuelas = { "Los Patos", "Marabunta", "RRC", "NRC", "ARC" };
		String[] categorias = { "M4", "M6", "M7", "M8", "M10" };
		int[][] matrizCantidad = MatrizEntero.cargaDesdeArchivo(ARCHIVO);
		boolean salir = false;

		while (!salir) {
			mostrarOpciones();

			switch (new Scanner(System.in).nextInt()) {
			case 0:
				salir = true;
				break;
			case 1:
				mostrarOpcion1(matrizCantidad);
				break;
			case 2:
				mostrarOpcion2(matrizCantidad, escuelas);
				break;
			case 3:
				mostrarCatEscGrupInc(matrizCantidad, escuelas, categorias);
				break;
			case 4:
				mostrarPromAlumPorCat(matrizCantidad, categorias);
				break;
			case 5:
				mostrarGrupMasGrandConCatEsc(matrizCantidad, escuelas, categorias);
				break;
			case 6:
				mostrarGrupMasPequeConCatEsc(matrizCantidad, escuelas, categorias);
				break;
			default:
				System.out.println("Opción inválida");
			}
		}
	}

	public static int cantMayorIgualA(int num, int[][] matrizNumero) {
		int contador = 0;
		int cantActual;

		for (int i = 0; i <= matrizNumero.length - 1; i++) {
			for (int j = 0; j <= matrizNumero[0].length - 1; j++) {
				cantActual = matrizNumero[i][j];
				if (cantActual >= num) {
					contador = contador + 1;
				}
			}
		}
		return contador;
	}

	public static int[][] leerMatrizEntero(int cantFilas, int cantColumnas) {

		int[][] matrizEntero = new int[cantFilas][cantColumnas];
		int i, j, num;
		for (i = 0; i <= cantFilas - 1; i++) {
			for (j = 0; j <= cantColumnas - 1; j++) {
				num = new Scanner(System.in).nextInt();
				matrizEntero[i][j] = num;
			}
		}
		return matrizEntero;
	}

	public static int[] cantidadAlumnosPorEscuela(int[][] matrizCantidad, String[] escuelas) {

		int i, j, cantAlumnos;
		int[] cantAlumPorEsc = new int[escuelas[0].length()];

		for (i = 0; i <= matrizCantidad[0].length - 1; i++) {
			cantAlumnos = 0;
			for (j = 0; j <= matrizCantidad.length - 1; j++) {
				cantAlumnos = cantAlumnos + matrizCantidad[i][j];
			}
			cantAlumPorEsc[i] = cantAlumnos;
		}
		return cantAlumPorEsc;
	}

	public static void mostrarOpcion1(int[][] matrizCantidad) {

		int totalGrupos = matrizCantidad[0].length * matrizCantidad.length;
		int cantGruposCompletos = cantMayorIgualA(7, matrizCantidad);
		int porcentaje = (cantGruposCompletos * totalGrupos) / 100;

		System.out.println(cantGruposCompletos);
		System.out.println(totalGrupos);

		System.out.println("La cantidad de grupos que tienen más 7 niños son: " + cantGruposCompletos);
		System.out.println("Y representa el porcentaje: " + porcentaje + "%");
	}

	public static void mostrarOpcion2(int[][] matrizCantidad, String[] escuelas) {

		int[] cantAlumnosPorEscuela = cantidadAlumnosPorEscuela(matrizCantidad, escuelas);
		int totalAlumnos = 0;
		int cantAlumnosActual, porcentaje;
		int totalEscuelas = escuelas.length;

		System.out.println("La cantidad de alumnos por escuela es: ");
		for (int i = 0; i <= totalEscuelas - 1; i++) {
			cantAlumnosActual = cantAlumnosPorEscuela[i];
			System.out.println("La escuela " + escuelas[i] + " tiene " + cantAlumnosActual + " alumnos.");
			totalAlumnos = totalAlumnos + cantAlumnosPorEscuela[i];
		}
		porcentaje = (totalAlumnos * totalEscuelas) / 100;
		System.out.println("Y representa el porcentaje: " + porcentaje + "%");

	}

	public static void mostrarCatEscGrupInc(int[][] matrizCantidad, String[] escuelas, String[] categorias) {

		int i, j;
		System.out.println("Los ifguientes grupos son los que no llegan a armar un equipo de 7:");
		for (i = 0; i <= matrizCantidad.length - 1; i++) {
			for (j = 0; j <= matrizCantidad[0].length - 1; j++) {
				if (matrizCantidad[i][j] < 7) {
					System.out.println("Escuela: " + escuelas[i]);
					System.out.println("Categoria: " + categorias[j]);
				}

			}
		}
	}

	public static void mostrarPromAlumPorCat(int[][] matrizCantidad, String[] categorias) {

		int totalAlumn, i, j;
		double promedio;
		for (j = 0; j <= matrizCantidad[0].length - 1; j++) {
			totalAlumn = 0;
			for (i = 0; i <= matrizCantidad.length - 1; i++) {
				totalAlumn = totalAlumn + matrizCantidad[i][j];
			}
			promedio = totalAlumn / matrizCantidad[0].length;
			System.out.println("El promedio de la categoría " + categorias[j] + " es " + promedio);
		}
	}

	public static void mostrarGrupMasGrandConCatEsc(int[][] matrizCantidad, String[] escuelas, String[] categorias) {

		int i, j;
		int[] grupoMasGrande = new int[3];
		grupoMasGrande[0] = matrizCantidad[0][0];
		grupoMasGrande[1] = 0;
		grupoMasGrande[2] = 0;
		for (i = 0; i <= matrizCantidad.length - 1; i++) {
			for (j = 0; j <= matrizCantidad[0].length - 1; j++) {
				if (matrizCantidad[i][j] > grupoMasGrande[0]) {
					grupoMasGrande[0] = matrizCantidad[i][j];
					grupoMasGrande[1] = i;
					grupoMasGrande[2] = j;
				}
			}
		}
		System.out.println("El grupo más grande es:");
		System.out.println("Escuela: " + escuelas[grupoMasGrande[1]]);
		System.out.println("Categoria: " + categorias[grupoMasGrande[2]]);
	}

	public static void mostrarGrupMasPequeConCatEsc(int[][] matrizCantidad, String[] escuelas, String[] categorias) {

		int i, j;
		int[] grupoMasPeque = new int[3];
		grupoMasPeque[0] = matrizCantidad[0][0];
		grupoMasPeque[1] = 0;
		grupoMasPeque[2] = 0;
		for (i = 0; i <= matrizCantidad.length - 1; i++) {
			for (j = 0; j <= matrizCantidad[0].length - 1; j++) {
				if (matrizCantidad[i][j] < grupoMasPeque[0]) {
					grupoMasPeque[0] = matrizCantidad[i][j];
					grupoMasPeque[1] = i;
					grupoMasPeque[2] = j;
				}
			}
		}
		System.out.println("El grupo más pequeño es:");
		System.out.println("Escuela: " + escuelas[grupoMasPeque[1]]);
		System.out.println("Categoria: " + categorias[grupoMasPeque[2]]);
	}

	public static void mostrarOpciones() {
		System.out.println("[0] Salir (IMPLEMENTADO)");
		System.out.println("[1] Cantidad y porcentaje de grupos que tienen más de 7 niños del total. (IMPLEMENTADO)");
		System.out.println("[2] Cantidad y porcentaje de alumnos por escuela del total. (IMPLEMENTADO)");
		System.out
				.println("[3] ¿Qué categorías y de qué escuela no llegan a armar un grupo de 7 for jugar un partido?.");
		System.out.println("[4] Promedio de alumnos por categoría. (IMPLEMENTADO)");
		System.out.println("[5] El grupo más grande, indicando además la categoría y la escuela. (IMPLEMENTADO)");
		System.out.println("[6] El grupo más pequeño, indicando además la categoría y la escuela. (IMPLEMENTADO)");
	}
}
