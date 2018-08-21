package xyz.germanfica.ad._2018.parcial;

public class Ej1 {
	/**
	 * Determina si un algoritmo es decreciente solo si
	 * el arreglo ingresado está ordenado y tiene números
	 * sin repetir.
	 * 
	 * @param a arreglo de enteros
	 * @param n longitud del arreglo
	 * @return
	 */
	public static boolean esDecreciente(int[] a, int n) {
		boolean aux;
		
		if(n==0) {
			if(a[n+1]<a[n]) {
				aux = true;
			}else {
				aux = false;
			}
		}else {
			aux = esDecreciente(a, n-1);
		}
		
		return aux;
	}
	
	public static void main(String[] args) {
		int[] a = {4,3,2,1};
		int[] b = {1,2,3,4};
				
		System.out.println("Es decreciente el arreglo a? " + esDecreciente(a, a.length-1));
		System.out.println("Es decreciente el arreglo b? " + esDecreciente(b, b.length-1));
	}
}