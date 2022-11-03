package Ejercicios.Listas.Actividad6.uno;

public abstract class Alumno extends Persona{

	private int curso;
	private String nivelAcademico;
	
	public Alumno(String nombre) {		
		super(nombre);
	}
	
	public Alumno(String nombre, int c) {
		super(nombre);
		this.curso=c;
	}
	
	public Alumno(String nombre, int c, String nA) {
		super(nombre);
		this.curso=c;
		this.nivelAcademico=nA;
	}

	public int getCurso() {
		return curso;
	}
	
	public void cambiarCurso(int c) {//este es el setter de curso
		this.curso= c;
	}
	public String getNivelAcademico() {
		return nivelAcademico;
	}
	
	@Override
	public String getNombre() {
		return super.getNombre();
	}
	
	@Override
	public String toString() {
		return this.getNombre()+ ", "+ super.getEdad()+", "+ this.curso+", "+ this.nivelAcademico;
	}
	
	public abstract double pagoMensual();
	public abstract String getAsignaturas();
	
	
}
