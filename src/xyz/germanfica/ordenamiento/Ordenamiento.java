package xyz.germanfica.ordenamiento;

/*
 * Exacto. Verificado. Cuando se manda por parametro a un arreglo,
 * se esta modificando el arreglo que esta en memoria. Es decir,
 * no crea un nuevo arreglo, sino que modifica el que esta en memoria. :D
 * 
 * Y ademas,
 * los métodos de ordenamiento que estamos implementando no son recursivos.(;
 */
public class Ordenamiento {
	
	public static void burbuja(int[] arreglo, int n){
		int auxiliar;
		
		for(int i=0; i<= n-1;i++) {
			for(int j=0; j<= (n-i-2);j++) {
				if(arreglo[j] > arreglo[j+1]) {
					auxiliar = arreglo[j];
					arreglo[j] = arreglo[j+1];
					arreglo[j+1] = auxiliar;
				}
			}
		}
	}
	
	public static void burbujaMejorado(int[] arreglo, int n) {
		int auxiliar, i;
		boolean ordenado;
		
		ordenado = false;
		i = 0;
		
		while(i<=n-1 && ordenado==false) {
			ordenado = true;
			
			for(int j=0;j<=(n-i-2);j++) {
				if(arreglo[j]>arreglo[j+1]) {
					ordenado = false;
					auxiliar = arreglo[j];
					arreglo[j] = arreglo[j+1];
					arreglo[j+1] = auxiliar;
				}
			}
			i++;
		}
	}
	
	public static void insercion(int[] arreglo, int n) {
		int auxiliar, j;
		
		for(int i=1;i<=n-1;i++) {
			j = i;
			auxiliar = arreglo[j];
			
			while(j>0 && arreglo[j-1]>auxiliar) {
				arreglo[j] = arreglo[j-1];
				j--;
			}
			arreglo[j] = auxiliar;
		}
	}
	
	public static void seleccion(int[] arreglo, int n) {
		int auxiliar, iMin;
		
		for(int i=0;i<=n-2;i++) {
			iMin = i;
			for(int j=i+1;j<=n-1;j++) {
				if(arreglo[j]<arreglo[iMin]) {
					iMin = j;
					auxiliar = arreglo[i];
					arreglo[i] = arreglo[iMin];
					arreglo[iMin] = auxiliar;
				}
			}
		}
	}
	
	public static int busquedaSecuencial(int [] array,int longitud) {
        //Retorna posicion del elemento
        int n=7,posicion=-1,i=0;
        boolean encontrado=false;
        while(encontrado==false && i < longitud){
            if(array[i]==n){
                encontrado=true;
                posicion=i;
            }
            else{
                i++;
            }
        }
        return posicion;
    }
	
	public static int busquedaBinaria(int[]array) {
        int inicio=0,fin=array.length-1,posicion=-1,medio,n=5;
        boolean encontrado=false;
        while(inicio<=fin && encontrado==false){
            medio=(inicio+fin)/2;
            if(n==array[medio]){
                posicion=medio;
                encontrado=true;
            }
            else{
                if(n<array[medio]){
                    fin=medio-1;
                }
                else{
                    inicio=medio+1;
                }
            }
        }
        return posicion;
    }
	
	public static void main(String[] args) {
		Menu.mostrar();
	}
}
