package xyz.germanfica._2019.preparacionfinal;

public class TestFinal2019Agosto1 {

	public static String nomCom(String nombre, String apellido) {
		String comprimido = "" + nombre.toLowerCase() + "-";
		String apellidoTrim = apellido.trim();
		int posPriEsp = apellidoTrim.indexOf(' ');
		int posUltEsp = apellidoTrim.lastIndexOf(' ');

		if (posPriEsp == -1 && posUltEsp == -1) {
			comprimido += apellidoTrim;
		} else {
			comprimido += apellidoTrim.substring(0, posPriEsp)
					+ apellidoTrim.substring(posUltEsp + 1, apellidoTrim.length());
		}

		return comprimido;
	}

	public static void main(String[] args) {
		String nombre1 = "RABO", nombre2 = "negro", nombre3 = "Colita";
		String apellido1 = "     Martinez     NOVOA", apellido2 = "   Perez   ",
				apellido3 = "  Sancez      Coel        ";

		System.out.println(nomCom(nombre1, apellido1));
		System.out.println(nomCom(nombre2, apellido2));
		System.out.println(nomCom(nombre3, apellido3));
	}
}
