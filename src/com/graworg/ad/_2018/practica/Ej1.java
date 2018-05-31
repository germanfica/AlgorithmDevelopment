package com.graworg.ad._2018.practica;

public class Ej1 {
	/*
	 * // La recursón podría recotarse cuando n/10=0 ó n=0
MÓDULO mostrarNúmeroTexto(Entero n)
	SI (n>0)
		t1← pasarATexto(n mod 10)
		ESCRIBIR(t1)
		mostrarNúmeroTexto(n/10)
	FIN SI
FIN MÓDULO mostrarNúmeroTexto
	 */
	
	/**
	 * Debería retornar esto una cadena(?)
	 * @param n
	 * @return
	 */
	private static String t1 = "";
	public static String paseANúmeroTexto(int n){
		
		if(n>0){
			t1 = pasarATexto(n%10);
			t1 = t1 + paseANúmeroTexto(n/10);
		}
		
		return t1;
	}
	
	public static void mostrarNúmeroTexto(int n){
		String t1;
		if(n>0){
			t1 = pasarATexto(n%10);
			System.out.println(t1);
			mostrarNúmeroTexto(n/10);
		}
	}
	
	/*
	 * pasarATexto(entero d)
// d es un dígito del 0 al 9
TEXTO nombreDelNúmero
SEGÚN d HACER
	CASO '0' nombreDelNúmero ← “cero”
	CASO '1': nombreDelNúmero← “uno”
	…
FIN SEGÚN
	 */
	public static String pasarATexto(int d){
		String nombreDelNúmero;
		
		switch(d){
			case 0:
				nombreDelNúmero = "cero";
				break;
			case 1:
				nombreDelNúmero = "uno";
				break;
			case 2:
				nombreDelNúmero = "dos";
				break;
			case 3:
				nombreDelNúmero = "tres";
				break;
			case 4:
				nombreDelNúmero = "cuatro";
				break;
			case 5:
				nombreDelNúmero = "cinco";
			case 6:
				nombreDelNúmero = "seis";
				break;
			case 7:
				nombreDelNúmero = "siete";
				break;
			case 8:
				nombreDelNúmero = "ocho";
				break;
			case 9:
				nombreDelNúmero = "nueve";
			default:
				nombreDelNúmero = "";
				break;
		}
		
		return nombreDelNúmero;
	}
	
	/*
	 * El mismo que el anterior
	 */
	public static void mostrarAlRevesNúmeroTexto(int n){
		String t1;
		if(n>0){
			t1 = pasarATexto(n%10);
			mostrarNúmeroTexto(n/10);
			System.out.println(t1); // GENIAAAAAAAAAL, muestra la desapilación
		}
	}
	/*
	 * EL mismo que el anterior pero 
	 */
	
	public static String paseAlRevesNúmeroTexto(int n){
		String t2 = ""; // No hay problema en ponerla acá
		if(n>0){
			t2 = pasarATexto(n%10);
			//mostrarNúmeroTexto(n/10);
			//t2 = t2 + ' ' + paseAlRevesNúmeroTexto(n/10);
			t2 = paseAlRevesNúmeroTexto(n/10) + t2 + ' ';
		}
		return t2;
	}
	
	public static void main(String[] args) {
		System.out.println("Bienvenido");
		//mostrarNúmeroTexto(112);
		System.out.println(paseANúmeroTexto(112));
		//mostrarAlRevesNúmeroTexto(112);
		System.out.println(paseAlRevesNúmeroTexto(112));
	}
}
