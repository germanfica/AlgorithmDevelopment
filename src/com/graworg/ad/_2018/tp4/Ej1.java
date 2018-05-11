package com.graworg.ad._2018.tp4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.graworg.ad._2018.tp3.ej3.Cliente;

/* En una empresa de diseño gráfico se utilizan distintos números para catalogar los colores usados en la
 * impresora full color.
 * 
 * Cada color tiene asociado un número que funciona como factor.
 * 
 * Este factor sirve para calcular el precio, ya que a mayor cantidad de colores a usar en la impresión,
 * mayor es el costo del producto.
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
	private static int tamArrgelo = 20;
	/**
	 * Siendo n es el número de colores
	 * @param n
	 */
	public static int segundaCalidad(int n) {
		// Declaración de variables
		int sumatoria;
		
		if (n > 1) {
			sumatoria = segundaCalidad(n - 1) + n; // Composición
		} else {
			sumatoria = 1; // Caso base
		}
			 
		return sumatoria ; // Retorna la sumatoria de un número dado
	}
        
        // La calidad depende de la cantidad de colores	
	public static int primeraCalidad(int n) {
		// Declaración de variables
		int factorial;
		
		if (n > 1) {
			factorial = primeraCalidad(n - 1) * n; // Composición
		} else {
			factorial = 1; // Caso base
		}
			 
		return factorial ; // Retorna el factorial de un número dado
	}
	
	/**
	 * Cargar a un arreglo de String todos los colores de un archivo determinado
	 */
	public static String[] coloresDesdeArchivo() {
		String[] colores = new String[tamArrgelo]; // Creación del arreglo
		int i = 0;
		
    	try {
    		BufferedReader buff = new BufferedReader(new FileReader("src/com/graworg/ad/_2018/tp4/Colores.txt")); // Obtener los datos que están en el archivo de texto
    		Scanner sc;
    		sc = new Scanner(buff); // Le asigno al scanner la tarea para buscar los colores dentro del archivo de texto
    		
    		
    		sc.useDelimiter("\\s*,\\s*"); // Me clasifica los colores cuando encuntra la coma
    		
    		// Objetivo: es almacenar los colores uno por uno
    		while(sc.hasNext()) {
    			colores[i] = sc.next();
    			System.out.println(colores[i]);
    			i = i + 1;
    		}
    		buff.close();
    	}
    	catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage() + "\nEl archivo no existe.");
        }
        catch (IOException ex) {
            System.err.println("Error al leer o escribir en el archivo.");
        }
		
		return colores;
	}
	
	public static int cantidadDeElementosDelArreglo(String[] arreglo) {
		int cantidadDeElementos;
		
		cantidadDeElementos = 0;
		
		return cantidadDeElementos;
		
	}
	
	public static void main(String[] args) {
		// Declaración de variables
		int cantidadDeColores;
		int precioBase = 100; // $100.-
		
		// Arreglo los colores del archivo
		coloresDesdeArchivo();
		
		cantidadDeElementosDelArreglo(coloresDesdeArchivo());
				
		cantidadDeColores = cantidadDeElementosDelArreglo(coloresDesdeArchivo());
		
		System.out.println("El precio del trabajo de segunda calidad es: $" + segundaCalidad(cantidadDeColores) * precioBase +".-");
	}
}
