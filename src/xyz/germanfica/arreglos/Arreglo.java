package xyz.germanfica.arreglos;

import xyz.germanfica.ad.util.Mensaje;
import xyz.germanfica.ad.util.TecladoIn;

public class Arreglo {
	/**
	 * Este módulo solicita el ingreso de caracteres y retorna un arreglo
	 * de caracteres con los elementos ingresados.
	 * @param longitud es la cantidad de elementos que tendrá el arreglo
	 * @param mensaje por ejemplo, "ingrese su caracter:"
	 * @return Arreglo de caracteres con los elementos previamente cargados
	 */
	public static char[] cargaLetras(int longitud, String mensaje) {
		// Declaración de variables
		char[] arregloLetras;
		char ch; // Caracter
		int i;
		
		// Inicialización de variables
		arregloLetras = new char[longitud];
		i = 0;
		
		// Agregar elementos al arreglo
		while(i <= arregloLetras.length-1) {
			System.out.println(mensaje);
			ch = TecladoIn.readNonwhiteChar(); // En este caso usamos TecladoIn ya que en Scanner no está defino para leer caracteres. Pd: usar readNonwhiteChar()
			if(Character.isLetter(ch)) {
				arregloLetras[i] = ch;
				i++;
			}else {
				System.err.println(Mensaje.leer().get(2));
			}
		}
		return arregloLetras;
	}
	/**
	 * Este módulo solicita el ingreso de caracteres y retorna un arreglo
	 * de caracteres con los elementos ingresados.
	 * @param longitud
	 * @return Arreglo de caracteres con los elementos previamente cargados
	 */
	public static char[] cargaLetras(int longitud) {
		return cargaLetras(longitud, "");
	}
}
