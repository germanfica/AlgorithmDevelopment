package xyz.germanfica.ad.primer_parcial._02_05_2018;

public class Libro {
	private String ISBN;
	private String nombre;
	private String autor;
	private int ejemplares;

	// ¿Cómo puedo crear un libro?
	Libro(String iSBN, String nom) {
		ISBN = iSBN;
		nombre = nom;
		autor = "";
		ejemplares = -1;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public String getAutor() {
		return autor;
	}

	public String toString() {
		String ISBN = "ISBN: " + this.ISBN + ", ";
		String nombre = "nombre: " + this.nombre + ", ";
		String autor = "autor: " + this.autor + ", ";
		String ejemplares = "ejemplares: " + this.ejemplares;

		return "{" + ISBN + nombre + autor + ejemplares + "}";
	}

	void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	boolean equals(Libro libro) {
		return ISBN.equalsIgnoreCase(libro.ISBN); // Puedo acceder por más que sea privado ya que estoy en la misma
													// clase
	}
}
