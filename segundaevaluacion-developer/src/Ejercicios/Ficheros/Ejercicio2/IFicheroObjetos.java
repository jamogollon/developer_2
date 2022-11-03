package Ejercicios.Ficheros.Ejercicio2;

import java.util.List;

public interface IFicheroObjetos<T>{
	
	    /** Guarda una lista de objetos en la fuente de datos asociada */
	   void  guardar(List< T > objetos)  throws  Exception;
	    /** Carga la lista de objetos desde la fuente de datos asociada */
	   void  cargar(List< T > objetos)  throws Exception;
	

}
