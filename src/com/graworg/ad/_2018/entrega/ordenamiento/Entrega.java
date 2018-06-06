package com.graworg.ad._2018.entrega.ordenamiento;

import java.util.Scanner;

import com.graworg.ad.util.Archivo;

public class Entrega {
	private static Scanner sc;
	
	/**
	 * Mostrar menú de opciones
	 */
	public static void mostrarMenú() {
		// Declaración de las variables
		int[] arreglo = {1,3,4,5};
		boolean salir;
		int opción;
		
		// Inicialización de las variables
		salir = false;
	
		
		System.out.println("Bienvenido a la consola de la aplicación");
		
		while(!salir)
		{
			sc = new Scanner(System.in);
			
			// Mostrar el cartel de las opciones
			System.out.print(
					"[0] Salir (IMPLEMENTADO)\n" +
					"[1] Aplicar el método de inserción\n" +
					"[2] Aplicar el método selección\n"
					);
			
			// Leer opción para el menú principal
			opción = sc.nextInt();
			
			switch (opción) {
			case 0:
				salir = true;
				break;
			case 1:
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
