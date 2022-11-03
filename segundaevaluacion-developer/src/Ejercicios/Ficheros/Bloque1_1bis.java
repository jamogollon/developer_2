package Ejercicios.Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Bloque1_1bis {

	public static void main(String[] args) {

		int countChar=0, countNum=0;
		/*Puesto que FileReader implementa la interface "Closeable", podemos ponerlo as�
		 * que se denomina 'try catch con recursos' y olvidarnos de cerrar el fichero, se 
		 * ocupa el mismo.
		 */
       try (FileReader fr = new FileReader("c:/ficheros/datos.txt")){
           BufferedReader entrada = new BufferedReader(fr);
           int car = entrada.read();         //se lee el primer car�cter del fichero
           while (car != -1) {               //mientras no se llegue al final del fichero                        
               System.out.print((char) car); //se nuestra por pantalla
               if(Character.isDigit(car)) {
               	countChar++;
               }
               else {
               	countNum++;
               }
               car = entrada.read();         //se lee el siguiente car�cter del fichero                          
           }
			System.out.println("N�mero de letras: " +countChar +"\n N�meros: " + countNum);
			
       } catch (FileNotFoundException e) {
           System.out.println(e.getMessage());
       } catch (IOException e) {
           System.out.println(e.getMessage());
       } 

	}

}
