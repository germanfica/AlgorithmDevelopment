package com.germanfica.ad._2018._2nd.tp1.ej10;

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
 * - ALGORITMO calcularAreaCuadrado( REAL lado) RETORNA REAL
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
	//private int asd = () -> 3+1;
	
	public static double leerReal() {
		sc = new Scanner(System.in);
		System.out.println("Ingrese el valor: ");
		return sc.nextDouble();
	}
	
	// Caso 1
	public static double calcularPerimetroCuadrado(double lado) {
		return 4*lado;
	}
	public static double calcularAreaCuadrado(double lado) {
		return lado*lado;
	}
	
	// Caso 2
	public static double calcularPerimetroRectangulo(double lado1, double lado2) {
		return 0;
	}
	public static double calcularAreaRectangulo(double lado1, double lado2) {
		return 0;
	}
	
	// Caso 3
	public static double calcularPerimetroTriangulo(double lado) {
		return 0;
	}
	public static double calcularAreaTriangulo(double lado) {
		return 0;
	}
	
	// Caso 4
	public static double calcularPerimetroCirculo(double radio) {
		return 0;
	}
	public static double calcularAreaCirculo(double radio) {
		return 0;
	}
	
	interface Formula {
		double calcularPerimetroCuadrado(double lado);
		double calcularAreaCuadrado(double lado);
	}
	
	public static void mostrarCartelDeOpciones() {
		System.out.print(
				"[0] Salir (IMPLEMENTADO)\n" +
				"[1] Perímetro y área de un cuadrado\n" +
				"[2] Perímetro y área de un rectángulo\n" +
				"[3] Perímetro y área de un triángulo\n" +
				"[4] Perímetro y área de un círculo\n"
				);
	}
	
	public static void mostrarCaso1() {
		lado = leerReal();
		perímetro = calcularPerimetroCuadrado(lado);
		área = calcularAreaCuadrado(lado);
		System.out.print(
				"El perímetro del cuadrado es de: " + perímetro + ".\n" +
				"El área del cuadrado es de: " + área + ".\n"
				);
	}
	
	public static void mostrarCaso2() {
		lado1 = leerReal();
		lado2 = leerReal();
		perímetro = calcularPerimetroRectangulo(lado1, lado2);
		área = calcularAreaRectangulo(lado1, lado2);
		System.out.print(
				"El perímetro del rectángulo es de: " + perímetro + ".\n" +
				"El área del rectángulo es de: " + área + ".\n"
				);
	}
	
	public static void mostrarCaso3() {
		lado = leerReal();
		perímetro = calcularPerimetroTriangulo(lado);
		área = calcularAreaTriangulo(lado);
		System.out.print(
				"El perímetro del triángulo es de: " + perímetro + ".\n" +
				"El área del triángulo es de: " + área + ".\n"
				);
	}
	
	public static void mostrarCaso4() {
		radio = leerReal();
		perímetro = calcularPerimetroCirculo(radio);
		área = calcularAreaCirculo(radio);
		System.out.print(
				"El perímetro del círculo es de: " + perímetro + ".\n" +
				"El área del círculo es de: " + área + ".\n"
				);
	}
	
	/**
	 * Mostrar menú de la aplicación
	 */
	public static void mostrarMenú() {
		boolean salir = false;
		int opción;
		
		// Mostrar cartel de opciones
		mostrarCartelDeOpciones();
		
		System.out.println(Mensaje.leer().get(0));
		while(!salir) {
			sc = new Scanner(System.in);
			
			// Leer opción del menú principal
			opción = sc.nextInt();
			
			switch (opción) {
			case 0: salir = true; break;
			case 1: mostrarCaso1(); break;
			case 2:	mostrarCaso2(); break;
			case 3:	mostrarCaso3();	break;
			case 4:	mostrarCaso4();	break;
			default: System.err.println(Mensaje.leer().get(1)); break;
			}
		}
	}
	
	public static void main(String[] args) {
		mostrarMenú();
	}
}
