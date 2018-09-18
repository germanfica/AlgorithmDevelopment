package xyz.germanfica.ad._2018._2nd.tpob;

/*
 * Escribir en Java la clase TestVivero para implementar un programa que:
 * 
 * - Defina un arreglo de �rboles que guarde informaci�n de todas los �rboles que el
 * vivero tiene a la venta.
 * 
 * - Provea al usuario un men� con las siguientes opciones:
 * 
 * 1. Carga de Datos: generar el arreglo de �rboles con tantos datos como el
 * usuario desee. Esta opci�n debe poder ejecutarse repetidas veces, es decir,
 * se deben poder agregar �rboles al arreglo las veces que haga falta. En la
 * carga de datos se debe controlar de no guardar datos repetidos.
 * 
 * 2. Listar �rboles: Este m�todo debe listar los datos de todos �rboles de
 * m�s de 10m de altura a partir de los elementos almacenados en el arreglo.
 * 
 * 3. Contar �rboles: Este m�todo debe contar, recorriendo el arreglo, la
 * cantidad de �rboles que soportan temperaturas por debajo de los 0�C.
 * 
 * 4. Mostrar �rboles: Este m�todo deber� mostrar el nombre de todos los
 * �rboles frutales.
 */
public class TestVivero {
	public static void main(String[] args) {
		Arbol arbol = new Arbol("Asdf");
		System.out.println(arbol.getNombre());
	}
}
