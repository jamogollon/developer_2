package Ejercicios.Listas.Actividad6.dos;
/* Observamos que aunque esta clase implementa la interfaz IAnimal
 * no vemos esos métodos(de la interfaz). Una clase abstracta se puede ahorrar ese paso
 * ya que su existencia es únicamete para que otra clase herede de ella.
 * Luego la clase que hereda de ella (y no sea abstracta) será la que sí implemente
 * los métodos de la interfaz. Ya que hereda también eso.
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
