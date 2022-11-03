package Ejercicios.Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Bloque3_1 {
	static File ruta=new File("F:\\Google Drive(amorenoa28@educarex.es)\\Educarex"
			+ "\\Castelar20-21\\Prog1\\Eclipse-WorkSpace\\SegundaEvaluacion"
			+ "\\segundaevaluacion\\ficheros");
	
	public static void main(String[] args) {

		int numero;
		try {
			File newf = new File(ruta + "\\fichero3_1.txt");
			if (newf.exists()) {
				newf.delete();
				newf.createNewFile();
			}
			for(int i=1; i<=100; i++) {
				numero = generarInt();
				if (numero==0) {
					throw new Exception("Error: el programa se cerrará");
				}
				escribe(numero);
			
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		

	}
	private static void escribe (int n) {
		String cnum= String.valueOf(n);

		try (BufferedWriter fr = new BufferedWriter (new FileWriter(ruta + "\\fichero3_1.txt",true))) {

			fr.append(cnum);
			fr.append(" ");
			//fr.flush();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	public static int generarInt() {
		try {
			do {
				int num = (int)(Math.random()*1000);
				if(comprueba(num))
					return num;
			}while(true);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
		
	}
	private static boolean comprueba(int num) {
		int n;

		try (BufferedReader cp = new BufferedReader(new FileReader(ruta+ "\\fichero3_1.txt"));
				Scanner sc = new Scanner(cp)) {
			
			while(sc.hasNextInt()) {
				n = sc.nextInt();
				if(num == n) {
					cp.close();
					return false;
				}
			}
			cp.close();
			return true;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return true;
		}
	}
}
