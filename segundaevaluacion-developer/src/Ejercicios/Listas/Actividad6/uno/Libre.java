package Ejercicios.Listas.Actividad6.uno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Libre extends Alumno  {
	
	private List<String> listaDeAsignaturas = new ArrayList<String>();
	private final static float precioPorHora = 10;
	private int noHorasDiarias;
	
	public Libre(String nombre) {
		super(nombre);
		
	}
	
	public Libre(String nombre, int c) {
		super(nombre,c);
	}

	
	public List<String> getListaDeAsignaturas() {
		return listaDeAsignaturas;
	}

	public int getNoHorasDiarias() {
		return noHorasDiarias;
	}

	public void setNoHorasDiarias(int noHorasDiarias) {
		this.noHorasDiarias = noHorasDiarias;
	}

	public static float getPrecioporhora() {
		return precioPorHora;
	}
	
	public void pedirAsignaturas(Scanner in) {
		
		while(true) {
			System.out.println("Introduzca una asignatura o n para terminar");
			String asig=in.nextLine();
			if(asig.equals("n")) 
				break;
			listaDeAsignaturas.add(asig);
		}
	}

	@Override
	public double pagoMensual() {
		return precioPorHora * noHorasDiarias*30;
	}

	@Override
	public String getAsignaturas() {
		return listaDeAsignaturas.toString()+ " LIBRE";
	}
	
	
}
