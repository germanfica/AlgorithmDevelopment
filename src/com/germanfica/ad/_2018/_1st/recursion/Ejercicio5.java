package com.germanfica.ad._2018._1st.recursion;

public class Ejercicio5 {
    public static void main(String[] args) {
        int Vector[] ={2,3,1,9,22,0,7};
        int cont =0, mayor=0;
        System.out.println("Numero Mayor :" + NumeroMayor(Vector, cont, mayor));
    }
    public static int NumeroMayor(int Vector[], int cont,int mayor) {
        if(cont<Vector.length){
            if (Vector[cont]>mayor){
                mayor = Vector[cont];
            }
          mayor = NumeroMayor(Vector, cont+1, mayor);
        }
        return mayor;
    }
}