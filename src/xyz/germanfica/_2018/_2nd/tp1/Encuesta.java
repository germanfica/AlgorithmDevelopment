package xyz.germanfica._2018._2nd.tp1;

public class Encuesta {
	private String nombre;
	private String apellido;
	private int edad;
	private int cantPaísesVis;
	private EstadoCivil estadoCivil;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getCantPaísesVis() {
		return cantPaísesVis;
	}
	public void setCantPaísesVis(int cantPaísesVis) {
		this.cantPaísesVis = cantPaísesVis;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
}
