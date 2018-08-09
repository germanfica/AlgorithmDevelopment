package com.germanfica.ad._2018._2nd.tp1repaso;

import java.util.Scanner;

/*
 * ALGORITMO misterio() RETORNA Ø
 * (* Este algoritmo ... *)
 * ENTERO x,y,z,a,b,c
 * LEER(x)
 * LEER(y)
 * LEER(a)
 * LEER(b)
 * z ← x*x+y*y
 * c ← a*a+b*b
 * ESCRIBIR ("El valor de z es")
 * ESCRIBIR (z)
 * ESCRIBIR ("El valor de c es")
 * ESCRIBIR (c)
 * FIN ALGORITMO misterio
 */
public class Ej2 {
	private static Scanner sc;
	/*
	 * Se me ocurre generar un módulo que se llame sumaDePotenciaDeSiMisma
	 * para evitar repetir la operación x*x+y*y
	 */
	public static void main(String[] args) {
		int x,y,z,a,b,c;
		
		// Creación del Scanner
		sc = new Scanner(System.in);
		
		x = sc.nextInt();
		y = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		z = x*x+y*y;
		c = a*a+b*b;
		System.out.println("El valor de z es");
		System.out.println(z);
		System.out.println("El valor de c es");
		System.out.println(c);
	}
}
