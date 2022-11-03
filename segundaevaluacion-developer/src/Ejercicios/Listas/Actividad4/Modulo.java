package Ejercicios.Listas.Actividad4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Modulo {
	/*---ATRIBUTOS DE CLASE---*/
	//private static Set<Integer> codigosModulos = new HashSet<Integer>();//otra forma de crar un código único
	private static int id;
	
	/*---ATRIBUTOS----*/
	private final int idModulo;
	private final String nombreModulo;
	private Profesor profesor;
	private Map<Alumno, Integer> alumnosNotaMap = new HashMap<Alumno, Integer>();


	
	/*---CONSTRUCTORES---*/
	public Modulo (String modulo) {
		
		this.nombreModulo = modulo;
		this.idModulo=id++;
		//this.idModulo = generaCodigo();//otra forma alternativa de crar un código único
	}
	
	public Modulo(String modulo, Profesor profesor) {
		
		this.nombreModulo=modulo;
		this.idModulo=id++;
		//this.idModulo= generaCodigo();//otra forma alternativa de crar un código único
		
	}
	/*----GETTERS Y SETTERS----*/
	
	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	/**
	 * devuelve una lista con todos los alumnos
	 * @return
	 */
	public String getAlumnos() {
		
		List<String> listaNombresAlumnos = new ArrayList<String>();
		
		for (Map.Entry<Alumno,Integer> i: alumnosNotaMap.entrySet()) {
			listaNombresAlumnos.add(i.getKey().getNombre());
		}
		return listaNombresAlumnos.toString();
	}
	/**
	 * Introduce pares alumnos notas en un módulo.
	 * @param alumno
	 * @param nota
	 */
	public void setAlumnos(Alumno alumno, int nota) {
		this.alumnosNotaMap.put(alumno, nota);
	}
	public int getIdModulo() {
		return idModulo;
	}

	public String getNombreModulo() {
		return nombreModulo;
	}
	
	/*-----METODOS-----*/
	
	/*método alternativo para crar un código único que se guarda en una lista set static.
	private int generaCodigo() {
		int cod;
		
		do {
			cod = (int)(Math.random()*100);
		}while(!codigosModulos.add(cod));//puesto que el conjunto set, no admite repetidos y devuelve false cuando ocurre esto.
		
		return cod;
	}*/
	/**
	 * devuelve la nota mínima de este módulo
	 * @return
	 */
	public int notaMin() {
		int minNota =(Collections.min(alumnosNotaMap.values()));//devuelve el mínimo del  valor del map
		return minNota;
	}
	/**
	 * método que devuelve el alumno con menos nota en este módulo
	 * @return
	 */
	public Alumno alumnoMinNota() {
		int minNota =(Collections.min(alumnosNotaMap.values()));//devuelve el mínimo del  valor del hashmap
		// Creamos un Entry, que es una copia del hasmap que se puede recorrer (iterar), ya que el hashmap no se puede.
		for (Map.Entry<Alumno, Integer> copiaHashMap : alumnosNotaMap.entrySet()) { 
			if (copiaHashMap.getValue()==minNota) { 
				return copiaHashMap.getKey();
				
			}
		}
		return null; //si no obtiene alumno
	}
	/**
	 * devuelve la nota máxima de este módulo
	 * @return
	 */
	public int notaMax() {
		int maxNota =(Collections.max(alumnosNotaMap.values()));//devuelve el mínimo del  valor del map
		return maxNota;
	}
	/**
	 * método que devuelve el alumno con mas nota en este módulo
	 * @return
	 */
	public Alumno alumnoMaxNota() {
		int maxNota =(Collections.max(alumnosNotaMap.values()));//devuelve el mínimo del  valor del hashmap
		// Recorremos un Entry, que es una copia del hasmap que se puede recorrer (iterar), ya que el hashmap no se puede.
		for (Map.Entry<Alumno, Integer> copiaHashMap : alumnosNotaMap.entrySet()) { 
			if (copiaHashMap.getValue()==maxNota) { 
				return copiaHashMap.getKey();
				
			}
		}
		return null; //si no obtiene alumno
	}
	/**
	 * calcula la nota media de todos los alumnos matriculados en el módulo
	 * @return
	 */
	public float notaMedia() {
		int sumaNotas=0;
		
		if (alumnosNotaMap.isEmpty()) {
			System.out.println("No se puede calcular la media de las notas ya que no hay alumnos matriculados.");
			return 0;
		}
		Set<Map.Entry<Alumno, Integer>> SetHashMap = alumnosNotaMap.entrySet();//creamos un Set copia del hashmap
		Iterator <Entry<Alumno, Integer>>  i= SetHashMap.iterator();//definimos un iterador
		while(i.hasNext()) {
			sumaNotas += i.next().getValue();
		}
		return sumaNotas/alumnosNotaMap.size();
	}
}
