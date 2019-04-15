package xyz.germanfica.ad._2019._1st.tp6;

import xyz.germanfica.blockchain.Block;
import xyz.germanfica.blockchain.Blockchain;
import xyz.germanfica.util.Lectura;

public class TestItem {
	public static void main(String[] args) {
		Blockchain germanCoin = new Blockchain();
		int opcion;
		boolean salir = false;

		while (!salir) {
			mostrarOpciones();
			opcion = Lectura.leerOpcion();
			switch (opcion) {
			case 0:
				salir = true;
				break;
			case 1:
				Item item = new Item("GTX 2080Ti", "", 500, 950);
				germanCoin.addBlock(new Block(1, 14042019, item, ""));
				germanCoin.addBlock(new Block(1, 15042019, "amount: 4", ""));
				break;
			case 2:
				System.out.println(germanCoin.toString());
				break;
			default:
				System.out.println("Opción inválida");
				break;
			}
		}
	}
	
	public static void mostrarOpciones() {
		System.out.println("Bienvenido!");
		System.out.println("[0] Salir");
		System.out.println("[1] Agregar coin");
		System.out.println("[2] Mostrar blockchain");
	}
}
