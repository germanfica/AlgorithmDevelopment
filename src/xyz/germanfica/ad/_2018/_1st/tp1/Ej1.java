package xyz.germanfica.ad._2018._1st.tp1;

import java.util.Scanner;

public class Ej1 {
	private static Scanner sc;
	
	/**
	 * Determina si un n�mero entero es par.
	 */
	public static boolean esPar(int n�mero)
	{
		boolean esPar = false;
		if(n�mero%2==0)
			esPar = true;
		
		return esPar;
	}
	
	/**
	 * Determinar la cantidad de divisores enteros de un n�mero entero.
	 */
	public static int divisoresEnteros(int n�mero)
	{
		int �ndice, resultado;
		
		resultado = 0; // Inicializar entero
				
		// Determinar divisores
		for(�ndice = n�mero; �ndice>1;�ndice--) {
			if(n�mero%�ndice==0) {
				resultado = resultado + 1;
			}
		}
		
		return resultado;
	}
	
	/**
	 * Carga elementos posibles primos de un n�mero a un arreglo.
	 * @param n
	 * @return
	 */
	public static int[] cargarPrimos(int n) 
	{
		int �ndice, primosEncontrados;
		int[] primo, resultado;
		
		primosEncontrados = 0; // Inicializar entero
		primo = new int[n]; // Inicializar arreglo
		
		// Buscar posible primo
		for(�ndice = 2; �ndice<=primo.length;�ndice++) {	
			if(divisoresEnteros(�ndice) == 1) {
				primosEncontrados = primosEncontrados + 1;
				primo[primosEncontrados-1] = �ndice;
			}
		}
		
		// Crear nuevo arreglo con la cantidad correcta de n�mero primos.
		resultado = new int[primosEncontrados];
		for(�ndice = 0; �ndice < resultado.length; �ndice++) {
			resultado[�ndice] = primo[�ndice];
		}
		
		return resultado;
	}
	
	/** Condicion A: Cargar los codigos de los productos en las posiciones pares.
	 * @param pieza Arreglo principal
	 */
	public static int[] cargarDatos(int[] pieza)
	{
		int �ndice;
		
		// Crear scanner
		sc = new Scanner(System.in);
		
		for(�ndice = 0; �ndice< pieza.length;�ndice++)
		{
			if(esPar(�ndice)) {
				pieza[�ndice] = sc.nextInt(); // Codigo de la pieza
			}else {
				pieza[�ndice] = sc.nextInt(); // Cantidad usada de esa pieza
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
	 * Determinar la parte entera de la ra�z cuadrada de cualquier
	 * n�mero entero.
	 */
	public static int ra�zCuadradaEntera(int n�mero) {
		int parteEntera, base, exponente;
		parteEntera = 0; // Indicar parte entera
		base = parteEntera;
		exponente = parteEntera;
		
		while(potencia(base, exponente)<=n�mero)
		{
			parteEntera = parteEntera + 1;
			base = parteEntera;
			exponente = parteEntera;
		}
		
		return parteEntera;
	}
	
	/**
	 * Determina si un n�mero entero es primo o no.
	 */
	public static boolean esPrimo(int n) {
		boolean respuesta;
		int �ndice;
		respuesta = false;
		// Teorema fundamental de la aritm�tica
		if(n!=1 && n!=-1 && n!=0)
		{
			//Como n > 1, si n no es primo entonces existe un primo p
			// tal que p|n y p<=raizCuadradaEntera(n)
			int [] p;
			p = cargarPrimos(ra�zCuadradaEntera(n));
			
			respuesta = true; // Es primo
			
			// Determinar si no es primo (nueva implementacion)
			�ndice = 0;
			while(�ndice < p.length) {
				if(n%p[�ndice]==0 && n!=p[�ndice]) {
					respuesta = false;
					�ndice = p.length;
				}
				�ndice++;
			}
			
			// Determinar si no es primo (no me convence)
			/*
			for(�ndice = 0;�ndice < p.length;�ndice++)
			{
				//System.out.println("n: " + n + " �ndice: " + �ndice);
				if(n%p[�ndice]==0 && n!=p[�ndice])
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
	 * Deberia retornar que esta ordenado de manera creciente.
	 * 
	 * . 1 (cod. pieza)
	 * . 25 (cant. pieza)
	 * . 3 (cod. pieza)
	 * . 2 (cant. pieza)
	 * Deberia retornar que no esta ordenado de forma creciente.
	 * 
	 * @param pieza arreglo de enteros.
	 * 
	 * @return Devuelve 1 si los elementos impares estan ordenado crecientemente
	 * sino 0.
	 */
	public static boolean esCreciente(int[] pieza) {
		boolean respuesta;
		int �ndice = pieza[3];
		respuesta = true;
		
		// Optimizado
		while(�ndice <= pieza.length-1 && !respuesta) 
		{
			if(pieza[�ndice-2]>pieza[�ndice] && !esPar(�ndice)) {
				respuesta = false;
			}
			
			�ndice++;
		}
		
		// Mal empleado.
		/*
		for(int �ndice = 0; �ndice <= pieza.length-1;�ndice++) {
			if(!esPar(�ndice)) {
				if(pieza[�ndice-1]>pieza[�ndice]) {
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
		
		for(int �ndice=0;�ndice<=(pieza.length-1);�ndice++) {
			if(!esPar(�ndice)) {
				promedio = promedio + pieza[�ndice];
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

		for(int �ndice=0;�ndice <= pieza.length-1;�ndice++) {
			if(esPrimo(pieza[�ndice]) && esPar(�ndice)){
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
		int piezaMenosUsada = pieza[1], �ndice;
		
		for(�ndice = 0;�ndice <= pieza.length-1;�ndice++) {
			if(pieza[�ndice] <= piezaMenosUsada && !esPar(�ndice)) {
				piezaMenosUsada = pieza[�ndice-1];
			}
		}
		
		return piezaMenosUsada;
	}
	
	/**
	 * Recorrer el arreglo de piezas y devolver la mas usada.
	 * @param pieza
	 * @return
	 */
	public static int piezaMasUsada(int[] pieza) {
		int piezaMasUsada = pieza[1], �ndice;
		
		for(�ndice = 0;�ndice <= pieza.length-1;�ndice++) {
			if(pieza[�ndice] >= piezaMasUsada && !esPar(�ndice)) {
				piezaMasUsada = pieza[�ndice-1];
			}
		}
		
		return piezaMasUsada;
	}
	
	public static void mostrarMen�(int[] pieza)
	{
		int opcion;
		boolean terminarPrograma;
		// Men� principal
		terminarPrograma = false;
		while(!terminarPrograma)
		{
			// Carteles del men� principal
			System.out.println("0- Salir del programa.");
			System.out.println("1- Cargar datos.");
			System.out.println("2- Verificar regla de la compa��a.");
			System.out.println("3- Promedio de la cantidad de piezas.");
			System.out.println("4- Verificar si las cantidades de piezas estan ordenadas en forma creciente.");
			System.out.println("5- La pieza mas usada.");
			System.out.println("6- La pieza menos usada.");
			opcion = sc.nextInt(); // Leer opcion
			
			switch(opcion)
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
						System.out.println("Las cantidades de las piezas estan ordenadas de manera creciente.");
					}else {
						System.out.println("No esta ordenando de forma creciente.");
					}
					break;
				case 5:
					// Cual es la pieza mas usada?
					System.out.println("La pieza mas usada es: " + piezaMasUsada(pieza));
					break;
				case 6:
					// Cual es la pieza menos usada?
					System.out.println("La pieza menos usada es: " + piezaMenosUsada(pieza));
					break;
				case -1:
					// Eficiencia de 4 segundos con el n�mero 2147309137
					long start = System.currentTimeMillis();
					System.out.println("Es primo: " + esPrimo(2147309137));
					// calcular tiempo transcurrido
					long end = System.currentTimeMillis();
					long res = end - start;
					System.out.println("Segundos: " + res / 1000);
					break;
				case -2:
					// Determinar si un n�mero es primo o no
					int test = sc.nextInt();
					start = System.currentTimeMillis();
					System.out.println(test + " es primo? Respuesta: " + esPrimo(test));
					// calcular tiempo transcurrido
					end = System.currentTimeMillis();
					res = end - start;
					System.out.println("Segundos: " + res / 1000);
					break;
				default:
					System.out.println("Solo estan disponibles las opciones del men�.");
					break;
			}
		}
	}
		
	/**
	 * Leer n piezas y mostrar men� con opciones.
	 */
	public static void main(String[] args) {
		int longitud, cn;
		int[] pieza;
		
		sc = new Scanner(System.in); // Crear scanner
		
		System.out.println("Bienvenido! Porfavor cargue la cantidad incial de piezas para"
				+ "esta sesion."); // Mostrar cartel de bienvenida
		
		cn = sc.nextInt(); // Leer cantidad de piezas		
		longitud = cn *2; // Calcular la longitud del arreglo
		
		pieza = new int[longitud]; // Inicilizar arreglo
		
		if(cn>=2){
			mostrarMen�(pieza);
		}else
		{
			System.out.println("Ingrese como m�nimo 2 piezas. Hasta la proxima.");
		}
		
	}
}
