package xyz.germanfica._2019.preparacionfinal;

public class Bombas {

	public static void explotar(int n, int b) {
		int n1 = (n / b), n2 = n - n1;

		if (b < n) {
			explotar(n1, b);
			explotar(n2, b);
		} else {
			System.out.print(n);
		}
	}

	public static void main(String[] args) {
		explotar(15, 3);
	}
}
