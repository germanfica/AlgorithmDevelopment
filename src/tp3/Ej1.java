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
	
	public static void leerArreglo(){
		
	}
	
	public static void main(String[] args) {
		int limite = 10;
		int i = 0;
		char letra[]; // Variable donde se va a almacenar las letras ingreadas.
		
		letra = new char[limite];
		
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
