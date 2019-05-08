package xyz.germanfica.ad._2019._2nd.primer_parcial;

public class Ej1 {

	public static String actualizaNumCel(String numCel) {
		String pais = "";
		String ciudad = "";
		String numero = "";
		int posPriGuion, posSegGuion;
		String numCelActualizado;

		// Pais
		posPriGuion = numCel.indexOf('-');
		if (posPriGuion != -1) {
			pais = numCel.substring(0, posPriGuion);
			numCel = numCel.substring(posPriGuion + 1, numCel.length());
		}

		// Ciudad
		posSegGuion = numCel.indexOf('-');
		if (posSegGuion != -1) {
			ciudad = numCel.substring(0, posSegGuion);
			numCel = numCel.substring(posSegGuion + 1, numCel.length());
		}

		numero = numCel;

		if (numero.charAt(0) != '1' && numero.charAt(1) != '5') {
			numCelActualizado = pais + ciudad + numero;
		} else {
			numCelActualizado = "4" + numero.substring(2, numero.length());
		}

		System.out.println(pais + " " + ciudad + " " + numero);

		return numCelActualizado;
	}

	public static void main(String[] args) {
		String numCel = "+54-0299-155030299";
		System.out.println(actualizaNumCel(numCel));
	}
}
