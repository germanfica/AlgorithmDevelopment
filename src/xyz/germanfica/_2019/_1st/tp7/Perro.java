package xyz.germanfica._2019._1st.tp7;

import java.util.Scanner;

import xyz.germanfica.util.Delimitador;

public class Perro {
	private String nombre;
	private String apellidoDuenio;
	private String raza;
	private int anioNacimiento;
	private double costoDiario;
	private int cantDiasAlojado;
	private boolean cuidadoEspecial;
	private static double valorFijo;
	
	public Perro(String nombre, String apellidoDuenio, String raza) {
		this.nombre = nombre;
		this.apellidoDuenio = apellidoDuenio;
		this.raza = raza;
	}
	
	public Perro(String nombre, String apellidoDuenio, String raza, int anioNacimiento) {
		this.nombre = nombre;
		this.apellidoDuenio = apellidoDuenio;
		this.raza = raza;
		this.anioNacimiento = anioNacimiento;
	}
	
	// Observadores
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidoDuenio() {
		return apellidoDuenio;
	}
	
	public String getRaza() {
		return raza;
	}
	
	public int getAnioNacimiento() {
		return anioNacimiento;
	}
	
	public double getCostoDiario() {
		return costoDiario;
	}
	
	public int getCantDiasAlojado() {
		return cantDiasAlojado;
	}
	
	public boolean isCuidadoEspecial() {
		return cuidadoEspecial;
	}
	
	public static double getValorFijo() {
		return valorFijo;
	}
	
	public String toString() {
		return this.nombre + ", " + this.apellidoDuenio + ", " + this.raza + ", " + this.anioNacimiento;
	}
	
	public static Perro fromString(String texto) {
		Scanner sc = new Scanner(texto).useDelimiter(Delimitador.patron(",")); // Crear Scanner, analizar el texto y usar un delimitador
		
		String nombre = sc.next();
		String apellidoDuenio = sc.next();
		String raza = sc.next();
		int anioNacimiento = sc.nextInt();
		
		return new Perro(nombre, apellidoDuenio, raza, anioNacimiento); // devuelvo el perro
	}
	
	// Modificadores
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellidoDuenio(String apellidoDuenio) {
		this.apellidoDuenio = apellidoDuenio;
	}
	
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}
	
	public void setCostoDiario(double costoDiario) {
		this.costoDiario = costoDiario;
	}
	
	public void setCantDiasAlojado(int cantDiasAlojado) {
		this.cantDiasAlojado = cantDiasAlojado;
	}
	
	public void setCuidadoEspecial(boolean cuidadoEspecial) {
		this.cuidadoEspecial = cuidadoEspecial;
	}
	
	public void setValorFijo(double valorFijo) {
		this.valorFijo = valorFijo;
	}
}
