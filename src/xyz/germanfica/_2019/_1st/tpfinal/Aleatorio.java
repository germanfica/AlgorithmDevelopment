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
	 * Si el número entero es menor al parametro, devuelve -1.
	 * 
	 * Si el número entero es mayor al parametro, devuelve 1.
	 * 
	 * Si el número entero es igual al parametro, devuelve 0.
	 * 
	 * Fuente: https://www.tutorialspoint.com/java/number_compareto.htm
	 * 
	 * @return
	 */
	public int compareTo(Aleatorio objBuscado) {
		int resultado;

		if (numAleatorio < objBuscado.numAleatorio) {
			// es menor
			resultado = -1;
		} else if (numAleatorio > objBuscado.numAleatorio) {
			// es mayor
			resultado = 1;
		} else {
			// son iguales
			resultado = 0;
		}
		return resultado;
	}

	public boolean tieneGem(int num) {
		boolean gemelos;
		int resto = num % 10;
		int numCompa = num / 10;
		int restoCompa = numCompa % 10;

		if (num > 0) {
			// Caso recursivo
			gemelos = tieneGem(num / 10);
		} else if (resto == restoCompa || resto != 0 || restoCompa != 0) {
			gemelos = true;
		} else {
			gemelos = false;
		}

		return gemelos;

	}

	private int fibo(int pos) {
		int num;
		if (pos == 1) {
			num = 0;
		} else if (pos == 2) {
			num = 1;
		} else {
			num = fibo(pos - 1) + fibo(pos - 2);
		}
		// System.out.println(num);

		return num;
	}

	private boolean pertFibo(int num, int i) {
		boolean aux;

		int fibo = fibo(i);

		if (fibo == num) {
			aux = true;
		} else if (fibo > num) {
			aux = false;
		} else {
			aux = pertFibo(num, i + 1);
		}

		return aux;
	}

	public boolean getPerteneceFibo() {
		return pertFibo(numAleatorio, 1);
	}

	// Mofificadores

	// Propias del tipo
	public Aleatorio clonar() {
		return this;
	}
}
