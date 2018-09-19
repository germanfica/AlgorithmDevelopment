package xyz.germanfica.ad._2018._2nd.tpob;

import java.util.Scanner;
import xyz.germanfica.mensaje.Mensaje;

/*
 * Escribir en Java la clase TestVivero para implementar un programa que:
 * 
 * - Defina un arreglo de �rboles que guarde informaci�n de todas los �rboles que el
 * vivero tiene a la venta.
 * 
 * - Provea al usuario un men� con las siguientes opciones:
 * 
 * 1. Carga de Datos: generar el arreglo de �rboles con tantos datos como el
 * usuario desee. Esta opci�n debe poder ejecutarse repetidas veces, es decir,
 * se deben poder agregar �rboles al arreglo las veces que haga falta. En la
 * carga de datos se debe controlar de no guardar datos repetidos.
 * 
 * 2. Listar �rboles: Este m�todo debe listar los datos de todos �rboles de
 * m�s de 10m de altura a partir de los elementos almacenados en el arreglo.
 * 
 * 3. Contar �rboles: Este m�todo debe contar, recorriendo el arreglo, la
 * cantidad de �rboles que soportan temperaturas por debajo de los 0�C.
 * 
 * 4. Mostrar �rboles: Este m�todo deber� mostrar el nombre de todos los
 * �rboles frutales.
 */
public class TestVivero {
	private static Scanner sc;
	
	public static boolean existeEsteArbol(Arbol[] arboles, Arbol arbol) {
		// Declaraci�n de variables
		boolean seRepite, hayObjetos;
		int i;
		
		// Inicializaci�n de variables
		i = 0;
		hayObjetos = true;
		seRepite = false;
		
		// Buscar si se repite el �rbol en el arreglo de �rboles
		while (i<=arboles.length-1 && !seRepite && hayObjetos) {
			if(arboles[i]==null) {
				hayObjetos = false;
			}else {
				if(arboles[i].equals(arbol)) {
					seRepite = true;
				}else {
					i++;
				}
			}
		}
		return seRepite;
	}
	
	/*
	 * [1] Carga de datos
	 */
	public static Arbol[] cargaArbol(int cantidadArboles) {
		// Declaraci�n de variables
		Arbol[] arboles;
		Arbol arbol;
		String nombre;
		int altura, profRaices, tempMinima, i;
		boolean frutos;
		
		// Inicializaci�n de variables
		arboles = new Arbol[cantidadArboles]; // Le doy una nueva longitud al arreglo de �rboles
		i = 0;
		
		// Leo los valores para el nuevo �rbol que va a estar en el arreglo
		while(i <= cantidadArboles-1) {
			sc = new Scanner(System.in);
			System.out.println("Ingrese nombre:");
			nombre = sc.next();
			System.out.println("Ingrese altura:");
			altura = sc.nextInt();
			System.out.println("Ingrese las raices:");
			profRaices = sc.nextInt();
			System.out.println("Ingrese si tiene frutos:");
			frutos = sc.nextBoolean();
			System.out.println("Ingrese la temperatura m�n. que soporta:");
			tempMinima = sc.nextInt();
			
			// Genero el �rbol
			arbol = new Arbol(nombre, altura, profRaices, frutos, tempMinima);
			
			// Se repite el �rbol en el arreglo de �rboles?
			if(existeEsteArbol(arboles, arbol)) {
				System.out.println("Este �rbol se repite. Ingrese nuevamente los datos.");
			}else {
				arboles[i] = arbol;
				i++; // S�lo se incremente si los valores no est�n repetidos
			}
		}
		
		return arboles;
	}
	
	public static void mostrarArboles(Arbol[] arbol) {
		for (int i = 0; i <= arbol.length-1; i++) {
			System.out.println(arbol[i].toString());
		}
	}
	
	/*
	 * Este modulo se encarga de mostrar los carteles del menu
	 */
	public static void mostrarCartelDeOpciones() {
		System.out.print("[0] Salir (IMPLEMENTADO)\n"
				+ "[1] Carga de datos\n"
				+ "[2] Listado de �rboles\n"
				+ "[3] Cantidad de �rboles que soportan los 0�\n"
				+ "[4] Mostrar el nombre de todos los �rboles\n"
				+ "[5] Mostrar todos los �rboles\n"
				);
	}
	
	/*
	 * Mostrar el menu de la aplicacion
	 */
	public static void mostrarMenu(Arbol[] arbol) {
		boolean salir = false;
		int opcion;
		
		// Mensaje de bienvenida
		System.out.println(Mensaje.leer(0));
		
		while(!salir) {
			// Mostrar cartel con las opciones
			mostrarCartelDeOpciones();
			
			// Leer opcion del menu principal
			sc = new Scanner(System.in);
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 0: salir = true; break;
			// [1] Carga de datos
			case 1: ;break; // Opcion 1
			// [2] Listado de �rboles
			case 2: ; break; // Opcion 2
			// [3] Cantidad de �rboles que soportan los 0�
			case 3: ; break; // Opcion 3
			// [4] Mostrar el nombre de todos los �rboles
			case 4: mostrarArboles(arbol); break; // Opcion 4
			default: System.err.println(Mensaje.leer(1)); break;
			}
		}
	}
	
	public static void main(String[] args) {
		Arbol[] arbol; // Arreglo de los �rboles que el vivero tiene a la venta
		int cantidadArboles; // La cantidad de �rboles que el vivero tiene a la venta
		
		// Carga de datos al arreglo
		sc = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de �rboles que hay en el vivero: ");
		cantidadArboles = sc.nextInt();
		arbol = cargaArbol(cantidadArboles);
		
		// Mostrar men�
		mostrarMenu(arbol);
	}
}
