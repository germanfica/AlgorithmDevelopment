package xyz.germanfica.ad._2019._1st.tp4;

import java.util.Scanner;

public class ArreglosUnidimensionales {

	public static boolean esPrimo(int num) {
		boolean esPrimo = true;
		int anterior = -1;

		while (esPrimo && anterior > 1) {
			if ((num % anterior) == 0) {
				esPrimo = false;
			}
			anterior--;
		}

		return esPrimo;
	}

	public static int[] pin() {
		int cantDig = 4;
		int[] pin = new int[cantDig];
		int cantPrimos = 0;
		boolean pinValido = false;
		int num;

		while (!pinValido) {
			System.out.println("Ingrese su pin:");
			for (int i = 0; i <= pin.length - 1; i++) {
				Scanner sc = new Scanner(System.in);
				num = sc.nextInt();
				if (esPrimo(num)) {
					cantPrimos++;
				}
				pin[i] = num;
			}
			if (cantPrimos > 2) {
				pinValido = true;
			} else {
				System.out.println("El pin no es válido, porfavor re-ingrese nuevamente un pin.");
			}
		}

		return pin;
	}

	public static int[] cn(int[] pin, int n) {
		int[] cn = new int[n * 2];
		int j = 0;

		for (int i = 0; i <= n - 1; i++) {
			cn[j] = pin[i];
			j++;
			cn[j] = (pin[i] + 5) * 3;
			j++;
		}
		return cn;
	}

	public static void mostrarElemArrEnt(int[] arr) {
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	public static int cantCifras(int num) {
		int rest = num % 10;
		int cantCifras = 0;

		while (rest > 0) {
			rest = num % 10;
			if (rest > 0) {
				cantCifras++;
			}
			num = num / 10;
		}
		return cantCifras;
	}
	
	public static int cantDigEqDeCif(int[] cn, int num) {
		int cant = 0;

		for (int i = 1; i <= cn.length - 1; i = i + 2) {
			if (cantCifras(cn[i]) == num) {
				cant++;
			}
		}
		return cant;
	}
	
	public static int cantDigEqDeCifMayIgual(int[] cn, int cantCif) {
		int cant = 0;

		for (int i = 1; i <= cn.length - 1; i = i + 2) {
			if (cantCifras(cn[i]) >= cantCif) {
				cant++;
			}
		}
		return cant;
	}

	public static int cantDigEqEntre(int[] cn, int ini, int fin) {
		int cant = 0;
		for (int i = 1; i <= cn.length-1; i=i+2) {
			if (cn[i] >= ini && cn[i] <= fin) {
				cant++;
			}
		}
		return cant;
	}

	public static void mostrarMenu() {
		int[] pin = pin();
		int[] cn = cn(pin, pin.length);
		int opcion = 0;

		while (opcion != -1) {
			System.out.println("Bienvenido!");
			System.out.println("[0] Mostrar pin codificado");
			System.out.println("[1] Mostrar la cantidad de dígitos equivalentes de 3 o más cifras");
			System.out.println("[2] Mostrar la cantidad de dígitos equivalentes de 1 cifra");
			System.out.println("[3] Mostrar la cantidad de dígitos equivalentes entre 20 y 40");

			Scanner sc = new Scanner(System.in);
			opcion = sc.nextInt();
			switch (opcion) {
			case 0:
				mostrarElemArrEnt(cn);
				break;
			case 1:
				System.out.println(cantDigEqDeCifMayIgual(cn, 3));
				break;
			case 2:
				System.out.println(cantDigEqDeCif(cn, 1));
				break;
			case 3:
				System.out.println(cantDigEqEntre(cn, 20, 40));
				break;
			default:
				System.out.println("Opción inválida");
				break;
			}
		}
	}

	public static void main(String[] args) {
		mostrarMenu();
	}
}
