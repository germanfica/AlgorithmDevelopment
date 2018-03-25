package tp1_2017;

import util.TecladoIn;

public class Exercise1 {

	public static void main(String[] args) {
		/* Este algoritmo muestra por pantalla
		 * los valores previamente ingresados por el usuario
		 * pero transformados.
		 */
		int numero1;
		int numero2;

		System.out.println();
		numero1 = TecladoIn.readLineInt(); // Enter firt value
		numero2 = TecladoIn.readLineInt(); // Enter second value

		numero1 = numero1 - numero2; // Restar el primer numero al segundo

		numero1 = numero1 + numero2; // Sumar el primer numero por el segundo numero

		numero1 = numero2 - numero1; // El primer n�mero es el segundo menos el primero

		System.out.println("Los valores de x e y son:");
		System.out.println(numero1);
		System.out.println(numero2);
	}
}
