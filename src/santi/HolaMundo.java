package santi;

import java.util.Scanner;

public class HolaMundo {
	// Cajita principal
	public static void main(String[] args) {
		// Mostrame un mensaje que diga hola mundo
		System.out.println("hola mundo");
		System.out.println("haceme la suma de 2+2: " + (2+2));
		System.out.println("haceme la multiplicacion de 2*3: " + (2*3));
		
		// Vamos a armar un calculadora para sumar
		
		// Declarar variable
		// Meter valores a una cajita
		int primerValor;
		int segundoValor;
		
		System.out.println("Ingrese el primer valor:");
		primerValor = new Scanner(System.in).nextInt();
		
		System.out.println("Ingrese el segundo valor:");
		segundoValor = new Scanner(System.in).nextInt();
		
		System.out.println("El resultado es: " + (primerValor+segundoValor));
	}
}
