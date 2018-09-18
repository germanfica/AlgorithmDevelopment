package xyz.germanfica.ad._2018._2nd.tpob;

public class Arbol {
	private String nombre;
	private int altura;
	private int profRaices;
	private boolean frutos;
	private int tempMinima;
	
	// Constructores
	public Arbol (String nombre) {
		this.nombre = nombre;
	}
	
	public Arbol (String nom, int alt, int pRaices, boolean fr, int tMin) {
		nombre = nom;
		alt = altura;
		profRaices = pRaices;
		frutos = fr;
		tempMinima = tMin;
	}
	
	// Modificadores
	public void setAltura(int alt) {
		altura = alt;
	}
	
	public void setProfR(int pRaices) {
		profRaices = pRaices;
	}
	
	public void setFrutos(boolean fr) {
		frutos = fr;
	}
	
	public void setTempMin(int tMin) {
		tempMinima = tMin;
	}
	
	// Observadores
	public String getNombre() {
		return nombre;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public int getProfR() {
		return profRaices;
	}
	
	public boolean getFrutos() {
		return frutos;
	}
	
	public int getTempMin() {
		return tempMinima;
	}
	
	/*
	 String nombre;
	int altura;
	int profRaices;
	boolean frutos;
	int tempMinima;
	
	 */
	public String toString() {
		return "Nombre: " + nombre + "; "
				+ "Altura: " + altura + "; "
				+ "Raices: " + profRaices + "; "
				+ "Frutos: " + frutos + "; "
				+ "Temperatura mínima: " + tempMinima
				;
	}
	
	public int equals (Arbol a) {
		// Declaración de variables
		int isEquals;
		
		// Inicialización de variables
		isEquals = 0; // No es igual
		
		if(nombre==a.nombre && altura==a.altura && profRaices==a.profRaices && frutos==a.frutos && tempMinima==a.tempMinima) {
			isEquals = 1; // Es igual
		}
		
		return isEquals;
	}
}
