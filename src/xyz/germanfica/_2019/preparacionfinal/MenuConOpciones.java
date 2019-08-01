package xyz.germanfica._2019.preparacionfinal;

import java.util.Scanner;

public class MenuConOpciones {

	/**
	 * Muestra las opciones disponibles en el menu de la app
	 */
	public static void mostrarOpciones() {
		System.out.println("Bienvenido!");
		System.out.println("[0] Salir.");
		System.out.println("[1] Hola mundo.");
	}

	/**
	 * Lee una opcion para el menu de la app
	 * 
	 * @return devuelve un numero entero
	 */
	public static int leerOpcion() {
		return new Scanner(System.in).nextInt();
	}

	/*
	 * El algoritmo principal tiene que ser el cerebro el que maneja y da las
	 * ordenes de qué hacer.
	 */
	public static void main(String[] args) {
		boolean salir = false;

		while (!salir) {
			mostrarOpciones(); // Muestra las opciones del menu

			switch (leerOpcion()) {
			case 0:
				salir = true;
				break;
			case 1:
				System.out.println("Hola mundo");
				break;
			default:
				System.err.println("Opción inválida");
			}
		}
	}
}
