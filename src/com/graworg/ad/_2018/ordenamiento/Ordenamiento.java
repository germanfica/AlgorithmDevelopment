package com.graworg.ad._2018.ordenamiento;

/*
 * Exacto. Verificado. Cuando se manda por parámetro a un arreglo,
 * se está modificando el arreglo que está en memoria. Es decir,
 * no crea un nuevo arreglo, sino que modifica el que está en memoria. :D
 * 
 * Y además,
 * los métodos de ordenamiento que estamos implementando no son recursivos.(;
 */
public class Ordenamiento {
	
	public static void burbuja(int[] arreglo, int n){
		int auxiliar;
		
		for(int i=0; i<= n-1;i++) {
			for(int j=0; j<= (n-i-2);j++) {
				if(arreglo[j] > arreglo[j+1]) {
					auxiliar = arreglo[j];
					arreglo[j] = arreglo[j+1];
					arreglo[j+1] = auxiliar;
				}
			}
		}
	}
	
	public static void burbujaMejorado(int[] arreglo, int n) {
		int auxiliar, i;
		boolean ordenado;
		
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
	
	public static void insercion(int[] arreglo, int n) {
		int auxiliar, j;
		
		for(int i=1;i<=n-1;i++) {
			j = i;
			auxiliar = arreglo[j];
			
			while(j>0 && arreglo[j-1]>auxiliar) {
				arreglo[j] = arreglo[j-1];
				j--;
			}
			arreglo[j] = auxiliar;
		}
	}
	
	public static void seleccion(int[] arreglo, int n) {
		int i, j, iMin, auxiliar;
		
		for(i=0;i<=n-2;i++) {
			iMin = i;
			for(j=i+1;j<=n-1;j++) {
				if(arreglo[j]<arreglo[iMin]) {
					iMin = j;
					auxiliar = arreglo[i];
					arreglo[i] = arreglo[iMin];
					arreglo[iMin] = auxiliar;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Menu.mostrar();
	}
}
