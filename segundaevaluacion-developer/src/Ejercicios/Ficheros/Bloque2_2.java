package Ejercicios.Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Bloque2_2 {

	public static void main(String[] args) {
		BufferedReader f1=null,f2=null;
		BufferedWriter f3=null;
		String lecturaFila1, lecturaFila2;
		
		try  {
			f1 = new BufferedReader(new FileReader("archivo1.txt"));
			f2 = new BufferedReader(new FileReader("archivo2.txt"));
			f3 = new BufferedWriter(new FileWriter("archivo3.txt"));
			do {
				lecturaFila1=f1.readLine();
				if(lecturaFila1!=null) {
					f3.write(lecturaFila1);
				}

				lecturaFila2=f2.readLine();
				if(lecturaFila2!=null) {
					f3.write(lecturaFila2);				
				}

			}while(lecturaFila1!=null || lecturaFila2!=null);


		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				f1.close();
				f2.close();
				f3.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			}
	}

}
