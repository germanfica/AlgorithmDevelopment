package com.graworg.ad._2018.tp3.ej3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
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

public class TestPuntosHeladeria {
	private static Scanner sc;
    private static final String NOMBRE_ARCHIVO = "src/com/graworg/ad/_2018/tp3/ej3/clientes.txt";
	
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
	
	public static void guardarALosClientesEnUnArchivo() {
		
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
	
	public static void menú() {
		Cliente[] clientes;
		boolean salir;
		int opción;
		
		// Inicializar variables
		salir = false;
		
		// Crear y cargar el repositorio de clientes desde un archivo
		clientes = clientesDesdeArchivo(200); // Máximo 200 clientes
		
		System.out.println("Bienvenido a la consola de la aplicación");
		
		sc = new Scanner(System.in);
		
		while(!salir)
		{
			// Mostrar cartel de opciones
			System.out.print(
					"[0] Salir\n" +
					"[1] Recargar los clientes desde el archivo clientes.txt\n" + // Ahorra mucho tiempo.
					"[2] Guardar todos los cambios recientes en el archivo clientes.txt\n" +
					"[3] Modificar la cantidad máxima de puntos logrables\n" +
					// Observadoras
					"[3] Mostrar nombre del cliente\n" +
					"[4] Mostrar puntos del cliente\n" +
					"[5] Mostrar cliente con su puntaje\n" +
					"[6] Verificar los clientes son iguales\n" +
					// Modificadoras
					"[7] Modificar nombre del cliente\n" +
					"[8] Modificar puntos del cliente\n" +
					// Propias del tipo
					"[9] Sumar puntos al cliente\n" +
					"[10] Canjear puntos del cliente\n" +
					"[11] Mostrar cliente de mayor puntaje logrado\n" +
					"[12] Mostrar si hay clientes que no tienen puntos actualmente.\n" // Boolean
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
					guardarALosClientesEnUnArchivo();
				}
				salir = true;
				break;
			case 1:
				//cliente = cambiarPuntos();
				break;
			case 2:
				System.out.println(clientes.toString());
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
