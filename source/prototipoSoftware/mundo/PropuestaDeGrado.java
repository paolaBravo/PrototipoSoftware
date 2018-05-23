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

	public String getModalidad() {
		return modalidad;
	}

	public File getPropuesta() {
		return propuesta;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public void setPropuesta(File propuesta) {
		this.propuesta = propuesta;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	
}