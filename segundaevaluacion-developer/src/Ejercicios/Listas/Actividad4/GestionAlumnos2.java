package Ejercicios.Listas.Actividad4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Programa de gestión de alumnos.
 * @author MiPc
 *
 */
public class GestionAlumnos2 {
	
	private final String args[];

	/**
	 * constructor
	 * @param args
	 */
	public GestionAlumnos2(String args[]) {
		this.args=args;
	}
	/**
	 * ejecuta el programa
	 */
	public void ejecutar() {

		//para probar las nuevas clase creadas vamos a instanciar unas de prueba
		//primero creamos unos alumnos
		Alumno alumno1= new Alumno("Pedro");
		Alumno alumno2= new Alumno("Juan");
		Alumno alumno3= new Alumno("Sebastian");
		
		//Ahora cramos unos profesores
		Profesor profe1 = new Profesor("Antonio", CategoriaProfesor.FP);
		Profesor profe2 = new Profesor("Javier", CategoriaProfesor.PES);
		Profesor profe3 = new Profesor("Fabiola", CategoriaProfesor.FP);
		
		//Ahora creamos unos módulos
		Modulo modulo1 = new Modulo("Programacion",profe1);
		Modulo modulo2 = new Modulo("Marca",profe2);
		Modulo modulo3 = new Modulo("Bases de Datos",profe3);
		
		//Ahora vamos a matricular alumnos y poner notas en el módulo modulo1
		modulo1.setAlumnos(alumno1, 6);
		modulo1.setAlumnos(alumno2, 7);
		modulo1.setAlumnos(alumno3, 8);
		
		//Ahora vamos a matricular alumnos y poner notas en el módulo modulo2
		modulo2.setAlumnos(alumno1, 4);
		modulo2.setAlumnos(alumno2, 10);
		modulo2.setAlumnos(alumno3, 5);
		
		//Ahora vamos a matricular alumnos y poner notas en el módulo modulo3
		modulo3.setAlumnos(alumno1, 4);
		modulo3.setAlumnos(alumno2, 5);
		modulo3.setAlumnos(alumno3, 6);
		
		//Ahora ya podemos obtener datos
		System.out.println("La nota menor de la asignatura de Programación es: "+
		modulo1.notaMin()+ " y corresponde al alumno: " + modulo1.alumnoMinNota().getNombre());
		System.out.println("La nota menor de la asignatura de Base de Datos es: "+
		modulo3.notaMin()+ " y corresponde al alumno: " + modulo3.alumnoMinNota().getNombre());
		System.out.println("La nota mayor de la asignatura de Programación es: "+
		modulo1.notaMax()+ " y corresponde al alumno: " + modulo1.alumnoMaxNota().getNombre());
		System.out.println("La nota mayor de la asignatura de Base de Datos es: "+
		modulo3.notaMax()+ " y corresponde al alumno: " + modulo3.alumnoMaxNota().getNombre());
		System.out.println("La nota media de la asignatura de Base de Datos es: "+ modulo3.notaMedia());
		System.out.println("La nota media de la asignatura de Programación es: "+ modulo1.notaMedia());
		System.out.println("Los alumnos matriculados en Marcas son: "+ modulo2.getAlumnos());

	}
	public static void main(String[] args) {
		GestionAlumnos2 gestion = new GestionAlumnos2(args);
		gestion.ejecutar();

	}
	

}
