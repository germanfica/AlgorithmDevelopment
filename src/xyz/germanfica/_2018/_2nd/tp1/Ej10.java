package xyz.germanfica._2018._2nd.tp1;

import java.util.Scanner;

import xyz.germanfica._2018._2nd.tp1.Formula.Circulo;
import xyz.germanfica._2018._2nd.tp1.Formula.Cuadrado;
import xyz.germanfica._2018._2nd.tp1.Formula.Rectangulo;
import xyz.germanfica._2018._2nd.tp1.Formula.Triangulo;
import xyz.germanfica.mensaje.Mensaje;

/*
 * 10) Diseñar en Java un algoritmo para calcular el
 * ------- perímetro y el area -------------
 * de diferentes figuras geométricas que cuente con un menú de opciones para
 * las siguientes figuras:
 * - Cuadrado.
 * - Rectangulo.
 * - Triangulo (suponer equilatero).
 * - Círculo.
 * 
 * Desarrollar también los métodos que debe reutilizar el algoritmo y cuyas signaturas
 * se detallan a continuacion:
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
/*
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
				"El area del cuadrado es de: " + area.calcular(lado) + ".\n"
				);
	}
	
	public static void mostrarCaso2() {
		Rectangulo perimetro = (lado1, lado2) -> lado1*lado1+lado2*lado2;
		Rectangulo area = (lado1, lado2) -> lado1*lado2;
		
		double lado1 = leerReal(); // Leer lado 1
		double lado2 = leerReal(); // Leer lado 2
		System.out.print(
				"El perímetro del rectangulo es de: " + perimetro.calcular(lado1, lado2) + ".\n" +
				"El area del rectangulo es de: " + area.calcular(lado1, lado2) + ".\n"
				);
	}
	
	public static void mostrarCaso3() {
		Triangulo perimetro = (lado) -> lado+lado+lado;
		Triangulo area = (lado) -> lado*lado/2;
		
		double lado = leerReal(); // Leer lado
		System.out.print(
				"El perímetro del triangulo es de: " + perimetro.calcular(lado) + ".\n" +
				"El area del triangulo es de: " + area.calcular(lado) + ".\n"
				);
	}
	
	public static void mostrarCaso4() {
		Circulo perimetro = (radio) -> 2*3.14*radio;
		Circulo area = (radio) -> 3.14*radio*radio;
		
		double radio = leerReal(); // Leer radio
		System.out.print(
				"El perímetro del círculo es de: " + perimetro.calcular(radio) + ".\n" +
				"El area del círculo es de: " + area.calcular(radio) + ".\n"
				);
	}
	
	public static void mostrarCartelDeOpciones() {
		System.out.print(
				"[0] Salir (IMPLEMENTADO)\n" +
				"[1] Perímetro y area de un cuadrado\n" +
				"[2] Perímetro y area de un rectangulo\n" +
				"[3] Perímetro y area de un triangulo\n" +
				"[4] Perímetro y area de un círculo\n"
				);
	}
	*/
	
	/**
	 * Mostrar menú de la aplicacion
	 * Los modulos no deben ocupar mas de una pantalla
	 */
/*
	public static void mostrarMenú() {
		boolean salir = false;
		int opcion;
		
		// Mensaje de bienvenida
		System.out.println(Mensaje.leer(0));
		
		// Mostrar cartel de opciones
		mostrarCartelDeOpciones();
		
		while(!salir) {
			sc = new Scanner(System.in);
			mostrarCartelDeOpciones();
			
			// Leer opcion del menú principal
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 0: salir = true; break;
			case 1: mostrarCaso1(); break;
			case 2:	mostrarCaso2(); break;
			case 3:	mostrarCaso3();	break;
			case 4:	mostrarCaso4();	break;
			default: System.err.println(Mensaje.leer(1)); break;
			}
		}
	}
	
	public static void main(String[] args) {
		mostrarMenú();
	}
	
}

*/
