package tp1_2018;

import java.util.Scanner;

public class Ej1 {
	
	public static boolean esPar(int número)
	{
		boolean esPar = false;
		if(número%2==0)
			esPar = true;
		
		return esPar;
	}
	
	/* Condición A: Cargar los códigos de los productos en las posiciones pares.
	 * @param pieza Arreglo principal
	 */
	public static int[] cargarDatos(int[] pieza)
	{
		int índice;
		
		// Crear scanner
		Scanner sc = new Scanner(System.in);
		
		for(índice = 0; índice< pieza.length-1;índice++)
		{
			if(esPar(índice)) {
				pieza[índice] = sc.nextInt(); // Código de la pieza
			}else {
				pieza[índice] = sc.nextInt(); // Cantidad usada de esa pieza
			}
		}
		
		return pieza;
	}
		
	/*
	 * Leer n piezas y mostrar menú con opciones.
	 */
	public static void main(String[] args) {
		boolean terminarPrograma;
		int opción, longitud, cn;
		int[] pieza;
		
		Scanner sc = new Scanner(System.in); // Crear scanner
		
		System.out.println("Bienvenido! Porfavor cargue la cantidad incial de piezas para"
				+ "esta sesión."); // Mostrar cartel de bienvenida
		
		cn = sc.nextInt(); // Leer cantidad de piezas		
		longitud = cn *2; // Calcular la longitud del arreglo
		
		pieza = new int[longitud]; // Inicilizar arreglo
				
		// Menú principal
		terminarPrograma = false;
		while(terminarPrograma==false)
		{
			// Carteles del menú principal
			System.out.println("0- Salir del programa.");
			System.out.println("1- Cargar datos.");
			opción = sc.nextInt(); // Leer opción
			
			switch(opción)
			{
				case 0:
					terminarPrograma = true;
					break;
				case 1:
					pieza = cargarDatos(pieza); // Cargar datos
					break;
				default:
					System.out.println("Solo están disponibles las opciones del menú.");
					break;
			}
		}
	}
}
