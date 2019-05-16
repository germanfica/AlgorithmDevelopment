package xyz.germanfica.ad._2019.test;

public class Test03 {
	
	public static String recortaPalabra(String palabra) {
		String palabraRecortada;
		
		if(palabra.length()>5) {
			palabraRecortada = palabra.substring(0, 5) + ".";
		}else {
			palabraRecortada = palabra;
		}
		
		return palabraRecortada;
	}
	
	// Hacerlo recursivo.
	
	public static void main(String[] args) {
		String texto = "Totalmente";
		String textoRecortado = "";
		boolean salir = false;
		int posEspacio;
		
		System.out.println("Bienvenido!");
		
		while(!salir) {
			posEspacio = texto.indexOf(' ');
			
			if(posEspacio==-1) {
				textoRecortado = recortaPalabra(texto); // Esta es
				salir = true;
			}else {
				texto = texto.substring(posEspacio+1, texto.length());
				textoRecortado = textoRecortado + recortaPalabra(texto);
			}
		}
		
		System.out.println(textoRecortado);
	}
}
