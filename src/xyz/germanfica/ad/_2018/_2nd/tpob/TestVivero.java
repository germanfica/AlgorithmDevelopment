package xyz.germanfica.ad._2018._2nd.tpob;

/*
 * Escribir en Java la clase TestVivero para implementar un programa que:
 * 
 * - Defina un arreglo de árboles que guarde información de todas los árboles que el
 * vivero tiene a la venta.
 * 
 * - Provea al usuario un menú con las siguientes opciones:
 * 
 * 1. Carga de Datos: generar el arreglo de árboles con tantos datos como el
 * usuario desee. Esta opción debe poder ejecutarse repetidas veces, es decir,
 * se deben poder agregar árboles al arreglo las veces que haga falta. En la
 * carga de datos se debe controlar de no guardar datos repetidos.
 * 
 * 2. Listar árboles: Este método debe listar los datos de todos árboles de
 * más de 10m de altura a partir de los elementos almacenados en el arreglo.
 * 
 * 3. Contar árboles: Este método debe contar, recorriendo el arreglo, la
 * cantidad de árboles que soportan temperaturas por debajo de los 0ºC.
 * 
 * 4. Mostrar árboles: Este método deberá mostrar el nombre de todos los
 * árboles frutales.
 */
public class TestVivero {
	public static void main(String[] args) {
		Arbol arbol = new Arbol("Asdf");
		System.out.println(arbol.getNombre());
	}
}
