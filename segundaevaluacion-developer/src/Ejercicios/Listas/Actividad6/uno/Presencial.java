package Ejercicios.Listas.Actividad6.uno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Presencial extends Alumno{
	
	private double matriculaCurso;
	private double plusPorConvocatoria;
	private int noConvocatoria;
	private List<String> listaDeAsignaturas = new ArrayList<String>();
	
	public Presencial(String nombre) {
		super(nombre);
	}
	
	public Presencial(String nombre, int c) {
		super(nombre, c);
	}
	
	
	public double getMatriculaCurso() {
		return matriculaCurso;
	}

	public void setMatriculaCurso(double matriculaCurso) {
		this.matriculaCurso = matriculaCurso;
	}

	public double getPlusPorConvocatoria() {
		return plusPorConvocatoria;
	}

	public void setPlusPorConvocatoria(double plusPorConvocatoria) {
		this.plusPorConvocatoria = plusPorConvocatoria;
	}

	public int getNoConvocatoria() {
		return noConvocatoria;
	}

	public void setNoConvocatoria(int noConvocatoria) {
		this.noConvocatoria = noConvocatoria;
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
		return (matriculaCurso + plusPorConvocatoria * noConvocatoria)/12;
	}

	@Override
	public String getAsignaturas() {
		return listaDeAsignaturas.toString()+ ", "+ super.getCurso()+ "PRESENCIAL";
	}
}
