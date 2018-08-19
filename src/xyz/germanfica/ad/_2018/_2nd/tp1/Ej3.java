package xyz.germanfica.ad._2018._2nd.tp1;

import java.util.Scanner;

import xyz.germanfica.ad.util.Mensaje;

/*
 *  Diseñar un algoritmo que permita leer N números enteros y muestre el promedio de los mismos.
 *  Implementar en Java y comprobar la solución mediante una traza.
 */
public class Ej3 {
	private static Scanner sc;
	/*
	 * Estoy generando como 20 mil arreglos en la memoria,
	 * en cambio si paso por parametro el arreglo 
	 * estoy usando el mismo arreglo que está en memoria,
	 * sin necesidad de crear uno nuevo.
	 * Respuesta tiene todo el sentido del mundo:
	 * 
	 * While I agree with the general opinion here that using arrays
	 * for such a purpose is bad practice, I'd like to add a few things. Are you
	 * sure that "pass by reference" really is what you need in the first place? Many
	 * have said that your code is bad style, but now let me tell you why that is IMHO.
	 * "Pass by reference" is mostly a synonym for "programming by side effect" which is
	 * a thing you always want to avoid. It makes code much harder to debug and understand,
	 * and in a multi-threaded environment, the bad effects of this attitude really can
	 * hit you hard. To write scalable and thread-safe code in Java, you should make
	 * objects "read-only" as much as possible, i.e. ideally, you create an object
	 * and initialize it at the same time, then use it with this unmodifiable state
	 * throughout your application. Logical changes to the state can almost always
	 * be considered a "creation" of new state, i.e. creation of a new instance
	 * initialized to a state then needed. Many modern scripting languages only
	 * let you work in this way, and it makes things much easier to understand. As
	 * opposed to C++, Java is much more efficient in allocating and releasing
	 * short-lived objects, so there is actually nothing wrong with what others
	 * here have suggested: To create an instance of a special class to hold the
	 * function result, just for the purpose of returning the result. Even if you do
	 * that in a loop, the JVM will be smart enough to deal with that efficiently. Java will
	 * only allocate memory from the OS in very large chunks when needed, and will deal
	 * with object creation and release internally without the overhead involved in
	 * languages like C/C++. "Pass by reference" really doesn't help you very much in Java.
	 * 
	 * EDIT: I suggest you search this forum or the net for the terms "side-effect",
	 * "functional programming" or "immutability". This will most likely open a
	 * new perspective to your question.
	 * 
	 * Link: https://stackoverflow.com/questions/14820115/is-it-a-bad-practice-to-use-arrays-as-parameters-to-return-multiple-values
	 * 
	 * Por lo tanto, pasar "por referencia" realmente no te ayuda mucho en Java,
	 * ya que hace que el código sea mucho más difícil de depurar y entender.
	 * Lo ideal es crear un objeto e inicializarlo al mismo tiempo, y luego usarlo con
	 * este estado no modificable en toda la aplicación.  De esta manera
	 * vas a escribir código escalable y seguro en Java.
	 * 
	 * Pasar por referencia es algo que se intenta evitar.
	 */
	public static int[] cargaDeNúmeros(int longitud) {
		// Declaración e inicialización de variables
		int[] números = new int[longitud];
		// Creación del Scanner
		sc = new Scanner(System.in);
		// Cargar de elementos al arreglo
		for(int i = 0;i<=longitud-1;i++) {
			números[i] = sc.nextInt();
		}
		return números;
	}
	
	public static int promedio(int[] números) {
		// Declaración de variables
		int sumaDeValores;
		// Inicialización de variables
		sumaDeValores = 0;
		// Calcular promedio/average = sum of values/number of values
		for(int i = 0;i<=números.length-1;i++) {
			sumaDeValores = sumaDeValores + números[i];
		}
		return sumaDeValores/números.length;
	}
	
	public static void main(String[] args) {
		// Declaración de variables
		int[] números;
		int longitud;
		
		// Inicialización de variables
		longitud = 0;
		
		// Creación del Scanner
		sc = new Scanner(System.in);
		
		// Mostrar mensaje de bienvenida
		System.out.println(Mensaje.leer().get(0));
		
		// Leer la cantidad de números a ingresar
		System.out.println("Ingrese la cantidad de números: ");
		longitud = sc.nextInt();
		
		// Cargar el arreglo
		números = cargaDeNúmeros(longitud);
		
		// Mostrar el promedio
		System.out.println("El promedio es "+promedio(números));
	}
}
