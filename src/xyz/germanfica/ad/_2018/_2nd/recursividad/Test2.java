package xyz.germanfica.ad._2018._2nd.recursividad;

public class Test2 {
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
