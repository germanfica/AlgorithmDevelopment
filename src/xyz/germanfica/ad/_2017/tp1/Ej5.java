package xyz.germanfica.ad._2017.tp1;

import java.util.Scanner;

/*
	Implementar un algoritmo para obtener las raices de ecuaciones
	de segundo grado ax2+bx+c=0
 */

public class Ej5 {
	private static Scanner sc;

	public static void main(String[] args) {
		float a, b, c; // Variables de la ecuacion
		sc = new Scanner(System.in);
		// Mostrar catel
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		Bhaskara(a,b,c);
		
		System.out.println();
	}
	
	public static void mostrarRaices(float a, float b, float c){
		
	}
	
	public static float[] Bhaskara(float a, float b, float c){
		float x1, x2;
		float raiz = 0;
		float contenidoRaiz;
		float[] raices;
		
		raices = new float[2];
		contenidoRaiz = b*b-(4*a*c);
		
		// Verificar si es raiz negativa
		if(contenidoRaiz < 0){
			
		}else{
			raiz = (float) Math.sqrt(contenidoRaiz);
		}
		
		// Optimizacion
		
		x1 = (float) (b*(-1) + raiz)/(2*a);
		x2 = (float) (b*(-1) - raiz)/(2*a);
		
		raices [0] = x1;
		raices [1] = x2;
	
		return raices;
	}
}
