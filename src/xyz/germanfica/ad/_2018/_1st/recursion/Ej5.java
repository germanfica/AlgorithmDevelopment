package xyz.germanfica.ad._2018._1st.recursion;

public class Ej5 {
	
	/**
	 * Retorna el mayor número de un vector
	 * @param vector
	 * @param i
	 * @return
	 */
	// No funciona si no envio como parametro al númeroMayor
	public static int esMayor(int[] vector, int i, int númeroMayor){
		if(i<2){
			if(vector[i]>númeroMayor){
				// Caso base
				númeroMayor = vector[i];
			}
			// Caso recursivo
			númeroMayor = esMayor(vector, i+1, númeroMayor);
		}
		return númeroMayor;
	}
	
	public static void main(String[] args) {
		// Declaracion de variables
		int[] vector = new int[2];
		
		// Inicializacion de variables
		vector[0] = 2;
		vector[1] = 12;
		
		System.out.println("El mayor de todos es " + esMayor(vector, 0, vector[0]) + ".");
	}
}
