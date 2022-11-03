package Ejercicios.Ficheros.Ejercicio2;

public class EmpleadoProduccion extends Asalariado{
	private Turno turno;
	
	public EmpleadoProduccion(String nombre, String nif, double salarioBase, 
			String turno) {
		super(nombre, nif, salarioBase);
		this.turno=Turno.valueOf(turno);
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = Turno.valueOf(turno);
	}

	@Override
	public double calculaNomina() {
		// TODO Auto-generated method stub
		return this.getSalarioBase()*1.15;
	}

	@Override
	public String toString() {
		return " " + getNombre() + ":" +
				getNif() + ":" +
				getSalarioBase() + ":" +
				turno +	":"	+
				calculaNomina();
	}

}
