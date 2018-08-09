package com.germanfica.ad.test2;


public class Prueba {
	
	/* On my point of view initializing in constructor advantage
	 * 	-easy initialization of private fields and don't need to use setter method
	 * 
	 * Initializing in setter method advantage
	 * 	-unpopulated your constructor for cleaner and easy to understand constructor if you have an if-else,looping to do etc.
	 * 
	 * Getter method
	 * 	-it is used to return values so that you can use it in e.g. arithmetic operations or test conditions etc
	 */
	
	public static void main(String[] args) {
		Alumno alumno = new Alumno();
		
		alumno.setName("Asd");
		
		System.out.println("Welcome " + alumno.getName());
	}
}