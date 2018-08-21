package xyz.germanfica.ad._2017.tp1;

import java.util.Scanner;

/*
ALGORITMO misterio() RETORNA Ø
	(* Comentario... *)
	ENTERO x,y
	LEER(x)
	LEER(y)
	x <- x-y
	y <- x+y
	x <- y-x
	ESCRIBIR ("Los valores de x e y son")
	ESCRIBIR (x)
	ESCRIBIR (y)
FIN ALGORITMO misterio
 */

public class Ej1 {
	private static Scanner sc;

	public static void main(String[] args) {
		int numero1;
		int numero2;

		System.out.println();
		// Enter firt value
		numero1 = sc.nextInt();
		// Enter second value
		numero2 = sc.nextInt();

		// Restar el primer numero al segundo
		numero1 = numero1 - numero2;

		// Sumar el primer numero por el segundo numero
		numero1 = numero1 + numero2;

		// El primer numero es el segundo meno el prmero
		numero1 = numero2 - numero1;

		System.out.println("Los valores de x e y son:");
		System.out.println(numero1);
		System.out.println(numero2);
	}
}
