package Ejercicios.Ficheros.Ejercicios3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class DaoFicheroInit {
	private File fichero;
	
	public DaoFicheroInit(String fname) {
		this(new File(fname));
	}
	public DaoFicheroInit(File f) {
		this.fichero=f;
	}
	
	public void leerInit() throws Exception {
		String linea;
		String []datos;
		Scanner brc;

		BufferedReader br = new BufferedReader(new FileReader(fichero));
		brc = new Scanner(br);
		
		linea = brc.nextLine();
		datos = linea.split("=");
		Variables.setPathPrograma(datos[1]);
		
		linea = brc.nextLine();
		datos = linea.split("=");
		Variables.setIpBaseDatos(datos[1]);
		
		linea = brc.nextLine();
		datos = linea.split("=");
		Variables.setPuertoBD(Integer.parseInt(datos[1]));
		
		linea = brc.nextLine();
		datos = linea.split("=");
		Variables.setUsuarioBD(datos[1]);
		
		linea = brc.nextLine();
		datos = linea.split("=");
		Variables.setTipo_letra(datos[1]);
		
		linea = brc.nextLine();
		datos = linea.split("=");
		Variables.setColor_fondo(datos[1]);
		
		linea = brc.nextLine();
		datos = linea.split("=");
		Variables.setTamano_ventana(datos[1]);
		
		linea = brc.nextLine();
		datos = linea.split("=");
		Variables.setIdioma(datos[1]);
		
		brc.close();
		
	}
	
	public void guardarInit() throws Exception {
		
		BufferedWriter bw = new BufferedWriter (new FileWriter(fichero, false));
		PrintWriter pw = new PrintWriter(bw);
		
		pw.println("pathPrograma = "+ Variables.getPathPrograma());
		pw.println("ipBaseDatos =  "+ Variables.getIpBaseDatos());
		pw.println("puertoBD =  "+ Variables.getPuertoBD());
		pw.println("usuarioBD = "+ Variables.getUsuarioBD());
		pw.println("tipo_letra = "+ Variables.getTipo_letra());
		pw.println("color_fondo = = "+ Variables.getColor_fondo());
		pw.println("tamano_ventan=  "+ Variables.getTamano_ventana());
		pw.println("idioma =  "+ Variables.getIdioma());
		
		pw.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
