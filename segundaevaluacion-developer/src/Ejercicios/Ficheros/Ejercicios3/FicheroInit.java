package Ejercicios.Ficheros.Ejercicios3;

import java.io.FileNotFoundException;

public class FicheroInit {
	
	public FicheroInit() {
		
	}
	public static void main(String[] args) {
		FicheroInit finit = new FicheroInit();
		finit.ejecutar();
		
	}
	private  void ejecutar() {
		DaoFicheroInit dfi = new DaoFicheroInit("C:/fichero/mifichero.ini");
	
			try {
				dfi.leerInit();
			} catch (FileNotFoundException e) {
				Variables.pedirVariablesConfiguracion();//metodo no implementado
				//seria un método para pedir al usuario las variables ya que no existen.
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		
		
	}
	
}
