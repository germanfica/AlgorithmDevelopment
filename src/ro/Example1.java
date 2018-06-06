package ro;

import java.util.Scanner;

public class Example1 {
	
	public static void main(String[] args) {
		// Declaración de variables
		int auxiliar, número;
		boolean salir;
		
		// Inicialización de variables
		auxiliar = 0;
		número = 0;
		salir = false;
		
		// Creación e inicialiación del scanner
		Scanner scanner = new Scanner(System.in);
		
		// Repetitiva
		while(!salir) {
			// Verificar si el número ingresado es mayor que el auxiliar
			System.out.println("Ingrese un número: ");
			número = scanner.nextInt();
			
			if(número>auxiliar) {
				auxiliar = número;
			}
			
			System.out.println("¿Quiere terminar de ingresar números?");
			salir = scanner.nextBoolean();
		}
		
		System.out.println("El mayor de todos los números ingresados es: " + auxiliar);
	}
}
