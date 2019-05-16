package xyz.germanfica._2018._2nd.tp7;

import java.util.Scanner;

public class Ej2 {
	private static Scanner sc;
	public static int digito(int n) {
		int cantDig = 1;
		
		if(n<=9 && n>0) {
			cantDig = 1;
		}else {
			cantDig = cantDig + digito(n/10);
		}
		
		return cantDig;
	}
	
	public static void main(String[] args) {
		System.out.println("Ingrese la cantidad de dígitos:");
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("La cantidad de dígitos del número " + n + " es: " + digito(n));
	}
}
