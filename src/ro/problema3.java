package ro;

import xyz.germanfica.util.TecladoIn;
import xyz.germanfica.matematicas.Paridad;

public class problema3 {
	
	public static void mostrarMatriz(int cantFilas, int cantColumn) {
		int cantPares = 0;
		for (int i = 1; i <= cantFilas; i++) {
			String numeros = "";
			int elem = 0;
			for (int j = 0; j <= cantColumn-1; j++) {
				elem = TecladoIn.readInt();
				numeros=numeros+elem + " ";
				if(Paridad.esPar(elem))
					cantPares++;
			}
			System.out.print("Fila " + i + ": ");
			System.out.print(numeros);
			System.out.println("Pares ingresados: " + cantPares);
			cantPares = 0;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int cantFilas, cantColumn;
		cantFilas = 3;
		cantColumn = 4;
		System.out.println("Bienvenido");
		
		mostrarMatriz(cantFilas, cantColumn);
	}
}
