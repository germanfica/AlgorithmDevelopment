package xyz.germanfica.ad._2018._2nd.tp2;

import java.util.Scanner;
import xyz.germanfica.ad.util.Mensaje;
import xyz.germanfica.arreglos.ArregloCaracter;
import xyz.germanfica.arreglos.ArregloLetra;

/*
 * 1. Diseñar un algoritmo que lea un arreglo de caracteres solicitando al
 * usuario que ingrese letras. El algoritmo deberá verificar que los
 * caracteres ingresados son letras.
 * Luego diseñar módulos que realicen las siguientes tareas a las cuales se
 * pueda acceder mediante un menú de opciones:
 * 
 * a) Mostrar por pantalla los caracteres de las posiciones pares del arreglo
 * de caracteres.
 * b) Mostrar por pantalla los caracteres almacenados en el arreglo en orden
 * inverso.
 * c) Contar cuantas veces aparece un carácter dado. 
 */
public class Ej1 {
	private static Scanner sc;
	
	public static void mostrarCartelDeOpciones() {
		System.out.print(
				"[0] Salir (IMPLEMENTADO)\n" +
				"[1] Mostrar por pantalla los caracteres de las posiciones pares del arreglo de caracteres (IMPLEMENTADO)\n" +
				"[2] Mostrar por pantalla los caracteres almacenados en el arreglo en orden inverso (IMPLEMENTADO)\n" +
				"[3] Contar cuantas veces aparece un carácter dado (IMPLEMENTADO)\n" +
				"[4] Mostrar todos los caracteres del arreglo (IMPLEMENTADO)\n"
				);
	}
	
	/**
	 * Mostrar el menú de la aplicación
	 * Nota: los módulos no deben ocupar más de una pantalla
	 */
	public static void mostrarMenú(char[] letras) {
		boolean salir = false;
		int opción;
		
		// Mensaje de bienvenida
		System.out.println(Mensaje.leer(0));
		
		while(!salir) {
			// Mostrar cartel con las opciones
			mostrarCartelDeOpciones();
			
			// Leer opción del menú principal
			sc = new Scanner(System.in);
			opción = sc.nextInt();
			
			switch (opción) {
			case 0: salir = true; break;
			case 1: ArregloCaracter.mostrarPosPar(letras);break; // Opción 1
			case 2:	ArregloCaracter.mostrarOrdInvertido(letras);break; // Opción 2
			case 3:	System.out.println("Ingrese el caracter:");System.out.println(ArregloCaracter.esteCaracterSeRepite(letras, sc.next().charAt(0)));break; // Opción 3
			case 4: ArregloCaracter.mostrar(letras);break; // Opción 4
			default: System.err.println(Mensaje.leer(1)); break;
			}
		}
	}
	
	public static void main(String[] args) {
		// Preparo al Scanner para que me lea las entradas del sistema
		sc = new Scanner(System.in);
		// Mostrar menú, leer y generar un arreglo de letras
		System.out.println(Mensaje.leer(3));
		mostrarMenú(ArregloLetra.carga(sc.nextInt(), "Ingrese su letra:"));
	}
}