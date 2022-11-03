package Ejercicios.Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Bloque1_1 {

	public static void main(String[] args) {
		FileReader fr = null;/*lo definimos aquí para que se pueda acceder
		 desde finally ya que si está dentro del try catch, no se puede acceder.*/
		int countChar=0, countNum=0;
		
        try {
            fr = new FileReader("c:/ficheros/datos.txt");
            BufferedReader entrada = new BufferedReader(fr);
            int car = entrada.read();         //se lee el primer carácter del fichero
            while (car != -1) {               //mientras no se llegue al final del fichero                        
                System.out.print((char) car); //se nuestra por pantalla
                if(Character.isDigit(car)) {
                	countChar++;
                }
                else {
                	countNum++;
                }
                car = entrada.read();         //se lee el siguiente carácter del fichero                          
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {

                if (fr != null) {
                    fr.close();
                }

            } catch (IOException e) {
                System.out.println(e.getMessage());                                                               
            }
        }

	}

}
