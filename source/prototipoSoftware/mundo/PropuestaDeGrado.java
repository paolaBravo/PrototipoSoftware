package prototipoSoftware.mundo;

import java.io.File;

public class PropuestaDeGrado 
{

	public final static String MODALIDAD1 = "Monografia";
	
	public final static String MODALIDAD2 = "Asistencia de investigacion";
	
	public final static String MODALIDAD3 = "Trabajo de investigacion";
	
	public final static String MODALIDAD4 = "Opcion de empredimiento";
	
	private String nombrePropuesta;
	
	private File propuesta;
	
	private Estudiante estudiante;
	
	public PropuestaDeGrado(String pPropuesta, Estudiante estu)
	{
		propuesta = new File(pPropuesta);
		estudiante = estu;
	}

	/**
	 * @return the nombrePropuesta
	 */
	public String getNombrePropuesta() {
		return nombrePropuesta;
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
	public void setNombrePropuesta(String nombrePropuesta) {
		this.nombrePropuesta = nombrePropuesta;
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

	/**
	 * @return the modalidad1
	 */
	public static String getModalidad1() {
		return "Monografia";
	}

	/**
	 * @return the modalidad2
	 */
	public static String getModalidad2() {
		return "Asistencia de investigacion";
	}

	/**
	 * @return the modalidad3
	 */
	public static String getModalidad3() {
		return "Trabajo de investigacion";
	}

	/**
	 * @return the modalidad4
	 */
	public static String getModalidad4() {
		return "Opcion de empredimiento";
	}


	
	
}
