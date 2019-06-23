package xyz.germanfica._2019._1st.tpfinal;

public class Principal {

	public static void main(String[] args) {
		Aleatorio aleatorio = new Aleatorio();
		System.out.println(aleatorio.toString());
		Aleatorio aleBus = new Aleatorio();
		System.out.println(aleBus.getNumAleatorio());
		System.out.println(aleatorio.compareTo(aleBus));
	}
}
