package com.graworg.ad._2018.tp4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Comentarios

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
	private static String[] colores = new String[tamArrgelo];
	private static int[] codigos = new int[tamArrgelo];
	
	
	public static void cargaElementos(){
		//rojo, 1, verde, 2, rosa, 3, negro, 4
		colores[0] = "verde";
		codigos[0] = 1;
		
		colores[1] = "azul";
		codigos[1] = 2;
		
		colores[2] = "rojo";
		codigos[2] = 3;
		
		colores[3] = "naranja";
		codigos[3] = 4;
		
		colores[4] = "amarrillo";
		codigos[4] = 5;
		
		colores[5] = "negro";
		codigos[5] = 6;
	}
	
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
	 * Guardar el arreglo clientes en el archivo clientes.txt
	 * @param clientes
	 */
	public static void guardarEnElArchivo(String[] colores) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		String contenido="";

		try {
			for (int i =0; i<colores.length; i++){				
				contenido += colores[i].toString().toUpperCase();
			}
			

			fw = new FileWriter("src/com/graworg/ad/_2018/tp4/Colores.txt");
			bw = new BufferedWriter(fw);
			bw.write(contenido);

			System.out.println("Listo.");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace(); // Error al leer o escribir en el archivo
			}
		}
	}
	
	/**
	 * (3) Cargar a un arreglo de String todos los colores de un archivo determinado
	 */
	public static String[] coloresDesdeArchivo() {
		String[] colores = new String[tamArrgelo]; // Creación del arreglo
		int[] códigos = new int[tamArrgelo];
 		int i = 0;
		
    	try {
    		BufferedReader buff = new BufferedReader(new FileReader("src/com/graworg/ad/_2018/tp4/Colores.txt")); // Obtener los datos que están en el archivo de texto
    		Scanner sc;
    		sc = new Scanner(buff); // Le asigno al scanner la tarea para buscar los colores dentro del archivo de texto
    		
    		
    		sc.useDelimiter("\\s*,\\s*"); // Me clasifica los colores cuando encuntra la coma
    		
    		// Objetivo: es almacenar los colores uno por uno
    		while(sc.hasNext()) {
    			colores[i] = sc.next();
    			códigos[i] = sc.nextInt();
    			System.out.println("Color: " + colores[i] + " Código: " + colores[i]);
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
	
	/**
	 * (4) Todos los colores usados y recuperados en el archivo de texto están en minúscula. Lo mejor es
	 * tenerlos a todos en mayúscula, entonces antes de cargar el arreglo deben ser convertidos.
	 * Realizar un algoritmo que convierta en mayúscula el color dado en minúscula. Probarlo en el
	 * algoritmo hecho en 3.
	 * @param args
	 */
	public static void pasarAMayúsculas(String[] BDColores) {
		
	}
	
	public static void main(String[] args) {
		// Declaración de variables
		int cantidadDeColores;
		int precioBase = 100; // $100.-
		
		// Arreglo de los colores con sus correspondientes códigos desde un archivo
		String[] BDColores = coloresDesdeArchivo();
		
		guardarEnElArchivo(BDColores);
		System.out.println(BDColores[0]);
		//BDColores = pasarAMayúsculas(BDColores); // (4)
		
		
		//cantidadDeElementosDelArreglo(coloresDesdeArchivo());
				
		//cantidadDeColores = cantidadDeElementosDelArreglo(coloresDesdeArchivo());
		
		//System.out.println("El precio del trabajo de segunda calidad es: $" + segundaCalidad(cantidadDeColores) * precioBase +".-");
	}
}
