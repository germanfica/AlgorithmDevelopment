package xyz.germanfica._2018._1st.tp3;

//import java.util.Scanner;

public class Producto {
	private int codigo;
	private String descripcion;
	private float precioUnitario;
	private int cantidadDeStock;
	
	public int getCodigo(){return codigo;}
	public String getDescripcion(){return descripcion;}
	public float getPrecioUnitario(){return precioUnitario;}
	public int getCantidadDeStock(){return cantidadDeStock;}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setDescripcion(String descripcionInicial) {
		descripcion = descripcionInicial;
	}
	public void setPrecioUnitario(float precioUnitarioInicial) {
		precioUnitario = precioUnitarioInicial;
	}
	public void setCantidadDeStock(int cantidadDeStockInicial) {
		cantidadDeStock = cantidadDeStockInicial;
	}
	
	/*
	 * Los siguientes métodos son solo una prueba de la clase teoríca del 18/04/18
	 */
	
	// ERROR CONCEPTURAL
	/*
	public void asd()
	{
		System.out.println(descripcion);
	}
	*/
	
	// ERROR CONCEPTURAL
	/*
	public void setFeg() {
		Scanner sc = new Scanner(System.in);
		descripcion = sc.next();
	}
	*/
}
