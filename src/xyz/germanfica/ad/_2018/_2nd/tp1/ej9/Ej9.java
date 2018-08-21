package xyz.germanfica.ad._2018._2nd.tp1.ej9;

import java.util.Scanner;

import xyz.germanfica.util.Archivo;
import xyz.germanfica.util.Mensaje;

/*
 * 9) En una exposicion de vehículos se administra la informacion de los autos que
 * estan exhibidos.
 * 
 * mostrarAutos();
 * Para cada auto se desea conocer: patente, marca, aioo de
 * fabricacion, color y capacidad (cantidad de personas sentadas y cinturon de
 * seguridad disponible). En base a la informacion relevada se desea mostrar:
 * 
 * a) La cantidad de vehículos rojos.
 * b) La capacidad promedio de los autos exhibidos.
 * c) La marca de vehículos que mas autos exhibe en la exposicion.
 * 
 * Diseioar el algoritmo principal y los modulos correspondientes. Implementar en Java.
 * 
 * Ya lo tenías hecho, pero hay que revisarlo: com/germanfica/ad/_2017/tp1/Excercise7.java
 */
public class Ej9 {
	private static final String NOMBRE_ARCHIVO = "src/com/germanfica/ad/_2018/_2nd/tp1/ej9/Autos.txt"; // Ruta del archivo Autos.txt
    private static Scanner sc;
    
	public static Auto[] autos(int longitud) {
		Auto[] autos = new Auto[longitud];
		String archivo = Archivo.leer(NOMBRE_ARCHIVO);
		
		sc = new Scanner(archivo); // Asignacion de tarea al scanner para analizar el archivo
		
		sc.useDelimiter("\\s*,\\s*"); // Esto clasifica cuando se encuntra una coma
		
		// Agregar elementos al arreglo
		int i = 0;
		while(sc.hasNext()) {
			Auto auto = new Auto();
			auto.setPatente(sc.next());
			auto.setMarca(sc.next());
			auto.setAiooDeFabricacion(sc.nextInt());
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
			System.out.println(autos[i].getAiooDeFabricacion());
			System.out.println(autos[i].getColor());
			System.out.println(autos[i].getCapacidad());
			System.out.println("---------------------------------");
		}
	}
	
	public static int cantidadDeAutosDeColor(String color, Auto[] autos) {
		// Declaracion de variables
		int cant;
		
		// Inicializacion de variables
		cant = 0;
		
		for (int i = 0; i < autos.length; i++) {
			if(color.toLowerCase().equals(autos[i].getColor().toLowerCase())) {
				cant++;
			}
		}
		
		return cant;
	}
	
	public static int capacidadPromedioDeLosAutos(Auto[] autos) {
		// Declaracion de variables
		int sumaCap, longitud;
		
		// Inicializacion de variables
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
	public static Auto[] burbujaMejorado(Auto[] autos, int n) {
		Auto auxiliar;
		int i;
		boolean ordenado;
		
		ordenado = false;
		i = 0;
		
		while(i<=n-1 && ordenado==false) {
			ordenado = true;
			
			for(int j=0;j<=(n-i-2);j++) {
				if(autos[j].getMarca().toLowerCase().compareTo(autos[j+1].getMarca().toLowerCase())>0) {
					ordenado = false;
					auxiliar = autos[j];
					autos[j] = autos[j+1];
					autos[j+1] = auxiliar;
				}
			}
			i++;
		}
		return autos;
	}
	
	public static void obtenerTodasLasMarcas() {
		
	}
	
	/*
	 * Regla: la marca es pary la cantidad es impar.
	 * Hay que concatenar la marca y la cantidad en un arreglo
	 * de Strings, y usar el scanner para obtener los datos.
	 * 
	 * El arreglo a ser analizado debe estar todo ordenado (usar
	 * método de ordenamiento, que ordene todos los colores,
	 * segun la correspondencia en el abecdario)
	 */
	public static String nombreDeLamarcaMasExhibida(Auto[] autos) {
		// Declaracion de variables
		String nombreMarcaMasExhibida, nombreMarca;
		int cantAutosMarcaMasExhibida, cantAutosMarca;
		
		// Inicializacion de variables
		nombreMarcaMasExhibida = "";
		cantAutosMarcaMasExhibida = 0;
		nombreMarca = autos[0].getMarca();
		cantAutosMarca = 1;
		
		// Ordenar el arreglo
		autos = burbujaMejorado(autos,autos.length);
		
		for (int i = 0; i <= autos.length-1; i++) {
			// Si se encontro una nueva marca para contar entonces nombreMarca = autos[i].getMarca()
			if(!autos[i].getMarca().toLowerCase().equals(nombreMarca.toLowerCase())) {
				nombreMarca = autos[i].getMarca();
				cantAutosMarca = 1;
			}
			// Sino si la cantidad de autos de la marca actual es mayor a la marca mas exhibida,
			// bueno, entonces tenemos una marca que exhibio mas.
			else if(cantAutosMarca>cantAutosMarcaMasExhibida) {
				nombreMarcaMasExhibida = nombreMarca;
				cantAutosMarcaMasExhibida = cantAutosMarca;
			}

			//System.out.println("Nombre de la marca: " + nombreMarca + " ; " + autos[i].getMarca());
			//System.out.println("Cantidad de autos exhibidos: " + cantAutosMarca);
			//System.out.println("Nombre de la marca mas exhibida: " + nombreMarcaMasExhibida);
			//System.out.println("Cantidad de autos de la marca mas exhibida: " + cantAutosMarcaMasExhibida);
			
			cantAutosMarca++;
		}
		
		return nombreMarcaMasExhibida;
	}
	
	// agregarAutos(Auto autos); // podria incrementar la longitud actual + 1 o preguntar cuantos autos quiere agregar
	
	public static void mostrarMenú() {
		boolean salir;
		int opcion;
		
		// Cargar a todos los autos desde el archivo
		Auto[] autos = autos(7);
		
		// Inicializar variables
		salir = false;
		
		System.out.println(Mensaje.leer(0));		
		while(!salir) {
			sc = new Scanner(System.in);
			
			// Mostrar cartel de opciones
			System.out.print(
					"[0] Salir (IMPLEMENTADO)\n" +
					"[1] Mostrar todos los autos\n" +
					"[2] La cantidad de vehículos rojos\n" +
					"[3] La capacidad promedio de los autos exhibidos\n" +
					"[4] La marca de vehículos que mas autos exhibe en la exposicion\n" +
					"[5] Burbuja Mejorado\n"
					);
			
			// Leer opcion del menú principal
			opcion = sc.nextInt();
			
			switch (opcion) {
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
				System.out.println("La marca mas exhibida fue: " + nombreDeLamarcaMasExhibida(autos));
				break;
			case 5:
				mostrarAutos(burbujaMejorado(autos,autos.length));
				break;
			default:
				System.err.println("Esta opcion no esta definida. Seleccione una de las siguientes opciones: ");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		mostrarMenú();
	}
}
