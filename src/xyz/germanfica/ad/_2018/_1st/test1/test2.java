package xyz.germanfica.ad._2018._1st.test1;

public class test2 {
	public static int[] cargarPrimos(int n) 
	{
		int divisores, primosEncontrados, indice, subIndice;
		int[] primo, posiblePrimo;
		
		primosEncontrados = 0; // Inicializar entero
		
		posiblePrimo = new int[n]; // Inicializar arreglo
		
		// Buscar posible primo
		for(indice = 2; indice<=posiblePrimo.length;indice++)
		{
			divisores = 0; // Inicializar entero
			
			for(subIndice = indice; subIndice>1;subIndice--)
			{
				if(indice%subIndice==0)
				{
					//System.out.println(j + " divide a " + i);
					divisores = divisores + 1;
				}
			}
			
			if(divisores == 1)
			{
				//System.out.println(i + " es primo.");
				primosEncontrados = primosEncontrados + 1;
				posiblePrimo[primosEncontrados-1] = indice;
			}else
			{
				//System.out.println(i + " no es primo.");
			}
		}
		
		// Crear nuevo arreglo con la cantidad correcta de numero primos.
		primo = new int[primosEncontrados];
		for(int i = 0; i < primo.length; i++)
		{
			primo[i] = posiblePrimo[i];
		}
		
		return primo;
	}
	
	public static void main(String[] args) {
		System.out.println("Bienvenido");
		int[] p;
		p = cargarPrimos(11);
		
		System.out.println("Primos encotrados: " + p.length);
		
		if(p.length!=0)
		{
			for(int i = 0; i<p.length;i++)
			{
				System.out.println("Elemento "+i+": " + p[i]);
			}
		}
	}
}
