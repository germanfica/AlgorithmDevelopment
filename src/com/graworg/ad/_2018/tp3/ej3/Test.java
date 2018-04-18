package com.graworg.ad._2018.tp3.ej3;

import java.util.Scanner;

public class Test {
	private static Scanner sc = new Scanner(System.in);
	
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
					"[1] Cargar producto\n" +
					"[2] Mostrar listado de productos\n" +
					"[3] Cantidad de productos con stock 0\n" +
					"[4] Cantidad de productos con un precio\n" +
						"unitario menor a un valor dado\n" + 
					"[5] Aumentar a todos los productos un\n" +
						"porcentaje de aumento al precio unitario.\n"
					);
			
			opción = sc.nextInt();
			
			switch (opción) {
			case 0:
				salir = true;
				break;
			case 1:
				System.out.println("Opción 1");
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
