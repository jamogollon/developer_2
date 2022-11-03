package Ejercicios.Ficheros.Ejercicio4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DaoAgenda {
	private File fichero;
	
	public DaoAgenda(String nfile) {
		this(new File(nfile));
	}
	
	public DaoAgenda(File f) {
		this.fichero=f;
	}
	/*-------EN MODO TEXTO--------*/
	
	public void guardar(List<Contacto> agenda) throws Exception{
		
		BufferedWriter bw = new BufferedWriter (new FileWriter(fichero, false));
		PrintWriter pw = new PrintWriter(bw);
		
		for(Contacto c: agenda) {
			pw.println(c.getNombre()+ " " + c.getTelefono());
		}
		pw.close();
		
	}
	public void guardaUno(Contacto c) throws Exception{
		BufferedWriter bw = new BufferedWriter (new FileWriter(fichero,true));
		PrintWriter pw = new PrintWriter(bw);
		
		pw.println(c.getNombre()+ " " + c.getTelefono());
		pw.close();
	}
	/**
	 * Para eliminar uno debemos eliminar todos y volver a guuardar
	 * @param c
	 * @throws Exception
	 */
	public void elimina(Contacto c) throws Exception{
		//TODO
	}
	
	public List<Contacto> carga() throws Exception{
		List <Contacto> listac = new ArrayList<Contacto>();
		String nombre;
		int tlf;
		
		BufferedReader br = new BufferedReader(new FileReader(fichero));
		Scanner brc = new Scanner (br);
		
		while((nombre=brc.next())!=null) {
			tlf =brc.nextInt();
			Contacto c = new Contacto(nombre, tlf);
			listac.add(c);
		}
		brc.close();
		return listac;
	}
	
	/*------------EN MODO BINARIO-------------*/
	
	public void guardarBi(List<Contacto> agenda) throws Exception{
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fichero,false));
		DataOutputStream dos = new DataOutputStream(bos);
		
		for(Contacto c: agenda) {
			dos.writeUTF(c.getNombre());
			dos.writeInt(c.getTelefono());
		}
		dos.close();
	}
	public void guardarUnoBi(Contacto c) throws Exception{
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fichero,true));
		DataOutputStream dos = new DataOutputStream(bos);
		
		dos.writeUTF(c.getNombre());
		dos.writeInt(c.getTelefono());
		dos.close();
	}
	public void eliminaBi(Contacto c) throws Exception{
		//TODO
	}
	
	public List<Contacto> cargaBi() throws Exception{
		List <Contacto> listac = new ArrayList<Contacto>();
		String nombre;
		int tlf;
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fichero));
		DataInputStream dis = new DataInputStream (bis);
		
		while((nombre=dis.readUTF())!=null) {
			tlf =dis.readInt();
			Contacto c = new Contacto(nombre, tlf);
			listac.add(c);
		}
		dis.close();
		return listac;
	}
	
	/*-----------MODO BINARIO CON OBJETOS------------*/
	
	public void guardarBiObj(List<Contacto> agenda) throws Exception{
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fichero,false));
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		for(Contacto c: agenda) {
			oos.writeObject(c);
		}
		oos.close();
	}
	public void guardarUnoBiObj(Contacto c) throws Exception{
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fichero,true));
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(c);
		oos.close();
	}
	public void eliminaBiObj(Contacto c) throws Exception{
		//TODO
	}
	
	public List<Contacto> cargaBiObj() throws Exception{
		List <Contacto> listac = new ArrayList<Contacto>();
		Contacto c;
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fichero));
		ObjectInputStream ois = new ObjectInputStream (bis);
		
		while(true) {
			try {
				c = (Contacto)ois.readObject();
				listac.add(c);
			} catch (EOFException e) {//si llega al final del archivo.
				break;
			} 
			
		}
		ois.close();
		return listac;
	}
}
