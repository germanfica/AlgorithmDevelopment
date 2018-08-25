package xyz.germanfica.recursion;

public class ETC {
	/*
	 * De la definicion recursiva de la suma de dos números enteros no negativos
	 * n y m. Utilice la funcion sucesor de un número.
	 */
	public static int sum(int m,int n) {
		int aux;
		if(n==0) {
			aux = 5;
			System.out.println(aux);
		}else {
			aux = suc(sum(m,n-1));
			System.out.println(aux);
		}
		return aux;
	}
	
	public static int suc(int k) {
		return k+1;
	}
	
	public static void main(String[] args) {
		int m = 5;
		int n = 4;
		sum(m,n);
	}
}
