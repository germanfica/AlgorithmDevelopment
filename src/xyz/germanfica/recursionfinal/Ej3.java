package xyz.germanfica.recursionfinal;

public class Ej3 {

	public static int deciABin(int num) {
		int bin;

		if (num == 1) {
			bin = 1;
		} else if (num == 0) {
			bin = 0;
		} else {
			bin = deciABin(num / 2) * 10 + (num % 2);
		}

		return bin;
	}

	public static void main(String[] args) {
		System.out.println("binario: " + deciABin(3));
	}
}
