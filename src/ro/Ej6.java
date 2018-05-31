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
public class Ej6 {
	/**
	 * Se lee y muestra por pantalla un cartel indicando el ingreso del tipo de socio
	 * y retorna el mismo.
	 * 
	 * @return tipo de socio
	 */
	public static String cargaTipoDeSocio() {
		System.out.println("Ingrese el tipo de socio: (p/np)");
		return TecladoIn.readLine();
	}
	
	/**
	 * Se lee y muestra por pantalla un cartel indicando el ingreso para conocer
	 * si el socio tiene la cuota al día y retorna el mismo.
	 * 
	 * @return
	 */
	public static boolean cargaCuotaAlDía() {
		System.out.println("¿Tiene su cuota al día? t/f");
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
	
	/**
	 * Muestra por pantalla el monto a pagar y el descuento aplicado.
	 * 
	 * @param tipoDeSocio
	 * @param cuotaAlDía
	 * @param cantidadDeMesesAPagar
	 */
	public static void mostrarMontoAPagar(String tipoDeSocio, boolean cuotaAlDía, int cantidadDeMesesAPagar) {
		// Si es un socio pleno entonces
		if(tipoDeSocio.equals("p")) {
			// Si tiene la cuota al día entonces
			if(cuotaAlDía) {
				int descuento = ((420*cantidadDeMesesAPagar)*15)/100;
				System.out.println("Monto a pagar: $" + ((420*cantidadDeMesesAPagar)-descuento) + ".-");
				System.out.println("Descuento aplicado: " + 15 +"%");
			}else {
				System.out.println("Monto a pagar: $" + (420*cantidadDeMesesAPagar) + ".-");
				System.out.println("Descuento aplicado: " + 0 +"%");
			}
		}
		
		// Si es un socio no pleno entonces
		if(tipoDeSocio.equals("np")) {
			System.out.println("Monto a pagar: $" + (310*cantidadDeMesesAPagar) + ".-");
			System.out.println("Descuento aplicado: " + 0 +"%");
		}
	}
	
	public static void main(String[] args) {
		// Declaración de variables
		String tipoDeSocio;
		boolean cuotaAlDía;
		int cantidadDeMesesAPagar;
		
		// Leer datos
		tipoDeSocio = cargaTipoDeSocio();
		cuotaAlDía = cargaCuotaAlDía();
		cantidadDeMesesAPagar = cargaCantidadDeMesesACargar();
		
		mostrarMontoAPagar(tipoDeSocio, cuotaAlDía, cantidadDeMesesAPagar);
	}
}
