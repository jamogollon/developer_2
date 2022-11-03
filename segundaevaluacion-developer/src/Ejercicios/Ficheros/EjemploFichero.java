package Ejercicios.Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploFichero {

	public static void main(String[] args) {
		int c, contL=0, contN=0;
		char car;
		FileReader f=null;
		
		try {
			f = new FileReader("F:\\Google Drive(amorenoa28@educarex.es)\\Educarex\\Castelar20-21\\Prog1\\Tema5\\mifichero.txt");
			BufferedReader bf = new BufferedReader(f);
			
			c = bf.read();

			while(c!=-1) {
				
				System.out.print((char)c);
				if (Character.isDigit((char)c)) {
				    contN++;
				}
				else {
				    contL++;
				}
				
				c=bf.read();
			}
			System.out.println("Número de letras = "+ contL);
			System.out.println("Número de números = "+ contN);

		} catch (FileNotFoundException e) {

			System.out.println(e.getMessage());
		} catch (IOException e) {

			System.out.println(e.getMessage());
		}finally {
            try {

                if (f != null) {
                    f.close();
                }

            } catch (IOException e) {
                System.out.println(e.getMessage());                                                               
            }
		}
		
		
		

	}

}
