package com.graworg.ad._2018.ordenamiento;

public class Ordenamiento {
	
	public static int[] burbuja(int[] arreglo){
		int auxiliar, n;
		
		n = arreglo.length;
		
		for(int i=0; i<= n-1;i++) {
			for(int j=0; j<= (n-i-2);j++) {
				if(arreglo[j] > arreglo[j+1]) {
					auxiliar = arreglo[j];
					arreglo[j] = arreglo[j+1];
					arreglo[j+1] = auxiliar;
				}
			}
		}
		
		return arreglo;
	}
	
	public static void burbujaMejorado(int[] arreglo) {
		int auxiliar, n, i;
		boolean ordenado;
		
		n = arreglo.length;
		ordenado = false;
		i = 0;
		
		while(i<=n-1 && ordenado==false) {
			ordenado = true;
			
			for(int j=0;j<=(n-i-2);j++) {
				if(arreglo[j]>arreglo[j+1]) {
					ordenado = false;
					auxiliar = arreglo[j];
					arreglo[j] = arreglo[j+1];
					arreglo[j+1] = auxiliar;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Menu.mostrar();
	}
}
