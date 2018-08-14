package com.germanfica.ad._2018._2nd.recursividad;

public class Test1 {
	// Dibujar el problema, organizar las ideas en una hoja de papel
	/*
	 * Si sum(m,0)=m y m=5 entonces 
	 * 
	 * tengo que calcular el sucesor de la suma
	 */
	public static int sum(int m,int n) {
		return m+n;
	}
	
	public static int anterior(int n) {
		int aux;
		if(n<=0) {
			aux = 0;
		}else {
			System.out.println(n);
			aux = anterior(n-1);
		}
		return aux;
	}
	
	public static int suc(int m, int n) {
		int sucesor;
		if(n==0) {
			sucesor=m;
		}else {
			System.out.println(n);
			sucesor = suc(m, sum(m,n)-1);
		}
		return sucesor;
	}
	
	public static void main(String[] args) {
		int m = 5;
		int n = 4;
		//anterior(5);
		suc(m,n);
		//System.out.println(suc(m, sum(m,n-1)));
	}
}
