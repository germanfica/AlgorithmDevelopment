/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.martin.salon;

import java.util.Scanner;
import xyz.germanfica.util.Delimitador;

public class Salon {

    //atributos
    private String nombre;
    private double disponibilidad;
    private boolean conMusica;
    private int telefono;
    private String direccion;
    private String adecuadoCantInvitados;
    private double capacidad;

    //constructor
    Salon(String nombre, double disponibilidad, boolean conMusica, int telefono, String direccion, double capacidad) {
        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
        this.conMusica = conMusica;
        this.telefono = telefono;
        this.direccion = direccion;
        this.capacidad = capacidad;
    }

    /*Salon(String nombre) {
        //inicializar los atributos en vacio en -1
        this.nombre = nombre;
        this.adecuadoCantInvitados = " ";
    }*/

    //observadores
    public double getCapacidad() {
        return capacidad;
    }

    public double getDisponibilidad() {
        return disponibilidad;
    }

    public String getNombre() {
        return nombre;
    }

    //modificadores
    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    //propias del tipo
    public boolean equals(Salon nombre) {
        
        return this.nombre.equalsIgnoreCase(nombre.getNombre());
    }

    @Override
    public String toString() {
        return "nombre: " + this.nombre + " disponibilidad: " + this.disponibilidad
                + " con musica: " + this.conMusica + " direccion: " + this.direccion + " telefono: "
                + this.telefono;
    }

    public int compareTo(String nombre) {
        int num = this.nombre.compareToIgnoreCase(nombre);
        return num;
    }

    public String adecuadoCantInvitados(int cantidad) {
        /*retorna “muy” si la cantidad está entre el 75% y 85% de la 
        capacidad, “regular” si está en el valor superior al 85% 
        hasta el 100% o inferior al 75%,y “nula” si es menor al 5% 
        o mayor que el 100% de la capacidad*/

        double porcentajeGente = (cantidad * this.disponibilidad) / 100;

        if ((porcentajeGente >= 75) && (porcentajeGente <= 85)) {
            adecuadoCantInvitados = "muy";
        }

        if ((porcentajeGente >= 85) && (porcentajeGente <= 100)
                || (porcentajeGente < 75)) {
            adecuadoCantInvitados = "regular";
        }

        if ((porcentajeGente < 5) || (porcentajeGente > 100)) {
            adecuadoCantInvitados = "nula";
        }
        return adecuadoCantInvitados;
    }

    public static Salon fromString(String texto) {
        Scanner sc = new Scanner(texto).useDelimiter(Delimitador.patron(","));
        //declaro e inicializo las variables

        String nombre = sc.next();
        double disponibilidad = sc.nextDouble();
        boolean conMusica = sc.nextBoolean();
        int telefono = sc.nextInt();
        String direccion = sc.next();
        double capacidad = sc.nextDouble();

        return new Salon(nombre, disponibilidad, conMusica, telefono, direccion, capacidad);
    }
}

