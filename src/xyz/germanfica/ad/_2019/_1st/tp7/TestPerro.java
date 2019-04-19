package xyz.germanfica.ad._2019._1st.tp7;

import xyz.germanfica.util.Archivo;

public class TestPerro {
	public static void main(String[] args) {
		String ejemploTxt = "src/xyz/germanfica/util/ejemplo.txt";
		String ejemplo = Archivo.leer(ejemploTxt).getTexto();
		System.out.println(ejemplo);
		
		String[] stringTDA = Archivo.leer("src/xyz/germanfica/ad/_2019/_1st/tp7/StringTDA.txt").toArray();
		
		for (int i = 0; i < stringTDA.length; i++) {
			System.out.println(stringTDA[0]);
		}
	}
}
