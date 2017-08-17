package utilidades;

public class Mensajes {
	
	public static void mostrarAgradecimiento(int numero){
		int limite = 10; // Limite del arreglo
		String[] texto = new String[limite]; // Creación del objeto
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
