package xyz.germanfica._2018._2nd.tp3;

public class Test {
	
	
	
	public static void main(String[] args) {
		int[][] matriz = {
				{1 , 2,  3,  4},
				{5 , 6 , 7,  8},
				{9,  10, 11, 12},
				{13, 14, 15, 16}
		};
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				int elemento = matriz[i][j];
				if(elemento<=9) {
					System.out.print(elemento + "  ");
				}else if(elemento <=99) {
					System.out.print(elemento + " ");
				}else {
					System.out.print(elemento);
				}
				
			}
			System.out.println();
		}
		System.out.println("____________-");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				int elemento = matriz[j][i];
				if(elemento<=9) {
					System.out.print(elemento + "  ");
				}else if(elemento <=99) {
					System.out.print(elemento + " ");
				}else {
					System.out.print(elemento);
				}
				
			}
			System.out.println();
		}
	}
}
