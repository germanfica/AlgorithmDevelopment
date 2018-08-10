package com.germanfica.ad._2018._2nd.tp1.ej9;

import java.util.Scanner;
import com.germanfica.ad.util.Archivo;
import com.germanfica.ad.util.Mensaje;

/*
 * 9) En una exposición de vehículos se administra la información de los autos que
 * están exhibidos.
 * 
 * mostrarAutos();
 * Para cada auto se desea conocer: patente, marca, año de
 * fabricación, color y capacidad (cantidad de personas sentadas y cinturón de
 * seguridad disponible). En base a la información relevada se desea mostrar:
 * 
 * a) La cantidad de vehículos rojos.
 * b) La capacidad promedio de los autos exhibidos.
 * c) La marca de vehículos que más autos exhibe en la exposición.
 * 
 * Diseñar el algoritmo principal y los módulos correspondientes. Implementar en Java.
 */
public class Ej9 {
	private static final String NOMBRE_ARCHIVO = "src/com/germanfica/ad/_2018/_2nd/tp1/ej9/Autos.txt"; // Ruta del archivo Autos.txt
    private static Scanner sc;
    
	public static Auto[] autos(int longitud) {
		Auto[] autos = new Auto[longitud];
		String archivo = Archivo.leer(NOMBRE_ARCHIVO);
		
		sc = new Scanner(archivo); // Asignación de tarea al scanner para analizar el archivo
		
		sc.useDelimiter("\\s*,\\s*"); // Esto clasifica cuando se encuntra una coma
		
		// Agregar elementos al arreglo
		int i = 0;
		while(sc.hasNext()) {
			Auto auto = new Auto();
			auto.setPatente(sc.next());
			auto.setMarca(sc.next());
			auto.setAñoDeFabricación(sc.nextInt());
			auto.setColor(sc.next());
			auto.setCapacidad(sc.nextInt());
			autos[i] = auto;
			i++;
		}
		
		return autos;
	}
	
	public static void mostrarAutos(Auto[] autos) {
		for(int i = 0; i<=autos.length-1 ;i++) {
			System.out.println(autos[i].getPatente());
			System.out.println(autos[i].getMarca());
			System.out.println(autos[i].getAñoDeFabricación());
			System.out.println(autos[i].getColor());
			System.out.println(autos[i].getCapacidad());
			System.out.println("---------------------------------");
		}
	}
	
	public static void mostrarMenú() {
		boolean salir;
		int opción;
		
		// Cargar a todos los autos desde el archivo
		Auto[] autos = autos(3);
		
		// Inicializar variables
		salir = false;
		
		System.out.println(Mensaje.leer().get(0));		
		while(!salir) {
			sc = new Scanner(System.in);
			
			// Mostrar cartel de opciones
			System.out.print(
					"[0] Salir (IMPLEMENTADO)\n" +
					"[1] Mostrar todos los autos\n" +
					"[2] La cantidad de vehículos rojos\n" +
					"[3] La capacidad promedio de los autos exhibidos\n" +
					"[4] La marca de vehículos que más autos exhibe en la exposición\n"
					);
			
			// Leer opción del menú principal
			opción = sc.nextInt();
			
			switch (opción) {
			case 0:
				salir = true;
				break;
			case 1:
				mostrarAutos(autos);
				break;
			case 2:
				// cantidadDeAutosDeColor("rojo", autos);
				break;
			case 3:
				// capacidadPromedioDeLosAutos(autos);
				break;
			case 4:
				// marcaMásExhibida(autos);
				break;
			default:
				System.err.println("Esta opción no está definida. Seleccione una de las siguientes opciones: ");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		mostrarMenú();
	}
}
