package com.graworg.ad._2018.practica;

public class Ej2 {
	/*
	 * Contar la cantida de dígitos cero que un número entero n
	 * 
	 * Ejemplo: 2030 tiene 2 ceros
	 * 
	 * Si n tiene dos o más digitos
	 *  . la cantida de ceros es la cantidad de ceros en n son el último dígito removido (planteo recursivo)
	 *  . más un 1 adicional si el último dígito es cero
	 *  
	 *  Ejemplo:
	 *   . cantidad de ceros en 20030 es -> cantidad de ceros en 2003 más 1
	 *   . cantidad de ceros en 20035 es -> cantidad de ceros en 2003
	 */
	
	public static int cantidadDigitos(int n){
		int cant = 0;
		
		if(n>0){
			if(n%10==0){
				cant = cantidadDigitos(n/10) + 1;
			}else{
				cant = cantidadDigitos(n/10);
			}
		}
		
		return cant;
	}
	
	
	public static void mostrarNúmeroTexto(int n){
		String t1;
		if(n>0){
			//t1 = pasarATexto(n%10);
			//System.out.println(t1);
			mostrarNúmeroTexto(n/10);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(cantidadDigitos(2030));
	}
}
