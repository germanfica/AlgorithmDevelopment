/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.martin.tp6;

/**
 *
 * @author pelam
 */
public class Item {

    /**
     * @param args the command line arguments
     */
    private int codigo;
    private String descripcion;
    private int stock;
    private String nombre;
    private double costo;
    private double importe;

    //constructores
    public Item(int ecodigo, int estock, double ecosto, double eimporte, String edescripcion, String enombre) {
        codigo = ecodigo;
        stock = estock;
        costo = ecosto;
        importe = eimporte;
        descripcion = edescripcion;
        nombre = enombre;
    }
    
    //getters
    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getStock() {
        return stock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCosto() {
        return costo;
    }

    public double getImporte() {
        return importe;
    }

    //setters
    public void setCodigo(int numCodigo) {
        numCodigo = codigo;
    }

    public void setDescripcion(String Ladescripcion) {
        Ladescripcion = descripcion;
    }

    public void setStock(int numStock) {
        numStock = stock;
    }

    public void setNombre(String elNombre) {
        elNombre = nombre;
    }

    public void setCosto(double elCosto) {
        elCosto = costo;
    }

    public void setImporte(double elImporte) {
        elImporte = importe;
    }
}
