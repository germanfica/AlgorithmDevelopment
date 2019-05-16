package xyz.germanfica._2019._2nd.primer_parcial;

public class Ej1 {
	
	public static String actualizar(String pais, String ciudad, String numero) {
		String numCelActualizado = "";
		
		return numCelActualizado;
	}

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
		
		if (numero.charAt(0) == '1' && numero.charAt(1) == '5') {
			numCelActualizado = "4" + numero.substring(2, numero.length());
		}else {
			numCelActualizado = pais + ciudad + numero;
		}

		return numCelActualizado;
	}

	public static void main(String[] args) {
		String numCel1 = "+54-0299-155030299";
		String numCel2 = "0299-155030299";
		String numCel3 = "155030299";
		String numCel4 = "1655030299";
		String numCel5 = "+54-0299-155030155";
		String numCel6 = "+54-0299-165030155";

		System.out.println(actualizaNumCel(numCel1));
		System.out.println(actualizaNumCel(numCel2));
		System.out.println(actualizaNumCel(numCel3));
		System.out.println(actualizaNumCel(numCel4));
		System.out.println(actualizaNumCel(numCel5));
		System.out.println(actualizaNumCel(numCel6));
	}
}
