package Ejercicios.Ficheros.Ejercicio4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agenda {
	 
    //Atributos
    private List<Contacto> listaContactos;
 
    //Constructores
    public Agenda() {
    	this.listaContactos= new ArrayList<Contacto>();
    }
    //Metodos
    /**
     * Añade un contacto a la agenda
     *
     * @param c
     */
    public void aniadirContacto(Contacto c) {
 
        if (existeContacto(c.getNombre())) { //Indico si existe el contacto
            System.out.println("El contacto con ese nombre ya existe");
        } else {
        	listaContactos.add(c);
        }
    }
    
    /**
     * Indica si existe un contacto
     *
     * @param c
     * @return
     */
    public boolean existeContacto(String nombre) {
 
        for (Contacto cont: listaContactos) {
            if (cont.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
 
    }
 
    /**
     * Lista los contactos de la agenda
     */
    public void listarContactos() {
 
    	for(Contacto c: listaContactos) {
    		System.out.println(c);//llama al toString de Contacto
    	}
    }
 
    /**
     * Busca un contacto por su nombre
     *
     * @param nombre
     */
    public void buscarPorNombre(String nombre) {

    	for(Contacto c : listaContactos) {
    		if(c.getNombre().equals(nombre)) {
    			System.out.println("Teléfono nº: "+ c.getTelefono());
    		}
    		else {
    			System.out.println("No se ha encontrado el contacto");
    		}
    	}
    } 
    /**
     * Elimina el contacto de la agenda
     *
     * @param c
     */
    	public void eliminarContacto(Contacto c) {
    		boolean hay=false;

    		Iterator<Contacto> i = listaContactos.iterator();
    		while(i.hasNext()) {
    			if(c.getNombre().equals(i.next().getNombre())) {
    				i.remove();
    				hay=true;
    				System.out.println("Se ha eliminado el contacto");
    			}
    		}
    		if (!hay) {
    			System.out.println("No se ha encontrado este contacto.");
    		}
    	}
 
}
