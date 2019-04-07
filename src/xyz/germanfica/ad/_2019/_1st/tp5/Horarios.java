package xyz.germanfica.ad._2019._1st.tp5;

import java.util.Scanner;
import xyz.germanfica.util.MatrizTexto;

public class Horarios {
	private static final String ARCHIVO = "src/xyz/germanfica/ad/_2019/_1st/tp5/horarios.txt"; // Ruta del archivo

	public static void main(String[] args) {
		String[][] matrizHorario = MatrizTexto.cargaDesdeArchivo(ARCHIVO); // Si no hay actividad se coloca una x
		boolean salir = false;

		while (!salir) {
			mostrarOpciones();
			switch (new Scanner(System.in).nextInt()) {
			case 0:
				salir = true;
				break;
			case 1:
				mostrarActividad(matrizHorario);
				break;
			case 2:
				MatrizTexto.mostrarConEspacio(matrizHorario);
				break;
			default:
				System.out.println("Opción inválida");
				break;
			}
		}
	}

	public static void mostrarActividad(String[][] matrizHorario) {
		System.out
				.println(hayActividad(matrizHorario, new Scanner(System.in).next(), new Scanner(System.in).nextInt()));
	}

	/**
	 * Si no hay actividad retorna falso
	 * 
	 * @param matrizHorario
	 * @param dia
	 * @param hora
	 * @return
	 */
	public static boolean hayActividad(String[][] matrizHorario, String dia, int hora) {
		return !matrizHorario[hora][posicionDia(dia)].equalsIgnoreCase("x");
	}

	public static int posicionDia(String dia) {
		int pos;
		switch (dia.toLowerCase()) {
		case "lunes":
			pos = 0;
			break;
		case "martes":
			pos = 1;
			break;
		case "miércoles":
			pos = 2;
			break;
		case "miercoles":
			pos = 2;
			break;
		case "jueves":
			pos = 3;
			break;
		case "viernes":
			pos = 4;
			break;
		default:
			pos = -1;
			break;
		}
		return pos;
	}

	public static void mostrarOpciones() {
		System.out.println("[0] Salir (IMPLEMENTADO)");
		System.out.println("[1] Ingresar un dia y hora, y mostrar si hay o no actividad");
	}
}
