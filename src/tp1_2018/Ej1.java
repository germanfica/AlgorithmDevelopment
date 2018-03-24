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
	
	/*
	 * Determinar la cantidad de divisores enteros de un número entero.
	 */
	public static int divisoresEnteros(int número)
	{
		int índice, resultado;
		
		resultado = 0; // Inicializar entero
				
		// Determinar divisores
		for(índice = número; índice>1;índice--)
		{
			if(número%índice==0)
			{
				resultado = resultado + 1;
			}
		}
		
		return resultado;
	}
	
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
	
	/* Condición A: Cargar los códigos de los productos en las posiciones pares.
	 * @param pieza Arreglo principal
	 */
	public static int[] cargarDatos(int[] pieza)
	{
		int índice;
		
		// Crear scanner
		Scanner sc = new Scanner(System.in);
		
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
	
	/*
	 * Calcular la potencia
	 */
	public static int potencia(int base, int exponente)
	{
		int resultado;
		resultado = base * exponente;
		
		return resultado;
	}
	
	/*
	 * Determinar la parte entera de la raíz cuadrada de cualquier
	 * número entero.
	 */
	public static int raízCuadradaEntera(int número) 
	{
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
	
	public static int esPrimo(int n)
	{
		int respuesta, índice;
		respuesta = 0;
		// Teorema fundamental de la aritmética
		if(n!=1 && n!=-1 && n!=0)
		{
			//Como n > 1, si n no es primo entonces existe un primo p
			// tal que p|n y p<=raizCuadradaEntera(n)
			int [] p;
			p = cargarPrimos(raízCuadradaEntera(n));
			
			respuesta = 1; // Es primo
			
			// Determinar si no es primo
			for(índice = 0;índice < p.length;índice++)
			{
				//System.out.println("n: " + n + " índice: " + índice);
				if(n%p[índice]==0 && n!=p[índice])
				{
					respuesta = 0;
					//System.out.println(n);
				}
			}
		}
		
		return respuesta;
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
			System.out.println("-1- Probar eficiencia del algoritmo para determinar primos con 2147309137.");
			System.out.println("0- Salir del programa.");
			System.out.println("1- Cargar datos.");
			System.out.println("2- Verificar regla de la compañía.");
			System.out.println("3- Promedio de la cantidad de piezas.");
			System.out.println("4- Verificar si las cantidades de piezas están ordenadas en forma creciente.");
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
					// Primos encontrados en los códigos de piezas
					int primos;
					primos = 0;
					// PARA índice <- 0 HASTA longitud(pieza)-1 PASO 1
					// 		código...	
					// FIN PARA
					for(int índice=0;índice <= pieza.length-1;índice++)
					{
						if(esPar(índice))
						{
							if(esPrimo(pieza[índice])==1)
							{
								primos = primos + 1;
							}
						}
					}
					if(primos>=2)
					{
						System.out.println("Se cumple la relga.");
					}else
					{
						System.out.println("No se cumple la regla.");
					}
					break;
				case 3:
					int promedio; // Contador del índice de la cantidad de piezas
					promedio = 0;
					
					System.out.println("Longitud " + pieza.length);
					
					for(int índice=0;índice<=(pieza.length-1);índice++)
					{
						if(!esPar(índice))
						{
							promedio = promedio + pieza[índice];
						}
					}
					promedio=promedio/(pieza.length/2);
					System.out.println("El promedio es: " + promedio);
					break;
				case 4:
					int anterior, resultado;
					resultado = 0;
					anterior = 0;
					for(int índice = 0; índice <= pieza.length-1;índice++)
					{
						if(!esPar(índice))
						{
							if(anterior>pieza[índice])
							{
								resultado = resultado + 1;
							}
							anterior = pieza[índice];
						}
					}
					
					if(resultado == 0)
					{
						System.out.println("Las cantidades de las piezas están ordenadas de manera creciente.");
					}else
					{
						System.out.println("No está ordenando de forma creciente.");
					}
					break;
				case 5:
					
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
				default:
					System.out.println("Solo están disponibles las opciones del menú.");
					break;
			}
		}
	}
}
