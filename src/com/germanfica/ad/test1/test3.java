package com.germanfica.ad.test1;

public class test3 {
	/*
	 * Determinar la cantidad de divisores enteros de un número entero.
	 */
	public static int divisoresEnteros(int número)
	{
		int índice, resultado;
		
		resultado = 0; // Inicializar entero
				
		// Determinar divisores
		for(índice = número; índice>1;índice--)
		{
			if(número%índice==0)
			{
				resultado = resultado + 1;
			}
		}
		
		return resultado;
	}
	
	public static int[] cargarPrimos(int n) 
	{
		int índice, primosEncontrados;
		int[] primo, resultado;
		
		primosEncontrados = 0; // Inicializar entero
		primo = new int[n]; // Inicializar arreglo
		
		// Buscar posible primo
		for(índice = 2; índice<=primo.length;índice++) {	
			if(divisoresEnteros(índice) == 1) {
				primosEncontrados = primosEncontrados + 1;
				primo[primosEncontrados-1] = índice;
			}
		}
		
		// Crear nuevo arreglo con la cantidad correcta de número primos.
		resultado = new int[primosEncontrados];
		for(índice = 0; índice < resultado.length; índice++) {
			resultado[índice] = primo[índice];
		}
		
		return resultado;
	}
	
	public static void main(String[] args) {
		System.out.println("Bienvenido");
		int[] p;
		p = cargarPrimos(2);
		
		System.out.println("Primos encotrados: " + p.length);
		
		if(p.length!=0)
		{
			for(int i = 0; i<p.length;i++)
			{
				System.out.println("Elemento "+i+": " + p[i]);
			}
		}
	}
}
