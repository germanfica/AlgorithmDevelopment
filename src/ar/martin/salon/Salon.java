/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.martin.salon;

import java.util.Scanner;
import xyz.germanfica.util.Delimitador;

/**
 *
 * @author Martin
 */
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

    Salon() {
        this.adecuadoCantInvitados = " ";
    }

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
        //compara el nombre que entra con el nombre de la clase?
        /*que nombre de la clase compara? uno o todos?
        porque es getnombre? si el nombre lo ingresa el usuario 
        y no esta en el txt...*/
        return this.nombre.equalsIgnoreCase(nombre.getNombre());
    }

    public String toString() {
        return "nombre: " + this.nombre + " disponibilidad: " + this.disponibilidad
                + " con musica: " + this.conMusica + " direccion: " + this.direccion + " telefono: "
                + this.telefono;
    }

    public int compareTo(String nombre) {
        return this.nombre.compareToIgnoreCase(nombre);
    }

    public String adecuadoCantInvitados(int cantidad) {
        /*retorna â€œmuyâ€� si la cantidad estÃ¡ entre el 75% y 85% de la 
        capacidad, â€œregularâ€� si estÃ¡ en el valor superior al 85% 
        hasta el 100% o inferior al 75%,y â€œnulaâ€� si es menor al 5% 
        o mayor que el 100% de la capacidad*/
        //arreglar estoooo
        /*compara la "cantidad" de todos los salones o de un solo salon?*/
        double porcentajeGente= (cantidad*this.disponibilidad)/100;
        
        if ((porcentajeGente >= 75) && (porcentajeGente <= 85)) {
            adecuadoCantInvitados = "muy";
        }

        if ((porcentajeGente >= 85) && (porcentajeGente <= 100)
                || (porcentajeGente < 75)) {
            adecuadoCantInvitados = "regular";
        }

        if ((porcentajeGente >= 5) || (porcentajeGente < 100)) {
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
