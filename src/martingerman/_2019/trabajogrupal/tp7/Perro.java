/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martingerman._2019.trabajogrupal.tp7;

import java.util.Scanner;
import xyz.germanfica.util.Delimitador;

public class Perro {

    private String nombrePerro;
    private String apellidoDuenio;
    private String raza;
    private int anioDeNacimiento;
    private double costoDiario;
    private boolean cuidadoEspecial;
    private static double porcentajeIncremento = 10; // 10% de incremento por defecto
    private int cantidadDiasCuidado;
    // private static double valorFijo;
    private double precioTotal;

    //constructores
    public Perro(String nombreDog, String apellidoDuenio, String raza, int anioDeNacimiento, double costoDiario, boolean cuidadoEspecial, int cantidadDiasCuidado) {
        nombrePerro = nombreDog;
        this.apellidoDuenio = apellidoDuenio;
        this.raza = raza;
        this.anioDeNacimiento = anioDeNacimiento;
        this.costoDiario = costoDiario;
        // this.valorFijo = valorFijo;
        this.cuidadoEspecial = cuidadoEspecial;
        this.cantidadDiasCuidado = cantidadDiasCuidado;
    }

    //getter
    public double getPrecioTotal() {
        //este metodo calcula el precio total        
        if (cuidadoEspecial) {
            precioTotal = (costoDiario * cantidadDiasCuidado) + porcentajeIncremento;
        } else {
            precioTotal = costoDiario * cantidadDiasCuidado;
        }
        return precioTotal;
    }

    /*
     * Correción por german. Los métodos estáticos no dependen del perro.
     * Por lo que el valor fijo 
     */
    public static double getPorcIncremento() {
        //este metodo calcula el porcentaje de incremento
        //declaracion de variables
        // double precioParcial, preciototal, incremento;
        //calculo
        // precioParcial = (costoDiario * cantidadDiasCuidado);
        // preciototal = precioParcial + valorFijo;
        // incremento = preciototal - precioParcial;
        // porcentajeIncremento = (incremento / precioParcial) * 100;
        
        //return porcentajeIncremento;
    	return porcentajeIncremento;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public String getApellidoDuenio() {
        return apellidoDuenio;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        return "año de nacimiento: " + anioDeNacimiento + " cuidado especial: " + cuidadoEspecial
                + " cantidad dias cuidado: " + cantidadDiasCuidado + " precio total: " + precioTotal;
    }

    //setters
    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setAnioDeNacimiento(int anioDeNaciemiento) {
        this.anioDeNacimiento = anioDeNaciemiento;
    }

    public void setCuidadoEspecial(boolean cuidadoEspecial) {
        this.cuidadoEspecial = cuidadoEspecial;
    }

    public void setCantidadDiasCuidado(int cantidadDiasCuidado) {
        this.cantidadDiasCuidado = cantidadDiasCuidado;
    }
    
    public static void setPorcIncremento(double nuevoPorc) {
    	/*cuando el "comerciante" decida cambiar el valor fijo 
        tambien cambia el porcentaje de incremento*/
    	porcentajeIncremento = nuevoPorc;
	}

    // public static void setValorFijo(double _valorFijo) {
        /*cuando el "comerciante" decida cambiar el valor fijo 
        tambien cambia el porcentaje de incremento*/
        // valorFijo = _valorFijo;
    // }

    //propias del tipo
    public static Perro fromString(String texto) {
        Scanner sc = new Scanner(texto).useDelimiter(Delimitador.patron(","));
        //declaro e inicializo las variables
        String nombrePerro = sc.next();
        String apellido = sc.next();
        String raza = sc.next();
        int anioNacimiento = sc.nextInt();
        double costoDiario = sc.nextDouble();
        // double valorFijo = sc.nextDouble();
        boolean cuidadoEspecial = sc.nextBoolean();
        int cantidadDias = sc.nextInt();

        return new Perro(nombrePerro, apellido, raza, anioNacimiento, costoDiario, cuidadoEspecial, cantidadDias);
    }
}
