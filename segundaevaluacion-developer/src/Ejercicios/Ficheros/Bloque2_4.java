package Ejercicios.Ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Bloque2_4 {

	public static void main(String[] args) {
		File ruta=new File("F:\\Google Drive(amorenoa28@educarex.es)\\Educarex"
				+ "\\Castelar20-21\\Prog1\\Eclipse-WorkSpace\\SegundaEvaluacion"
				+ "\\segundaevaluacion\\ficheros");
		String linea;
		String[] datos;
		
		try (BufferedReader f= new BufferedReader(new FileReader(ruta +"\\fichero2_4.txt"))){
			
			linea = f.readLine();
			while(linea!=null) {
				
				
				datos = linea.split(" ");
				for(int i=0; i < datos.length; i+=2) {
					System.out.print("Nombre: "+ datos[i]);
					System.out.print(" Nota: "+ datos[i+1]);
					System.out.println();
				}
								
				linea=f.readLine();
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
