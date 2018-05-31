package com.graworg.ad._2018.tp3.ej1;

import java.util.Scanner;

import com.graworg.ad.util.TecladoIn;

public class Principal {
	private static Scanner sc = new Scanner(System.in);
	
	/**
	 * Crea un nuevo producto
	 * @param código
	 * @param descripción
	 * @param precioUnitario
	 * @param cantidadDeStock
	 * @return
	 */
	public static Producto crearProducto(int código, String descripción, float precioUnitario, int cantidadDeStock)
	{
		Producto producto = new Producto();
		producto.setCódigo(código);
		producto.setDescripción(descripción);
		producto.setPrecioUnitario(precioUnitario);
		producto.setCantidadDeStock(cantidadDeStock);
		
		return producto;
	}
	
	/**
	 * Contar la cantidad de productos con un precio unitario menor a un valor dado.
	 */
	public static int contarLosProductosConPrecioUnitarioMenorA(Producto[] productos, float precio)
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
	 * Aumentar a todos los productos un porcentaje de aumento al precio unitario.
	 */
	public static void aumentarPrecioUnitarioDeTodosLosProductosUn(Producto[] productos, float porcentaje) {
		int índice;
		float auxiliar;
		
		for(índice = 0;índice <= productos.length-1;índice++) {	
			auxiliar = (productos[índice].getPrecioUnitario()*porcentaje)/100 + productos[índice].getPrecioUnitario();
			productos[índice].setPrecioUnitario(auxiliar);
		}
	}
	
	/**
	 * Solicitación de los datos para cargar al arreglo productos
	 * @param productos
	 * @return
	 */
	public static Producto[] cargaDeProductos(Producto[] productos){
		int código, cantidadDeStock;
		float precioUnitario;
		String descripción;
		
		for(int i = 0;i<=productos.length-1;i++){
			System.out.println("Ingrese producto:");
			System.out.print(" Código: "); código = sc.nextInt();
			System.out.print(" Descripción: "); descripción = TecladoIn.readLine();
			System.out.print(" Precio unitario: "); precioUnitario = sc.nextFloat();
			System.out.print(" Cantidad de Stock: "); cantidadDeStock = sc.nextInt();
			
			productos[i] = crearProducto(código, descripción, precioUnitario, cantidadDeStock);
			System.out.println("Producto cargado con éxito.");
			System.out.println(""); // Salto de línea
		}
		
		return productos;
	}

	/**
	 * Mostrar listado de todos los productos. Además,
	 * por cada producto mostrar su código, descripción,
	 * precio unitario y cantidad de stock.
	 */
	public static void opción2(Producto[] productos) {
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
	public static void opción3(Producto[] productos) {
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
	public static void opción4(Producto[] productos)
	{
		float precio;
		System.out.print("Valor: "); precio = sc.nextFloat();
		System.out.println("La cantidad de productos con un precio\n" +
				"unitario menor a " + precio + " son: " + contarLosProductosConPrecioUnitarioMenorA(productos, precio));
	}
	
	/**
	 * Mostrar todos los productos con precio unitario con un cierto porcentaje.
	 */
	public static void opción5(Producto[] productos)
	{
		float porcentaje;
		System.out.print("Porcentaje a aumentar: "); porcentaje = sc.nextFloat();
		aumentarPrecioUnitarioDeTodosLosProductosUn(productos, porcentaje);
	}
	
	public static void mostrarMenú() {
		Producto[] productos;
		boolean salir;
		int opción;
		
		// Inicializar variables
		productos = new Producto[3]; // Crear y dar tamaño de arreglo de productos
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
				productos = cargaDeProductos(productos);
				break;
			case 2:
				if(productos[0]!=null) { opción2(productos); } else {System.err.println("Debe cargar al menos un producto."); }
				break;
			case 3:
				if(productos[0]!=null) { opción3(productos); } else {System.err.println("Debe cargar al menos un producto."); }
				break;
			case 4:
				if(productos[0]!=null) { opción4(productos); } else {System.err.println("Debe cargar al menos un producto."); }
				break;
			case 5:
				if(productos[0]!=null) { opción5(productos); } else {System.err.println("Debe cargar al menos un producto."); }
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