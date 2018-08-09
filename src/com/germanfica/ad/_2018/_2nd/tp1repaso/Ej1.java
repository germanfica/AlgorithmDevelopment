package com.germanfica.ad._2018._2nd.tp1repaso;

import java.util.Scanner;

/*
ALGORITMO misterio() RETORNA Ø
(* Este algoritmo ….. *)
ENTERO x,y
LEER(x)
LEER(y)
x ← x-y
y ← x+y
x ← y-x
ESCRIBIR (“Los valores de x e y son”)
ESCRIBIR (x)
ESCRIBIR (y)
FIN ALGORITMO misterio
 */
public class Ej1 {
    private static final String NOMBRE_ARCHIVO = "src/com/germanfica/ad/mensaje/Mensaje.txt"; // Ruta del archivo Mensaje.txt

	public static void main(String[] args) {
		// Declaración de variables
		Scanner sc;
		int x,y;
		
		// Inicialización de variables
		x=0;
		y=0;
		
		// Mensaje de bienvenida
		System.out.println("");
		
		// Creación del Scanner
		sc = new Scanner(System.in);
		
		// Leer
		x = sc.nextInt();
		y = sc.nextInt();
		
		// Operaciones
		x = x-y;
		y = x+y;
		x = y-x;
		
		
		// Escribir
		System.out.println("Los valores de x e y son");
		System.out.println(x);
		System.out.println(y);
	}
}
