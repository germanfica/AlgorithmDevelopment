package xyz.germanfica.matematicas;

public class Polinomio {
	/**
	 * Calcula bhaskara 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static float[] bhaskara(float a, float b, float c){
		float x1, x2;
		float raiz = 0;
		float discriminante;
		float[] raices;
		
		raices = new float[2];
		discriminante = b*b-(4*a*c);
		
		// Verificar si es raiz negativa
		if(discriminante < 0){
			
		}else{
			raiz = (float) Math.sqrt(discriminante);
		}
		
		// Optimizacion
		
		x1 = (float) (b*(-1) + raiz)/(2*a);
		x2 = (float) (b*(-1) - raiz)/(2*a);
		
		raices [0] = x1;
		raices [1] = x2;
	
		return raices;
	}
}
