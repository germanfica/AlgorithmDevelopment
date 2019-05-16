package xyz.germanfica._2018._2nd.tp2;

public class Example {
	public static void main(String[] args) {
		// Declaracion de variables
		char[] caracteres; // Arreglo
		char a, b, c;
		
		// Incializacion de variables
		a = 'a';
		b = 'b';
		c = 'c';
		caracteres = new char[3]; // Siempre hay que asignarle un tamaño o longitud
		
		// Ahora tengo que meter los elementos al arreglo
		// Como tiene una longitud de 3, esto es, de 0 a 2
		caracteres[0] = a;
		caracteres[1] = b;
		caracteres[2] = c;
		
		for (int i = 0; i < caracteres.length; i++) {
			System.out.println(i);
			System.out.println(caracteres[i]);
		}
	}
}
