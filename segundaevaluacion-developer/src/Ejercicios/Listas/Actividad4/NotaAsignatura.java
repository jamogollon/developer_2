package Ejercicios.Listas.Actividad4;
/**
 * Esta clase se compone de una asignatura y la nota correspondiente.
 * @author MiPc
 *
 */
public class NotaAsignatura {
	
	/***ATRIBUTOS****/
	private final String asignatura;
	private int nota;
	
	/***CONTRUCTORES****/
	/**
	 * crear un objeto con nota=0
	 * @param asignatura
	 */
	public NotaAsignatura(String asignatura) {
		this.asignatura=asignatura;
		this.nota=0;
	}
	/**
	 * 
	 * @param asignatura
	 * @param nota
	 */
	public NotaAsignatura(String asignatura, int nota) {
		this.asignatura=asignatura;
		this.nota=nota;//TODO debemos controlar que la nota esté entre 0 y 10.
		
	}
	
	/*------GETTERS Y SETTERS------*/
	public String getAsignatura() {
		return asignatura;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota=nota;
	}
	
}
