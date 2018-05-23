package prototipoSoftware.mundo;

import java.io.File;
import java.util.ArrayList;

public class Proyecto 
{

	/**
	 * arreglo de propuestas de grado
	 */
	private ArrayList propuestasGrado;
	private ArrayList trabajosGrado;
	private ArrayList jurados;
	
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
	
	
	public void registrarTrabajoDeGrado(PropuestaDeGrado propuesta, String nombrePropuesta)
	{
		for (int i = 0; i < propuestasGrado.size(); i++) 
		{
			if(nombrePropuesta.equalsIgnoreCase(propuesta.getPropuesta().getName()))
			{
				File f = new File(propuesta.getPropuesta().getAbsolutePath());
						
				trabajosGrado.add(f);
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
