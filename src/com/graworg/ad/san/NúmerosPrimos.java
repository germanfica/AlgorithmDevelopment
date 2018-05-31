// NOTA: Este algoritmo no determina primos.
package com.graworg.ad.san;

import com.graworg.ad.util.TecladoIn;

public class NúmerosPrimos {
	public static void main(String[] args) {
		/* Leer una cadena de números y reconocer cuántos de ellos son
		 * primos. Para finalizar el conteo ingresar -1.
		 */
		int num;//, i;
		System.out.println("ingrese numero: ");
		num = TecladoIn.readLineInt();
		while(num >=0)
		{
			//i = num - 1;
			primo(num, 1);
			System.out.println("ingrese numero: ");
			num = TecladoIn.readLineInt();
		}
	}
	
	public static void primo(int num, int i) {
		while((num % i) != 0) {
			i--;
		}
		if(i == 1) {
			System.out.println("es primo");
		}else {
			System.out.println("no es primo");
		}
	}
}
