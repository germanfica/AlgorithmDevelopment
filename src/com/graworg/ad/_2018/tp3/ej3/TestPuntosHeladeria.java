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
 *  - Cargar y operar con los datos de un cliente.
 *  
 *  a) Debe contar con un menú de opciones para probar toda la funcionalidad del TDA.
 *  
 *  2. Implementar en el puntaje de la heladería:
 * 	 - Una cantidad máxima de puntos logrables (única e igual para todos los clientes). La
 *   cantidad máxima fue definida por el dueño de la heladería como 5000 puntos.
 *   - Si un cliente se excede esa cantidad, el usuario está obligado a canjear por
 *   algún premio.
 *   - El usuario podría modificar el tope máximo de puntos y consultarlo cuando desee.
 *  
 *  a) Para incluir esto en el modelo UML e implementación en java, cómo lo harías?
 *  
 *  b) Modificá tu TDA original y escribí en los comentarios las mejoras realizadas
 *  para esta nueva versión.
 *  
 *  3. Considerá diseñar algún mecanismo para guardar la información de
 *  todos los clientes con un máximo de 200 clientes.
 *  
 *  Como un detalle de implementación te pedimos que utilices un menú de opciones para:
 *  a) Cargar los clientes a partir de un archivo dado por el dueño de la heladería.
 *  (podés usar el archivo que publicamos en este link:
 *  http://pedco.uncoma.edu.ar/mod/resource/view.php?id=203583)
 *  
 *  b) Identificar a uno de los clientes que tenga mayor puntaje logrado. Mostrar sus datos.
 *  
 *  c) Identificar si hay clientes que no tienen puntos actualmente.
 */
// Probablemente me conviene modificar segun un id.
public class TestPuntosHeladeria {
	private static Scanner sc;
    private static final String NOMBRE_ARCHIVO = "src/com/graworg/ad/_2018/tp3/ej3/clientes.txt";
    private static int CANTIDAD_MAX_CLIENTES = 200; // Máximo 200 clientes
	
	/**
	 * Cambiar el puntaje de un cliente
	 * @return
	 */
	public static Cliente cambiarPuntosAlCliente(Cliente cliente){
		int nuevaCantidadDePuntosParaElCliente;
		
		sc = new Scanner(System.in);

		System.out.println("Ingrese la cantidad de puntos: ");
		nuevaCantidadDePuntosParaElCliente = sc.nextInt(); // Leer puntos del cliente
		
		cliente.setPuntos(nuevaCantidadDePuntosParaElCliente);
		
		return cliente;
	}
	
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
	 * [4] Mostrar nombre del cliente
	 */
	public static void mostrarNombreDelCliente(Cliente cliente) {
		System.out.println("Nombre del cliente: " + cliente.getNombre());
	}
	
	/*
	 * [5] Mostrar puntos del cliente
	 */
	public static void mostrarLosPuntosDelCliente(Cliente cliente) {
		System.out.println("Puntos del cliente: " + cliente.getPuntos());
	}
	
	/*
	 * [6] Mostrar cliente con su puntaje
	 */
	public static void mostrarClienteConSuPuntaje(Cliente cliente) {
		System.out.println("El cliente " + cliente.getNombre() + " tiene " + cliente.getPuntos() + " puntos.");
	}
	
	/*
	 * [8] Modificar el nombre del cliente
	 */
	public static void modificarElNombreDelCliente(Cliente cliente, String nombre) {
		cliente.setNombre(nombre);
	}
	
	/*
	 * [9] Modificar los puntos del cliente
	 */
	public static void modificarLosPuntosDelCliente() {
		
	}
	
	/*
	 * [10] Sumar puntos al cliente
	 */
	public static void sumarPuntosAlCliente() {
		
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
					"[0] Salir\n (IMPLEMENTADO)" +
					"[1] Volver a cargar los clientes del archivo clientes.txt (IMPLEMENTADO)\n" + // Ahorra mucho tiempo.
					"[2] Guardar todos los cambios recientes en el archivo clientes.txt (IMPLEMENTADO)\n" +
					"[3] Modificar la cantidad máxima de puntos logrables\n" +
					// Observadoras
					"[4] Mostrar nombre del cliente\n" +
					"[5] Mostrar puntos del cliente\n" +
					"[6] Mostrar cliente con su puntaje\n" +
					"[7] Verificar si dos clientes son iguales\n" + // DUDOSO
					// Modificadoras
					"[8] Modificar nombre del cliente\n" +
					"[9] Modificar puntos del cliente\n" +
					// Propias del tipo
					"[10] Sumar puntos al cliente\n" +
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
				System.err.println("Esta opción no existe. Seleccione una de las siguientes opciones: ");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		menú();
	}
}
