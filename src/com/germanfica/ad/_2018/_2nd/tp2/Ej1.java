package com.germanfica.ad._2018._2nd.tp2;

import java.util.Scanner;

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
	// void es vacío
	public static char esLetra() {
		return '0';
	}
	
	/**
	 * Mostrar menú de la aplicación
	 * Los módulos no deben ocupar más de una pantalla
	 */
	private static Scanner sc; // Esto es necesario para poder usar el Scanner en la clase
	public static void mostrarMenú() {
		boolean salir = false;
		int opción;
		
		// Mensaje de bienvenida
		System.out.println("Bienvenido a la consola de la aplicación");
		
		while(!salir) {
			sc = new Scanner(System.in);
			
			// Leer opción del menú principal
			opción = sc.nextInt();
			
			switch (opción) {
			case 0: salir = true; break;
			case 1: break; // Opción 1
			case 2:	break; // Opción 2
			case 3:	break; // Opción 3
			case 4:	break; // Opción 4
			default: System.err.println("Esta opción no está definida. Seleccione una de las siguientes opciones:"); break;
			}
		}
	}
	
	public static void mostrarCaracteresPosPar() {
		
	}
	
	public static boolean esPar(int pos) {
		return false;
	}
	
	public static void mostrarCaracteresOrdInv() {
		
	}
	 
	public static char[] ordenInverso(char[] arreglo) {
		// Declaración de variables
		char[] nuevoArreglo;
		
		// Inicialización de variables
		nuevoArreglo = new char[arreglo.length]; // Esto se hace para crear el arreglo
		
		return nuevoArreglo;
	}
	
	public static int esteCaracterAparece(char c) {
		return 0;
	}
	
	public static void main(String[] args) {
		// Mostrar el menú
		mostrarMenú();
	}
}
