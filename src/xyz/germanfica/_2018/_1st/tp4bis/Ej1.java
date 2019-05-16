package xyz.germanfica._2018._1st.tp4bis;

/*
 * 1. Determinar a trav�s de trazas cual es el c�lculo realizado por siguiente funci�n:  
 * 
 * a) Escribir una funci�n iterativa que cumpla la misma funci�n y realizar
 * su traza correspondiente.
 * 
 * b) En el TP4 anterior, cu�les de los incisos utilizaban este tipo de
 * c�lculo recursivo?
 * 
 * c) Si el caso base setea aux = 1, y el caso general en vez de sumar
 * multiplica, qu� estar�a calculando?
 * 
 * d) En qu� puntos del TP4 anterior Ud. ve aplicado el tipo de c�lculo propuesto en c)?
 * 
 * e) Qu� nombre le dar�a al algoritmo recursivo propuesto en el c�digo? Y en el punto c)? 
 */

public class Ej1 {
	
	public static int func (int n) {
		//Precondici�n: n siempre es un entero positivo.
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