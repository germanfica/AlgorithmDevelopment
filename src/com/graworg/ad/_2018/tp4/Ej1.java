package com.graworg.ad._2018.tp4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.graworg.ad.util.Archivo;

public class Ej1 {
    private static final String NOMBRE_ARCHIVO = "src/com/graworg/ad/_2018/tp4/Colores.txt"; // Ruta del archivo
	private static int tamArrgelo = 20;
	
	/**
     * Convierte un arreglo a texto plano.
     * 
     * @param clientes
     * @return
     */
	public static String coloresToString(String[] BDColores) {
		String textoPlano = "";

		for (int i =0; i<=BDColores.length-1; i++){	
			if(i==0) {
				textoPlano = textoPlano + BDColores[i];
			}else {
				textoPlano = textoPlano + ", " + BDColores[i];
			}
		}
		
		return textoPlano;
	}
	
	/**
	 * (1) Retorna la sumatoria de un número dado.
	 * 
	 * @see Dada la cantidad de colores usados, determina el factor resultante de sumar
	 * los códigos de orden. Este trabajo de impresión se define como de 2da calidad.
	 * @param n
	 * @return
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
	
	/**
	 * (2) Retorna el factorial de un número dado.
	 * 
	 * @see Para ciertos trabajos que requieren una calidad de impresion muy superior, se
	 * utiliza un factor distinto, resultante de calcular el factorial de la cantidad
	 * de colores usados. Calcule el factor para esta calidad de trabajo. Este trabajo
	 * de impresión se define como de 1ra calidad.
	 * @param n
	 * @return
	 */
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
	 * (3) Carga a un arreglo de String todos los colores de un archivo determinado.
	 * 
	 * @see Ahora suponga que los colores usados son provistos en un archivo de texto.
	 * Realice la carga de un arreglo de Strings a partir del archivo y muestre el color
	 * con los códigos numéricos asociados a cada uno.
	 * @return
	 */
	public static String[] leerArchivo() {
		String[] colores = new String[tamArrgelo]; // Creación del arreglo
 		int i = 0;
		
    	try {
    		BufferedReader buff = new BufferedReader(new FileReader(NOMBRE_ARCHIVO)); // Obtener los datos que están en el archivo de texto
    		Scanner sc;
    		sc = new Scanner(buff); // Le asigno al scanner la tarea para buscar los colores dentro del archivo de texto
    		
    		
    		sc.useDelimiter("\\s*,\\s*"); // Me clasifica los colores cuando encuntra la coma
    		
    		// Objetivo: es almacenar los colores uno por uno
    		while(sc.hasNext()) {
    			colores[i] = sc.next();
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
	
	/**
	 * (4) Convierte en mayúscula los colores que están en minúscula de un arrreglo.
	 * 
	 * @see Todos los colores usados y recuperados del archivo de texto están en
	 * minúscula. Lo mejor es guardarlos en mayúscula, entonces antes de cargar el
	 * arreglo deben ser convertidos. Realizar un algoritmo que convierta en mayúscula
	 * el color dado en minúscula. Probarlo en el algoritmo hecho en 3.
	 * @param args
	 */
	public static String[] pasarArregloAMayúsculas(String[] BDColores) {
		for(int i = 0; i <= (BDColores.length)-1; i++) {
			BDColores[i] = BDColores[i].toUpperCase();
		}
		
		return BDColores;
	}
	
	public static void main(String[] args) {
		// Declaración de variables
		String[] BDColores; // Arreglo de los colores
		int precioBase = 100; // $100.-
		
		BDColores = pasarArregloAMayúsculas(leerArchivo()); // (4)
		Archivo.guardar(coloresToString(BDColores), NOMBRE_ARCHIVO); // Guardar los cambios
		
		
		//cantidadDeElementosDelArreglo(coloresDesdeArchivo());
				
		//cantidadDeColores = cantidadDeElementosDelArreglo(coloresDesdeArchivo());
		
		//System.out.println("El precio del trabajo de segunda calidad es: $" + segundaCalidad(cantidadDeColores) * precioBase +".-");
	}
}
