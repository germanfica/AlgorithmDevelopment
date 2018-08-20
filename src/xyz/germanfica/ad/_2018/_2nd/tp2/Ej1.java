package xyz.germanfica.ad._2018._2nd.tp2;

import java.util.Scanner;
import xyz.germanfica.arreglos.ArregloCaracter;
import xyz.germanfica.arreglos.ArregloLetra;

/*
 * 1. Diseñar un algoritmo que lea un arreglo de caracteres solicitando al usuario que
 * ingrese letras. El algoritmo deberá verificar que los caracteres ingresados son letras.
 * Luego diseñar módulos que realicen las siguientes tareas a las cuales se pueda acceder
 * mediante un menú de opciones:
 * 
 * a) Mostrar por pantalla los caracteres de las posiciones pares del arreglo de caracteres.
 * b) Mostrar por pantalla los caracteres almacenados en el arreglo en orden inverso.
 * c) Contar cuantas veces aparece un carácter dado. 
 */
public class Ej1 {
	private static Scanner sc;
	 
	public static char[] ordenInverso(char[] arreglo) {
		// Declaración de variables
		char[] nuevoArreglo;
		
		// Inicialización de variables
		nuevoArreglo = new char[arreglo.length]; // Esto se hace para crear el arreglo
		
		return nuevoArreglo;
	}
	
	public static char[] caracteresOrdInv(char[] caracteres) {
		char[] nuevoArreglo;
		int longitud, aux;
		
		longitud = caracteres.length;
		nuevoArreglo = new char[longitud];
		aux = longitud-1;
		
		for (int i = 0; i < longitud; i++) {
			nuevoArreglo[i] = caracteres[aux];
			aux--;
		}
		
		return nuevoArreglo;
	}
	
	/**
	 * (2)
	 * 
	 * Mostrar por pantalla los caracteres almacenados en el arreglo en orden inverso.
	 */
	public static void mostrarCaracteresOrdInv(char[] caracteres) {
		caracteres = caracteresOrdInv(caracteres);
		ArregloCaracter.mostrar(caracteres);
	}
	
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
	 * 
	 * Nota: los módulos no deben ocupar más de una pantalla
	 */
	public static void mostrarMenú() {
		char[] letras;
		boolean salir = false;
		int opción;
		
		// Mensaje de bienvenida
		System.out.println("Bienvenido a la consola de la aplicación");
		
		// Leer y generar un arreglo de caracteres
		System.out.println("Ingrese la longitud de su arreglo:");
		sc = new Scanner(System.in);
		letras = ArregloLetra.carga(sc.nextInt(), "Ingrese su letra:"); // Arreglo de caracteres
		while(!salir) {
			// Mostrar cartel con las opciones
			mostrarCartelDeOpciones();
			
			// Leer opción del menú principal
			opción = sc.nextInt();
			
			switch (opción) {
			case 0: salir = true; break;
			case 1: ArregloCaracter.mostrarPosPar(letras);break; // Opción 1
			case 2:	mostrarCaracteresOrdInv(letras);break; // Opción 2
			case 3:	System.out.println("Ingrese el caracter:");System.out.println(ArregloCaracter.esteCaracterSeRepite(letras, sc.next().charAt(0)));break; // Opción 3
			case 4: ArregloCaracter.mostrar(letras);break; // Opción 4
			default: System.err.println("Esta opción no está definida. Seleccione una de las siguientes opciones:"); break;
			}
		}
	}
	
	public static void main(String[] args) {
		// Mostrar el menú
		mostrarMenú();
	}
}
