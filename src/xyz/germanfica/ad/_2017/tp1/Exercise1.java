package xyz.germanfica.ad._2017.tp1;

import java.util.Scanner;

public class Exercise1 {
	private static Scanner sc;

	public static void main(String[] args) {
		/* Este algoritmo muestra por pantalla
		 * los valores previamente ingresados por el usuario
		 * pero transformados.
		 */
		int numero1;
		int numero2;

		sc = new Scanner(System.in);
		System.out.println();
		numero1 = sc.nextInt(); // Enter firt value
		numero2 = sc.nextInt(); // Enter second value

		numero1 = numero1 - numero2; // Restar el primer numero al segundo

		numero1 = numero1 + numero2; // Sumar el primer numero por el segundo numero

		numero1 = numero2 - numero1; // El primer n�mero es el segundo menos el primero

		System.out.println("Los valores de x e y son:");
		System.out.println(numero1);
		System.out.println(numero2);
	}
}
