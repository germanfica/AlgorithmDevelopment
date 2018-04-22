package com.graworg.ad._2018.tp3.ej2;
/*
 * Actualizaciones:
 *  - Se ha quitado muestraIngrediente ya que no es buena práctica mostrar por
 *  pantalla carteles en objectos/clases.
 *  - En lugar de muestraIngrediente se agregó un método observador toString,
 *  con el objetivo de retornar todos los atributos del objeto ingrediente en
 *  texto plano.
 *  - Nombres más descriptivos a los parámetros.
 *  - Se agregaron comentarios, a excepción del constructor para reforzar el
 *  entendimiento de los mismos.
 *  - Se modificó el atributo "ingrediente" por "nombre", haciendo referencia al
 *  nombre del ingrediente ya que el objeto/clase es Ingrediente. Por lo tanto,
 *  tiene más sentido que "nombre" sea el atributo correcto para el objeto Ingrediente.
 *  - Consecutivamente, se modificaron los métodos observador y modificador de lo anterior.
 */
public class Ingrediente {
	private String nombre;
	private double cantidad;
	private String unidadDeMedida;
	
	// Constructores
	
	public Ingrediente() {
		nombre = null;
		cantidad = 0.0;
		unidadDeMedida = null;
	}
	
	// Observadoras
	
	/**
	 * Devuelve el nombre del ingrediente 
	 * @return ingrediente
	 */
	public String getNombre() {
		return this.nombre;
	}
	
	/**
	 * Devuelve la cantidad de ingredientes
	 * @return cantidad
	 */
	public double getCantidad() {
		return this.cantidad;
	}
	
	/**
	 * Devuelve el nombre de la unidad de medida usada para el ingrediente
	 * @return unidadDeMedida
	 */
	public String getUnidadDeMedida() {
		return this.unidadDeMedida;
	}
	
	/**
	 * Retorna en texto plano todos los atributos del objeto ingrediente
	 */
	public String toString() {
		return "Ingrediente: " + this.nombre + "\nCantidad: " + this.cantidad + "\nUnidad de medida" + this.unidadDeMedida;
	}
	
	// Modificadoras
	
	/**
	 * Cambiar nombre del ingrediente
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Cambiar la cantidad de ingredientes
	 * @param cantidad
	 */
	public void setCantidad(int cantidad){
		this.cantidad = cantidad;
	}
	
	/**
	 * Cambiar el nombre de la unidad de medida usada para el ingrediente
	 * @param unidadDeMedida
	 */
	public void setUnidadDeMedida(String unidadDeMedida) {
		this.unidadDeMedida = unidadDeMedida;
	}
	
	// Propias del tipo
}
