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
public class TestItem {

    public static void main(String[] args) {
        //declaracion de variables
        int codigo=1;
        String descripcion=" ";
        int stock=525518884;
        String nombre="martin";
        double costo=0;
        double importe=0;
        
        Item miItem = new Item(codigo, stock,costo, importe, descripcion, nombre);
        
        // Cargar un arreglo de objetos
            // 1- Una repetitiva
            // 2- Solicitar al usuario los datos y guardarlos en variables
            // 3- Crear el objeto y por parametro mandar esas variables del paso 2
            // arregloItem[i] = new Item(nombre, apellido);
        
        // Objeto
       
        
    }
}
