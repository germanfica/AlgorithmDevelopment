package com.germanfica.ad._2018._2nd.tp1;

import java.util.Scanner;
import com.germanfica.ad.util.Mensaje;

/*
 * 10) Diseñar en Java un algoritmo para calcular el
 * ------- perímetro y el área -------------
 * de diferentes figuras geométricas que cuente con un menú de opciones para
 * las siguientes figuras:
 * - Cuadrado.
 * - Rectángulo.
 * - Triángulo (suponer equilátero).
 * - Círculo.
 * 
 * Desarrollar también los métodos que debe reutilizar el algoritmo y cuyas signaturas
 * se detallan a continuación:
 * 
 * - ALGORITMO calcularPerimetroCuadrado(REAL lado) RETORNA REAL
 * - ALGORITMO calcularAreaRectangulo( REAL lado) RETORNA REAL
 * 
 * - ALGORITMO calcularPerimetroRectangulo( REAL lado1, REAL lado2) RETORNA REAL
 * - ALGORITMO calcularAreaRectangulo( REAL lado1, REAL lado2) RETORNA REAL
 * 
 * - ALGORITMO calcularPerimetroTriangulo( REAL lado) RETORNA REAL
 * - ALGORITMO calcularAreaTriangulo( REAL lado) RETORNA REAL
 * 
 * - ALGORITMO calcularAreaCirculo( REAL radio) RETORNA REAL
 * - ALGORITMO calcularPerimetroCirculo( REAL radio) RETORNA REAL
 */
public class Ej10 {
	private static Scanner sc;
	
	public static double calcularPerimetroCuadrado(double lado) {
		return 0;
	}
	
	public static double calcularAreaRectangulo(double lado) {
		return 0;
	}
	
	public static double calcularPerimetroRectangulo(double lado1, double lado2) {
		return 0;
	}
	
	public static double calcularAreaRectangulo(double lado1, double lado2) {
		return 0;
	}
	
	public static double calcularPerimetroTriangulo(double lado) {
		return 0;
	}
	
	public static double calcularAreaTriangulo(double lado) {
		return 0;
	}
	
	public static double calcularAreaCirculo(double radio) {
		return 0;
	}
	
	public static double calcularPerimetroCirculo(double radio) {
		return 0;
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
					"[1] Perímetro y área de un cuadrado\n" +
					"[2] Perímetro y área de un rectángulo\n" +
					"[3] Perímetro y área de un triángulo\n" +
					"[4] Perímetro y área de un círculo\n"
					);
			
			// Leer opción del menú principal
			opción = sc.nextInt();
			
			switch (opción) {
			case 0:
				salir = true;
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
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
