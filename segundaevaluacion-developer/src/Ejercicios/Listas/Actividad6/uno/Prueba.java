package Ejercicios.Listas.Actividad6.uno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prueba {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Profesor> listaProfesores = new ArrayList<Profesor>();
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		
		//Crear una colección de profesores
		Profesor profesor1 = new Profesor("Antonio","Programación");
		Profesor profesor2 = new Profesor("Fabiola", "Marcas");
		Profesor profesor3 = new Profesor("Maite", "Base de datos");
		listaProfesores.add(profesor1);
		listaProfesores.add(profesor2);
		listaProfesores.add(profesor3);
		
		for(Profesor p: listaProfesores) {
			System.out.println("Profesor: "+ p.getNombre()+ " Asignatura: "+ p.getAsignatura());
		}
		
		//Crear una colección de alumnos
		//3 alumnos de presencial
		Presencial alumnoPresencial1 = new Presencial("Arturo", 1);
			System.out.println("Alumno:" + alumnoPresencial1.getNombre());
			alumnoPresencial1.pedirAsignaturas(sc);
			alumnoPresencial1.setMatriculaCurso(100.25);
			alumnoPresencial1.setNoConvocatoria(1);
			alumnoPresencial1.setPlusPorConvocatoria(30.50);
			
		Presencial alumnoPresencial2 = new Presencial ("Sergio", 1);
			System.out.println("Alumno:" + alumnoPresencial2.getNombre());
		 	alumnoPresencial2.pedirAsignaturas(sc);
			alumnoPresencial2.setMatriculaCurso(100.25);
			alumnoPresencial2.setNoConvocatoria(1);
			alumnoPresencial2.setPlusPorConvocatoria(30.50);
			
		Presencial alumnoPresencial3 = new Presencial ("Alfonso",1);
			System.out.println("Alumno:" + alumnoPresencial3.getNombre());
			alumnoPresencial3.pedirAsignaturas(sc);
			alumnoPresencial3.setMatriculaCurso(100.25);
			alumnoPresencial3.setNoConvocatoria(1);
			alumnoPresencial3.setPlusPorConvocatoria(30.50);
		//los añado a la colección
		listaAlumnos.add(alumnoPresencial1);
		listaAlumnos.add(alumnoPresencial2);
		listaAlumnos.add(alumnoPresencial3);
		
		//2 alumnos de libre
		Libre alumnoLibre1 = new Libre("Pepe", 1);
			System.out.println("Alumno:" + alumnoLibre1.getNombre());
			alumnoLibre1.pedirAsignaturas(sc);
			alumnoLibre1.setNoHorasDiarias(5);
		Libre alumnoLibre2 = new Libre("Juan", 1);
		System.out.println("Alumno:" + alumnoLibre2.getNombre());
			alumnoLibre2.pedirAsignaturas(sc);
			alumnoLibre2.setNoHorasDiarias(5);

		//los añado a la colección	
		listaAlumnos.add(alumnoLibre1);
		listaAlumnos.add(alumnoLibre2);
		
		for(Alumno a: listaAlumnos) {
			System.out.println("Alumno: "+ a.getNombre());
			System.out.println("Asignaturas: "+ a.getAsignaturas());
		}
		
		for (Alumno a: listaAlumnos) {
			System.out.println("Alumno: " + a.getNombre()+", Pago mensual: "+ a.pagoMensual());
		}
	}

}
