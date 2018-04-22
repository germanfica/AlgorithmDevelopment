package com.graworg.ad._2018.tp3.ej3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
	private static Scanner sc = new Scanner(System.in);
	static final int CANTNUMEROS = 10;
    static final String NOMBRE_ARCHIVO = "src/com/graworg/ad/_2018/tp3/ej3/clientes.txt";
	
	/*
	 * Guardar los datos del cliente en el disco
	 */
	public static void guardarClienteEnElDisco(Cliente[] data) {
		try {
			// Abrir un archivo para escribir, llamado Cliente.data.
			FileOutputStream archivoDeguardado = new FileOutputStream("Cliente.dat");
			
			// Crear ObjectOutputStream para poner objetos en el archivo a guardar.
			ObjectOutputStream guardar = new ObjectOutputStream(archivoDeguardado);
			
			// Ahora lo guardamos
			guardar.writeObject(data);
			
			// Cierramos el archivo
			guardar.close(); // Esto también cierra archivoDeguardado
			
			System.out.println("Cliente guardado con éxito.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * Cargar los datos del cliente desde disco.
	 */
	public static String cargarLosDatosDelClienteDesdeElDisco() {
		String data = "";
		
		try {
			// Open file to read from, named SavedObj.sav.
			FileInputStream archivoDeguardado = new FileInputStream("Cliente.dat");
			
			// Create an ObjectInputStream to get objects from save file.
			ObjectInputStream guardar = new ObjectInputStream(archivoDeguardado);
			
			// Now we do the restore.
			// readObject() returns a generic Object, we cast those back
			// into their original class type.
			// For primitive types, use the corresponding reference class.
			data = (String) guardar.readObject();
			
			// Close the file.
			guardar.close(); // This also closes saveFile.
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
	}
	
	/*
	 * Cargar puntaje
	 */
	public static Cliente cambiarPuntos(){
		String nombreDelCliente;
		int puntosDelCliente;
		
		System.out.println("Ingrese el nombre del cliente: ");
		nombreDelCliente = sc.next(); // Leer nombre cliente
		System.out.println("Ingrese la cantidad de puntos: ");
		puntosDelCliente = sc.nextInt(); // Leer puntos del cliente
		
		Cliente cliente = new Cliente(nombreDelCliente);
		cliente.setPuntos(puntosDelCliente);
		
		return cliente;
	}
	
	//System.out.print("Bienvenido a El rico helado\nIngrese nombre del primer cliente: ");
	//nombreDelCliente = sc.next();
	
	public static void menú() {
		Cliente[] cliente;
		String nombreDelCliente;
		boolean salir;
		int opción;
		
		// Inicializar variables
		salir = false;
		
		// Crear repositorio de clientes
		cliente = new Cliente[200]; // Máximo 200 clientes
		
		System.out.println("Bienvenido a la consola de la aplicación");
		
		while(!salir)
		{
			// Mostrar cartel de opciones
			System.out.print(
					"[0] Salir\n" +
					"[1] Cargar clientes desde un archivo\n" + // Me puede ahorrar mucho trabajo.
					"[2] Modificar la cantidad máxima de puntos logrables\n" +
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
				salir = true;
				break;
			case 1:
				//cliente = cambiarPuntos();
				break;
			case 2:
				System.out.println(cliente.toString());
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
