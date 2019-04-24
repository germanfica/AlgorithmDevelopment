package martingerman._2019.trabajogrupal.tp7;

import java.util.Scanner;
import xyz.germanfica.util.Archivo;

public class TestPerro {
	private final static String NOMBRE_ARCHIVO = "src/martingerman/_2019/trabajogrupal/tp7/StringTDA.txt";

	public static void main(String[] args) {
		// este algoritmo....
		// declaracion de variables
		Perro[] arregloPerro = new Perro[10];
		Scanner sc = new Scanner(System.in);
		String StringTDA = Archivo.leer(NOMBRE_ARCHIVO).getTexto();
		boolean salir = false;
		int opcion;
		cargarPerro(arregloPerro);
		String nombrePerro, apellido, raza;
		
		while (!salir) {
			muestraOpcion();
			opcion = sc.nextInt();
			switch (opcion) {
			case 0:
				salir = false;
				break;
			case 1:
				mostrarListaPerro(arregloPerro);
				break;
			case 2:
				System.out.println("ingrese el nombre del perro:");
				nombrePerro = sc.next();
				System.out.println("ingrese el apellido:");
				apellido = sc.next();
				System.out.println("ingrese la raza:");
				raza = sc.next();
				buscaElPerro(arregloPerro, nombrePerro, apellido, raza);
				break;
			case 3:
				double nuevoValorFijo = 0.0;
				try {
					nuevoValorFijo = new Scanner(System.in).nextDouble();
				} catch (Exception e) {
					System.err.println("Error. Ingrese coma, no punto.");
				}
				// usar coma (no punto)
				cambiaValorFijo(arregloPerro, nuevoValorFijo);
				break;
			case 4:
				System.out.println("ingrese el nombre del perro que quiere modificar:");
				nombrePerro = sc.next();
				modificaPerro(arregloPerro, nombrePerro);
				break;
			case 5:
				System.out.println(Perro.getPorcIncremento() + "%");
				break;
			case 6:
				System.out.println("ingrese el nombre del perro para saber el precio total:");
				cuantoCobrar(arregloPerro, sc.next());
				break;
			default:
				System.out.println("ingrese una opcion correcta.");
				break;
			}
		}
	}

	public static void cargarPerro(Perro[] arregloPerro) {
		// este modulo carga la clase perro
		for (int i = 0; i < arregloPerro.length; i++) {
			arregloPerro[i] = Perro.fromString(Archivo.leer(NOMBRE_ARCHIVO).toArray()[i]);
		}
	}

	public static void mostrarListaPerro(Perro[] arregloPerro) {
		// este modulo muestra todos los perros que estan en la guarderia
		for (int i = 0; i < arregloPerro.length; i++) {
			System.out.print(arregloPerro[i].getNombrePerro() + " ");
		}

	}

	public static void buscaElPerro(Perro[] arregloPerro, String nombrePerro, String apellido, String raza) {
		// este modulo muestra todos los datos del perro dado su nombre, apellido y raza
		// declaro e inicializo variables
		boolean estaPerro = false;
		int i = 0;

		// busco en el arregloPerro si es que coinciden el nombre, el apellido y la raza
		// dados por el usuario
		while (i < arregloPerro.length && !estaPerro) {
			if (arregloPerro[i].getNombrePerro().equalsIgnoreCase(nombrePerro)
					&& arregloPerro[i].getApellidoDuenio().equalsIgnoreCase(apellido)
					&& arregloPerro[i].getRaza().equalsIgnoreCase(raza)) {
				System.out.println(arregloPerro[i].toString());
				estaPerro = true;
			}
			i++;
		}
		if (!estaPerro) {
			System.out.println("el perro no se encuentra.");
		}
	}

	public static void muestraOpcion() {
		System.out.println("[1] mostrar lista de perros");
		System.out.println("[2] buscar un perro");
		System.out.println("[3] modificar el valor fijo");
		System.out.println("[4] modificar los datos de un perro");
		System.out.println("[5] mostrar porcentaje fijo de incremento");
		System.out.println("[6] cuanto cobrar");
		System.out.println("[0] finalizar programa");
	}

	public static void cuantoCobrar(Perro[] arregloPerro, String apellido) {
		// este modulo muestra cuanto tiene que cobrar
		int posicion = 0;

		// recorro el arreglo y busco el apellido. Guarda la posicion si es que existe.
		for (int i = 0; i < arregloPerro.length; i++) {
			if (arregloPerro[i].getApellidoDuenio().equalsIgnoreCase(apellido)) {
				posicion = i;
			}
		}
		System.out.println("el precio total es: " + arregloPerro[posicion].getPrecioTotal());
	}

	public static void cambiaValorFijo(Perro[] arregloPerro, double nuevoValorFijo) {
		// este modulo cambia el valor fijo por lo tanto cambiara el porcentaje de
		// incremento
		//for (int i = 0; i < arregloPerro.length; i++) {
			// arregloPerro[i].setPorcIncremento(nuevoValorFijo);
			
		//}
		Perro.setPorcIncremento(nuevoValorFijo);
	}

	public static void modificaPerro(Perro[] arregloPerro, String nombrePerro) {
		// este modulo modifica los datos de un perro en especifico
		// declaracion e inicializacion de variables
		int posicion = 0, nuevoAnioNaciemiento, nuevoCantDiasCuidado;
		boolean nuevoCuidadoEspecial;
		String nuevoNombrPerro, nuevaRaza;

		/*
		 * recorro el arreglo buscando el nombre del perro para guardar su posicion para
		 * luego modificar los elementos en el arreglo Perro
		 */
		for (int i = 0; i < arregloPerro.length; i++) {
			if (arregloPerro[i].getNombrePerro().equalsIgnoreCase(nombrePerro)) {
				posicion = i;
			}
		}

		System.out.println("ingrese el nuevo nombre:");
		nuevoNombrPerro = new Scanner(System.in).next();
		arregloPerro[posicion].setNombrePerro(nuevoNombrPerro);

		System.out.println("ingrese la nueva raza:");
		nuevaRaza = new Scanner(System.in).next();
		arregloPerro[posicion].setRaza(nuevaRaza);

		System.out.println("ingrese el nuevo año de nacimiento:");
		nuevoAnioNaciemiento = new Scanner(System.in).nextInt();
		arregloPerro[posicion].setAnioDeNacimiento(nuevoAnioNaciemiento);

		System.out.println("ingrese si tiene cuidado especial:");
		nuevoCuidadoEspecial = new Scanner(System.in).nextBoolean();
		arregloPerro[posicion].setCuidadoEspecial(nuevoCuidadoEspecial);

		System.out.println("ingrese la nueva cantidad de dias de cuidado");
		nuevoCantDiasCuidado = new Scanner(System.in).nextInt();
		arregloPerro[posicion].setCantidadDiasCuidado(nuevoCantDiasCuidado);

	}
}
