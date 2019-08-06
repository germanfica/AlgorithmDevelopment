package xyz.germanfica.recursionfinal;

public class Ej4v2 {
	public static int binADeci(int bin, int i) {
		int deci;

		if (bin == 1) {
			deci = 1 * (int) (Math.pow(2, i));
		} else if (bin == 0) {
			deci = 0;
		} else {
			deci = (bin % 10) * (int) (Math.pow(2, i)) + binADeci(bin / 10, i + 1);
		}

		return deci;
	}

	public static void main(String[] args) {
		System.out.println("decimal " + binADeci(1101, 0));
		System.out.println("decimal " + binADeci(1, 0));
		System.out.println("decimal " + binADeci(0, 0));
	}
}
