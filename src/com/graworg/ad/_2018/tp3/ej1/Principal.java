package com.graworg.ad._2018.tp3.ej1;

//import java.util.List;
import java.util.Scanner;

/*
 * 1. Retomar el ejercicio visto en clase sobre el TDA Producto. de
 * Tipo de Dato Item de Stock.
 * Generar un arreglo de productos y luego generar la carga de los mismos,
 * luego hacer un menú que realice en forma modularizada lo siguiente:
 * 	
 * 	a)Listado de ítems: Por cada ítem muestre su nro.de código,
 * 	descripción, precio unitario y cantidad de stock.
 * 	
 * 	b) Contar la cantidad de items que tienen 0 en cantidad
 * 	de stock.
 * 	
 * 	c) Contar la cantidad de items con un precio unitario menor
 * 	a un valor dado.
 * 	
 * 	d) Aumentar a todos los ítems un porcentaje de aumento al
 * 	precio unitario.

 */

public class Principal {
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
	 * Solicitación de los datos para cargar un nuevo producto en específico
	 */
	public static void opción1() {
		int código, cantidadDeStock;
		float precioUnitario;
		String descripción;
		
		System.out.print("Código: "); código = sc.nextInt();
		System.out.print("Descripción: "); descripción = sc.next();
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
					"[3] Cantidad de productos con stock 0\n"
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
			default:
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		mostrarMenú();
		System.err.println("La aplicación se ha cerrado");
	}
}
