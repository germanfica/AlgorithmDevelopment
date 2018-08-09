/*
 * Ejemplo de lectura de Archivos
 */
package recda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.germanfica.ad._2018.tp3.ej3.Cliente;;

/**
 *
 * @author nadina
 */
public class EjScanner {

    
/**
 * Podemos usar una instancia de la clase Scanner para poder leer datos de forma más comoda 
 * Recordamos que un reader solo nos provee operaciones para leer o un byte o
 * una linea completa (hasta el siguiente \n o \r ). 
 * 
 * Scanner nos permite encapsular un objeto Reader, un Stream (como System.in) o un String y obtener a
 * partir de ese objeto secuencialmente datos de tipos primitivos o incluso substrings separados sin 
 * que necesitemos controlar manualmente como se reconocen esos datos.
 * 
 * https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
 */    
	static final int CANTNUMEROS = 5;
    static final String NOMBRE_ARCHIVO = "src/recda/archivo1.txt";
    static Scanner s, sc;
    
    public static void leerArchivo_1(){
    	try{
    		BufferedReader buff = new BufferedReader(new FileReader(NOMBRE_ARCHIVO));
    		s = new Scanner(buff);
    		for (int i = 0; i < CANTNUMEROS  ; i++){
    			//System.out.println( Integer.parseInt(buff.readLine()));
    			System.out.println(s.nextInt());
    		}
    		buff.close();
    	}
    	catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage() + "\nSignifica que el archivo del "
                    + "que queriamos leer no existe.");
        }
        catch (IOException ex) {
            System.err.println("Error leyendo o escribiendo en algun archivo.");
        }
    }

    public static void leerArchivo_2(){
    	try{
    		BufferedReader buff = new BufferedReader(new FileReader("src/recda/archivo2.txt"));
    		s = new Scanner(buff);
    		//Si falla la lectura del float, cambiar el '.' por coma, cuestion de configuracion de idiomas.
    		//s = new Scanner("123141   4243.433     unaPalabra\no muchas palabras seguidas.");
    		System.out.println("Scanner nos da herramientas comodas para leer datos primitivos de distinto tipo");
    		System.out.println(s.nextInt() +" " + s.nextFloat() + " " + s.next() + " ");
    		System.out.println(s.nextLine());
    		buff.close();
    	}
    	catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage() + "\nSignifica que el archivo del "
                    + "que queriamos leer no existe.");
        }
        catch (IOException ex) {
            System.err.println("Error leyendo o escribiendo en algun archivo.");
        }
    }
    
    public static void leerDesdeUnaCadenaDeTexto() {
    	//Lectura con delimitadores distintos de espcacios en blanco.
        String entrada = "Juan Perez, 150, Luis Soto, 43";
        Scanner sc = new Scanner(entrada);
        sc.useDelimiter("\\s*,\\s*");
        
        // Contenido de la entrada
        
        System.out.println(sc.next());
        System.out.println(sc.nextInt());
        
        System.out.println(sc.next());
        System.out.println(sc.nextInt());
        
        sc.close();
    }
    
    /*
     * if (sc.next().equals("3")) { break; }
     */
    public static void leerArchivo_3() {
    	Cliente[] clientes = new Cliente[200];
    	
    	try{
    		BufferedReader buff = new BufferedReader(new FileReader("src/recda/archivo3.txt"));
    		
    		sc = new Scanner(buff);
    		sc.useDelimiter("\\s*,\\s*");
    		int i = 0;
    		while(sc.hasNext()) {
    			Cliente cliente = new Cliente(sc.next());
    			cliente.setPuntos(sc.nextInt());
    	    	clientes[i] = cliente;
    	    	System.out.println(clientes[i].toString());
    			i = i + 1;
    		}    		
    		buff.close();
    	}
    	catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage() + "\nEl archivo no existe.");
        }
        catch (IOException ex) {
            System.err.println("Error al leer o escribir en el archivo.");
        }
    }
    
    public static void main(String[] args) {
    	System.out.println("Welcome!");
    	//leerDesdeUnaCadenaDeTexto();
    	
        //leerArchivo_1();
        
    	//leerArchivo_2();
    	
    	leerArchivo_3();
    }
}