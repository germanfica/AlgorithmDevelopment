package com.gelopfalcon.lambda_expressions_example;

public class Test2 {
	interface Formula {
		double perimetro(double lado);
	}

	public static void main (String args[]) {
		// Block lambda
		
		Formula cuadrado = (lado) -> lado*lado;

		// Output
		System.out.println(cuadrado.perimetro(8)); 
	}
}
