package xyz.germanfica._2018._2nd.tpob;

import java.util.Scanner;
import xyz.germanfica.mensaje.Mensaje;
import xyz.germanfica.util.Archivo;

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
	private static final String NOMBRE_ARCHIVO = "src/xyz/germanfica/ad/_2018/_2nd/tpob/Arboles.txt"; // Ruta del archivo

	/*
	 * [5] Mostrar todos los �rboles
	 * Mustra todos los �rboles del arreglo de �rboles
	 */
	public static void mostrarArboles(Arbol[] arbol) {
		for (int i = 0; i <= arbol.length-1; i++) {
			System.out.println(arbol[i].toString());
		}
	}
	
	/*
	 * [4] Mostrar el nombre de todos los �rboles que son frutales
	 * Mostrar �rboles: Este m�todo deber� mostrar el nombre de todos los
	 * �rboles frutales.
	 */
	public static void mostrarNombArbFrut(Arbol[] arboles) {
		int cant;
		cant = 0;
		for (int i = 0; i <= arboles.length-1; i++) {
			if(arboles[i].getFrutos()) { // Solo muestro los que son frutales
				System.out.println(arboles[i].toString()); // Muestra todos los atributos que tienen el �rbol
				cant++;
			}
		}
		// Determina si hay �rboles frutales sino muestra un mensaje
		if(cant==0) {
			System.out.println("No hay �rboles frutales.");
		}
	}
	
	/*
	 * [3] Cantidad de �rboles que soportan por debajo de los 0�
	 * Contar �rboles: Este m�todo debe contar, recorriendo el arreglo, la
	 * cantidad de �rboles que soportan temperaturas por debajo de los 0�C.
	 */
	public static void mostrarCantSopTem(Arbol[] arboles) {
		System.out.println("La cantidad de �rboles que soportan temperaturas por debajo de los 0�c es: " + cantSopTem(arboles, 0));
	}
	
	/*
	 * [2] Listado de �rboles de m�s de 10m de altura
	 * Listar �rboles: Este m�todo debe listar los datos de todos �rboles de
	 * m�s de 10m de altura a partir de los elementos almacenados en el arreglo.
	 */
	public static void mostrarArbAlt10(Arbol[] arboles) {
		int cant;
		cant = 0;
		// Mensaje
		System.out.println("Los �rboles que tienen m�s de 10m de altura son:");
		// Recorro el arreglo
		for (int i = 0; i <= arboles.length-1; i++) {
			if(arboles[i].getAltura()>10) { // Solo los que tienen m�s de 10 m de altura
				cant++;
				System.out.println(arboles[i].toString()); // Muestra todos los atributos que tienen el �rbol
			}
		}
		// Determina si hay �rboles sino muestra un mensaje
		if(cant==0) {
			System.out.println("No hay �rboles que superen los 10m de altura.");
		}
	}
	
	/*
	 * [1] Carga de datos
	 * 
	 * Se genera el arreglo de �rboles con tantos datos como el
	 * usuario desee. Esta opci�n debe poder ejecutarse repetidas veces, es decir,
	 * se deben poder agregar �rboles al arreglo las veces que haga falta. En la
	 * carga de datos se debe controlar de no guardar datos repetidos.
	 */
	public static Arbol[] cargaArboles(int cantidadArboles) {
		// Declaraci�n de variables
		Arbol[] arregloArbol;
		Arbol arbol;
		int i;
		
		// Inicializaci�n de variables
		arregloArbol = new Arbol[cantidadArboles]; // Le doy una nueva longitud al arreglo de �rboles
		i = 0;
		
		// Leo los valores para el nuevo �rbol que va a estar en el arreglo
		while(i <= cantidadArboles-1) {
			arbol = generaArbol(); // Genero un nuevo �rbol
			
			// Se repite el �rbol en el arreglo de �rboles?
			if(existeEsteArbol(arregloArbol, arbol)) {
				System.out.println("Este �rbol se repite. Ingrese nuevamente los datos.");
			}else {
				arregloArbol[i] = arbol;
				i++; // S�lo se incremente si los valores no est�n repetidos
			}
		}
		
		return arregloArbol;
	}
	
	/**
	 * Determina si un �rbol determinado ya existe en el arreglo
	 * de �rboles solicitado.
	 * 
	 * @param arboles es el arreglo de �rboles a analizar
	 * @param arbol es el �rbol que se quiere comparar
	 * para saber si existe en el arreglo de �rboles
	 * @return
	 */
	public static boolean existeEsteArbol(Arbol[] arboles, Arbol arbol) {
		// Declaraci�n de variables
		boolean seRepite, hayObjetos;
		int i;
		
		// Inicializaci�n de variables
		i = 0;
		hayObjetos = true;
		seRepite = false;
		
		// Busca si se repite el �rbol en el arreglo de �rboles
		while (i<=arboles.length-1 && !seRepite && hayObjetos) {
			if(arboles[i]==null) { // No tiene que ser n�lo
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
	
	/**
	 * Genera un objeto de tipo �rbol
	 *
	 * @return devuelve un objeto de tipo �rbol con sus atributos
	 * inicializados
	 */
	public static Arbol generaArbol() {
		String nombre;
		int altura, profRaices, tempMinima;
		boolean frutos;
		
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
		
		return new Arbol(nombre, altura, profRaices, frutos, tempMinima);
	}
	
	/**
	 * Cuenta la cantidad de �rboles que soportan temperaturas por debajo de los 0�C
	 * 
	 * @param arboles es el arreglo o listado de todos los �rboles del vivero
	 * @param temp es la temperatura m�nima que va a soportar el �rbol
	 * @return devuelve la cantidad de �rboles que soportan temperaturas por
	 * debajo de los 0�C
	 */
	public static int cantSopTem(Arbol[] arboles, int temp) {
		int cant;
		cant = 0;
		for (int i = 0; i <= arboles.length-1; i++) {
			if(arboles[i].getTempMin()<temp) {
				cant++;
			}
		}
		return cant;
	}
	
	/**
	 * Carga de datos al arreglo pero de forma manual.
	 * 
	 * @return devuelve un arreglo de �rboles cargado de elementos
	 */
	public static Arbol[] cargaManual() {
		int cantidadArboles; // La cantidad de �rboles que el vivero tiene a la venta
		
		sc = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de �rboles que hay en el vivero: ");
		cantidadArboles = sc.nextInt();
		
		return cargaArboles(cantidadArboles);
	}
	
	/**
	 * En este m�dulo se pretende hacer la primera carga al arreglo
	 * de �rboles. Se mostrar� un men� con dos opciones a elegir. Seg�n la
	 * opci�n es el tipo de carga que se lleva a cabo.
	 * 
	 * Los dos tipos de carga son:
	 * - Manual.
	 * - Desde el archivo.
	 * @return devuelve un arreglo de �rboles cargado de elementos
	 */
	public static Arbol[] cargaInicial() {
		Arbol[] arbol;
		int opcion;
		
		System.out.println("�Quiere cargar desde el archivo o de manera manual?");
		System.out.print("[1] Desde el archivo (IMPLEMENTADO)\n"
				+ "[2] Manual (IMPLEMENTADO)\n"
				);
		sc = new Scanner(System.in);
		opcion = sc.nextInt();
		
		switch (opcion) {
		case 1: arbol = cargaDesdeArchivo(NOMBRE_ARCHIVO);break;
		case 2:
			int cantidadArboles; // La cantidad de �rboles que el vivero tiene a la venta
			
			// Carga de datos al arreglo por primera vez
			sc = new Scanner(System.in);
			System.out.println("Ingrese la cantidad de �rboles que hay en el vivero: ");
			cantidadArboles = sc.nextInt();
			arbol = cargaArboles(cantidadArboles);
			;break;
		default: arbol = cargaDesdeArchivo(NOMBRE_ARCHIVO); break; // Por defecto hago la carga desde el archivo
		}
		
		return arbol;
	}
	
	private static Scanner scLongitudDelArchivo;
	/**
	 * Determina la longitud que tendr� un arreglo cualquiera,
	 * tomando como identificador el ; para contar los elementos
	 * que hay en el archivo.
	 * 
	 * @param contenidoDelArchivo es el contenido del archivo. Para obtener
	 * el contenido del archivo s�lo basta con llamar al m�dulo
	 * Archivo.Leer(ARCHIVO), siendo ARCHIVO (la ruta)+(nombre del
	 * archivo con su extensi�n), ejemplo: 
	 * ARCHIVO = "src/xyz/germanfica/ad/_2018/_2nd/tp3/Ej2.txt".
	 * @return Devuelve la longitud que debe tener un arreglo seg�n los elementos del archivo
	 */
	public static int longitudDelArchivo(String contenidoDelArchivo) {
		int longitud = 0;
		scLongitudDelArchivo = new Scanner(contenidoDelArchivo); // Le digo al scanner que me analice el contenido del archivo
		scLongitudDelArchivo.useDelimiter("\\s*;\\s*"); // Clasifica los elementos cuando encuntra un punto y coma
		
		while(scLongitudDelArchivo.hasNext()) {
			scLongitudDelArchivo.next();
			longitud++;
		}
		return longitud;
	}
	
	private static Scanner scArregloArbol;
	private static Scanner scArbol;
	/**
	 * Carga un arreglo de �rboles desde un archivo solicitado.
	 * 
	 * Este m�dulo solo funciona si cumple con el siguiente formato:
	 * 
	 * Cada atributo del �rbol dentro del archivo deben ir separados
	 * con una ','.
	 * Y se debe terminar con un ';'.
	 *  
	 * Ejemplo:
	 * �rbol 1: Abedul, 10, 3, false, -2;
	 * �rbol 2: Naranjo, 5, 6, true, 15;
	 * 
	 * Nota: �ste m�dulo contempla que hayan �rboles repetidos.
	 * 
	 * @param ARCHIVO ruta del archivo. Ac� no va el contenido del archivo.
	 * Para obtener el contenido del archivo s�lo basta con llamar al m�dulo
	 * Archivo.Leer(ARCHIVO), siendo ARCHIVO (la ruta)+(nombre del
	 * archivo con su extensi�n), ejemplo: 
	 * ARCHIVO = "src/xyz/germanfica/ad/_2018/_2nd/tp3/Ej2.txt".
	 * @return Devuelve una arreglo de �rboles cargada con los elementos
	 * del archivo.
	 */
	public static Arbol[] cargaDesdeArchivo(String ARCHIVO) {
		// Declaraci�n de variables
		Arbol[] arregloArbol;
		int i;
		String contenidoDelArchivo;
		
		// Inicializaci�n de variables
		contenidoDelArchivo = Archivo.leer(ARCHIVO).getTexto();
		arregloArbol = new Arbol[longitudDelArchivo(contenidoDelArchivo)]; // longitudDelArchivo()
		i=0;
		
		// Carga de elementos
		scArregloArbol = new Scanner(contenidoDelArchivo); // Le digo al scanner que me analice el contenido del archivo
		scArregloArbol.useDelimiter("\\s*;\\s*"); // Clasifica los elementos cuando encuntra un punto y coma
		
		while(scArregloArbol.hasNext()) {
			// Esto va hasta el ; por lo tanto, despues necesito analizar individualmente por cada ,
			scArbol = new Scanner(scArregloArbol.next()); // Le digo al scanner que me analice el contenido del archivo
			scArbol.useDelimiter("\\s*,\\s*"); // Clasifica los elementos cuando encuntra un punto y coma
			
			Arbol arbol = new Arbol("");
			while(scArbol.hasNext()) {
				arbol = new Arbol(scArbol.next(), scArbol.nextInt(), scArbol.nextInt(), scArbol.nextBoolean(), scArbol.nextInt());	
			}
			
			arregloArbol[i] = arbol;
			i++;
		}
		return arregloArbol;
	}
	
	/*
	 * Este modulo se encarga de mostrar los carteles del menu
	 */
	public static void mostrarCartelDeOpciones() {
		System.out.print("[0] Salir (IMPLEMENTADO)\n"
				+ "[1] Carga de datos (IMPLEMENTADO)\n"
				+ "[2] Listado de �rboles de m�s de 10m de altura (IMPLEMENTADO)\n"
				+ "[3] Cantidad de �rboles que soportan por debajo de los 0� (IMPLEMENTADO)\n"
				+ "[4] Mostrar el nombre de todos los �rboles que son frutales (IMPLEMENTADO)\n"
				+ "[5] Mostrar todos los �rboles (IMPLEMENTADO)\n"
				);
	}
	
	/*
	 * Mostrar el men� de la aplicaci�n
	 */
	public static void mostrarMenu() {
		Arbol[] arregloArbol; // Arreglo de los �rboles que el vivero tiene a la venta
		boolean salir = false;
		int opcion;
		
		// Mensaje de bienvenida
		System.out.println(Mensaje.leer(0));
		
		arregloArbol = cargaInicial(); // Carga inicial del arreglo
		//arboles = cargaManual(); // Carga manual
		//arboles = cargaDesdeArchivo(NOMBRE_ARCHIVO); // Carga desde el archivo
		
		while(!salir) {
			// Mostrar cartel con las opciones
			mostrarCartelDeOpciones();
			
			// Leer opcion del menu principal
			sc = new Scanner(System.in);
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 0: salir = true; break;
			// [1] Carga de datos
			case 1: arregloArbol = cargaManual();break; // Opcion 1
			// [2] Listado de �rboles de m�s de 10m de altura
			case 2: mostrarArbAlt10(arregloArbol);; break; // Opcion 2
			// [3] Cantidad de �rboles que soportan por debajo de los 0�
			case 3: mostrarCantSopTem(arregloArbol);; break; // Opcion 3
			// [4] Mostrar el nombre de todos los �rboles que son frutales
			case 4: mostrarNombArbFrut(arregloArbol);; break; // Opcion 4
			// [5] Mostrar todos los �rboles pero el m�s reciente
			case 5: mostrarArboles(arregloArbol); break;
			default: System.err.println(Mensaje.leer(1)); break;
			}
		}
	}
	
	public static void main(String[] args) {
		// Mostrar men�
		mostrarMenu();
	}
}
