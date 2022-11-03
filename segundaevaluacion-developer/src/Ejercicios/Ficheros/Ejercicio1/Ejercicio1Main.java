package Ejercicios.Ficheros.Ejercicio1;

import java.io.File;
import java.util.Scanner;

import ejemplosClase.persona.Persona;

public class Ejercicio1Main {
	private static File ruta=new File("F:\\Google Drive(amorenoa28@educarex.es)\\Educarex"
			+ "\\Castelar20-21\\Prog1\\Eclipse-WorkSpace\\SegundaEvaluacion"
			+ "\\segundaevaluacion\\ficheros");
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Ejercicio1Main mn = new Ejercicio1Main();
		mn.init();

	}
	private void init() {
		boolean sigue=false;
		FicheroPersonas f;
		//para probar
		Persona p1 = new Persona("123456789", "Antoni Romero", "Gran Via 5", "25852", 1000);
		Persona p2 = new Persona("123456789", "Juan Alcalde", "Zurbarán 5", "25852", 2000);
		Persona p3 = new Persona("123456789", "Ramón García", "Sagasta 45", "25852", 3000);

		do {
			System.out.println("Introduce el nombre de un fichero");
			String fil = sc.nextLine();
			try {
				f = new FicheroPersonas(ruta + "\\"+ fil);
				sigue=false;
				f.addPersona(p1);
				f.addPersona(p2);
				f.addPersona(p3);
				
				f.abrir();
				Persona p =f.obtenerSiguiente();
				System.out.println(p.getAll());
				p =f.obtenerSiguiente();
				System.out.println(p.getAll());
				p =f.obtenerSiguiente();
				System.out.println(p.getAll());
				f.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				sigue=true;
				System.out.println("Intentalo de nuevo");
			}
			
		} while (sigue);

	}

}
