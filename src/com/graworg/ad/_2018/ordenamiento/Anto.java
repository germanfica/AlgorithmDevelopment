package com.graworg.ad._2018.ordenamiento;

import java.util.Scanner;

public class Anto {
    public static void main(String[] args) {
        int Arreglo[] = {2,3,6,5,7,9,10,1,0};
    	//int Arreglo[] = {1,5,3,2};
        Menu(Arreglo);
    }
    public static void Menu(int Arreglo[]) {
        Scanner sc = new Scanner(System.in);
        int Opcion;
        boolean reiniciar = true;
        
        System.out.println("MENU:");
        System.out.println("Ingrese el tipo de ordenamiento a realizar:");
        System.out.println("1.- Ordenamiento Burbuja");
        System.out.println("2.- Ordenamiento Seleccion");
        System.out.println("3.- Salir");
        
        while (reiniciar){
            Opcion = sc.nextInt();
            if (Opcion <3){
                    Opciones(Opcion, Arreglo);   
                    System.out.println("Ingrese otra opcion del menu o 3 para "
                       + "finalizar el programa");
                }else{
                        reiniciar = false;
                }
        }
    }
    public static void Opciones(int Opcion, int Arreglo[]) {
        
           switch (Opcion){
                case 1: System.out.println("Imprimiendo en metodo burbuja:");
                        Burbuja(Arreglo);
                        ImprimirArreglo(Arreglo);
                        Desordenar(Arreglo);
                        break;
                case 2: System.out.println("Imprimiendo en metodo seleccion");
                        Seleccion(Arreglo);
                        ImprimirArreglo(Arreglo);
                        Desordenar(Arreglo);
                        break;
                case 3: System.err.println("Programa terminado ");
            }
    }
    public static void Burbuja (int Arreglo[]) {
        boolean cambio = false;
        int i = 0;
        int num;
        while(!cambio && i<Arreglo.length){
            cambio = true;
            for (int j  = 0; j <Arreglo.length-1; j++) {
                if (Arreglo[j]>Arreglo[j+1]) {
                    num=Arreglo[j];
                    Arreglo[j]= Arreglo[j+1];
                    Arreglo[j+1]=num;
                    cambio=false;
                }
            }
            i++;
        }
    }
    public static void Seleccion(int Arreglo[]) {
        int minimo, aux;
        
        for (int i = 0; i <Arreglo.length-1; i++) {
            minimo=i;
            for (int j = i+1; j <Arreglo.length ; j++) {
                if(Arreglo[j]<Arreglo[minimo]){
                    minimo=j;
                }
            }
            aux = Arreglo[i];
            Arreglo[i]=Arreglo[minimo];
            Arreglo[minimo]=aux;
            
        }
    }
    
    public static void ImprimirArreglo(int Arreglo[]) {
      
        for (int j = 0; j < Arreglo.length; j++) {
            System.out.println(Arreglo[j]); 
        }
        
    }
    public static void Desordenar(int Arreglo[]) {
         Arreglo[0] = 2;
         Arreglo[1] = 3;
         Arreglo[2] = 6;
         Arreglo[3] = 5;
         Arreglo[4] = 7;
         Arreglo[5] = 9;
         Arreglo[6] = 10;
         Arreglo[7] = 1;
         Arreglo[8] = 0;
         
    }
}