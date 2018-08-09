package com.germanfica.ad._2018.tp3.ej1;

//import java.util.List;
import java.util.Scanner;

import com.germanfica.ad.util.TecladoIn;

public class Principal_inefficient {
	private static Scanner sc = new Scanner(System.in);
	private static Producto[] productos = new Producto[0];
	//private List<Object> list;
	
	public static Producto crearProducto(int código, String descripción, float precioUnitario, int cantidadDeStock)
	{
		Producto producto = new Producto();
		producto.setCódigo(código);
		producto.setDescripción(descripción);
		producto.setPrecioUnitario(precioUnitario);
		producto.setCantidadDeStock(cantidadDeStock);
		
		return producto;
	}
	
	public static void cargarProducto(int código, String descripción, float precioUnitario, int cantidadDeStock)
	{	
		Producto[] productosAnteriores;
		int nuevaLongitud, índice;
		
		productosAnteriores = productos; // Almacena los productos anteriores
		nuevaLongitud = productos.length + 1; // Longitud del nuevo arreglo
		
		productos = new Producto[nuevaLongitud]; // Crear nuevo arreglo
		
		// Agregar los elementos al nuevo arreglo
		for(índice = 0; índice <= productos.length -1 ;índice ++)
		{
			// Agregar todos los elementos del arreglo anterior al nuevo arreglo.
			if(índice <= productosAnteriores.length -1) {
				productos[índice] = productosAnteriores[índice];
			}else {
				// Una vez agregado todos los elementos del arreglo anterior al nuevo arreglo,
				// en la última posición del nuevo arreglo se agrega el nuevo elemento.
				productos[índice] = crearProducto(código, descripción, precioUnitario, cantidadDeStock);
			}
		}
	}
	
	/**
	 * Contar la cantidad de productos con un precio unitario menor a un valor dado.
	 */
	public static int contarLosProductosConPrecioUnitarioMenorA(float precio)
	{
		int contador, índice;
		contador = 0;
		
		for(índice = 0;índice <= productos.length-1;índice++){
			if(productos[índice].getPrecioUnitario()<precio)
			{
				contador = contador + 1;
			}
		}
		
		return contador;
	}
	
	/**
	 * Solicitación de los datos para cargar un nuevo producto en específico
	 */
	public static void opción1() {
		int código, cantidadDeStock;
		float precioUnitario;
		String descripción;
		
		System.out.print("Código: "); código = sc.nextInt();
		System.out.print("Descripción: "); descripción = TecladoIn.readLine();
		System.out.print("Precio unitario: "); precioUnitario = sc.nextFloat();
		System.out.print("Cantidad de Stock: "); cantidadDeStock = sc.nextInt();
		
		cargarProducto(código, descripción, precioUnitario, cantidadDeStock);
		
		System.out.println("Cargado con éxito.");
	}
	
	/**
	 * Mostrar listado de todos los productos. Además,
	 * por cada producto mostrar su código, descripción,
	 * precio unitario y cantidad de stock.
	 */
	public static void opción2() {
		int índice, índiceFinal;
		
		índiceFinal = productos.length -1;
	
		for(índice = 0;índice <= índiceFinal;índice++){
			System.out.println("-------------------------");
			System.out.println("Código: " + productos[índice].getCódigo());
			System.out.println("Descripción: " + productos[índice].getDescripción());
			System.out.println("Precio unitario: " + "$" + productos[índice].getPrecioUnitario());
			System.out.println("Cantidad de Stock: " + productos[índice].getCantidadDeStock());
			System.out.println("-------------------------");
		}
	}
	
	/**
	 * Contar la cantidad de productos que tienen 0 en 
	 * cantidad de stock.
	 */
	public static void opción3() {
		int índice, índiceFinal, contador;
		
		índiceFinal = productos.length -1;
		contador = 0;
		
		for(índice = 0;índice <= índiceFinal;índice++){
			if(productos[índice].getCantidadDeStock()==0) {
				contador = contador + 1;
			}
		}
		
		System.out.println("La cantidad de productos sin stock: " + contador);
	}
	
	/**
	 * Mostrar la cantidad de productos con un precio unitario menor a un valor dado.
	 */
	public static void opción4()
	{
		float precio;
		System.out.print("Valor: "); precio = sc.nextFloat();
		System.out.println("La cantidad de productos con un precio\n" +
				"unitario menor a " + precio + " son: " + contarLosProductosConPrecioUnitarioMenorA(precio));
	}
	
	/**
	 * Aumentar a todos los productos un porcentaje de aumento al precio unitario.
	 */
	public static void aumentarPrecioUnitarioDeTodosLosProductosUn(float porcentaje) {
		int índice;
		float auxiliar;
		
		for(índice = 0;índice <= productos.length-1;índice++) {	
			auxiliar = (productos[índice].getPrecioUnitario()*porcentaje)/100 + productos[índice].getPrecioUnitario();
			productos[índice].setPrecioUnitario(auxiliar);
		}
	}
	
	/**
	 * Mostrar todos los productos con precio unitario con un cierto porcentaje.
	 */
	public static void opción5()
	{
		float porcentaje;
		System.out.print("Porcentaje a aumentar: "); porcentaje = sc.nextFloat();
		aumentarPrecioUnitarioDeTodosLosProductosUn(porcentaje);
	}
	
	public static void mostrarMenú() {
		boolean salir;
		int opción;
		
		salir = false;
		
		System.out.println("Bienvenido a la consola de la aplicación");
		
		while(!salir)
		{
			System.out.print(
					"[0] Salir\n" +
					"[1] Cargar producto\n" +
					"[2] Mostrar listado de productos\n" +
					"[3] Cantidad de productos con stock 0\n" +
					"[4] Cantidad de productos con un precio\n" +
						"unitario menor a un valor dado\n" + 
					"[5] Aumentar a todos los productos un\n" +
						"porcentaje de aumento al precio unitario.\n"
					);
			
			opción = sc.nextInt();
			
			switch (opción) {
			case 0:
				salir = true;
				break;
			case 1:
				opción1();
				break;
			case 2:
				if(productos.length!=0) { opción2(); } else {System.err.println("Debe cargar al menos un producto."); }
				break;
			case 3:
				if(productos.length!=0) { opción3(); } else {System.err.println("Debe cargar al menos un producto."); }
				break;
			case 4:
				if(productos.length!=0) { opción4(); } else {System.err.println("Debe cargar al menos un producto."); }
				break;
			case 5:
				if(productos.length!=0) { opción5(); } else {System.err.println("Debe cargar al menos un producto."); }
				break;
			default:
				System.err.println("Esta opción no existe. Seleccione una de las siguientes opciones: ");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		mostrarMenú();
		System.err.println("La aplicación se ha cerrado");
	}
}