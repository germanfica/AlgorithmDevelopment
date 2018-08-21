package xyz.germanfica.ad._2017.tp1;

import java.util.Scanner;

/*
 * Implement an algorithm to obtain roots of second-degree equations, like:
 * ax2+bx+c=0
 */

public class Exercise5 {
	private static Scanner sc;

	public static void main(String[] args) {
		float a, b, c; // Equation variables
		sc = new Scanner(System.in);
		
		// Show message
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
		
		// Check negative root
		if(contenidoRaiz < 0){
			
		}else{
			raiz = (float) Math.sqrt(contenidoRaiz);
		}
		
		// Optimization
		
		x1 = (float) (b*(-1) + raiz)/(2*a);
		x2 = (float) (b*(-1) - raiz)/(2*a);
		
		raices [0] = x1;
		raices [1] = x2;
	
		return raices;
	}
}
