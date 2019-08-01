package xyz.germanfica._2019.preparacionfinal;

public class Ej3 {
	
	public static boolean codigoValido(int cod) {
		boolean res;

		int restoDer = cod % 10; // Digito de la derecha
		int restoIzq = (cod / 10) % 10; // Digito de la izquierda

		if (cod > Math.pow(10, 2)) {
			if (restoIzq < restoDer) {
				res = codigoValido(cod / 10);
			} else {
				res = false;
			}
		} else {
			if (restoIzq < restoDer) {
				res = true;
			} else {
				res = false;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		System.out.println("Res: " + codigoValido(23459));
	}
}
