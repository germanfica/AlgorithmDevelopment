package com.graworg.ad._2017.tp1;

import com.graworg.ad.util.TecladoIn;

/*
Dise�ar un algoritmo que permita leer N n�meros enteros y muestre el
promedio de los mismos.

Implementar en Java y comprobar la soluci�n mediante una traza.
 */

public class Ej3 {
	
	public static void main(String[] args) {
		int cantidad; // Cantidad de numeros
		
		System.out.println();
		cantidad = TecladoIn.readLineInt();
		System.out.println(Promedio(cantidad));
	}
	
	public static int Promedio(int cantidad){
		int promedio = 0;
		int numero;
		
		for(int i=1; i<=cantidad; i++){
			numero = TecladoIn.readLineInt();
			promedio = promedio + numero;
		}
		
		return promedio/cantidad;
	}
}
