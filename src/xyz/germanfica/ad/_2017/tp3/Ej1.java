package xyz.germanfica.ad._2017.tp3;

import java.util.Scanner;

import xyz.germanfica.util.Cartel;

/*
Diseñar un algoritmo que lea un arreglo de caracteres solicitando al usuario que ingrese letras. El
algoritmo debera verificar que los caracteres ingresados son letras. Luego:

	1. Diseñar un modulo:  mostrar los caracteres de las posiciones pares del arreglo de
	caracteres.
	
	2. Diseñar un modulo que muestre por pantalla los caracteres almacenados en el arreglo en orden
	inverso.
	
	3. Diseñar un modulo que cuente cuantas veces aparece un caracter dado.
 * */

public class Ej1 {
	private static Scanner sc;
	public static void mostrarPosicion(){
		
	}
	
	public static void mostrarMenu(){
		System.out.println("----- MENU -----");
		System.out.println("0- Para finalizar el programa.");
		System.out.println("1- Mostrar los caracteres de posiciones pares.");
		System.out.println("2- Mostrar los caracteres en orden inverso.");
		System.out.println("3- Mostrar la cantidad que x caracter se repite.");
	}
	
	public static void main(String[] args) {
		int limite = 10;
		int i = 0;
		char letra[]; // Variable donde se va a almacenar las letras ingreadas.
		
		letra = new char[limite];
		
		mostrarMenu();
		while(i<limite){
			sc = new Scanner(System.in);
			System.out.println("Ingrese caracter:");
			letra[i] = sc.next().charAt(0);
			
			if(i==i-1)
				Cartel.mostrarAdvertencia(0);
			if(letra[i] == '0')
				Cartel.mostrarAgradecimiento(0);
				i=limite;
		}
	}
}
