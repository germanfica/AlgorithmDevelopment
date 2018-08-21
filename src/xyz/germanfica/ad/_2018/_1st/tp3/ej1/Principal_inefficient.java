package xyz.germanfica.ad._2018._1st.tp3.ej1;

//import java.util.List;
import java.util.Scanner;

import xyz.germanfica.util.TecladoIn;

public class Principal_inefficient {
	private static Scanner sc = new Scanner(System.in);
	private static Producto[] productos = new Producto[0];
	//private List<Object> list;
	
	public static Producto crearProducto(int codigo, String descripcion, float precioUnitario, int cantidadDeStock)
	{
		Producto producto = new Producto();
		producto.setCodigo(codigo);
		producto.setDescripcion(descripcion);
		producto.setPrecioUnitario(precioUnitario);
		producto.setCantidadDeStock(cantidadDeStock);
		
		return producto;
	}
	
	public static void cargarProducto(int codigo, String descripcion, float precioUnitario, int cantidadDeStock)
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
				// en la última posicion del nuevo arreglo se agrega el nuevo elemento.
				productos[índice] = crearProducto(codigo, descripcion, precioUnitario, cantidadDeStock);
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
	 * Solicitacion de los datos para cargar un nuevo producto en específico
	 */
	public static void opcion1() {
		int codigo, cantidadDeStock;
		float precioUnitario;
		String descripcion;
		
		System.out.print("Codigo: "); codigo = sc.nextInt();
		System.out.print("Descripcion: "); descripcion = TecladoIn.readLine();
		System.out.print("Precio unitario: "); precioUnitario = sc.nextFloat();
		System.out.print("Cantidad de Stock: "); cantidadDeStock = sc.nextInt();
		
		cargarProducto(codigo, descripcion, precioUnitario, cantidadDeStock);
		
		System.out.println("Cargado con éxito.");
	}
	
	/**
	 * Mostrar listado de todos los productos. Además,
	 * por cada producto mostrar su codigo, descripcion,
	 * precio unitario y cantidad de stock.
	 */
	public static void opcion2() {
		int índice, índiceFinal;
		
		índiceFinal = productos.length -1;
	
		for(índice = 0;índice <= índiceFinal;índice++){
			System.out.println("-------------------------");
			System.out.println("Codigo: " + productos[índice].getCodigo());
			System.out.println("Descripcion: " + productos[índice].getDescripcion());
			System.out.println("Precio unitario: " + "$" + productos[índice].getPrecioUnitario());
			System.out.println("Cantidad de Stock: " + productos[índice].getCantidadDeStock());
			System.out.println("-------------------------");
		}
	}
	
	/**
	 * Contar la cantidad de productos que tienen 0 en 
	 * cantidad de stock.
	 */
	public static void opcion3() {
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
	public static void opcion4()
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
	public static void opcion5()
	{
		float porcentaje;
		System.out.print("Porcentaje a aumentar: "); porcentaje = sc.nextFloat();
		aumentarPrecioUnitarioDeTodosLosProductosUn(porcentaje);
	}
	
	public static void mostrarMenú() {
		boolean salir;
		int opcion;
		
		salir = false;
		
		System.out.println("Bienvenido a la consola de la aplicacion");
		
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
			
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 0:
				salir = true;
				break;
			case 1:
				opcion1();
				break;
			case 2:
				if(productos.length!=0) { opcion2(); } else {System.err.println("Debe cargar al menos un producto."); }
				break;
			case 3:
				if(productos.length!=0) { opcion3(); } else {System.err.println("Debe cargar al menos un producto."); }
				break;
			case 4:
				if(productos.length!=0) { opcion4(); } else {System.err.println("Debe cargar al menos un producto."); }
				break;
			case 5:
				if(productos.length!=0) { opcion5(); } else {System.err.println("Debe cargar al menos un producto."); }
				break;
			default:
				System.err.println("Esta opcion no existe. Seleccione una de las siguientes opciones: ");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		mostrarMenú();
		System.err.println("La aplicacion se ha cerrado");
	}
}