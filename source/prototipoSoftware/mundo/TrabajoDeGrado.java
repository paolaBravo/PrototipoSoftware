package prototipoSoftware.mundo;

import java.io.File;
import java.util.Date;

public class TrabajoDeGrado 
{
	
	private PropuestaDeGrado propuestaGrado;

	private File trabajoGrado;
	
	private Estudiante estudiante;
	
	private Jurado jurado ; 

	public TrabajoDeGrado(String pTrabajoGrado, Estudiante estu, Jurado ju)
	{
		trabajoGrado = new File(pTrabajoGrado);
		estudiante = estu;
		jurado = null;
	
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

	public Jurado getJurado() {
		return jurado;
	}

	public void setJurado(Jurado jurado) {
		this.jurado = jurado;
	}
	
	
	
}