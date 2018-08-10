package com.germanfica.ad._2018._2nd.tp1;

public class Ej7 {
	/*
	 * 7) Implementar un algoritmo para obtener:
	 * las raíces de ecuaciones de segundo grado ax2+bx+c=0
	 * 
	 * Si son raices reales entonces el algoritmo funciona
	 */
	public static String bhaskara(int a, int b, int c) {
		// Declaración de variables
		String raices;
		double x1, x2, loDeAdentroDeLaRaíz;
		
		// Inicialización de variables
		x1 = 0;
		x2 = 0;
		
		// Operación
		// -b +- al cuadrado(b al cuadrado-4ac)/2a
		loDeAdentroDeLaRaíz = (b*b)-(4*a*c);
		
		if(loDeAdentroDeLaRaíz>=0) {
			x1 = (-b+Math.sqrt(loDeAdentroDeLaRaíz))/2*a;
			x2 = (-b-Math.sqrt(loDeAdentroDeLaRaíz))/2*a;
			raices = "Las raices del polinomio son: " + "x1: " + x1 + " x2: " + x2;
		}else {
			raices = "El polinomio no tiene raices reales.";
		}
		
		return raices;
	}
	
	public static void main(String[] args) {
		System.out.println(bhaskara(20,70,60));
	}
}
