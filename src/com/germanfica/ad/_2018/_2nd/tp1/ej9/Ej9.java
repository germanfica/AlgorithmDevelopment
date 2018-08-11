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
	
	public static int cantidadDeAutosDeColor(String color, Auto[] autos) {
		// Declaración de variables
		int cant;
		
		// Inicialización de variables
		cant = 0;
		
		for (int i = 0; i < autos.length; i++) {
			if(color.toLowerCase().equals(autos[i].getColor().toLowerCase())) {
				cant++;
			}
		}
		
		return cant;
	}
	
	public static int capacidadPromedioDeLosAutos(Auto[] autos) {
		// Declaración de variables
		int sumaCap, longitud;
		
		// Inicialización de variables
		sumaCap = 0;
		longitud = autos.length;
		
		for (int i = 0; i <= longitud-1; i++) {
			sumaCap += autos[i].getCapacidad();
		}
		
		return sumaCap/longitud;
	}
	
	/*
	 * arreglo el arreglo y
	 * n la longitud del arreglo (arreglo.length)
	 * 
	 * link 1: http://javabasicosise.blogspot.com/2012/12/ordenamiento-de-string-burbuja.html
	 * link 2: https://www.javatpoint.com/java-string-compareto
	 */
	public static void burbujaMejorado(Auto[] autos, int n) {
		Auto auxiliar;
		int i;
		boolean ordenado;
		
		ordenado = false;
		i = 0;
		
		while(i<=n-1 && ordenado==false) {
			ordenado = true;
			
			for(int j=0;j<=(n-i-2);j++) {
				if(autos[j].getColor().compareTo(autos[j+1].getColor())>0) {
					ordenado = false;
					auxiliar = autos[j];
					autos[j] = autos[j+1];
					autos[j+1] = auxiliar;
				}
			}
			i++;
		}
		mostrarAutos(autos);
	}
	
	public static void marcaMásExhibida(Auto[] autos) {
		// Marca es par, cantidad es impar
		// concatenas todo en un String, y usar el scanner para obtener los datos
		// debe estar todo ordenado (método de ordenamiento, que ordene los colores,
		// segun la correspondencia en el abecdario
		for (int i = 0; i <= autos.length-1; i++) {
			//if(autos[i].getMarca()) {
			//	
			//}
		}
	}
	
	// agregarAutos(Auto autos); // podria incrementar la longitud actual + 1 o preguntar cuantos autos quiere agregar
	
	public static void mostrarMenú() {
		boolean salir;
		int opción;
		
		// Cargar a todos los autos desde el archivo
		Auto[] autos = autos(4);
		
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
					"[4] La marca de vehículos que más autos exhibe en la exposición\n" +
					"[5] Burbuja Mejorado\n"
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
				String color;
				color = "rojo";
				System.out.println("Hay " + cantidadDeAutosDeColor(color, autos) + " autos de color "+ color);
				break;
			case 3:
				System.out.println("La capacidad promedio de los autos exhibidos: " + capacidadPromedioDeLosAutos(autos));
				break;
			case 4:
				marcaMásExhibida(autos);
				break;
			case 5:
				burbujaMejorado(autos,autos.length);
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
