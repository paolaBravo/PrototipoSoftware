package prototipoSoftware.mundo;

import java.io.File;
import java.util.Date;

public class TrabajoDeGrado 
{
	
	private PropuestaDeGrado propuestaGrado;

	private File trabajoGrado;
	
	private Estudiante estudiante;

	public TrabajoDeGrado(String pTrabajoGrado, Estudiante estu)
	{
		trabajoGrado = new File(pTrabajoGrado);
		estudiante = estu;
	
	}

	public PropuestaDeGrado getPropuestaGrado() {
		return propuestaGrado;
	}

	public File getTrabajoGrado() {
		return trabajoGrado;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setPropuestaGrado(PropuestaDeGrado propuestaGrado) {
		this.propuestaGrado = propuestaGrado;
	}

	public void setTrabajoGrado(File trabajoGrado) {
		this.trabajoGrado = trabajoGrado;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	
}