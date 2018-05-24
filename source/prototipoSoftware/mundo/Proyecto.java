package prototipoSoftware.mundo;

import java.io.File;
import java.util.ArrayList;

public class Proyecto 
{

	/**
	 * arreglo de propuestas de grado
	 */
	private ArrayList<PropuestaDeGrado> propuestasGrado;
	private ArrayList<TrabajoDeGrado> trabajosGrado;
	private ArrayList<Jurado> jurados;
	
	private String directorio;
	
	
	public Proyecto(String Pruta)
	{
		propuestasGrado = new ArrayList();
		trabajosGrado = new ArrayList();
		jurados = new ArrayList();
		directorio = Pruta;
	}
	
	/**
	 * Registra una propuesta
	 * @param propuesta
	 * @param estu
	 * @throws Exception
	 */
	public void registrarPropuesta(PropuestaDeGrado propuesta, Estudiante estu) throws Exception
	{
		
		File f = new File(directorio);
		File[] elementos = f.listFiles();
		
		if(elementos != null)
		{
			for(int i = 0; i<elementos.length; i++)
			{
				
				if(elementos[i].isFile() && elementos[i].getName().equalsIgnoreCase(propuesta.getPropuesta().getName()))
				{
					propuestasGrado.add(new PropuestaDeGrado(elementos[i].getPath(), estu, propuesta.getModalidad()));
					
				}
			}
		
		}
	
	}
	
	
	public void registrarTrabajoDeGrado(TrabajoDeGrado trabajo, Estudiante estu)
	{
		File f = new File(directorio);
		File[] elementos = f.listFiles();
		
		if(elementos != null)
		{
			for(int i = 0; i<elementos.length; i++)
			{
				
				if(elementos[i].isFile() && elementos[i].getName().equalsIgnoreCase(trabajo.getTrabajoGrado().getName()))
				{
					trabajosGrado.add(new TrabajoDeGrado(elementos[i].getPath(), estu, null));
					
				}
			}
		}
	}
	
	
	public void asignarJurado(String nombre, String codigo)
	{
		Estudiante e ;
		Jurado j = null ;
		
		
		for(Jurado ju :jurados) {
			
			if(ju.getNombre().equals(nombre)) {
				
				j = ju ; 
				
			}
			
		}	
		for (TrabajoDeGrado egh:trabajosGrado)
		{
			
			if(egh.getEstudiante().getCodigo().equals(codigo)) {
				
				egh.setJurado(j);
			}
			
		}
			
			
	}
	
	
	/**
	 * @return the arregloPropuesta
	 */
	public ArrayList getArregloPropuesta() {
		return propuestasGrado;
	}

	/**
	 * @return the directorio
	 */
	public String getDirectorio() {
		return directorio;
	}

	/**
	 * @param arregloPropuesta the arregloPropuesta to set
	 */
	public void setArregloPropuesta(ArrayList arregloPropuesta) {
		this.propuestasGrado = arregloPropuesta;
	}

	/**
	 * @param directorio the directorio to set
	 */
	public void setDirectorio(String directorio) {
		this.directorio = directorio;
	}

	public ArrayList getTrabajosGrado() {
		return trabajosGrado;
	}

	public void setTrabajosGrado(ArrayList trabajosGrado) {
		this.trabajosGrado = trabajosGrado;
	}

	public ArrayList getJurados() {
		return jurados;
	}

	public void setJurados(ArrayList jurados) {
		this.jurados = jurados;
	}

}
