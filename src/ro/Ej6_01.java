package ro;

import com.graworg.ad.util.TecladoIn;

/*
 * (6) Club cuota social
 * 
 * Desarrollar un programa que permita:
 * 	- Ingresar el tipo socio.
 * 	- Si tiene cuota al día.
 *  - Cantidad de meses a pagar.
 *  
 * Los socios plenos:
 * 	. Deberán pagar $ 420 por mes.
 *  . Si tienen la cuota social al día tendrán un descuento del 15%.
 * Los socios no plenos abonarán $ 310 por mes.
 *  
 * En base a estos datos muestre un cartel con el monto a pagar y el descuento aplicado.
 */
public class Ej6_01 {
	/**
	 * Se lee y muestra por pantalla un cartel indicando el ingreso del tipo de socio
	 * y retorna el mismo.
	 * 
	 * @return tipo de socio
	 */
	public static String cargaTipoDeSocio() {
		System.out.println("Ingrese el tipo de socio: ");
		return TecladoIn.readLine();
	}
	
	/**
	 * Se lee y muestra por pantalla un cartel indicando el ingreso para conocer
	 * si el socio tiene la cuota al día y retorna el mismo.
	 * 
	 * @return
	 */
	public static boolean cargaCuotaAlDía() {
		System.out.println("¿Tiene su cuota al día?");
		return TecladoIn.readLineBoolean();
	}
	
	/**
	 * Se lee y muestra por pantalla un cartel indicando el ingreso de la cantidad de
	 * meses a cargar para el socio y retorna el mismo.
	 * 
	 * @return
	 */
	public static int cargaCantidadDeMesesACargar() {
		System.out.println("Cantidad de meses a pagar: ");
		return TecladoIn.readInt();
	}
	
	public static void mostrarMontoAPagar(String tipoDeSocio, boolean cuotaAlDía, int cantidadDeMesesAPagar) {
		System.out.println("Monto a pagar: ");
		System.out.println("Descuento aplicado: ");
	}
	
	public static void main(String[] args) {
		// Declaración de variables
		String tipoDeSocio;
		boolean cuotaAlDía;
		int cantidadDeMesesAPagar;
		
		System.out.println("Bienvenido!(:");
		
		// Leer datos
		tipoDeSocio = cargaTipoDeSocio();
		cuotaAlDía = cargaCuotaAlDía();
		cantidadDeMesesAPagar = cargaCantidadDeMesesACargar();
		
		mostrarMontoAPagar(tipoDeSocio, cuotaAlDía, cantidadDeMesesAPagar);
	}
}
