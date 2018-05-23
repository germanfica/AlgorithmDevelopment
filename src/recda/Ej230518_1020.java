package recda;

import java.util.Scanner;

public class Ej230518_1020 {
	
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
	
	/*
	 *  MÓDULO busquedaBinaria(ENTERO[] vec, ENTERO pos) RETORNA ENTERO
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
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int x;
	        int[] vec = cargaArreglo();
	        int inicial=0, fin = vec.length-1;
	        
	        System.out.println("Ingrese numero a buscar");
	        x = sc.nextInt();
	        System.out.println("Busqueda iterativa");
	        System.out.println("Pos arreglo: "+BusquedaBin(vec, x ));
	        
	        System.out.println("Busqueda recursiva");
	        System.out.println("Pos arreglo: "+RecursionBusquedaBin(vec, x, inicial, fin ));
	    }
	    
	    public static int RecursionBusquedaBin(int []vec, int x, int inicial, int fin) {
	        int aux=-1, medio;
	        medio = (inicial+fin)/2;
	        
	        if(inicial <=fin){
	            if(vec[medio]==x){
	                aux = medio;
	            }else{
	                if(vec[medio]>x){
	                    aux=RecursionBusquedaBin(vec, x, inicial,medio-1);
	                }else{
	                    aux=RecursionBusquedaBin(vec,x,medio+1, fin);
	                }
	            }
	        }
	        
	        return aux;
	    }
	    
	    public static int BusquedaBin(int []vec, int x) {
	    	// Declaración de variables
	        int aux, inicial, fin, medio;
	        boolean encontrado;
	        
	        // Inicialización de variables
	        encontrado = false;
	        inicial =0;
	        fin = vec.length-1;
	        aux=-1;
	        
	        while(!encontrado && inicial <= fin){
	            medio=(inicial + fin)/2;
	            
	            if (vec[medio]== x){
	                aux = medio;
	                encontrado=true;
	            }else{
	                if(vec[medio]>x){
	                    fin = medio-1;
	                }else{
	                    inicial = medio+1;
	                }
	            }
	        }
	        
	        return aux;
	    }
	    
	
	    /*
	public static int asd(int[] vector, int x) {
		// Declaración de variables
		int aux, inicial, fin, medio;
		boolean encontrado;
		
		// Inicialización de variables
		encontrado = false;
		inicial=0;
		fin=vector.length-1;
		aux = -1;
		
		while(!encontrado && inicial <= fin){
			medio = (inicial + fin)/2;
		
			if(vector[medio] == x){
				aux = medio;
				encontrado = true;
			}else{
				if(vector[medio]>x){
					fin = medio-1;
				}else{
					inicial = medio+1;
				}
			}
			System.out.println("asd");
		}
		
		return aux; // El error era que retornabas x y había que retornar aux
	}
	*/
	
	/*
	public static void main(String[] args) {
		int[] vector = cargaArreglo();
		//System.out.println(vector[0]);
		System.out.println("Bienvenido a la consola");
		System.out.println(busquedaBinariaSin(vector, 90));
		
		//busquedaBinaria(arreglo, 0, 0, arreglo.length-1);
	}
	*/
	
	public static int[] cargaArreglo() {
		int[] arreglo = {-5,-3,2,4,7};
		
		return arreglo;
	}
}
