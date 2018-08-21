package xyz.germanfica.util;

public class Cartel {
	
	public static void mostrarMenu(int numero){
		int limite = 10; // Limite del arreglo
		String[] texto = new String[limite]; // Creacion del objeto
		texto[0] = "0- Para salir.";
		System.out.println(texto[numero]);
	}
	
	public static void mostrarAgradecimiento(int numero){
		int limite = 10; // Limite del arreglo
		String[] texto = new String[limite]; // Creacion del objeto
		texto[0] = "Gracias por usar nuestro software :)";
		System.out.println(texto[numero]);
	}
	
	public static void mostrarAdvertencia(int numero){
		int limite = 10; // Limite del arreglo
		String[] texto = new String[limite];
		texto[0] = "Ha excedido el límite establecido.";
		System.out.println(texto[numero]);
	}
}
