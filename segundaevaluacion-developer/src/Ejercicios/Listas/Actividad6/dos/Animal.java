package Ejercicios.Listas.Actividad6.dos;
/* Observamos que aunque esta clase implementa la interfaz IAnimal
 * no vemos esos m�todos(de la interfaz). Una clase abstracta se puede ahorrar ese paso
 * ya que su existencia es �nicamete para que otra clase herede de ella.
 * Luego la clase que hereda de ella (y no sea abstracta) ser� la que s� implemente
 * los m�todos de la interfaz. Ya que hereda tambi�n eso.
 */
public abstract class Animal implements IAnimal{
	public final String nombre;
	
	public Animal(String nom) {
		this.nombre=nom;
	}

	public String getNombre() {
		return nombre;
	}

	
	public abstract void tipoAnimal();

}
