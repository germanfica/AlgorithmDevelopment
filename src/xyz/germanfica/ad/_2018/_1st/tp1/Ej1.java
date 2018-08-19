package xyz.germanfica.ad._2018._1st.tp1;

import java.util.Scanner;

public class Ej1 {
	private static Scanner sc;
	
	/**
	 * Determina si un número entero es par.
	 */
	public static boolean esPar(int número)
	{
		boolean esPar = false;
		if(número%2==0)
			esPar = true;
		
		return esPar;
	}
	
	/**
	 * Determinar la cantidad de divisores enteros de un número entero.
	 */
	public static int divisoresEnteros(int número)
	{
		int índice, resultado;
		
		resultado = 0; // Inicializar entero
				
		// Determinar divisores
		for(índice = número; índice>1;índice--) {
			if(número%índice==0) {
				resultado = resultado + 1;
			}
		}
		
		return resultado;
	}
	
	/**
	 * Cargar elementos posibles primos de un número a un arreglo.
	 * @param n
	 * @return
	 */
	public static int[] cargarPrimos(int n) 
	{
		int índice, primosEncontrados;
		int[] primo, resultado;
		
		primosEncontrados = 0; // Inicializar entero
		primo = new int[n]; // Inicializar arreglo
		
		// Buscar posible primo
		for(índice = 2; índice<=primo.length;índice++) {	
			if(divisoresEnteros(índice) == 1) {
				primosEncontrados = primosEncontrados + 1;
				primo[primosEncontrados-1] = índice;
			}
		}
		
		// Crear nuevo arreglo con la cantidad correcta de número primos.
		resultado = new int[primosEncontrados];
		for(índice = 0; índice < resultado.length; índice++) {
			resultado[índice] = primo[índice];
		}
		
		return resultado;
	}
	
	/** Condición A: Cargar los códigos de los productos en las posiciones pares.
	 * @param pieza Arreglo principal
	 */
	public static int[] cargarDatos(int[] pieza)
	{
		int índice;
		
		// Crear scanner
		sc = new Scanner(System.in);
		
		for(índice = 0; índice< pieza.length;índice++)
		{
			if(esPar(índice)) {
				pieza[índice] = sc.nextInt(); // Código de la pieza
			}else {
				pieza[índice] = sc.nextInt(); // Cantidad usada de esa pieza
			}
		}
		
		return pieza;
	}
	
	/**
	 * Calcular la potencia
	 */
	public static int potencia(int base, int exponente)
	{
		int resultado;
		resultado = base * exponente;
		
		return resultado;
	}
	
	/**
	 * Determinar la parte entera de la raíz cuadrada de cualquier
	 * número entero.
	 */
	public static int raízCuadradaEntera(int número) {
		int parteEntera, base, exponente;
		parteEntera = 0; // Indicar parte entera
		base = parteEntera;
		exponente = parteEntera;
		
		while(potencia(base, exponente)<=número)
		{
			parteEntera = parteEntera + 1;
			base = parteEntera;
			exponente = parteEntera;
		}
		
		return parteEntera;
	}
	
	/**
	 * Determina si un número entero es primo o no.
	 */
	public static boolean esPrimo(int n) {
		boolean respuesta;
		int índice;
		respuesta = false;
		// Teorema fundamental de la aritmética
		if(n!=1 && n!=-1 && n!=0)
		{
			//Como n > 1, si n no es primo entonces existe un primo p
			// tal que p|n y p<=raizCuadradaEntera(n)
			int [] p;
			p = cargarPrimos(raízCuadradaEntera(n));
			
			respuesta = true; // Es primo
			
			// Determinar si no es primo (nueva implementación)
			índice = 0;
			while(índice < p.length) {
				if(n%p[índice]==0 && n!=p[índice]) {
					respuesta = false;
					índice = p.length;
				}
				índice++;
			}
			
			// Determinar si no es primo (no me convence)
			/*
			for(índice = 0;índice < p.length;índice++)
			{
				//System.out.println("n: " + n + " índice: " + índice);
				if(n%p[índice]==0 && n!=p[índice])
				{
					respuesta = 0;
					//System.out.println(n);
				}
			}
			*/
		}
		
		return respuesta;
	}
	
	/**
	 * Indica si los elementos impares de un arreglo de enteros estan
	 * ordenados de manera creciente o no.
	 * 
	 * Sugerencia, probar con los siguientes valores:
	 * . 3 (cod. pieza)
	 * . 2 (cant. piezas)
	 * . 1 (cod. pieza)
	 * . 25 (cant. pieza)
	 * Deberia retornar que está ordenado de manera creciente.
	 * 
	 * . 1 (cod. pieza)
	 * . 25 (cant. pieza)
	 * . 3 (cod. pieza)
	 * . 2 (cant. pieza)
	 * Deberia retornar que no está ordenado de forma creciente.
	 * 
	 * @param pieza arreglo de enteros.
	 * 
	 * @return Devuelve 1 si los elementos impares estan ordenado crecientemente
	 * sino 0.
	 */
	public static boolean esCreciente(int[] pieza) {
		boolean respuesta;
		int índice = pieza[3];
		respuesta = true;
		
		// Optimizado
		while(índice <= pieza.length-1 && !respuesta) 
		{
			if(pieza[índice-2]>pieza[índice] && !esPar(índice)) {
				respuesta = false;
			}
			
			índice++;
		}
		
		// Mal empleado.
		/*
		for(int índice = 0; índice <= pieza.length-1;índice++) {
			if(!esPar(índice)) {
				if(pieza[índice-1]>pieza[índice]) {
					respuesta = 0;
				}
			}
		}
		*/
		
		return respuesta;
	}
	
	/**
	 * Determina el promedio de los elementos impares de un arreglo de
	 * enteros.
	 * @param pieza arreglo de enteros.
	 * @return Promedio.
	 */
	public static int promedio(int[] pieza)
	{
		int promedio = 0;
		
		for(int índice=0;índice<=(pieza.length-1);índice++) {
			if(!esPar(índice)) {
				promedio = promedio + pieza[índice];
			}
		}
		promedio=promedio/(pieza.length/2);
		
		return promedio;
	}
	
	/**
	 * Determina la cantidad de primos que hay en las posiciones
	 * pares de un arreglo de enteros.
	 * @param pieza arreglo de enteros.
	 * @return
	 */
	public static int primosPosPar(int[] pieza)
	{
		int primos = 0;

		for(int índice=0;índice <= pieza.length-1;índice++) {
			if(esPrimo(pieza[índice]) && esPar(índice)){
				primos = primos + 1;
			}
		}
		
		return primos;
	}
	
	/**
	 * Recorrer el arreglo de piezas y devolver la menos usada.
	 * @param pieza
	 * @return
	 */
	public static int piezaMenosUsada(int[] pieza) {
		int piezaMenosUsada = pieza[1], índice;
		
		for(índice = 0;índice <= pieza.length-1;índice++) {
			if(pieza[índice] <= piezaMenosUsada && !esPar(índice)) {
				piezaMenosUsada = pieza[índice-1];
			}
		}
		
		return piezaMenosUsada;
	}
	
	/**
	 * Recorrer el arreglo de piezas y devolver la más usada.
	 * @param pieza
	 * @return
	 */
	public static int piezaMásUsada(int[] pieza) {
		int piezaMásUsada = pieza[1], índice;
		
		for(índice = 0;índice <= pieza.length-1;índice++) {
			if(pieza[índice] >= piezaMásUsada && !esPar(índice)) {
				piezaMásUsada = pieza[índice-1];
			}
		}
		
		return piezaMásUsada;
	}
	
	public static void mostrarMenú(int[] pieza)
	{
		int opción;
		boolean terminarPrograma;
		// Menú principal
		terminarPrograma = false;
		while(!terminarPrograma)
		{
			// Carteles del menú principal
			System.out.println("0- Salir del programa.");
			System.out.println("1- Cargar datos.");
			System.out.println("2- Verificar regla de la compañía.");
			System.out.println("3- Promedio de la cantidad de piezas.");
			System.out.println("4- Verificar si las cantidades de piezas están ordenadas en forma creciente.");
			System.out.println("5- La pieza más usada.");
			System.out.println("6- La pieza menos usada.");
			opción = sc.nextInt(); // Leer opción
			
			switch(opción)
			{
				case 0:
					terminarPrograma = true;
					break;
				case 1:
					pieza = cargarDatos(pieza); // Cargar datos
					break;
				case 2:
					if(primosPosPar(pieza)>=2) {
						System.out.println("Se cumple la relga.");
					}else {
						System.out.println("No se cumple la regla.");
					}
					break;
				case 3:
					System.out.println("El promedio es: " + promedio(pieza));
					break;
				case 4:
					if(esCreciente(pieza)) {
						System.out.println("Las cantidades de las piezas están ordenadas de manera creciente.");
					}else {
						System.out.println("No está ordenando de forma creciente.");
					}
					break;
				case 5:
					// Cuál es la pieza más usada?
					System.out.println("La pieza más usada es: " + piezaMásUsada(pieza));
					break;
				case 6:
					// Cuál es la pieza menos usada?
					System.out.println("La pieza menos usada es: " + piezaMenosUsada(pieza));
					break;
				case -1:
					// Eficiencia de 4 segundos con el número 2147309137
					long start = System.currentTimeMillis();
					System.out.println("Es primo: " + esPrimo(2147309137));
					// calcular tiempo transcurrido
					long end = System.currentTimeMillis();
					long res = end - start;
					System.out.println("Segundos: " + res / 1000);
					break;
				case -2:
					// Determinar si un número es primo o no
					int test = sc.nextInt();
					start = System.currentTimeMillis();
					System.out.println(test + " es primo? Respuesta: " + esPrimo(test));
					// calcular tiempo transcurrido
					end = System.currentTimeMillis();
					res = end - start;
					System.out.println("Segundos: " + res / 1000);
					break;
				default:
					System.out.println("Solo están disponibles las opciones del menú.");
					break;
			}
		}
	}
		
	/**
	 * Leer n piezas y mostrar menú con opciones.
	 */
	public static void main(String[] args) {
		int longitud, cn;
		int[] pieza;
		
		sc = new Scanner(System.in); // Crear scanner
		
		System.out.println("Bienvenido! Porfavor cargue la cantidad incial de piezas para"
				+ "esta sesión."); // Mostrar cartel de bienvenida
		
		cn = sc.nextInt(); // Leer cantidad de piezas		
		longitud = cn *2; // Calcular la longitud del arreglo
		
		pieza = new int[longitud]; // Inicilizar arreglo
		
		if(cn>=2){
			mostrarMenú(pieza);
		}else
		{
			System.out.println("Ingrese como mínimo 2 piezas. Hasta la próxima.");
		}
		
	}
}
