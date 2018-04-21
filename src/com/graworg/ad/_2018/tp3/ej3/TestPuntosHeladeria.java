package com.graworg.ad._2018.tp3.ej3;

import java.util.Scanner;

/*
 *  Escribir un programa TestPuntosHeladeria que permita:
 *  - Cargar y operar con los datos de un cliente.
 *  
 *  Debe contar con un menú de opciones para probar toda la funcionalidad del TDA.
 */

public class TestPuntosHeladeria {
	private static Scanner sc = new Scanner(System.in);
	
	/*
	 * Cargar puntaje
	 */
	public static Cliente cargarPuntos(){
		String nombreDelCliente;
		int puntosDelCliente;
		
		System.out.println("Ingrese el nombre del cliente: ");
		nombreDelCliente = sc.next();
		System.out.println("Ingrese la cantidad de puntos: ");
		puntosDelCliente = sc.nextInt();
		
		Cliente cliente = new Cliente(nombreDelCliente);
		cliente.setPuntos(puntosDelCliente);
		
		return cliente;
	}
	
	
	public static void menú() {
		Cliente cliente;
		boolean salir;
		int opción;
		
		// Inicializar variables
		salir = false;
		
		// Crear objecto
		cliente = new Cliente("vacío");
		
		System.out.println("Bienvenido a la consola de la aplicación");
		
		while(!salir)
		{
			System.out.print(
					"[0] Salir\n" +
					"[1] Cargar puntos\n" +
					"[2] Mostrar cliente con su puntaje\n" +
					"[3] Cambiar nombre del cliente\n" +
					"[4] Cambiar el puntaje del cliente\n" +
					"[4] Sumar más puntos al cliente\n"
					);
			
			opción = sc.nextInt();
			
			switch (opción) {
			case 0:
				salir = true;
				break;
			case 1:
				cliente = cargarPuntos();
				break;
			case 2:
				System.out.println(cliente.toString());
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
