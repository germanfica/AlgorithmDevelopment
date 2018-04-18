package com.graworg.ad._2018.tp3.ej3;

import java.util.Scanner;

/*
 *  Escribir un programa TestPuntosHeladeria que permita:
 *  - Cargar y operar un objeto de la clase Puntos.
 *  
 *  Debe contar con un menú de opciones para probar toda la funcionalidad del TDA.
 */

public class TestPuntosHeladeria {
	private static Scanner sc = new Scanner(System.in);
	
	public static void cargarPuntos(){
		
	}
	
	
	public static void menú() {
		boolean salir;
		int opción;
		
		// Inicializar variables
		salir = false;
		
		System.out.println("Bienvenido a la consola de la aplicación");
		
		while(!salir)
		{
			System.out.print(
					"[0] Salir\n" +
					"[1] Cargar puntos\n"
					);
			
			opción = sc.nextInt();
			
			switch (opción) {
			case 0:
				salir = true;
				break;
			case 1:
				System.out.println("Cargar");
				break;
			default:
				System.err.println("Esta opción no existe. Seleccione una de las siguientes opciones: ");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		menú();
	}
}
