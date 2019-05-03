/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.martin.salon;

import java.util.Scanner;
import xyz.germanfica.util.Archivo;

/**
 *
 * @author Martin
 */
public class TestSalon {
	private static String NOMBRE_ARCHIVO = "src/ar/martin/salon/TDASalon.txt"; // Se recomienda usar una ruta relativa

    public static void main(String[] args) {
        //esta algoritmo....
        //declaracion de variables
        String TDASalon = Archivo.leer(NOMBRE_ARCHIVO).getTexto();

        char opcion;
        int numElegido, cantidad;
        String nombreSalon;
        double capacidad;

        //cargo el arreglo con el archivo txt
        Salon[] arregloSalon = new Salon[10];
        cargarArregloSalon(arregloSalon);

        //pedimos y leemos datos del usuario
        System.out.println("desea ingresar los datos del salon (s/n):");
        opcion = new Scanner(System.in).next().charAt(0);

        while (opcion == 's') {
            mostrarMenu();
            numElegido = new Scanner(System.in).nextInt();

            switch (numElegido) {
                case 1:
                    System.out.println("ingrese el nombre del salon:");
                    nombreSalon = new Scanner(System.in).next();
                    salonesIguales(nombreSalon, arregloSalon);
                    break;

                case 2:
                    mostrarDatosDeSalones(arregloSalon);
                    break;

                case 3:
                    moduloCompareTo();
                    break;

                case 4:
                    mostrarCapacidad(arregloSalon);
                    break;

                case 5:
                    System.out.println("ingrese el nombre del salon:");
                    nombreSalon = new Scanner(System.in).next();
                    System.out.println("ingrese la nueva capacidad:");
                    capacidad = new Scanner(System.in).nextDouble();
                    modificarCapacidad(nombreSalon, capacidad, arregloSalon);
                    break;

                case 6:
                    System.out.println("ingrese el nombre del salon:");
                    nombreSalon = new Scanner(System.in).next();
                    System.out.println("ingrese la cantidad de invitados:");
                    cantidad = new Scanner(System.in).nextInt();
                    mostrarCantidadAdecuada(arregloSalon, nombreSalon, cantidad);
                    break;             

                default:
                    System.err.println("ingrese una opcion correcta.");
                    break;
            }

        }

    }

    public static void cargarArregloSalon(Salon[] arregloSalon) {
        //este modulo carga el arreglo
        for (int i = 0; i < arregloSalon.length; i++) {
            arregloSalon[i] = Salon.fromString(Archivo.leer(NOMBRE_ARCHIVO).toArray()[i]);
        }
    }

    public static void mostrarMenu() {
        System.out.println("[1] buscar 2 salones iguales.");
        System.out.println("[2] mostrar los datos de los salones.");
        System.out.println("[3] modulo compareTo.");
        System.out.println("[4] mostrar capacidad.");
        System.out.println("[5] modificar capacidad.");
        System.out.println("[6] mostrar cantidad adecuada.");
        System.out.println("[7] muestra los salones con mayor capacidad.");
    }

    public static void salonesIguales(String nombreSalon, Salon[] arregloSalon) {
        //este modulo verifica si hay salones con el mismo nombre
        //declaro e inicializo variables
        boolean sonIguales = false;
        int cantSalonesIguales = 0;
        for (int i = 0; i < arregloSalon.length; i++) {
            if (arregloSalon.equals(nombreSalon)) {
                sonIguales = true;
                cantSalonesIguales++;
            }
        }
        if (sonIguales) {
            System.out.println("hay nombres iguales.");
            System.out.println("la cantidad de nombres iguales son: "
                    + cantSalonesIguales);
        } else {
            System.out.println("no hay nombre iguales.");
        }
    }

    public static void mostrarDatosDeSalones(Salon[] arregloSalon) {
        //este modulo muestra los datos de los salones
        for (int i = 0; i < arregloSalon.length; i++) {
            arregloSalon[i].toString();
        }
    }

    public static void mostrarCapacidad(Salon[] arregloSalon) {
        //muestra la capacidad de cada salon
        for (int i = 0; i < arregloSalon.length; i++) {
            System.out.println("nombre salon: " + arregloSalon[i].getNombre()
                    + " capacidad: " + arregloSalon[i].getCapacidad());
        }
    }

    public static void modificarCapacidad(String nombreSalon,
            double capacidad, Salon[] arregloSalon) {
        //este modulo modifica la capacidad de un salon
        int i = 0, posicion = 0;
        boolean estaNombre = false;
        //recorro el arreglo buscando el nombre del salon y cuando lo encuentro, guardo su posicion
        while (i < arregloSalon.length && !estaNombre) {
            if (arregloSalon[i].getNombre().equalsIgnoreCase(nombreSalon)) {
                posicion = i;
                estaNombre = true;
            }
            i++;
        }
        arregloSalon[posicion].setCapacidad(capacidad);
    }

    public static void mostrarCantidadAdecuada(Salon[] arregloSalon, String nombreSalon, int cantidad) {
        //este modulo muestra la cantidad adecuada de un salon en especifico
        //declaracion e inicializacion de variables
        boolean estaNombre = false;
        int i = 0, posicion = 0;
        while (i < arregloSalon.length && !estaNombre) {
            if (arregloSalon[i].getNombre().equalsIgnoreCase(nombreSalon)) {
                estaNombre = true;
                posicion = i;
            }
            i++;
        }
        if (estaNombre) {
            System.out.println("la cantidad adecuada es: "
                    + arregloSalon[posicion].adecuadoCantInvitados(cantidad));
        }

    }

    public static void moduloCompareTo() {

    }
}
