package xyz.germanfica.ad._2018._2nd.tpob;

import java.util.Scanner;
import xyz.germanfica.mensaje.Mensaje;
import xyz.germanfica.util.Archivo;
import xyz.germanfica.util.Matriz;

/*
 * Escribir en Java la clase TestVivero para implementar un programa que:
 * 
 * - Defina un arreglo de árboles que guarde información de todas los árboles que el
 * vivero tiene a la venta.
 * 
 * - Provea al usuario un menú con las siguientes opciones:
 * 
 * 1. Carga de Datos: generar el arreglo de árboles con tantos datos como el
 * usuario desee. Esta opción debe poder ejecutarse repetidas veces, es decir,
 * se deben poder agregar árboles al arreglo las veces que haga falta. En la
 * carga de datos se debe controlar de no guardar datos repetidos.
 * 
 * 2. Listar árboles: Este método debe listar los datos de todos árboles de
 * más de 10m de altura a partir de los elementos almacenados en el arreglo.
 * 
 * 3. Contar árboles: Este método debe contar, recorriendo el arreglo, la
 * cantidad de árboles que soportan temperaturas por debajo de los 0ºC.
 * 
 * 4. Mostrar árboles: Este método deberá mostrar el nombre de todos los
 * árboles frutales.
 */
public class TestVivero {
	private static Scanner sc;
	private static final String NOMBRE_ARCHIVO = "src/xyz/germanfica/ad/_2018/_2nd/tpob/Arboles.txt"; // Ruta del archivo

	
	/*
	 * [4] Mostrar el nombre de todos los árboles que son frutales
	 * Mostrar árboles: Este método deberá mostrar el nombre de todos los
	 * árboles frutales.
	 */
	public static void mostrarNombArbFrut(Arbol[] arboles) {
		int cant;
		cant = 0;
		for (int i = 0; i <= arboles.length-1; i++) {
			if(arboles[i].getFrutos()) { // Solo muestro los que son frutales
				System.out.println(arboles[i].toString()); // Muestra todos los atributos que tienen el árbol
				cant++;
			}
		}
		// Determina si hay árboles frutales sino muestra un mensaje
		if(cant==0) {
			System.out.println("No hay árboles frutales.");
		}
	}
	
	/*
	 * [3] Cantidad de árboles que soportan por debajo de los 0°
	 * Contar árboles: Este método debe contar, recorriendo el arreglo, la
	 * cantidad de árboles que soportan temperaturas por debajo de los 0ºC.
	 */
	public static void mostrarCantSopTem(Arbol[] arboles) {
		System.out.println("La cantidad de árboles que soportan temperaturas por debajo de los 0°c es: " + cantSopTem(arboles, 0));
	}
	
	/*
	 * [2] Listado de árboles de más de 10m de altura
	 * Listar árboles: Este método debe listar los datos de todos árboles de
	 * más de 10m de altura a partir de los elementos almacenados en el arreglo.
	 */
	public static void mostrarArbAlt10(Arbol[] arboles) {
		int cant;
		cant = 0;
		// Mensaje
		System.out.println("Los árboles que tienen más de 10m de altura son:");
		// Recorro el arreglo
		for (int i = 0; i <= arboles.length-1; i++) {
			if(arboles[i].getAltura()>10) { // Solo los que tienen más de 10 m de altura
				cant++;
				System.out.println(arboles[i].toString()); // Muestra todos los atributos que tienen el árbol
			}
		}
		// Determina si hay árboles sino muestra un mensaje
		if(cant==0) {
			System.out.println("No hay árboles que superen los 10m de altura.");
		}
	}
	
	/*
	 * [1] Carga de datos
	 * 
	 * Se genera el arreglo de árboles con tantos datos como el
	 * usuario desee. Esta opción debe poder ejecutarse repetidas veces, es decir,
	 * se deben poder agregar árboles al arreglo las veces que haga falta. En la
	 * carga de datos se debe controlar de no guardar datos repetidos.
	 */
	public static Arbol[] cargaArboles(int cantidadArboles) {
		// Declaración de variables
		Arbol[] arregloArbol;
		Arbol arbol;
		int i;
		
		// Inicialización de variables
		arregloArbol = new Arbol[cantidadArboles]; // Le doy una nueva longitud al arreglo de árboles
		i = 0;
		
		// Leo los valores para el nuevo árbol que va a estar en el arreglo
		while(i <= cantidadArboles-1) {
			arbol = cargaArbol(); // Genero un nuevo árbol
			
			// Se repite el árbol en el arreglo de árboles?
			if(existeEsteArbol(arregloArbol, arbol)) {
				System.out.println("Este árbol se repite. Ingrese nuevamente los datos.");
			}else {
				arregloArbol[i] = arbol;
				i++; // Sólo se incremente si los valores no están repetidos
			}
		}
		
		return arregloArbol;
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
				+ "[1] Carga de datos (IMPLEMENTADO)\n"
				+ "[2] Listado de árboles de más de 10m de altura (IMPLEMENTADO)\n"
				+ "[3] Cantidad de árboles que soportan por debajo de los 0° (IMPLEMENTADO)\n"
				+ "[4] Mostrar el nombre de todos los árboles que son frutales (IMPLEMENTADO)\n"
				+ "[5] Mostrar todos los árboles (IMPLEMENTADO)\n"
				);
	}
	
	public static boolean existeEsteArbol(Arbol[] arboles, Arbol arbol) {
		// Declaración de variables
		boolean seRepite, hayObjetos;
		int i;
		
		// Inicialización de variables
		i = 0;
		hayObjetos = true;
		seRepite = false;
		
		// Busca si se repite el árbol en el arreglo de árboles
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
	 * Cargar un objeto de tipo árbol
	 */
	public static Arbol cargaArbol() {
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
		System.out.println("Ingrese la temperatura mín. que soporta:");
		tempMinima = sc.nextInt();
		
		return new Arbol(nombre, altura, profRaices, frutos, tempMinima);
	}
	
	/**
	 * Cuenta la cantidad de árboles que soportan temperaturas por debajo de los 0ºC
	 * 
	 * @param arboles es el arreglo o listado de todos los árboles del vivero
	 * @param temp es la temperatura mínima que va a soportar el árbol
	 * @return devuelve la cantidad de árboles que soportan temperaturas por debajo de los 0ºC
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
	
	/*
	 * Este módulo lee nuevamente la cantidad de árboles para
	 * del vivero y carga los árboles al arreglo de árboles
	 */
	public static void opcion1(Arbol[] arboles) {
		// Declaración de variables
		int cantidadArboles;
		
		// Leer la cantidad de árboles
		sc = new Scanner(System.in);
		System.out.println("Ingrese la nueva cantidad de árboles del vivero:");
		cantidadArboles = sc.nextInt();
		arboles = cargaArboles(cantidadArboles); // Modifica el arreglo que tengo por referencia
	}
	
	/*
	 * Mostrar el menu de la aplicacion
	 */
	public static void mostrarMenu(Arbol[] arboles) {
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
			case 1: opcion1(arboles);break; // Opcion 1
			// [2] Listado de árboles de más de 10m de altura
			case 2: mostrarArbAlt10(arboles);; break; // Opcion 2
			// [3] Cantidad de árboles que soportan por debajo de los 0°
			case 3: mostrarCantSopTem(arboles);; break; // Opcion 3
			// [4] Mostrar el nombre de todos los árboles que son frutales
			case 4: mostrarNombArbFrut(arboles);; break; // Opcion 4
			// [5] Mostrar todos los árboles pero el más reciente
			case 5: mostrarArboles(arboles); break;
			default: System.err.println(Mensaje.leer(1)); break;
			}
		}
	}
	
	private static Scanner scLongitudDelArchivo;
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
	public static Arbol[] cargaDesdeArchivo(String ARCHIVO) {
		// Declaración de variables
		Arbol[] arregloArbol;
		int i;
		String contenidoDelArchivo;
		
		// Inicialización de variables
		contenidoDelArchivo = Archivo.leer(ARCHIVO);
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
	
	public static void mostrarMenuDeCargaInicial(Arbol[] arbol) {
		boolean esManual;
		//int cantidadArboles; // La cantidad de árboles que el vivero tiene a la venta
		
		// Carga de datos al arreglo por primera vez
		//sc = new Scanner(System.in);
		//System.out.println("Ingrese la cantidad de árboles que hay en el vivero: ");
		//cantidadArboles = sc.nextInt();
		//arbol = cargaArboles(cantidadArboles);
		System.out.println("¿Quiere cargar desde el archivo o de manera manual?");
		System.out.print("[1] Desde el archivo (IMPLEMENTADO)\n"
				+ "[2] Manual (IMPLEMENTADO)\n"
				);
		sc = new Scanner(System.in);
		esManual = sc.nextBoolean();
		if(esManual) {
			
		}else {
			arbol = cargaDesdeArchivo(NOMBRE_ARCHIVO);	
		}
	}
	
	public static void main(String[] args) {
		Arbol[] arbol = new Arbol[0]; // Arreglo de los árboles que el vivero tiene a la venta
		// Mostrar menú para la carga inicial del arreglo
		mostrarMenuDeCargaInicial(arbol);
		// Mostrar menú
		mostrarMenu(arbol);
	}
}
