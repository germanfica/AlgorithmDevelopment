package xyz.germanfica.recursionfinal;

public class Ej3 {

	public static int deciABin(int num) {
		int bin;

		if (num == 1) {
			bin = num % 2;

		} else {

			bin = deciABin(num / 2) * 10 + (num % 2);
		}

		return bin;
	}

	public static void main(String[] args) {
		System.out.println("binario: " + deciABin(13));
	}
}
