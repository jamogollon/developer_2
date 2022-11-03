package Ejercicios.Listas.Actividad5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



/**
 * Gesti�n de colecci�n de discos con colecciones ArrayList
 * @author MiPc
 *
 */
public class ColeccionDiscosMain {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Creamos la lista de objetos Disco
		List<Disco> album = new ArrayList<Disco>();

		int opcion;
		String codigoIntroducido;
		String autorIntroducido;
		String tituloIntroducido;
		String generoIntroducido;
		int duracionIntroducida;
		Disco miDisco=null;
		boolean sigue=true;

		do {
			System.out.println("\n\nCOLECCI�N DE DISCOS");
			System.out.println("===================");
			System.out.println("1. Listado");
			System.out.println("2. Nuevo disco");
			System.out.println("3. Modificar");
			System.out.println("4. Borrar");
			System.out.println("5. Salir");
			System.out.print("Introduzca una opci�n: ");

			opcion = sc.nextInt();
			sc.nextLine();
			switch (opcion) {
			case 1:
				System.out.println("\nLISTADO");
				System.out.println("=======");

				System.out.println(album.toString());
				break;

			case 2:
				System.out.println("\nNUEVO DISCO");
				System.out.println("===========");

				Disco miNewDisco = new Disco();

				System.out.println("Por favor, introduzca los datos del disco.");  

				System.out.print("C�digo: ");
				codigoIntroducido = sc.nextLine();
				miNewDisco.setCodigo(codigoIntroducido);

				System.out.print("Autor: ");
				autorIntroducido = sc.nextLine();
				miNewDisco.setAutor(autorIntroducido);

				System.out.print("T�tulo: ");
				tituloIntroducido = sc.nextLine();
				miNewDisco.setTitulo(tituloIntroducido);

				System.out.print("G�nero: ");
				generoIntroducido = sc.nextLine();
				miNewDisco.setGenero(generoIntroducido);

				System.out.print("Duraci�n: ");
				duracionIntroducida = sc.nextInt();
				miNewDisco.setDuracion(duracionIntroducida);

				album.add(miNewDisco);
				break;

			case 3:
				System.out.println("\nMODIFICAR");
				System.out.println("===========");

				do {
					System.out.print("Por favor, introduzca el c�digo del disco cuyos datos desea cambiar: ");
					codigoIntroducido = sc.nextLine();

					for(Disco d: album) {
						if (d.getCodigo().equals(codigoIntroducido) ){
							miDisco = d;
							sigue=false;
							break;
						}
					}
					if(sigue==true) {
						System.out.println("El c�digo introducido no pertenece a ning�n disco");
					}
				}while(sigue);

				System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

				System.out.println("C�digo: " + miDisco.getCodigo());
				System.out.print("Nuevo c�digo: ");
				codigoIntroducido = sc.nextLine();
				if (!codigoIntroducido.equals("")) {
					miDisco.setCodigo(codigoIntroducido);
				}

				System.out.println("Autor: " + miDisco.getAutor());
				System.out.print("Nuevo autor: ");
				autorIntroducido = sc.nextLine();
				if (!autorIntroducido.equals("")) {
					miDisco.setAutor(autorIntroducido);
				}

				System.out.println("T�tulo: " + miDisco.getTitulo());
				System.out.print("Nuevo t�tulo: ");
				tituloIntroducido = sc.nextLine();
				if (!tituloIntroducido.equals("")) {
					miDisco.setTitulo(tituloIntroducido);
				}

				System.out.println("G�nero: " + miDisco.getGenero());
				System.out.print("Nuevo g�nero: ");
				generoIntroducido = sc.nextLine();
				if (!generoIntroducido.equals("")) {
					miDisco.setGenero(generoIntroducido);
				}

				System.out.println("Duraci�n: " + miDisco.getDuracion());
				System.out.print("Duraci�n: ");
				duracionIntroducida = sc.nextInt();
				if (duracionIntroducida >0) {
					miDisco.setDuracion(duracionIntroducida);
				}

				break;

			case 4:
				System.out.println("\nBORRAR");
				System.out.println("======");

				do {
					System.out.println("Por favor, introduzca el c�digo del disco que desea borrar:  ");
					codigoIntroducido = sc.nextLine();

					Iterator<Disco> i = album.iterator();
					while(i.hasNext()) {
						if(i.next().getCodigo().equals(codigoIntroducido) ) {
							i.remove();
							sigue=false;
							break;
						}
					}
					if(sigue==true) {
						System.out.println("El c�digo introducido no pertenece a ning�n disco");
						sigue=true;
					}
				}while(sigue);

				System.out.println("Album borrado.");

				break;
			case 5:/*Se pone esta opcion tambi�n, porque si no, en la siguiente (el default) tambi�n entraria
	    	  con el valor 5. */
				break;

			default: System.out.println("Debe seleccionar una opci�n del men�.");

			} // switch
		} while (opcion != 5);
		sc.close();
	}
}


