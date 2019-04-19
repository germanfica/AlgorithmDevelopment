package xyz.germanfica.ad._2019._1st.tp7;

import xyz.germanfica.util.Archivo;

public class TestPerro {
	
	public static void mostrarPerros(Perro[] perros) {
		for (int i = 0; i < perros.length; i++) {
			System.out.println(perros[i].toString());
		}
	}
	
	public static void cargaPerros(Perro[] perros) {
		for (int i = 0; i <= perros.length-1; i++) {
			perros[i] = Perro.fromString(Archivo.leer("src/xyz/germanfica/ad/_2019/_1st/tp7/StringTDA.txt").toArray()[i]);
		}
	}
	
	public static void main(String[] args) {
		Perro[] perros = new Perro[10];
		
		cargaPerros(perros);
		mostrarPerros(perros);
	}
}
