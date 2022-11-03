package Ejercicios.Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class bloque1_2 {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter vo=null, co= null;

		
        try {
            fr = new FileReader("c:/ficheros/datos.txt");
            vo = new FileWriter("c:/ficheros/vocales.txt");
            co = new FileWriter("c:/ficheros/consonantes.txt");
            BufferedReader entrada = new BufferedReader(fr);
            BufferedWriter bvo= new BufferedWriter(vo);
            BufferedWriter bco= new BufferedWriter(co);
            
            int car = entrada.read();         //se lee el primer carácter del fichero
            while (car != -1) {               //mientras no se llegue al final del fichero                        
                
                if(car=='a'||car=='e'||car=='i'||car=='o'||car=='u') {
                	bvo.append((char)car);
                }
                else {
                	bco.append((char)car);
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
                if (vo != null) {
                    vo.close();
                }
                if (co != null) {
                    co.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());                                                               
            }
        }

	}

}
