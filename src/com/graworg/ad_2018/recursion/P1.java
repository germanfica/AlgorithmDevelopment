package com.graworg.ad_2018.recursion;

public class P1 {
	/**
	 * Invertir un número dado recursivamente
	 */
	public static int numInv(int num) {
		
		if(num<0) {
			
		}else {
			num = numInv(num-1);
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		numInv(921); // Debería mostrar 129
	}
}
