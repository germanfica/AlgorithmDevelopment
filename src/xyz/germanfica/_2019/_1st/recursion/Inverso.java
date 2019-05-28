package xyz.germanfica._2019._1st.recursion;

public class Inverso {
	private static int vuelta2(int num, int m) {
		int res;
		// System.out.println(m * 10 + num % 10);

		if (num > 0) {
			res = vuelta2(num / 10, m * 10 + num % 10);
		} else {
			res = m;
		}
		// System.out.println(m * 10 + num % 10);

		return res;
	}

	/*
	 * 5738 -> 8*1000 + 375 573 -> 3*100 + 75 57 -> 7*10 + 5 5
	 * 
	 * 8375
	 */

	private static int vuelta3(int num) {
		int numInvertido;
		int resto = num % 10;
		int longNum = (int) Math.pow(10, Integer.toString(num).length() - 1);

		if (num > 10) {
			numInvertido = resto * longNum + vuelta3(num / 10);
		} else {
			numInvertido = num;
		}

		return numInvertido;
	}

	public static void main(String[] args) {
		// System.out.println(vuelta2(12345, 0));
		// System.out.println(vuelta2(57381,0 ));
		// System.out.println(vuelta3(57381));
		System.out.println(vuelta3(5738));
	}
}
