/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.germanfica.ad._2018._1st.ordenamiento;

/**
 *
 * @author manul
 */
public class MetodosBusquedaOrdenacion {
    public static int busquedaSecuencial(int [] array,int longitud) {
        //Retorna posicion del elemento
        int n=7,posicion=-1,i=0;
        boolean encontrado=false;
        while(encontrado==false && i < longitud){
            if(array[i]==n){
                encontrado=true;
                posicion=i;
            }
            else{
                i++;
            }
        }
        return posicion;
    }
    public static void ordenacionPorSeleccion(int []array, int longitud) {
        int min,aux;
        for (int i = 0; i < longitud-1; i++) {
            min=i;
            for (int j = i+1; j < longitud; j++) {
                if(array[j]<array[min]){
                    min=j;
                }
            }
        aux=array[i];
        array[i]=array[min];
        array[min]=aux;
        }
        System.out.print("Array ordenado por ordenacion por seleccion: ");
        for (int i = 0; i < longitud; i++) {
            System.out.print(array[i]+",");
        }
    }

    public static void ordenacionPorBurbuja(int []array,int longitud) {
        int aux;
        for (int i = 0; i < longitud-1; i++) {
            for (int j = 0; j < longitud-1-i; j++) {
                if(array[j+1]<array[j]){
                    aux=array[j];
                    array[j]=array[j+1];
                    array[j+1]=aux;
                }
            }
        }
        
        System.out.print("Array ordenado por burbuja: ");
        for (int i = 0; i < longitud; i++) {
            System.out.print(array[i]+",");
        }
    }
    public static void ordenacionPorInsercion(int []array, int longitud) {
        int aux,p;
        for (int i = 1; i < longitud; i++) {
            aux=array[i];
            p=i;
            while(p>0 && aux<array[p-1]){
                array[p]=array[p-1];
                p=p-1;
            }
            array[p]=aux;
        }
        System.out.println("");
        System.out.print("Ordenacion por insercion: ");
        for (int i = 0; i < longitud; i++) {
            System.out.print(array[i]+",");
        }
    }
        public static int busquedaBinaria(int[]array) {
        int inicio=0,fin=array.length-1,posicion=-1,medio,n=5;
        boolean encontrado=false;
        while(inicio<=fin && encontrado==false){
            medio=(inicio+fin)/2;
            if(n==array[medio]){
                posicion=medio;
                encontrado=true;
            }
            else{
                if(n<array[medio]){
                    fin=medio-1;
                }
                else{
                    inicio=medio+1;
                }
            }
        }
        return posicion;
    }
    public static void main(String[] args) {
        int longitud;
        int[] array={5,3,6,2,1,0};
        longitud=array.length;
        System.out.println("esta en la posicion: "+busquedaSecuencial(array,longitud));
        ordenacionPorSeleccion(array,longitud);
        System.out.println("");
        ordenacionPorBurbuja(array,longitud);
        ordenacionPorInsercion(array,longitud);
        System.out.println("");
        System.out.println("Esta en la posicion: "+busquedaBinaria(array));
    }
    
}
