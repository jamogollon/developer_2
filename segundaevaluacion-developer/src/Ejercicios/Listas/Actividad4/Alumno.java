package Ejercicios.Listas.Actividad4;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

	/*------ATRIBUTOS------*/
	private final String  nombre;
	private final List <NotaAsignatura> notas = new ArrayList<>();
	private int nota;//atributo nota para utilizar en la clase modulo
	
	/*-----CONSTRUCTORES-----*/
	public Alumno(String nombre) {
		this.nombre=nombre;
	}
	
	/*-----GETTERS Y SETTERS-----*/
	public String getNombre() {
		return nombre;
	}

	public List<NotaAsignatura> getNotas() {
		return notas;
	}
	
	/*----METODOS-----*/
	/**
	 * m�todo para a�adir una nota nueva a un alumno.
	 * @param nota
	 */
	public void addNotasAsignatura(NotaAsignatura nota) {
		notas.add(nota);
	}
	/**
	 * m�todo alternativo que ayuda a hacerlo mas sencillo
	 * @param asignatura
	 * @param nota
	 */
	public void addNotasAsignatura(String asignatura, int nota) {
		notas.add(new NotaAsignatura(asignatura,nota));
	}
	/**
	 * m�todo que devuelve la media de las notas (es un entero)
	 * @return
	 */
	public int calculaNotaMedia() {
		int notaTotal=0;
		for(NotaAsignatura nota: notas) {
			notaTotal += nota.getNota();
		}
		return notaTotal/notas.size();
	}
	
	
}
