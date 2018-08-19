package xyz.germanfica.ad._2018._2nd.tp1.ej10;

public interface Formula {
	interface Cuadrado {
		double calcular(double lado);
	}
	
	interface Rectangulo {
		double calcular(double lado1, double lado2);
	}
	
	interface Triangulo {
		double calcular(double lado);
	}
	
	interface Circulo {
		double calcular(double radio);
	}
}
