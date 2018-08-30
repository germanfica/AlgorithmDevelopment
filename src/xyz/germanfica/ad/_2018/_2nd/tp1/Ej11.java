package xyz.germanfica.ad._2018._2nd.tp1;

import java.util.Scanner;

import xyz.germanfica.mensaje.Mensaje;

/*
 * 11) Diseñe un algoritmo que dado un número N entre 1 y 9, permita generar triangulos
 * como los indicados en cada inciso.
 * 
 * a) N = 4
 * 1
 * 22
 * 333
 * 4444
 * 
 * b) N=4
 *    A
 *   AB
 *  ABC
 * ABCD
 * 
 * c) N = 5
 * 1 3 5 7 9
 *  1 3 5 7
 *   1 3 5
 *    1 3
 *     1
 *
 * d) N=5
 * 5 4 3 2 1
 *  4 3 2 1
 *   3 2 1
 *    2 1
 *     1
 */
public class Ej11 {
	private static Scanner sc;
	
	public static int leerEntero() {
		int n = 0;
		sc = new Scanner(System.in);
		System.out.println("Escriba un número debe ser del 1 al 9:");
		n = sc.nextInt();
		while (n>9 || n<1) {
			System.err.println("El número debe ser del 1 al 9.");
			n = sc.nextInt();
		}
		return n;
	}
	
	public static boolean esPar(int num) {
		return num%2==0;
	}
	
	/*
	 * d) N=5
	 * 5 4 3 2 1
	 *  4 3 2 1
	 *   3 2 1
	 *    2 1
	 *     1
	 */
	public static void mostrarTrianguloD(int n) {
		int num = n, aux = 0;
		for (int i = 0; i <= n-1; i++) {
			for (int j2 = 0; j2 < i; j2++) {
				System.out.print(" ");
			}
			for (int j = n-1; j >= i; j--) {
				System.out.print(num);
				if(j>i) {
					System.out.print(" ");
				}
				aux++;
				num--;
			}
			num = aux-1;
			aux = 0;
			System.out.println();
		}
	}
	
	/*
	 * c) N = 5
	 * 1 3 5 7 9
	 *  1 3 5 7
	 *   1 3 5
	 *    1 3
	 *     1
	 */
	public static void mostrarTrianguloC(int n) {
		int num = 0;
		for (int i = 0; i <= n-1; i++) {
			num = 0;
			for (int j2 = 0; j2 < i; j2++) {
				System.out.print(" ");
			}
			for (int j = n-1; j >= i; j--) {
				if(esPar(num)) {
					num++;
				}
				System.out.print(num);
				if(j>i) {
					System.out.print(" ");
				}
				num++;
			}
			System.out.println();
		}
	}
	
	/*
	 * b) N=4
	 *    A
	 *   AB
	 *  ABC
	 * ABCD
	 */
	public static void mostrarTrianguloB(int n) {
		int caracter = 65;
		String letra;
		for (int i = 0; i <= n-1; i++) {
			caracter = 65;
			for (int j2 = 0; j2 < n-i-1; j2++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				letra = Character.toString((char)caracter);
				System.out.print(letra);
				caracter++;
			}
			System.out.println();
		}
	}
	
	/*
	 * a) N = 4
	 * 1
	 * 22
	 * 333
	 * 4444
	 */
	public static void mostrarTrianguloA(int n) {
		for (int i = 0; i <= n-1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
	}
	
	public static void mostrarMenú() {
		boolean salir;
		int opcion;
		
		// Inicializar variables
		salir = false;
		
		System.out.println(Mensaje.leer(0));		
		while(!salir) {
			sc = new Scanner(System.in);
			
			// Mostrar cartel de opciones
			System.out.print(
					"[0] Salir (IMPLEMENTADO)\n" +
					"[1] Generar el triangulo A\n" +
					"[2] Generar el triangulo B\n" +
					"[3] Generar el triangulo C\n" +
					"[4] Generar el triangulo D\n"
					);
			
			// Leer opcion del menú principal
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 0:
				salir = true;
				break;
			case 1:
				mostrarTrianguloA(leerEntero());
				break;
			case 2:
				mostrarTrianguloB(leerEntero());
				break;
			case 3:
				mostrarTrianguloC(leerEntero());
				break;
			case 4:
				mostrarTrianguloD(leerEntero());
				break;
			default:
				System.err.println("Esta opcion no esta definida. Seleccione una de las siguientes opciones: ");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		mostrarMenú();
	}
}
