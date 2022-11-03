package Ejercicios.Listas.Actividad2;
/**
 * Crea un programa que cree un Map con clave cadena y valor un contador.
* Crea 100 contadores asignando el valor a un número de 1 a 100 y nombre el número convertido en cadena.
* Busca el contador con id 10 e incrementalo.
* Busca el contador con id 20 y decrementalo.
* Elimina los contadores con valor <= 10
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import ejemplosClase.cuenta2.Contador;

public class Ejercicio1 {

	public static void main(String[] args) {
		Map <String, Contador> contadores= new HashMap<String, Contador>(); 
		
		for (int i=0; i<100; i++) {
			contadores.put(Integer.toString(i), new Contador(i));
		}
		
		//contadores.get(Integer.toString(10)).incrementa(); //en un paso
		Contador conta = contadores.get(Integer.toString(10));
		conta.incrementa();
		System.out.println(contadores);

		
		//contadores.get(Integer.toString(20)).decrementa();//en un paso
		Contador conta1 = contadores.get(Integer.toString(20));
		conta1.decrementa();
		System.out.println(contadores);
		
		//IGUAL QUE EN LIST, ASÍ NO SE PUEDE, HAY QUE UTILIZAR UN ITERADOR, PERO MAP NO IMPLEMENTA UN ITERADOR????
		/*for (int i = 0; i < contadores.size(); i++) {
			if (contadores.get(Integer.toString(i)).getCont() <= 10) {
				contadores.remove(Integer.toString(i));
			}
			contadores.remove(Integer.toString(i));
		}*/
		
		//PUESTO QUE MAP NO IMPLEMENTA UN ITERADOR, LO SACAMOS DE UN SET ASI:
		Set<Entry<String,Contador>> miSet = contadores.entrySet();//copiamos el map en un set, y este si se puede iterar.
		Iterator <Entry<String, Contador>>  i= miSet.iterator();
		while (i.hasNext()) {
			Entry<String, Contador> item = i.next();//Entry = representa un tipo Map que si admite iterador.
			if(item.getValue().getCont() <= 10) {
				i.remove();
			}
		}
		System.out.println(contadores);
	}

}
