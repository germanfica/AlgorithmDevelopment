package xyz.germanfica.ad._2018._1st.tp1;

import java.util.Scanner;

public class Ej2 {
	/*
	 * 1- Dada una matriz de n filas y 2 columnas correspondientes a apellido, nombre del estudiante, y direccion de email.
	 * 
	 * Implementar en java un método que retorne un arreglo de n strings formados con el apellido
	 * (la/s palabra/s antes de la "," de la primer columna de cada fila ) seguida de un espacio,
	 * seguida de la direccion de email, (solo para los estudiantes que tiene direccion en la fi.,
	 * que la última parte se "@fi.uncoma.edu.ar", caso contrario, que no tenga direccion.
	 * 
	 * Consejo para el parcial: para el parcial al usar arreglos solo utilizarlo con los tipos
	 * primitivos de java, ya que lleva tiempo y solo se evalua arreglos.
	 * 
	 * Nota: Solamente puede utilizar los siguientes métodos en Java:
	 *  - charAt(pos) <- devuelve la letra correspondiente a la posicion.
	 *  - substring(pos) <- devuelve un String formado desde la posicion pos hasta el final
	 *  - indexOf(otroString) <- Retorna la posicion de la primer ocurrencia de otroString dentro del String llamador
	 *  - compareTo(otroString) <- Compara el string llamador con otroString Si el objeto llamador es menor que
	 *  - otroString devuelve un valor negativo, si son iguales devuelve 0 y si no devuelve un número positivo.
	 */
	static Scanner sc;
	
	/**
	 * Retorna un arreglo de n strings formados con el apellido (la/s palabra/s antes de la ","
	 * de la primer columna de cada fila ) seguida de un espacio, seguida de la direccion de
	 * email, (solo para los estudiantes que tiene direccion en la fi., que la última parte se
	 * "@fi.uncoma.edu.ar", caso contrario, que no tenga direccion.
	 * @param matriz
	 * @return
	 */
	public static String[] regla(String[][] matriz){
		String[] arreglo = new String[matriz.length];
		
		for(int i = 0; i <= matriz.length -1 ;i++) {
			for(int j = 0; j <= matriz[0].length -1 ; j++) {
				boolean agregado;
				int charIndex;
				String nombre, mail;
				
				nombre = matriz[i][j];
				mail = matriz[i][j];
				charIndex = 0;
				agregado = false;
				
				while(charIndex<=nombre.length()-1 && !agregado) {
					if(nombre.charAt(charIndex)==',') {
						System.out.println(charIndex);
						arreglo[i] = nombre.substring(0, charIndex);
						//texto = texto + nombre.substring(0, charIndex);
						agregado = true;
					}
					
					if(mail.indexOf("@fi.uncoma.edu.ar") != -1) {
						arreglo[i] = arreglo[i] + " " + mail;
						//texto = texto + " " + mail;
						agregado = true;
					}
					
					charIndex = charIndex + 1;
				}
			}
		}
		
		return arreglo;
	}
	
	/**
	 * Mostrar todos los elementos de un arreglo de String
	 * @param arreglo
	 */
	public static void mostrarLosElementosDelArreglo(String[] arreglo) {
		for(int i = 0; i <= arreglo.length-1 ;i++) {
			System.out.println(arreglo[i]);
		}
	}
	
	/**
	 * Cargar de elementos a una matriz de String
	 * @param cantidadDeFilas
	 * @return
	 */
	public static String[][] cargaDeElementos(int cantidadDeFilas) {
		String [][] matriz = new String[cantidadDeFilas][2];
		String nombre, mail;
		
		for(int i = 0; i <= cantidadDeFilas -1 ;i++) {
			// Leer nombre
			System.out.println("Ingrese nombre:");
			sc = new Scanner(System.in);
			nombre = sc.next();
			matriz[i][0] = nombre;
			
			// Leer mail
			System.out.println("Ingrese mail:");
			sc = new Scanner(System.in);
			mail = sc.next();	
			matriz[i][1] = mail;
		}
		
		return matriz;
	}
	
	/*
	 * Para no crear el modulo mostrarMenú en el parcial:
	 * 
	 * Aclarar con un comentario:
	 *  - No hice el modulo mostrarMenú ni un algoritmo principal ya que
	 *  se supone que los parametros recibidos por cada modulo que resuelven la 
	 *  el algoritmo son evíados desde el algoritmo principal.
	 */
	
	
	/**
	 * Mostrar menú de opciones
	 * @param cantidadDeFilas
	 */
	public static void mostrarMenú(int cantidadDeFilas) {
		String[][] matriz;
		boolean salir;
		int opcion;
		
		// Inicializar variables
		salir = false;
		
		// Crear y cargar la matriz
		matriz = cargaDeElementos(cantidadDeFilas);
		
		System.out.println("Bienvenido a la consola de la aplicacion");
		
		while(!salir)
		{
			sc = new Scanner(System.in);
			
			// Mostrar cartel de opciones
			System.out.print(
					"[0] Salir\n" +
					"[1] Ejecutar la regla\n"
					);
			
			// Leer opcion del menú principal
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 0:
				salir = true;
				System.err.println("Aplicacion cerrada.");
				break;
			case 1:
				mostrarLosElementosDelArreglo(regla(matriz));
				break;
			default:
				System.err.println("Esta opcion no esta definida. Seleccione una de las siguientes opciones: ");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		int cantidadDeFilas;
		
		// Leer la cantidad de filas
		System.out.println("Ingrese la cantidad de estudiantes:");
		sc = new Scanner(System.in);
		cantidadDeFilas = sc.nextInt();
		
		mostrarMenú(cantidadDeFilas);
		
	}
}
