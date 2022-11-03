package Ejercicios.Ficheros.Ejercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Fichero dao para guardar y cargar un fichero.
 * @author Antonio Moreno
 *
 */
public class FicheroEmpleadosTexto implements IFicheroObjetos<Asalariado>{
	File fich= null;
	FileReader fichRead;
	BufferedReader br=null;
	
	public FicheroEmpleadosTexto(String fich) {
		 this(new File(fich));
	}
	public FicheroEmpleadosTexto(File fich) {
		this.fich=fich;
	}
	/**
	 * guarda una lista de objetos Asalariado en un archivo
	 */
	@Override
	public void guardar(List<Asalariado> miLista) throws Exception {
		BufferedWriter writer=null;
	    try {
			writer = new BufferedWriter(new FileWriter(fich, true));
			for(Asalariado a: miLista) {
			    writer.append(a.toString());
			    writer.newLine();	
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			if(writer!=null)
				writer.close();
		}

		
	}
	/**
	 * Carga el contenido de un fichero en una lista de objetos Asalariado
	 */
	@Override
	public void cargar(List<Asalariado> miLista) throws Exception {
		String nombre;
		String nif;
		double salarioBase;
		String turno;
		int kmRecorridos;
		BufferedReader reader=null;
		
		try {
			reader = new BufferedReader(new FileReader(fich));
			boolean fin = false;


			while(!fin) {

				// Carga la siguiente línea
				String linea = reader.readLine();

				// Si la línea existe, carga el vehículo.
				if(linea != null) {
					String [] datos = linea.split(":");

					int idx = 0;
					nombre = datos[idx++];
					nif = datos [idx++];
					salarioBase=Double.parseDouble(datos[idx++]);
					if(Character.isDigit(datos[idx].charAt(0))) {
						kmRecorridos = Integer.parseInt(datos[idx++]);
						miLista.add(new EmpleadoDistribucion(nombre, nif, salarioBase, kmRecorridos));  
					}
					else {
						turno = datos[idx++];
						miLista.add(new EmpleadoProduccion(nombre, nif, salarioBase, turno));  

					}
					                              
				} else {
					fin = true;
				}
			}

		} catch (NumberFormatException e) {
			reader.close();
			System.out.println("Error en la conversion númerica "+ e.getMessage());
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			reader.close();
			System.out.println("Archivo no encontrado " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			reader.close();
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			if(reader!=null)
				reader.close();
		}
		
		
		
	}

}
