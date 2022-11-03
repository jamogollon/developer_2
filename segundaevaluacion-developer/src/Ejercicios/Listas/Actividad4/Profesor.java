package Ejercicios.Listas.Actividad4;

import java.util.HashSet;
import java.util.Set;

public class Profesor {
	private static int id=0;
	/*----ATRIBUTOS-----*/
	private final int idProfesor;
	private String nombre;
	private CategoriaProfesor categoria;
	//private static Set<Integer> codigos = new HashSet<Integer>();
	
	/*---CONSTRUCTOR----*/
	public Profesor(String nombre, CategoriaProfesor categoria) {
		
		this.nombre=nombre;
		this.categoria=categoria;
		this.idProfesor=id++;
		//this.idProfesor=generaCodigo();//otra forma 
	}
	/*---GETTERS Y SETTERS---*/
	public CategoriaProfesor getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaProfesor categoria) {
		this.categoria = categoria;
	}
	public int getIdProfesor() {
		return idProfesor;
	}
	public String getNombre() {
		return nombre;
	}

	/*----METODOS----*/
	/**
	 * método que genera un código único.
	 * @return
	 */
	/*private int generaCodigo() {
		int cod;
		
		do {
			cod = (int)(Math.random()*100);
		}while(!codigos.add(cod));//puesto que el conjunto set, no admite repetidos y devuelve false cuando ocurre esto.
		
		return cod;
	}*/



}
