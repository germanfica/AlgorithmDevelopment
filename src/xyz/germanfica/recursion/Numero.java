package xyz.germanfica.recursion;

public class Numero {
	/**
	 * Devuelve el número anterior
	 * @param n
	 * @return
	 */
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
}
