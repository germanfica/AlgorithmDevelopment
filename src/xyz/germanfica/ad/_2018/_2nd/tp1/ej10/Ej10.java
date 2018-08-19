package xyz.germanfica.ad._2018._2nd.tp1.ej10;

import java.util.Scanner;

import xyz.germanfica.ad._2018._2nd.tp1.ej10.Formula.Circulo;
import xyz.germanfica.ad._2018._2nd.tp1.ej10.Formula.Cuadrado;
import xyz.germanfica.ad._2018._2nd.tp1.ej10.Formula.Rectangulo;
import xyz.germanfica.ad._2018._2nd.tp1.ej10.Formula.Triangulo;
import xyz.germanfica.ad.util.Mensaje;

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
	
	public static double leerReal() {
		sc = new Scanner(System.in);
		System.out.println("Ingrese el valor: ");
		return sc.nextDouble();
	}
	
	public static void mostrarCaso1() {
		Cuadrado perimetro = (lado) -> 4*lado;
		Cuadrado area = (lado) -> lado*lado;
		double lado = leerReal(); // Leer lado
		System.out.print(
				"El perímetro del cuadrado es de: " + perimetro.calcular(lado) + ".\n" +
				"El área del cuadrado es de: " + area.calcular(lado) + ".\n"
				);
	}
	
	public static void mostrarCaso2() {
		Rectangulo perimetro = (lado1, lado2) -> lado1*lado1+lado2*lado2;
		Rectangulo area = (lado1, lado2) -> lado1*lado2;
		
		double lado1 = leerReal(); // Leer lado 1
		double lado2 = leerReal(); // Leer lado 2
		System.out.print(
				"El perímetro del rectángulo es de: " + perimetro.calcular(lado1, lado2) + ".\n" +
				"El área del rectángulo es de: " + area.calcular(lado1, lado2) + ".\n"
				);
	}
	
	public static void mostrarCaso3() {
		Triangulo perimetro = (lado) -> lado+lado+lado;
		Triangulo area = (lado) -> lado*lado/2;
		
		double lado = leerReal(); // Leer lado
		System.out.print(
				"El perímetro del triángulo es de: " + perimetro.calcular(lado) + ".\n" +
				"El área del triángulo es de: " + area.calcular(lado) + ".\n"
				);
	}
	
	public static void mostrarCaso4() {
		Circulo perimetro = (radio) -> 2*3.14*radio;
		Circulo area = (radio) -> 3.14*radio*radio;
		
		double radio = leerReal(); // Leer radio
		System.out.print(
				"El perímetro del círculo es de: " + perimetro.calcular(radio) + ".\n" +
				"El área del círculo es de: " + area.calcular(radio) + ".\n"
				);
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
	
	/**
	 * Mostrar menú de la aplicación
	 * Los módulos no deben ocupar más de una pantalla
	 */
	public static void mostrarMenú() {
		boolean salir = false;
		int opción;
		
		// Mensaje de bienvenida
		System.out.println(Mensaje.leer().get(0));
		
		// Mostrar cartel de opciones
		mostrarCartelDeOpciones();
		
		while(!salir) {
			sc = new Scanner(System.in);
			mostrarCartelDeOpciones();
			
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
