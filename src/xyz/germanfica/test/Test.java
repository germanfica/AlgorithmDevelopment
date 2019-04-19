package xyz.germanfica.test;

import xyz.germanfica.util.Archivo;

public class Test {
	public static void main(String[] args) {
		String NOMBRE_ARCHIVO = "src/xyz/germanfica/util/ejemplo.txt";
		String ejemplo = Archivo.leer(NOMBRE_ARCHIVO).getTexto();
		System.out.println(ejemplo);
	}
}
