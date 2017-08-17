package tp3;

import utilidades.Mensajes;
import utilidades.TecladoIn;

/*
Diseñar un algoritmo que lea un arreglo de caracteres solicitando al usuario que ingrese letras. El
algoritmo deberá verificar que los caracteres ingresados son letras. Luego:

	1. Diseñar un módulo que muestre por pantalla los caracteres de las posiciones pares del arreglo de
	caracteres.
	
	2. Diseñar un módulo que muestre por pantalla los caracteres almacenados en el arreglo en orden
	inverso.
	
	3. Diseñar un módulo que cuente cuantas veces aparece un carácter dado.
 * */

public class Ej1 {
	
	public static void mostrarPosicion(){
		
	}
	
	public static void mostrarMenu(){
		System.out.println("----- MENU -----");
		System.out.println("0- Para finalizar el programa.");
		System.out.println("1- Mostrar posición.");
		System.out.println("2- Mostrar carácteres ingresados en orden inverso.");
		System.out.println("3- Mostrar cantidad de x carácter.");
	}
	
	public static void main(String[] args) {
		int limite = 10;
		int i = 0;
		char letra[]; // Variable donde se va a almacenar las letras ingreadas.
		
		letra = new char[limite];
		
		mostrarMenu();
		while(i<limite){
			System.out.println("Ingrese letras:");
			letra[i] = TecladoIn.readNonwhiteChar();
			
			if(i==i-1)
				Mensajes.mostrarAdvertencia(0);
			if(letra[i] == '0')
				Mensajes.mostrarAgradecimiento(0);
				i=limite;
		}
	}
}
