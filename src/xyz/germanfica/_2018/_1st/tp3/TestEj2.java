package xyz.germanfica._2018._1st.tp3;

public class TestEj2 {
	public static void main (String [] args){
		Ingrediente ingrediente = new Ingrediente();
		ingrediente.setNombre("Harina");
		ingrediente.setCantidad(2);
		ingrediente.setUnidadDeMedida("taza");
		System.out.println(ingrediente.toString());
	}
}
