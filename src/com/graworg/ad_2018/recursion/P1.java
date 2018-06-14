package com.graworg.ad_2018.recursion;

public class P1 {
	/**
	 * Invertir un número dado recursivamente
	 */
	public static int númeroInverso(int num, int n) {
		int aux;
		
		if(num==0) {
			aux = n;
		}else {
			aux = númeroInverso(num/10, num%10 + n*10);
		}
		
		return aux;
	}
	
	public static void main(String[] args) {
		System.out.println("Bienvenido al programa");
		System.out.println(númeroInverso(921, 0)); // Debería mostrar 129);
	}
}
