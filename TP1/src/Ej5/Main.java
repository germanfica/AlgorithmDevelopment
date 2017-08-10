package Ej5;

import Utilities.TecladoIn;

/*
Implementar un algoritmo para obtener las raíces de ecuaciones de
segundo grado ax2+bx+c=0
 */

public class Main {
	public static void main(String[] args) {
		float a, b, c; // Variables de la ecuacion
		
		// Mostrar catel
		a = TecladoIn.readLineInt();
		b = TecladoIn.readLineInt();
		c = TecladoIn.readLineInt();
		
		Bhaskara(a,b,c);
		
		System.out.println();
	}
	
	public static void verificarComplejo(){
		// Si es un numero complejo retorna string
	}
	
	public static float[] Bhaskara(float a, float b, float c){
		float x1, x2;
		float raiz;
		float[] raices;
		
		raices = new float[2];
		
		raiz = (float) Math.sqrt(b*b-(4*a*c));
		
		// Optimización
		
		x1 = (float) (b*(-1) + raiz)/(2*a);
		x2 = (float) (b*(-1) - raiz)/(2*a);
		
		raices [0] = x1;
		raices [1] = x2;
	
		return raices;
	}
	
	
}
