package xyz.germanfica.ad._2017.tp1;

import java.util.Scanner;

/*
Dise�ar un algoritmo que permita leer N n�meros enteros y muestre el
promedio de los mismos.

Implementar en Java y comprobar la soluci�n mediante una traza.
 */

public class Ej3 {
	private static Scanner sc;
	
	public static void main(String[] args) {
		int cantidad; // Cantidad de numeros
		
		System.out.println();
		cantidad = sc.nextInt();
		System.out.println(Promedio(cantidad));
	}
	
	public static int Promedio(int cantidad){
		int promedio = 0;
		int numero;
		
		for(int i=1; i<=cantidad; i++){
			numero = sc.nextInt();
			promedio = promedio + numero;
		}
		
		return promedio/cantidad;
	}
}
