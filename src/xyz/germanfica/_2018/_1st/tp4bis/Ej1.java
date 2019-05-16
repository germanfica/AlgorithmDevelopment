package xyz.germanfica._2018._1st.tp4bis;

/*
 * 1. Determinar a través de trazas cual es el cálculo realizado por siguiente función:  
 * 
 * a) Escribir una función iterativa que cumpla la misma función y realizar
 * su traza correspondiente.
 * 
 * b) En el TP4 anterior, cuáles de los incisos utilizaban este tipo de
 * cálculo recursivo?
 * 
 * c) Si el caso base setea aux = 1, y el caso general en vez de sumar
 * multiplica, qué estaría calculando?
 * 
 * d) En qué puntos del TP4 anterior Ud. ve aplicado el tipo de cálculo propuesto en c)?
 * 
 * e) Qué nombre le daría al algoritmo recursivo propuesto en el código? Y en el punto c)? 
 */

public class Ej1 {
	
	public static int func (int n) {
		//Precondición: n siempre es un entero positivo.
		int aux;
		
		if (n==0) {
			aux = 0;
		} else {
			aux = n + func(n - 1);
		}
		
		return aux; 
	}
	
	public static void main(String[] args) {
		System.out.println(func(10));;
	}
}