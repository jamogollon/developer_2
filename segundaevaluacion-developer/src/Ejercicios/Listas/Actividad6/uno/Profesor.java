package Ejercicios.Listas.Actividad6.uno;

public class Profesor extends Persona{
	
	private String asignatura;
	
	public Profesor(String nombre, String asig) {
		super(nombre);
		this.asignatura = asig;
	}
	
	
	public String getAsignatura() {
		return asignatura;
	}


	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	@Override
	public String toString() {
		 return  super.getNombre() + ", " + this.getEdad() + ", " + this.asignatura;
	}
}
