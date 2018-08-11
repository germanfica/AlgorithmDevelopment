package com.germanfica.ad._2018._2nd.tp1;

import java.util.Scanner;

import com.germanfica.ad.util.Mensaje;

/*
 * 11) Diseñe un algoritmo que dado un número N entre 1 y 9, permita generar triángulos
 * como los indicados en cada inciso.
 * 
 * a) N = 4
 * 1
 * 22
 * 333
 * 4444
 * 
 * b) N=4
 *    A
 *   AB
 *  ABC
 * ABCD
 * 
 * c) N = 5
 * 1 3 5 7 9
 *  1 3 5 7
 *   1 3 5
 *    1 3
 *     1
 *
 * d) N=5
 * 5 4 3 2 1
 *  4 3 2 1
 *   3 2 1
 *    2 1
 *     1
 */
public class Ej11 {
	private static Scanner sc;
	
	public static int leer() {
		int n = 0;
		sc = new Scanner(System.in);
		System.out.println("Escriba un número debe ser del 1 al 9:");
		n = sc.nextInt();
		while (n>9 || n<1) {
			System.err.println("El número debe ser del 1 al 9.");
			n = sc.nextInt();
		}
		return n;
	}
	
	public static void mostrarTriánguloA(int n) {
		
	}
	
	public static void mostrarTriánguloB(int n) {
		
	}
	
	public static void mostrarTriánguloC(int n) {
		
	}
	
	public static void mostrarTriánguloD(int n) {
		
	}
	
	public static void mostrarMenú() {
		boolean salir;
		int opción;
		
		// Inicializar variables
		salir = false;
		
		System.out.println(Mensaje.leer().get(0));		
		while(!salir) {
			sc = new Scanner(System.in);
			
			// Mostrar cartel de opciones
			System.out.print(
					"[0] Salir (IMPLEMENTADO)\n" +
					"[1] Generar el triángulo A\n" +
					"[2] Generar el triángulo B\n" +
					"[3] Generar el triángulo C\n" +
					"[4] Generar el triángulo D\n"
					);
			
			// Leer opción del menú principal
			opción = sc.nextInt();
			
			switch (opción) {
			case 0:
				salir = true;
				break;
			case 1:
				mostrarTriánguloA(leer());
				break;
			case 2:
				mostrarTriánguloB(leer());
				break;
			case 3:
				mostrarTriánguloC(leer());
				break;
			case 4:
				mostrarTriánguloD(leer());
				break;
			default:
				System.err.println("Esta opción no está definida. Seleccione una de las siguientes opciones: ");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		mostrarMenú();
	}
}
