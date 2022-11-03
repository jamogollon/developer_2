package Ejercicios.Ficheros;

import java.io.File;
import java.util.Scanner;

public class Bloque2_3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		File f=null;
		String in;

		try {
			System.out.println("Introduce una archivo o directorio:");
			in = entrada.next();
			f = new File(in);

			if(f.exists()) {
				if(f.isDirectory()) {
					System.out.println("Existe, y es un directorio");
					System.out.println("Listado:\n"+ f.list());

				}
				else {
					System.out.println("Existe y es un fichero");
					System.out.println("Nombre: "+ f.getName());
					System.out.println("Tamaño: "+ f.length());
					String permisos = f.canRead()?"Lectura, ":"";
					permisos += f.canWrite()?"Escritura, ":"";
					permisos += f.canExecute()? "Ejecución":"";
					System.out.println("Permisos "+ permisos);
				}
			}
			entrada.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}

}
