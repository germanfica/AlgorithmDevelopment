package ar.martin;

import java.util.Scanner;

public class TestVivero {

	private static Scanner sc;

	public static void mostrarOpcMen() {
		System.out.println("Ingrese la opcion que desea:");
		System.out.println("[0] Salir");
		System.out.println("[1] Lista de los arboles mayores a 10 m de altura.");
        System.out.println("[2] Cantidad de arboles que soportan temperaturas bajo cero.");
        System.out.println("[3] Mostrar los arboles frutales.");
        System.out.println("[4] Cargar mas arboles");
	}
	
	public static void listarArbolesAltura(Arbol[] arreglo, int cantArbEnArreglo) {// funciona
        //este modulo muestra una lista de arboles mayores a 10m de altura.
        for (int i = 0; i < cantArbEnArreglo; i++) {
            if (arreglo[i].getAltura() > 10) {
                System.out.println("Los arboles son: " + arreglo[i].toString());
            }
        }
	}
	/*
	public static void menu(Arbol[] arreglo, int opcion, int max, int cantArbol) {
        //este modulo llama a los modulos segun la opcion elegida por el usuario
        switch (opcion) {
            case 1: ;
                listarArbolesAltura(arreglo, cantArbol);
                break;
            case 2: ;
                contarArbolBajoCero(arreglo, cantArbol);
                break;
            case 3:
                listarArbolesFrutales(arreglo, cantArbol);
                break;
            case 4:
                cargarMasArboles(arreglo, max, cantArbol);
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }
        */

	public static void contarArbolBajoCero(Arbol[] arreglo, int cantArbEnArreglo) {//funciona
        //este modulo cuenta los arboles que soportan temperaturas menores a 0 grados.
        int cantArbBajoCero = 0;
        for (int i = 0; i < cantArbEnArreglo; i++) {
            if (arreglo[i].getTempeMinima() < 0) {
                cantArbBajoCero++;
            }
        }
        System.out.println("La cantidad de Arbol/les es: " + cantArbBajoCero);
    }
	
	public static void listarArbolesFrutales(Arbol[] arreglo, int cantArbEnArreglo) {//funciona
        //este modulo muestra una lista de arboles que si tienen frutas.
        for (int i = 0; i < cantArbEnArreglo; i++) {
            if (arreglo[i].getFrutos() == true) {
                System.out.println("Los arboles son: " + arreglo[i].getNombre());
            } else {
                System.out.println("Ningun Arbol tiene frutas.");
            }
        }
    }
	
	/*
	 * Este modulo llama según la opcion elegida por el usuario
	 * un módulo
	 */
	public static void mostrarMenu(Arbol[] arregloArbol, int[] max) {
		// Declaración de variables
		int opcion, cantArboles;
		boolean salir;
		
		// Inicialización de variables
		salir = false;
		cantArboles = 0;
		
		while(!salir) {
			// Si todavía no se ha cargado ningun árbol entonces se debe cargar
			if(max[0]==0) {
				System.out.println("Ingrese la cantidad de arboles:");
				cantArboles = sc.nextInt();
				cargarArboles(arregloArbol, cantArboles, max);
			}else {
				mostrarOpcMen(); // Mostrar las opciones que hay para elegir
				opcion = sc.nextInt(); // Leer la opción
				switch (opcion) {
				case 0: salir = true; break;
				case 1: listarArbolesAltura(arregloArbol, cantArboles);
						break;
				case 2: contarArbolBajoCero(arregloArbol, cantArboles);
						break;
				case 3: listarArbolesFrutales(arregloArbol, cantArboles);
						break;
				case 4:
					System.out.println("Ingrese la cantidad de arboles:");
					cantArboles = sc.nextInt();
					cargarArboles(arregloArbol, cantArboles, max); break;
				default: System.err.println("INGRESE UNA OPCIÓN VÁLIDA."); break;
				}
			}
		}
	}
	
	/*
	 * Este modulo carga los arboles al arreglo pero si hay espacio
	 */
	public static void cargarArboles(Arbol[] arreglo, int cantArboles, int[] max) {
		if(max[0]+cantArboles>arreglo.length) {
			System.out.println("No queda espacio.");
		}else {
			for (int i = max[0]; i <= arreglo.length-cantArboles; i++) {
				arreglo[i] = arbol(arreglo, cantArboles, max);
			}
		}
	}

	/*
	 * Este módulo crea un árbol pero no se debe repetir en el
	 * arreglo de árboles
	 */
	public static Arbol arbol(Arbol[] arregloArbol, int cantArbol, int[] max) {
		// Declaración de variables
		String nombre;
		boolean frutos;
		int altura, profRaices, tempMinima;

		// Pedimos los datos al usuario
		System.out.println("Ingrese nombre:");
		nombre = sc.next(); // Le preguntamos el nombre del árbol

		while (seRepiteNombre(arregloArbol, nombre, max)) {
			System.out.println("Ingrese otro nombre porque este ya existe.");
			nombre = sc.next();
		}

		System.out.println("Ingrese los metros de altura:");
		altura = sc.nextInt();
		System.out.println("Ingrese los metros de las raices:");
		profRaices = sc.nextInt();
		System.out.println("Ingrese si tiene frutos:");
		frutos = sc.nextBoolean();
		System.out.println("Ingrese la temperatura mín. que soporta:");
		tempMinima = sc.nextInt();
		
		// Se cargó un nuevo elemento
		max[0]++;
		
		return new Arbol(nombre, altura, profRaices, frutos, tempMinima);
	}

	/*
	 * Verifica en el arreglo de árboles si se repite el nombre
	 */
	public static boolean seRepiteNombre(Arbol[] arreglo, String nombre, int[] max) {
		// Este módulo verifica si se repite el nombre
		int i = 0;
		boolean existe = false;
		while ((i < max[0]) && !existe) {
			if (arreglo[i].getNombre().equalsIgnoreCase(nombre)) {
				existe = true;
			}
			i++;
		}
		return existe;
	}

	public static void main(String[] args) {
		// Declaración de variables
		Arbol arregloArbol[];
		int[] max = {0};
		int longArreglo;
		
		// Inicialización de variables
		sc = new Scanner(System.in);
		
		System.out.println("Ingrese la longitud del arreglo:");
		longArreglo = sc.nextInt();
		
		arregloArbol = new Arbol[longArreglo];
		
		// Mostrar menú
		mostrarMenu(arregloArbol, max);
		
		System.out.println("Se cargaron: " + max[0] + " árboles.");
	}
}
