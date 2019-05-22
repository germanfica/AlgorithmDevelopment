package xyz.germanfica._2019._1st.recursion;

public class Ej1 {
	public static void main(String[] args) {
		// averiguar que hace mistery
		String numero;
		numero = "123456789";
		int j;
		j = numero.length() - 1;
		mistery(j, numero);
	}

	public static void mistery(int p, String a) {
		if (p > 0) {
			System.out.println(a.charAt(p));
			mistery(p - 1, a);
		}
	}
}
