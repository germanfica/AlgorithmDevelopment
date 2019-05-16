package xyz.germanfica._2019._2nd.primer_parcial;

public class Jugador {
	private int dni;
	private String nombre;
	private String numTel;
	private int cantGoles;
	private int cantMinJugadas;

	// Constructores
	Jugador(int dni, int cantGoles, int cantMinJugadas) {
		this.dni = dni;
		this.cantGoles = cantGoles;
		this.cantMinJugadas = cantMinJugadas;
		nombre = "";
		numTel = "";
	}

	Jugador(int dni, String nombre, String numTel, int cantGoles, int cantMinJugadas) {
		this.dni = dni;
		this.numTel = numTel;
		this.cantGoles = cantGoles;
		this.cantMinJugadas = cantMinJugadas;
	}

	// Observadores
	
	public String getNombre() {
		return nombre;
	}

	public boolean equals(Jugador jugador) {
		return dni == jugador.dni;
	}

	/*
	 * Orden segun el dni
	 */
	public int compareTo(Jugador jugador) {
		int res;

		if (equals(jugador)) {
			res = 0;
		} else if (dni > jugador.dni) {
			res = 1;
		} else {
			res = -1;
		}

		return res;
	}
	
	// cociente entre la cantidad de goles y la cantidad de minutos jugados
	public double valJug() {
		return cantGoles/cantMinJugadas;
	}

	// Modificadores
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Propias del tipo
}
