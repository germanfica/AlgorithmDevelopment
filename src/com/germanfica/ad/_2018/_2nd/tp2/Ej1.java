package com.germanfica.ad._2018._2nd.tp2;

import com.germanfica.ad.util.Mensaje;
import com.germanfica.ad.util.TecladoIn;

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
	/**
	 * Este módulo me retorna el arreglo de caracteres con todos sus elementos.
	 * Por lo tanto, es módulo solicita que ingrese caracteres para cargar al arreglo.
	 * @return
	 */
	public static char[] caracteres(int longitud, String mensaje) {
		// Declaración de variables
		char[] nuevoArreglo;
		char ch; // Caracter
		int i;
		
		// Inicialización de variables
		nuevoArreglo = new char[longitud];
		i = 0;
		
		// Agregar elementos al arreglo
		while(i <= nuevoArreglo.length-1) {
			System.out.println(mensaje);
			ch = TecladoIn.readNonwhiteChar(); // En este caso usamos TecladoIn ya que en Scanner no está defino para leer caracteres. Pd: usar readNonwhiteChar()
			if(Character.isLetter(ch)) {
				nuevoArreglo[i] = ch;
				i++;
			}else {
				System.err.println(Mensaje.leer().get(2));
			}
		}
		return nuevoArreglo;
	}
	// void es vacío
	public static char esLetra() {
		return '0';
	}
	
	/**
	 * En este módulo voy a mostrar los caracteres del arreglo de caracteres
	 * @param caracteres
	 */
	public static void mostrarCaracteres(char[] caracteres) {
		for (int i = 0; i < caracteres.length; i++) {
			System.out.println(caracteres[i]);
		}
	}
	
	public static boolean esPar(int pos) {
		return pos%2==0;
	}
	 
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
	 * 
	 */
	public static int esteCaracterAparece(char[] caracteres, char c) {
		int contador;
		contador = 0;
		for (int i = 0; i < caracteres.length; i++) {
			if(caracteres[i]==c)
				contador++;
		}
		return contador;
	}
	
	/**
	 * (2)
	 * 
	 * Mostrar por pantalla los caracteres almacenados en el arreglo en orden inverso.
	 */
	public static void mostrarCaracteresOrdInv(char[] caracteres) {
		caracteres = caracteresOrdInv(caracteres);
		mostrarCaracteres(caracteres);
	}
	
	/**
	 * (1)
	 * 
	 * Mostrar por pantalla los caracteres de las posiciones pares del arreglo de caracteres
	 */
	public static void mostrarCaracteresPosPar(char[] caracteres) {
		for (int i = 0; i < caracteres.length; i++) {
			if(esPar(i)) {
				System.out.println(caracteres[i]);
			}
		}
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
	 * Mostrar menú de la aplicación
	 * Los módulos no deben ocupar más de una pantalla
	 */
	public static void mostrarMenú() {
		char[] caracteres;
		boolean salir = false;
		int opción;
		
		// Mensaje de bienvenida
		System.out.println("Bienvenido a la consola de la aplicación");
		
		// Leer y generar un arreglo de caracteres
		System.out.println("Ingrese la longitud de su arreglo:");
		caracteres = caracteres(TecladoIn.readInt(), "Ingrese su caracter:"); // Areglo de caracteres
		while(!salir) {
			// Mostrar cartel con las opciones
			mostrarCartelDeOpciones();
			
			// Leer opción del menú principal
			opción = TecladoIn.readInt();
			
			switch (opción) {
			case 0: salir = true; break;
			case 1: mostrarCaracteresPosPar(caracteres);break; // Opción 1
			case 2:	mostrarCaracteresOrdInv(caracteres);break; // Opción 2
			case 3:	System.out.println("Ingrese el caracter:");System.out.println(esteCaracterAparece(caracteres, TecladoIn.readChar()));;break; // Opción 3
			case 4: mostrarCaracteres(caracteres);break; // Opción 4
			default: System.err.println("Esta opción no está definida. Seleccione una de las siguientes opciones:"); break;
			}
		}
	}
	
	public static void main(String[] args) {
		// Mostrar el menú
		mostrarMenú();
	}
}
