package xyz.germanfica.util;

/**
 * Copyright 2018 German Fica
 * 
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge,
 * publish, distribute, sublicense, and/or sell copies of the Software,
 * and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 * @author German Fica
 */
public class NumeroReal {
	/**
	 * Calcula bhaskara de un polinomio dado
	 * 
	 * @param a indeterminada de grado 2
	 * @param b indeterminada de grado 1
	 * @param c termino independiente
	 * @return devuelve las raices reales de un polinomio real
	 */
	public static float[] bhaskara(float a, float b, float c) {
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
	
	public static double promedio(double sumatoria, double cantidad){
		return sumatoria/cantidad;
	}
}
