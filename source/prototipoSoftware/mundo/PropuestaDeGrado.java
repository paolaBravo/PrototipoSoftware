package prototipoSoftware.mundo;

import java.io.File;

public class PropuestaDeGrado 
{

	private String modalidad;
	
	private File propuesta;
	
	private Estudiante estudiante;
	
	public PropuestaDeGrado(String pPropuesta, Estudiante estu , String pModalidad)
	{
		propuesta = new File(pPropuesta);
		estudiante = estu;
		modalidad = pModalidad;
	}

	/**
	 * @return the nombrePropuesta
	 */
	public String getModalidad() {
		return modalidad;
	}

	/**
	 * @return the propuesta
	 */
	public File getPropuesta() {
		return propuesta;
	}

	/**
	 * @param nombrePropuesta the nombrePropuesta to set
	 */
	public void setModalidad(String modalida) {
		this.modalidad = modalida;
	}

	/**
	 * @param propuesta the propuesta to set
	 */
	public void setPropuesta(File propuesta) {
		this.propuesta = propuesta;
	}

	/**
	 * @return the estudiante
	 */
	public Estudiante getEstudiante() {
		return estudiante;
	}

	/**
	 * @param estudiante the estudiante to set
	 */
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}


	
	
}
