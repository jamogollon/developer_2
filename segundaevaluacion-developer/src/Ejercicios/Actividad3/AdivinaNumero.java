package Ejercicios.Actividad3;

import java.util.Scanner;
/**
 * Escriba un programa para implementar un juego en el que el usuario tenga que
adivinar un n�mero generado aleatoriamente dentro de un rango. 
Para ello vamos a crear las siguientes clases: 
� AdivinaNumero: Tiene dos atributos:
o Numero
o Vidas: se inicializan a 5. Controla las vidas que le quedan al usuario 
cuando juegue.
Escriba los m�todos que considere oportuno. Dentro de estos m�todos 
habr� uno que ser� generarN�mero. Le entrar� por par�metro el rango en el que
estar� el n�mero (m�nimo y m�ximo). 
� Clase AdivinaNumeroPar. Hereda de la clase AdivinaNumero. El n�mero que
se genera en esta clase debe ser par. 
� Clase AdivinaNumeroImpar. Hereda de la clase AdivinaNumero. El n�mero
que se genera en esta clase debe ser impar. 
El programa principal mostrar� un men� que permitir� al usuario elegir la opci�n
que prefiera. 
1. Adivinar n�mero
2. Adivinar n�mero par
3. Adivinar n�mero impar 

El usuario intentar� adivinar el n�mero en cuesti�n metiendo n�meros por teclado. 
 
 * @author Antonio Moreno
 * 
 *
 */
public class AdivinaNumero {
	protected int numero;
	protected int vidas;
	protected Scanner ed= new Scanner(System.in);
	
	public AdivinaNumero() {
		this.vidas=5;
	}

	/**
	 * @return el numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @return el vidas
	 */
	public int getVidas() {
		return vidas;
	}
	/**
	 * 
	 * @return array de enteros con los n�meros del rango
	 */
	public int[] elegirNumero() {
		int[] rango= new int[2];
		
		System.out.println("Introduce rango, entre que n�meros?");
		System.out.println("M�nimo:");
		rango[0]=ed.nextInt();
		System.out.println("M�ximo:");
		rango[1]=ed.nextInt();
		return rango;
	}
	/**
	 * @return array de enteros con los n�meros del rango
	 * ademas llama al m�todo para generar el n�mero aleatorio.
	 */
	public void elegirNumeroGenerar() {
		int minimo, maximo;
		
		System.out.println("Introduce rango, entre que n�meros?");
		System.out.println("M�nimo:");
		minimo=ed.nextInt();
		System.out.println("M�ximo:");
		maximo=ed.nextInt();
		generaNumero(minimo, maximo);
	}
	/**
	 * 
	 * @param min
	 * @param max
	 * m�todo que genera un n�mero aleatorio dentro de un rango definido en los par�metros.
	 */
	public void generaNumero(int min, int max ) {
		
		numero = (int) ((Math.random() * (max-min))+min);
		
	}
	/**
	 * 
	 * @param num
	 * @return boolean resultado de la comparaci�n. 
	 * Compara un n�mero con el n�mero generado y actualiza las vidas.
	 */
	public boolean comparaNumero(int num) {
		vidas--;
		if (num==numero)
			return true;
		return false;
	}

	
	
}
