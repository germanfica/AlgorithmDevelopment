package xyz.germanfica._2018._1st.practica;

public class Ej2 {
	/*
	 * Contar la cantida de dígitos cero que un número entero n
	 * 
	 * Ejemplo: 2030 tiene 2 ceros
	 * 
	 * Si n tiene dos o mas digitos
	 *  . la cantida de ceros es la cantidad de ceros en n son el último dígito removido (planteo recursivo)
	 *  . mas un 1 adicional si el último dígito es cero
	 *  
	 *  Ejemplo:
	 *   . cantidad de ceros en 20030 es -> cantidad de ceros en 2003 mas 1
	 *   . cantidad de ceros en 20035 es -> cantidad de ceros en 2003
	 */
	
	public static int cantidadDigitos(int n){
		int cant = 0;
		
		// ARMAR UNA TRAZA
		
		if(n>0){
			// Cuenta la cantidad de digitos
			/*
			if(n%10==0){ // Consulta el último valor del número por ej. 2030, es decir ¿0==0? Sí 
				cant = cantidadDigitos(n/10) + 1; // Como n/10 es cero entonces sumo 1
			}else{
				cant = cantidadDigitos(n/10);
			}
			*/
			//
			
			System.out.println(n); // Descompone
			cantidadDigitos(n/10); // Corre la coma un lugar hacia la izquierda del número
			System.out.println(n); // Compone
			
			//System.out.println(n%10); // Muestra el modulo de izquierda a derecha
		}
		
		return cant;
	}
	
	
	public static void mostrarNúmeroTexto(int n){
		//String t1;
		if(n>0){
			//t1 = pasarATexto(n%10);
			//System.out.println(t1);
			mostrarNúmeroTexto(n/10);
		}
	}
	
	public static void main(String[] args) {
		cantidadDigitos(2030);
		//System.out.println(cantidadDigitos(2030));
	}
}
