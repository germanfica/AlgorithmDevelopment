package tp1_2017;

import util.TecladoIn;

/*
 * Implement an algorithm to obtain roots of second-degree equations, like:
 * ax2+bx+c=0
 */

public class Exercise5 {
	public static void main(String[] args) {
		float a, b, c; // Equation variables
		
		// Show message
		a = TecladoIn.readLineInt();
		b = TecladoIn.readLineInt();
		c = TecladoIn.readLineInt();
		
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
