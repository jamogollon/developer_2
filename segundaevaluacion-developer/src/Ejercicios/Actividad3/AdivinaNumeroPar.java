package Ejercicios.Actividad3;
/**
 * 
 * @author Antonio Moreno
 *Clase heredada, que sobreescribe un m�todo.
 */
public class AdivinaNumeroPar extends AdivinaNumero {
	/**
	 * Constructor
	 */
	public AdivinaNumeroPar() {
		super();
	}
	
	/**
	 * M�todo sobreescrito, se ejecuta este m�todo en vez del que hay en la clase base.
	 */
	@Override
	public void generaNumero(int min, int max) {
		do {
			super.generaNumero(min, max);
		}while(numero%2 !=0);
		
	}
}
