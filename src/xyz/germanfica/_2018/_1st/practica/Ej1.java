package xyz.germanfica._2018._1st.practica;

public class Ej1 {
	/*
	 * // La recurson podria recotarse cuando n/10=0 o n=0
MÓDULO mostrarNumeroTexto(Entero n)
	SI (n>0)
		t1<- pasarATexto(n mod 10)
		ESCRIBIR(t1)
		mostrarNumeroTexto(n/10)
	FIN SI
FIN MÓDULO mostrarNumeroTexto
	 */
	
	/**
	 * Deberia retornar esto una cadena(?)
	 * @param n
	 * @return
	 */
	private static String t1 = "";
	public static String paseANumeroTexto(int n){
		
		if(n>0){
			t1 = pasarATexto(n%10);
			t1 = t1 + paseANumeroTexto(n/10);
		}
		
		return t1;
	}
	
	public static void mostrarNumeroTexto(int n){
		String t1;
		if(n>0){
			t1 = pasarATexto(n%10);
			System.out.println(t1);
			mostrarNumeroTexto(n/10);
		}
	}
	
	/*
	 * pasarATexto(entero d)
// d es un digito del 0 al 9
TEXTO nombreDelNumero
SEGÚN d HACER
	CASO '0' nombreDelNumero <- "cero"
	CASO '1': nombreDelNumero<- "uno"
	…
FIN SEGÚN
	 */
	public static String pasarATexto(int d){
		String nombreDelNumero;
		
		switch(d){
			case 0:
				nombreDelNumero = "cero";
				break;
			case 1:
				nombreDelNumero = "uno";
				break;
			case 2:
				nombreDelNumero = "dos";
				break;
			case 3:
				nombreDelNumero = "tres";
				break;
			case 4:
				nombreDelNumero = "cuatro";
				break;
			case 5:
				nombreDelNumero = "cinco";
			case 6:
				nombreDelNumero = "seis";
				break;
			case 7:
				nombreDelNumero = "siete";
				break;
			case 8:
				nombreDelNumero = "ocho";
				break;
			case 9:
				nombreDelNumero = "nueve";
			default:
				nombreDelNumero = "";
				break;
		}
		
		return nombreDelNumero;
	}
	
	/*
	 * El mismo que el anterior
	 */
	public static void mostrarAlRevesNumeroTexto(int n){
		String t1;
		if(n>0){
			t1 = pasarATexto(n%10);
			mostrarNumeroTexto(n/10);
			System.out.println(t1); // GENIAAAAAAAAAL, muestra la desapilacion
		}
	}
	/*
	 * EL mismo que el anterior pero 
	 */
	
	public static String paseAlRevesNumeroTexto(int n){
		String t2 = ""; // No hay problema en ponerla aca
		if(n>0){
			t2 = pasarATexto(n%10);
			//mostrarNumeroTexto(n/10);
			//t2 = t2 + ' ' + paseAlRevesNumeroTexto(n/10);
			t2 = paseAlRevesNumeroTexto(n/10) + t2 + ' ';
		}
		return t2;
	}
	
	public static void main(String[] args) {
		System.out.println("Bienvenido");
		//mostrarNumeroTexto(112);
		System.out.println(paseANumeroTexto(112));
		//mostrarAlRevesNumeroTexto(112);
		System.out.println(paseAlRevesNumeroTexto(112));
	}
}
