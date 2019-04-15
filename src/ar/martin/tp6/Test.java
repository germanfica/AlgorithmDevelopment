package ar.martin.tp6;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int codigo;
		String descripcion;
		int stock;
		String nombre;
		double costo;
		double importe;
		System.out.println("ingrese codigo");
		codigo = new Scanner(System.in).nextInt();
		
		System.out.println("ingrese descripcion");
		descripcion = new Scanner(System.in).next();
		
		System.out.println("ingrese stock");
		stock = new Scanner(System.in).nextInt();
		
		System.out.println("ingrese nombre");
		descripcion = new Scanner(System.in).next();
		
		System.out.println("ingrese costo");
		costo = new Scanner(System.in).nextDouble();
		
		System.out.println("ingrese importe");
		importe = new Scanner(System.in).nextDouble();
		
	}
}
