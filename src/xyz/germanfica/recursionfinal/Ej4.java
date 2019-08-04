package xyz.germanfica.recursionfinal;

public class Ej4 {

	public static int binADeci(int num, int i) {
		int deci;

		if (num / 10 == 0) {
			deci = (num % 10) * (int) (Math.pow(2, i));
		} else {
			deci = binADeci(num / 10, i + 1) + (num % 10) * (int) (Math.pow(2, i));
		}

		return deci;
	}

	public static void main(String[] args) {
		System.out.println("decimal " + binADeci(1101, 0));
	}
}
