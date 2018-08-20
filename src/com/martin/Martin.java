package com.martin;

import xyz.germanfica.ad.util.TecladoIn;

public class Martin {
	
	public static void main(String[] args) {
        /* este algoritmo */
        // Declaracion de variables
        char letra;
        int cantLetra, i = 0;
        char[] arregloLetras;
        // Pedimos y leemos datos al usuario
        System.out.println("Ingrese la cantidad de letras que desea:");
        cantLetra = TecladoIn.readLineInt();
        arregloLetras = new char[cantLetra];
        //calculo

        while (i < cantLetra) {
            System.out.println("Ingrese letras:");
            letra = TecladoIn.readLineNonwhiteChar();

            if (Character.isLetter(letra)) { //verifica si es una letra
                arregloLetras[i] = letra;
                i++;
            } else {
                System.err.println("Error");
            }
        }
        
        mostrarPosiPar(arregloLetras, cantLetra);
        mostrarCaracteres(arregloLetras, cantLetra);
    }

    public static void mostrarPosiPar(char[] caracteres, int cantLetra) {
        /* Este modulo retorna el carater de la posicion par */
        int i;
        char arregloLetrasPar;
        for (i = 0; i < cantLetra; i++) {
            if (i % 2 == 0) {
                arregloLetrasPar = caracteres[i];
                System.out.println("letras par:" + arregloLetrasPar);
            }
        }
    }
    
    // b) Mostrar por pantalla los caracteres almacenados en el arreglo en orden inverso.
    public static void mostrarCaracteres(char[] caracteres, int cantLetras) {
        for (int i = 0; i < cantLetras; i++) {
            System.out.println("arreglo inverso: " + caracteres[cantLetras - i - 1]);
        }
    }
}

