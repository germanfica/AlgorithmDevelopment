package com.germanfica.ad._2018._2nd.tp1repaso;

import java.util.Scanner;

import com.germanfica.ad.util.Mensaje;

public class Ej6 {
	/*
	 * 6) Diseñar un algoritmo que permita leer un número
	 * del 1 al 7 y muestre un cartel con el nombre del día
	 * de la semana al que corresponde.
	 * 
	 * (ej. 1- lunes, 2-martes,...,7-domingo) 
	 */
	private static Scanner sc;
	
	public static void main(String[] args) {
		// Declaración de variables
		int num;
		
		// Inicialización de variables
		num = 0;
		
		// Crear Scanner
		sc = new Scanner(System.in);
		
		// Mostrar mensaje de bienvenida
		System.out.println(Mensaje.leer().get(0));
		
		System.out.println("Eliga un número del 1 al 7: ");
		num = sc.nextInt();
		
		if(num<=7) {
			for(int i = 1;i<=num;i++) {
				switch (i) {
					case 1:
						System.out.println("1- lunes");
						break;
					case 2:
						System.out.println("2- martes");
						break;
					case 3:
						System.out.println("3- miércoles");
						break;
					case 4:
						System.out.println("4- jueves");
						break;
					case 5:
						System.out.println("5- viernes");
						break;
					case 6:
						System.out.println("6- sábado");
						break;
					case 7:
						System.out.println("7- domingo");
						break;
					default:
						break;
				}
			}
		}else {
			System.out.println("Debe elegeir un número del 1 al 7.");
		}
	}
}
