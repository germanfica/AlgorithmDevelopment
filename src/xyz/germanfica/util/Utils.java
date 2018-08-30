package xyz.germanfica.util;

/*
 * Copyright 2018 German Fica
 * 
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge,
 * publish, distribute, sublicense, and/or sell copies of the Software,
 * and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 * @author German Fica
 */
public class Utils {
	/**
	 * Muestra por pantalla el porcentaje que le queda pendiente
	 * a una tarea determinada
	 * 
	 * @param tiempo es es el tiempo de la tarea
	 */
	public static void porcentajeCompletado(long tiempo) {
		new Thread(()-> {
	           int i = 0;
	           while(i++ < 100) {
	               System.out.print("[");
	               int j=0;
	               while(j++<i){
	                  System.out.print("#");
	               }
	               while(j++<100){
	                  System.out.print(" ");
	               }
	               System.out.print("] : "+ i+"%");
	               try {
	                  Thread.sleep(tiempo); // 1000l
	               } catch (InterruptedException e) {
	                  e.printStackTrace();
	               }
	               System.out.print("\r");
	           }
	        }).start();
	}
	
	public static void tiempoRestante(int tiempoEstimado) {
		String texto;
		texto = "\r";
		try
        {
            System.out.print("Counting down ...");
            for (int i = tiempoEstimado; 1 <= i; i--) {
            	System.out.print(texto + i);
                Thread.currentThread().sleep(500);
                texto = texto + " ";
			}
            System.out.println("\rDone!");
        }
        catch (Exception ex)
        {
        }
	}
}
