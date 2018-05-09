package com.graworg.ad._2018.tp4;

import java.util.Scanner;

/* En una empresa de diseño gráfico se utilizan distintos números para catalogar los colores usados en la
 * impresora full color. Cada color tiene asociado un número que funciona como factor para calcular el
 * precio, ya que a mayor cantidad de colores a usar en la impresión, mayor es el costo del producto.
 * 
 * Los colores tienen asignado un código que es un números natural y a medida que se agrega un color a la
 * impresión se le asigna el siguiente nro natural. Por ejemplo:
 * 
 * Si los colores usados son: Rojo, verde, azul, naranja, celeste, y verde oscuro, el código asociado es: 1, 2,
 * 3, 4, 5, 6, respectivamente.
 * 
 * El factor es: 1 + 2 + 3 + 4 + 5 + 6 = 21.
 * 
 * El precio base de la impresión (sin aplicar el factor) es $100.
 * 
 * Entonces el precio final de aplicar el factor es $2100.
 * 
 * Con esto, para calcular el factor Ud. Solo debe conocer cuántos colores va a usar.*/

public class Ej1 {
	
	/**
	 * Siendo n es el número de colores
	 * @param n
	 */
	public static int precioDeLosColores(int n) {
		// Declaración de variables
		int factorial;
		
		if (n > 1) {
			factorial = precioDeLosColores(n - 1) + n; // Composición
		} else {
			factorial = 1; // Caso base
		}
			 
		return factorial ; // Retorna el precio total de los colores usados
	}
	
	// Obtener los colore usados
	
	public static void main(String[] args) {
		// Declaración de variables
		int cantidadDeColores;
		int precioBase = 100; // $100.-
		
		System.out.println("Ingrese la cantidad de colores: ");
		
		Scanner sc = new Scanner(System.in); // Creación del scanner
		
		cantidadDeColores = sc.nextInt(); // Leer la cantidad de colores
		
		System.out.println("El precio es de: $" + precioDeLosColores(cantidadDeColores)*precioBase +".-");
	}
}
