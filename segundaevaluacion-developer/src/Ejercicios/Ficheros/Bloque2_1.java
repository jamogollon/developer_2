package Ejercicios.Ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Bloque2_1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);		

		try {
			System.out.println("Introduzca una ruta con nombre de fichero");
			File f = new File(sc.nextLine());
			if(f.exists()) {
				System.out.println("El fichero ya existe");
				f.delete();
				System.out.println("Fichero borrado");
			}
			else {
				f.createNewFile();
				System.out.println("El fichero no existe, fichero creado");
			}
			f.delete();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
	}

}
