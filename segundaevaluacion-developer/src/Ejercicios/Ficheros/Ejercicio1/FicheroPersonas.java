package Ejercicios.Ficheros.Ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import ejemplosClase.persona.Persona;

/**
 * 
 * @author Antonio Moreno
 * Ejercicio 1 tema ficheros
 */
public class FicheroPersonas implements Closeable{
	private File fichero;
	private boolean archivoOpen=false;
	private BufferedReader br=null;
	
	/**
	 * Constructor que admite ruta completa fichero como string
	 * @param nomFile
	 * @throws Exception 
	 */
	public FicheroPersonas(String nomFile) throws Exception {
		
		this(new File(nomFile));
	}
	/**
	 * Constructor que admite ruta completa fichero como objeto File
	 * @param f
	 * @throws Exception 
	 */
	public FicheroPersonas(File f) throws Exception {
		this.fichero=f;
		if(fichero.isDirectory()) {
			throw new Exception ("No se trata de un fichero");
		}
	}
	/**
	 * 
	 * @return
	 */
	public File getFichero() {
		return fichero;
	}
	
	public boolean isArchivoOpen() {
		return archivoOpen;
	}
	
	/*------------METODOS-----------*/
	/**
	 * Método que añade un objeto persona al final del fichero.
	 * @param p
	 */
	public void addPersona(Persona p) {
		if(archivoOpen) {
			throw new IllegalStateException("No se pueden añadir personas"
					+ " con el fichero abierto.");
		}
		else {
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichero, true))){	
				
				bw.append(p.getAll());
				bw.newLine();/*añado una nueva linea para que no escriba en la misma
				de esta forma cada objeto persona estará en un línea*/
			
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	/**
	 * Método que abre archivo en modo lectura.
	 */
	public void abrir() {
		
		try {
			br = new BufferedReader(new FileReader(fichero));
			archivoOpen=true;
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public Persona obtenerSiguiente() {
		String nombre;
		String dni;
		String direccion;
		String nss;
		float sueldo;
		Persona per=null;
		String linea;
		String [] datos;
		int i=0;

		try {
			linea = br.readLine();
			datos = linea.split(",");

			nombre = datos[i++];
			dni = datos[i++];
			direccion = datos[i++];
			nss = datos[i++];
			sueldo= Float.parseFloat(datos[i++]);
			per = new Persona(dni, nombre, direccion, nss, sueldo);
			return per;
		} catch (NumberFormatException | IOException e) {
			System.out.println(e.getMessage());		
			try {
				close();
				return per;
			} catch (IOException e1) {
				System.out.println(e.getMessage());
				return per;
			}
		}
	}
	/**
	 * implementamos este metodo de la interface Closeable
	 */
	@Override
	public void close() throws IOException {

		if(br!=null) {
			br.close();
			archivoOpen=false;
		}

	}
	
}
