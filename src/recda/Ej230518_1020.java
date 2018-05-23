package recda;

public class Ej230518_1020 {
	
	/*
	 *  MÓDULO busquedaBinaria(vec, ENTERO pos) RETORNA ENTERO
			ENTERO aux, inicial, final, medio
			LÓGICO encontrado
			
			inicial ← 0
			final ← vec.longitud-1
			aux ← -1 // No encontró nada
			
				MIENTRAS (NOT encontrado AND inicial<=final) HACER
					Medio ← (inicial + final)/2
			
					SI (vec[medio] = pos) ENTONCES
						aux ← medio
						encontrado ← true
			SINO
				SI (vec[medio]>pos)
					final ← medio -1
				SINO
					inicial ← medio +1
				FIN SI
			FIN SI
				FIN MIENTRAS
		FIN MÓDULO busquedaBinaria
	 */
	
	public static int busquedaBinariaSin(int[] arreglo, int pos) {
		// Declaración de variables
		
		int aux, medio, posInicial, posFinal;
		boolean encontrado;
		
		// Inicialización de variables
		posInicial=0;
		posFinal=arreglo.length-1;
		encontrado = false;
		aux = -1;
		
		while(!encontrado && posInicial <=posFinal){
			medio = (posInicial + posFinal)/2;
		
			if(arreglo[medio] == pos){
				aux = medio;
				encontrado = true;
			}
			
		}
		
		
		
		return pos;
		
	}
	
	// Recursión y algo más
	public static int busquedaBinaria(int[] arreglo, int pos, int posInicial, int posFinal) {
		// Declaración de variables
		int aux, medio;
		boolean encontrado;
		
		// Inicialización de variables
		encontrado = false;
		aux = -1;
		medio = (posInicial+posFinal)/2;
		
		if(posInicial<=posFinal){
			if(arreglo[medio]==pos){
				aux = medio;
			}else{
				if(arreglo[medio]>pos){
					aux = busquedaBinaria(arreglo, pos, posInicial, medio-1);
				}else{
					aux = busquedaBinaria(arreglo, pos, medio-1, posFinal);
				}
			}
		}
		
		
		
		return pos;
		
	}
	
	public static void main(String[] args) {
		int[] arreglo = cargaArreglo();
		
		busquedaBinaria(arreglo, 0, 0, arreglo.length-1);
	}
	
	public static int[] cargaArreglo() {
		int[] arreglo = {2,3,-5,-3,2,-2,4};
		
		return arreglo;
	}
}
