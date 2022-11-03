package Ejercicios.Actividad3;
/**
 * 
 * @author Antonio Moreno
 *Clase heredada, que sobreescribe un método.
 */
public class AdivinaNumeroPar extends AdivinaNumero {
	/**
	 * Constructor
	 */
	public AdivinaNumeroPar() {
		super();
	}
	
	/**
	 * Método sobreescrito, se ejecuta este método en vez del que hay en la clase base.
	 */
	@Override
	public void generaNumero(int min, int max) {
		do {
			super.generaNumero(min, max);
		}while(numero%2 !=0);
		
	}
}
