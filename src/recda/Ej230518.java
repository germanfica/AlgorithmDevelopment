package recda;

public class Ej230518 {
	/*
	 * MÓDULO contarNeg(ENTERO arr[], ENTERO pos) RETORNA ENTERO
	ENTERO aux
	
	SI(pos<longitud(arr)
		SI arr[pos]<0
			aux <- contarNeg(arr, pos+1)+1
		SINO
			aux <- contarNeg(arr, pos+1)+0
		FIN SI
	FIN SI
	
	RETORNA aux
FIN MÓDULO contarNeg
	

	 */
	
	public static int[] cargaArreglo() {
		int[] arreglo = {2,3,-5,-3,2,-2,4};
		
		return arreglo;
	}
	
	public static void main(String[] args) {
		int[] arreglo = cargaArreglo();
		
		System.out.println(contarNeg(arreglo, arreglo.length-1));
	}
	
	public static int contarNeg(int[] arr, int pos) {
		int aux = 0;
		
		if(arr.length>=0){
			if(arr[pos]<0){
				aux = contarNeg(arr, pos-1)+1;
			}else{
				aux = contarNeg(arr, pos-1)+0;
			}
		}
		
		return aux;
	}
}
