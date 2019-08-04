<<<<<<< HEAD:src/xyz/germanfica/_2019/trailend/Aleatorio.java
package xyz.germanfica._2019.trailend;
=======
package xyz.germanfica._2019.preparacionfinal;
>>>>>>> aa7053f22433a98639ef4a27764a9b8d55132e95:src/xyz/germanfica/_2019/preparacionfinal/Aleatorio.java

/**
 * @authors [GERMAN LUIS GUILLERMO FICA, GONZALO DARIO OLMOS]
 *
 */
public class Aleatorio {
	private int numAleatorio; // La clave
	private boolean tieneDigGem;
	private boolean perteneceFibo;

	Aleatorio() {
		// Comentario de Fede:
		// El constructor de aleatorio debería realizar las determinaciones para gemelos
		// y fibonacci.

		numAleatorio = (int) (Math.random() * 3798);
		tieneDigGem = false;
		perteneceFibo = false;
	}

	// Observadores
	/**
	 * Obtiene el numero aleatorio de la clase
	 * 
	 * @return devuelve el numero aleatorio de la clase
	 */
	public int getNumAleatorio() {
		return numAleatorio;
	}

	/**
	 * Compara dos objetos aleatorios
	 * 
	 * @param a es el objeto aleatorio a comparar
	 * @return devuelve verdadero si son identicos
	 */
	public boolean equals(Aleatorio a) {
		return numAleatorio == a.numAleatorio;
	}

	/**
	 * Devuelve json del objeto aleatorio
	 */
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

	/**
	 * Verifica si tiene numeros gemelos
	 * 
	 * @param num es el numero a verificar
	 * @return devuelve verdadero si tiene numeros gemelos
	 */
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

	/**
	 * Busca el numero de la serie que esta la posicion solicitada
	 * 
	 * @param pos es la posicion de la serie de fibo
	 * @return devuelve el numero de fibo
	 */
	private int fibo(int pos) {
		int num;
		if (pos == 1) {
			num = 0;
		} else if (pos == 2) {
			num = 1;
		} else {
			num = fibo(pos - 1) + fibo(pos - 2);
		}

		return num;
	}

	/**
	 * Verifica si el numero solicitado pertenece a la serie de fibo
	 * 
	 * @param num
	 * @param i
	 * @return devuelve verdadero si pertenece a la serie
	 */
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

	/**
	 * Obtiene el numero aleatorio de la clase
	 * 
	 * @return devuelve el numero aleatorio de la clase
	 */

	/**
	 * Obtiene si pertenece o no a la serie fibo
	 * 
	 * @return devuelve si pertenece o no a la serie fibo
	 */
	public boolean getPerteneceFibo() {
		return pertFibo(numAleatorio, 1);
	}

	// Mofificadores

	// Propias del tipo
	/**
	 * Clona el objeto
	 * 
	 * @return devuelve el clon del objeto
	 */
	public Aleatorio clonar() {
		// Comentario de Fede:
		// Clonar debería entregar una copia del objeto, no el mismo objeto.
		// Si retorna this, retorna el puntero al mismo objeto, no a una copia como se
		// supone debería.
		return this;
	}
}
