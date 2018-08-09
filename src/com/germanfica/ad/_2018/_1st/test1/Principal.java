package com.germanfica.ad._2018._1st.test1;
//import java.util.Scanner;

public class Principal {
	public static void main(String[] arg){
		
		Alumno[] alumno = new Alumno[5];
		
		// Cartel de saludo
		System.out.println("Bienvenido.");
		
		for(int i = 0; i<alumno.length ; i++)
			alumno[i]= new Alumno("alumno"+ i,"asd",i);
		
		System.out.println("El primer alumno se llama: " + alumno[1].firstName.toString());
		
		System.out.println("asd: " + arg[0]);
	}
}
