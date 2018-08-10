package com.germanfica.ad._2018._2nd.tp1.ej8;

import java.util.Scanner;
import com.germanfica.ad.util.Archivo;
import com.germanfica.ad.util.Mensaje;

/*
 * 8) En un evento realizado por la empresa de turismo Argentar se
 * hizo una encuesta a algunas de las personas que asistieron,
 * se les preguntó:
 * - Nombre y apellido.
 * - Edad.
 * - Cantidad de países visitados.
 * - Estado civil.
 * 
 * Las personas solteras con edad entre 45 y 62 años podían participar del sorteo
 * de un viaje a las Cataratas. En base a la información relevada se desea mostrar:
 * 
 * a) El promedio de edad de los asistentes encuestados
 * b) El nombre y apellido de la persona que más países visitó
 * c) Por cada persona indicar si podía o no participar del sorteo
 * 
 * Diseñar el algoritmo principal y los módulos correspondientes.
 * Implementar en Java.
 */
public class Ej8 {
    private static final String NOMBRE_ARCHIVO = "src/com/germanfica/ad/_2018/_2nd/tp1/ej8/Encuestados.txt"; // Ruta del archivo Mensaje.txt
    private static Scanner sc;
    
    public static EstadoCivil estadoCivil(String texto) {
    	EstadoCivil estadoCivil = new EstadoCivil();
		switch (texto) {
		case "soltero":
		case "soltera":
			estadoCivil.setSoltero(true);
			break;
		case "casado":
		case "casada":
			estadoCivil.setCasado(true);
			break;
		case "viudo":
		case "viuda":
			estadoCivil.setViudo(true);
			break;
		case "divorciado":
		case "divorciada":
			estadoCivil.setDivorciado(true);
			break;
		default:
			break;
		}
		return estadoCivil;
	}
    
	public static Encuesta[] encuestados(int longitud) {
		Encuesta[] encuestados = new Encuesta[longitud];
		String archivo = Archivo.leer(NOMBRE_ARCHIVO);
		
		sc = new Scanner(archivo); // Asignación de tarea al scanner para analizar el archivo
		
		sc.useDelimiter("\\s*,\\s*"); // Esto clasifica cuando se encuntra una coma
		
		// Agregar elementos al arreglo
		int i = 0;
		while(sc.hasNext()) {
			Encuesta encuesta = new Encuesta();
			encuesta.setNombre(sc.next());
			encuesta.setApellido(sc.next());
			encuesta.setEdad(sc.nextInt());
			encuesta.setCantPaísesVis(sc.nextInt());
			encuesta.setEstadoCivil(estadoCivil(sc.next()));
			encuestados[i] = encuesta;
			i++;
		}
		
		return encuestados;
	}
	
	public static void mostrarEncuestados(Encuesta[] encuestados) {
		for(int i = 0; i<=encuestados.length-1 ;i++) {
			System.out.println(encuestados[i].getNombre());
			System.out.println(encuestados[i].getApellido());
			System.out.println(encuestados[i].getEdad());
			System.out.println(encuestados[i].getCantPaísesVis());
			System.out.println("¿Está soltero/a? "+encuestados[i].getEstadoCivil().isSoltero());
			System.out.println("¿Está casado/a? "+encuestados[i].getEstadoCivil().isCasado());
			System.out.println("¿Está viudo/a? "+encuestados[i].getEstadoCivil().isViudo());
			System.out.println("¿Está divorciado/a? "+encuestados[i].getEstadoCivil().isDivorciado());
			System.out.println("---------------------------------");
		}
	}
	
	public static void mostrarMenú() {
		boolean salir;
		int opción;
		
		// Cargar a todos los encuestados desde el archivo
		Encuesta[] encuestados = encuestados(2);
		
		// Inicializar variables
		salir = false;
		
		System.out.println(Mensaje.leer().get(0));		
		while(!salir) {
			sc = new Scanner(System.in);
			
			// Mostrar cartel de opciones
			System.out.print(
					"[0] Salir (IMPLEMENTADO)\n" +
					"[1] El promedio de edad de los asistentes encuestados\n" +
					"[2] El nombre y apellido de la persona que más países visitó\n" +
					"[3] Por cada persona indicar si podía o no participar del sorteo\n" +
					"[4] Mostrar la lista de todos los encuestados\n"
					);
			
			// Leer opción del menú principal
			opción = sc.nextInt();
			
			switch (opción) {
			case 0:
				salir = true;
				break;
			case 1:
				//promedioDeEdadDeLosEncuestados();
				break;
			case 2:
				//quiénVisitóMásPaíses();
				break;
			case 3:
				//quiénesPuedenParticiparDelSorteo();
				break;
			case 4:
				// Mostrar todos los encuestados
				mostrarEncuestados(encuestados);
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
