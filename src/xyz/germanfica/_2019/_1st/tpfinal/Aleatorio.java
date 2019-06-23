package xyz.germanfica._2019._1st.tpfinal;

/**
 * @authors [GERMAN LUIS GUILLERMO FICA, GONZALO DARIO OLMOS]
 *
 */
public class Aleatorio {
	private int numAleatorio; // La clave
	private boolean tieneDigGem;
	private boolean perteneceFibo;

	Aleatorio() {
		numAleatorio = (int) (Math.random() * 3798);
		tieneDigGem = false;
		perteneceFibo = false;
	}

	// Observadores
	public int getNumAleatorio() {
		return numAleatorio;
	}

	public boolean equals(Aleatorio a) {
		return numAleatorio == a.numAleatorio;
	}

	public String toString() {
		return "{\"numAleatorio\": " + numAleatorio + ", \"tieneDigGem\": " + tieneDigGem + ", \"perteneceFibo\": "
				+ perteneceFibo + "}";
	}

	/**
	 * Si el numAleatorio de la clase es más pequeño al parametro, devuelve -1.
	 * 
	 * Si el numAleatorio de la clase es mayor al parametro, retorna 1.
	 * 
	 * Si el numAleatorio de la clase es igual al parametro, retorna 0.
	 * 
	 * Fuente: https://www.tutorialspoint.com/java/number_compareto.htm
	 * 
	 * @return
	 */
	public int compareTo(Aleatorio objBuscado) {
		int resultado;

		if (numAleatorio < objBuscado.numAleatorio) {
			// menor
			resultado = -1;
		} else if (numAleatorio > objBuscado.numAleatorio) {
			// mayor
			resultado = 1;
		} else {
			// son iguales
			resultado = 0;
		}
		return resultado;
	}

	// Mofificadores

	// Propias del tipo

}
