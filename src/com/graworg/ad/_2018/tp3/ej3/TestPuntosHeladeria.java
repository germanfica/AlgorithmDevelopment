package com.graworg.ad._2018.tp3.ej3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 	1. Escribir un programa TestPuntosHeladeria que permita:
 *  - Cargar y operar con los datos de un cliente. (IMPLEMENTADO)
 *  
 *  a) Debe contar con un menú de opciones para probar toda la funcionalidad del TDA.
 *  
 *  2. Implementar en el puntaje de la heladería:
 * 	 - Una cantidad máxima de puntos logrables (igual para todos los clientes). La
 *   cantidad máxima fue definida por el dueño de la heladería como 5000 puntos. (IMPLEMENTADO)
 *   - El dueño podría modificar el tope máximo de puntos y consultarlo cuando desee
 *   (IMPLEMENTADO).
 *   - Si un cliente se excede esa cantidad, el usuario está obligado a canjear por
 *   algún premio.
 *  
 *  a) Para incluir esto en el modelo UML e implementación en java, cómo lo harías?
 *  
 *  b) Modificá tu TDA original y escribí en los comentarios las mejoras realizadas
 *  para esta nueva versión.
 *  
 *  3. Considerá diseñar algún mecanismo para guardar la información de
 *  todos los clientes con un máximo de 200 clientes. (IMPLEMENTADO)
 *  
 *  Como un detalle de implementación te pedimos que utilices un menú de opciones para:
 *  a) Cargar los clientes a partir de un archivo dado por el dueño de la heladería.
 *  (podés usar el archivo que publicamos en este link:
 *  http://pedco.uncoma.edu.ar/mod/resource/view.php?id=203583) (IMPLEMENTADO)
 *  
 *  b) Identificar a uno de los clientes que tenga mayor puntaje logrado. Mostrar sus datos. (IMPLEMENTADO)
 *  
 *  c) Identificar si hay clientes que no tienen puntos actualmente. (IMPLEMENTADO)
 */
// Probablemente me conviene modificar segun un id.
public class TestPuntosHeladeria {
	private static Scanner sc;
    private static final String NOMBRE_ARCHIVO = "src/com/graworg/ad/_2018/tp3/ej3/clientes.txt";
    private static int CANTIDAD_MAX_CLIENTES = 200; // Máximo 200 clientes
	
	public static String clientesToString(Cliente[] clientes) {
		String textoPlano = "";
		int i = 0;
		
		while(i <= clientes.length-1 && clientes[i]!=null) {
			if(i==0) {
				textoPlano = textoPlano + clientes[i].getNombre() + ", " + clientes[i].getPuntos();
			}else {
				textoPlano = textoPlano + ", " + clientes[i].getNombre() + ", " + clientes[i].getPuntos();
			}
			i = i +1;
		}
		
		return textoPlano;
	}
	
	/*
	 * [1] Volver a cargar los clientes del archivo clientes.txt
	 */
	/**
	 * Cargar a un arreglo todos los clientes de un archivo determinado
	 * @param longitud
	 * @return
	 */
	public static Cliente[] clientesDesdeArchivo(int longitud) {
		Cliente[] clientes = new Cliente[longitud];
		int i = 0;
    	
    	try{
    		BufferedReader buff = new BufferedReader(new FileReader(NOMBRE_ARCHIVO));
    		
    		sc = new Scanner(buff);
    		sc.useDelimiter("\\s*,\\s*");
    		
    		while(sc.hasNext()) {
    			Cliente cliente = new Cliente(sc.next());
    			cliente.setPuntos(sc.nextInt());
    	    	clientes[i] = cliente;
    	    	//System.out.println(clientes[i].toString());
    			i = i + 1;
    		}
    		buff.close();
    	}
    	catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage() + "\nEl archivo no existe.");
        }
        catch (IOException ex) {
            System.err.println("Error al leer o escribir en el archivo.");
        }
		
		return clientes;
	}
	
	/*
	 * [2] Guardar todos los cambios recientes en el archivo clientes.txt
	 */
	public static void guardarALosClientesEnUnArchivo(Cliente[] clientes) {
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {
			String contenido = clientesToString(clientes);

			fw = new FileWriter(NOMBRE_ARCHIVO);
			bw = new BufferedWriter(fw);
			bw.write(contenido);

			System.out.println("Listo.");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace(); // Error al leer o escribir en el archivo
			}
		}
	}
	
	/*
	 * [3] Modificar la cantidad máxima de puntos logrables
	 */
	public static void modificarLaCantidadMáximaDePuntosLogrables() {
		int cantidadMáximaDePuntosLogrables;
		
		sc = new Scanner(System.in);
		
		System.out.println("Ingrese la nueva cantidad máxima de puntos logrables: ");
		
		cantidadMáximaDePuntosLogrables = sc.nextInt();
		
		Cliente.cantidadMáximaDePuntosLogrables = cantidadMáximaDePuntosLogrables;
		
		System.out.println("Operación ejecutada con éxito\nAhora la nueva cantidad máxima de puntos logrables es de: " + Cliente.cantidadMáximaDePuntosLogrables + " puntos.");
	}
	
	/*
	 * [4] Mostrar nombre del cliente
	 */
	public static void mostrarNombreDelCliente(Cliente[] clientes) {
		int ID;
		
		System.out.println("Ingrese el ID del cliente: ");
		
		sc = new Scanner(System.in);
		ID = sc.nextInt();
		
		System.out.println("Nombre del cliente con el ID " + ID + ": " +  clientes[ID].getNombre());
	}
	
	/*
	 * [5] Mostrar puntos del cliente
	 */
	public static void mostrarLosPuntosDelCliente(Cliente[] clientes) {
		int ID;
		
		System.out.println("Ingrese el ID del cliente: ");
		
		sc = new Scanner(System.in);
		ID = sc.nextInt();
		
		System.out.println("Puntos del cliente con el ID " + ID + ": " + clientes[ID].getPuntos());
	}
	
	/*
	 * [6] Mostrar cliente con su puntaje
	 */
	public static void mostrarClienteConSuPuntaje(Cliente[] clientes) {
		int ID;
		
		System.out.println("Ingrese el ID del cliente: ");
		
		sc = new Scanner(System.in);
		ID = sc.nextInt();
		
		System.out.println("El cliente de nombre " + clientes[ID].getNombre() + " y ID " + ID + " tiene " + clientes[ID].getPuntos() + " puntos.");
	}
	
	/*
	 * [7] Mostrar si dos clientes son iguales
	 * Nota: hay muchos casos prácticos para usar el método equals del objeto Cliente,
	 * este es sólo una de las aplicaciones posibles.
	 */
	public static void mostrarSiDosClientesSonIguales(Cliente[] clientes) {
		int ID_1, ID_2;
		
		System.out.println("Ingrese el ID del primer cliente: ");
		
		sc = new Scanner(System.in);
		ID_1 = sc.nextInt(); // Leer ID del primer cliente
		
		System.out.println("Ingrese el ID del segundo cliente: ");
		
		sc = new Scanner(System.in);
		ID_2 = sc.nextInt(); // Leer ID del segundo cliente
		
		if(clientes[ID_1].equals(clientes[ID_2])) {
			System.out.println("Los clientes son iguales.");
		}else {
			System.out.println("Los clientes no son iguales.");
		}
	}
	
	/*
	 * [8] Modificar el nombre del cliente
	 */
	public static void modificarElNombreAlCliente(Cliente[] clientes) {
		System.out.println("Ingrese el ID del cliente: ");
		String nombre;
		int ID;
		
		sc = new Scanner(System.in);
		ID = sc.nextInt(); // Leer ID del cliente
		
		sc = new Scanner(System.in); // Es necesario para poder leer la cadena completa.
		System.out.println("Ingrese el nuevo nombre para el cliente con id "+ ID +": ");
		nombre = sc.nextLine();
		
		clientes[ID].setNombre(nombre);
		System.out.println("El nombre se ha cambiado con éxito.");
	}
	
	/**
	 * Cambiar el puntaje de un cliente determinado
	 */
	/*
	 * [9] Modificar el puntaje de un cliente
	 */
	public static void modificarPuntajeAlCliente(Cliente[] clientes) {
		System.out.println("Ingrese el ID del cliente: ");
		int ID, puntos;
		
		sc = new Scanner(System.in);
		ID = sc.nextInt(); // Leer ID del cliente
		
		sc = new Scanner(System.in); // Es necesario
		System.out.println("Ingrese el nuevo puntaje para el cliente con id "+ ID +": ");
		puntos = sc.nextInt();
		
		clientes[ID].setPuntos(puntos);
		System.out.println("El puntaje se ha cambiado con éxito.");
	}
	
	/*
	 * [10] Sumar puntos al cliente
	 * Nota: si un cliente excede la cantidad máxima de puntos logrables,
	 * el usuario está obligado a canjear los puntos por algún premio.
	 * 
	 * ¿Después sumo la diferencia con el canje?
	 */
	public static void sumarPuntosAlCliente(Cliente[] clientes) {
		System.out.println("Ingrese el ID del cliente: ");
		int mas;
		int ID;
		
		sc = new Scanner(System.in);
		ID = sc.nextInt(); // Leer ID del cliente
		
		sc = new Scanner(System.in); // Es necesario para poder leer la cadena completa.
		System.out.println("Ingrese la cantidad de puntos que le quiere dar al cliente " + clientes[ID].getNombre() + " de id "+ ID +": ");
		mas = sc.nextInt();
		
		if(clientes[ID].getPuntos()+mas>Cliente.cantidadMáximaDePuntosLogrables) {
			System.out.println("El cliente ha excedido la cantidad máxima de puntos logrables.\nDebe primero canjear sus puntos por algún premio.");
		}else {
			clientes[ID].sumarPuntos(mas);
			System.out.println("Los puntos se han sumado con éxito.");
		}
	}
	
	/*
	 * [11] Canjear puntos del cliente
	 */
	public static void canjeDePuntosAlCliente(Cliente[] clientes) {
		System.out.println("Ingrese el ID del cliente: ");
		int ID, canje;
		sc = new Scanner(System.in);
		ID = sc.nextInt();
		
		System.out.println("Ingrese la cantidad de puntos a canjear: ");
		canje = sc.nextInt();
		
		if(clientes[ID].canjearPuntos(canje)) {
			System.out.println("Se pudo efectuar la operación.");
		}else {
			System.out.println("No fue posible efectuar la operación.");
		}
	}
	
	/*
	 * [12] Mostrar el cliente de mayor puntaje logrado
	 */
	public static void mostrarElClienteDeMayorPuntajeLogrado(Cliente[] clientes) {
		int elÍndiceDelClienteConMayorPuntajeLogrado = 0;
		int puntajeDelClienteAnterior = clientes[1].getPuntos();
		int i = 0;
		
		while(i<= clientes.length-1 && clientes[i]!=null) {
			if(clientes[i].getPuntos()>puntajeDelClienteAnterior) {
				puntajeDelClienteAnterior = clientes[i].getPuntos();
				elÍndiceDelClienteConMayorPuntajeLogrado = i;
			}
			i = i + 1;
		}
		
		/*
		for(int i = 1; i<= clientes.length-1 ;i++) {
			if(clientes[i]!=null) {
				if(clientes[i].getPuntos()>puntajeDelClienteAnterior) {
					puntajeDelClienteAnterior = clientes[i].getPuntos();
					elÍndiceDelClienteConMayorPuntajeLogrado = i;
				}
			}
		}
		*/
		
		System.out.println("El cliente con el mayor puntaje logrado es: " + clientes[elÍndiceDelClienteConMayorPuntajeLogrado].getNombre() + " con " + clientes[elÍndiceDelClienteConMayorPuntajeLogrado].getPuntos() + " puntos.");
	}
	
	/*
	 * [13] Mostrar si hay clientes que no tienen puntos actualmente.
	 */
	public static void mostrarSiHayClientesQueNoTienenPuntosActualmente(Cliente[] clientes) {
		boolean hayClientesQueNoTienenPuntos = false;
		int i = 0;
		
		while(i <= clientes.length-1 && hayClientesQueNoTienenPuntos==false && clientes[i]!=null) {
			if(clientes[i].getPuntos()==0) {
				hayClientesQueNoTienenPuntos = true;
			}
			i = i +1;
		}
		if(hayClientesQueNoTienenPuntos == true) {
			System.out.println("Hay clientes que no tienen puntos actualmente.");
		}else {
			System.out.println("Todos los clientes tienen puntos actualmente.");
		}
	}
	
	public static void menú() {
		Cliente[] clientes;
		boolean salir;
		int opción;
		
		// Inicializar variables
		salir = false;
		
		// Crear y cargar el repositorio de clientes desde un archivo
		clientes = clientesDesdeArchivo(CANTIDAD_MAX_CLIENTES); // Máximo 200 clientes
		
		System.out.println("Bienvenido a la consola de la aplicación");
		
		while(!salir)
		{
			sc = new Scanner(System.in);
			
			// Mostrar cartel de opciones
			System.out.print(
					"[0] Salir (IMPLEMENTADO)\n" +
					"[1] Volver a cargar los clientes del archivo clientes.txt (IMPLEMENTADO)\n" + // Ahorra mucho tiempo.
					"[2] Guardar todos los cambios recientes en el archivo clientes.txt (IMPLEMENTADO)\n" +
					"[3] Modificar la cantidad máxima de puntos logrables (IMPLEMENTADO)\n" +
					// Observadoras
					"[4] Mostrar nombre del cliente (IMPLEMENTADO)\n" +
					"[5] Mostrar puntos del cliente (IMPLEMENTADO)\n" +
					"[6] Mostrar cliente con su puntaje (IMPLEMENTADO)\n" +
					"[7] Mostrar si dos clientes son iguales (IMPLEMENTADO)\n" +
					// Modificadoras
					"[8] Modificar nombre al cliente (IMPLEMENTADO)\n" +
					"[9] Modificar el puntaje de un cliente (IMPLEMENTADO)\n" +
					// Propias del tipo
					"[10] Sumar puntos al cliente (IMPLEMENTADO)\n" +
					"[11] Canjear puntos al cliente (IMPLEMENTADO)\n" +
					"[12] Mostrar el cliente de mayor puntaje logrado (IMPLEMENTADO)\n" +
					"[13] Mostrar si hay clientes que no tienen puntos actualmente (IMPLEMENTADO)\n" // Boolean
					);
			
			// Leer opción del menú principal
			opción = sc.nextInt();
			
			switch (opción) {
			case 0:
				System.err.println("¿Quiere guardar todos los cambios hechos en el archivo clientes.txt? SI/NO");
				String respuesta = "";
				sc = new Scanner(System.in);
				respuesta = sc.next();
				if(respuesta.toLowerCase().equals("SI") || respuesta.toLowerCase().equals("SÍ")) {
					guardarALosClientesEnUnArchivo(clientes);
				}
				salir = true;
				break;
			case 1:
				clientes = clientesDesdeArchivo(CANTIDAD_MAX_CLIENTES);
				break;
			case 2:
				guardarALosClientesEnUnArchivo(clientes);
				break;
			case 3:
				modificarLaCantidadMáximaDePuntosLogrables();
				break;
			case 4:
				mostrarNombreDelCliente(clientes);
				break;
			case 5:
				mostrarLosPuntosDelCliente(clientes);
				break;
			case 6:
				mostrarClienteConSuPuntaje(clientes);
				break;
			case 8:
				modificarElNombreAlCliente(clientes);
				break;
			case 7:
				mostrarSiDosClientesSonIguales(clientes);
				break;
			case 9:
				modificarPuntajeAlCliente(clientes);
				break;
			case 10:
				sumarPuntosAlCliente(clientes);
				// Si un cliente se excede cantidadMáximaDePuntosLogrables, el usuario está obligado a canjear por algún premio.
				break;
			case 11:
				canjeDePuntosAlCliente(clientes);
				break;
			case 12:
				mostrarElClienteDeMayorPuntajeLogrado(clientes);
				break;
			case 13:
				mostrarSiHayClientesQueNoTienenPuntosActualmente(clientes);
				break;
			default:
				System.err.println("Esta opción no está definida. Seleccione una de las siguientes opciones: ");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		menú();
	}
}
