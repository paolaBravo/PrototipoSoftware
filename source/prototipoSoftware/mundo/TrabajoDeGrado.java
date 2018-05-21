package prototipoSoftware.mundo;

import java.util.Date;

public class TrabajoDeGrado 
{
	
	private PropuestaDeGrado propuestaGrado;
	
	private Date fechaLimite;
	
	private String calificacion;
	

	public TrabajoDeGrado(PropuestaDeGrado PpropuestaGrado, Date PfechaLimite, String Pcalificacion) 
	{
		propuestaGrado = PpropuestaGrado;
		fechaLimite = PfechaLimite;
		calificacion = Pcalificacion;
	}

	public PropuestaDeGrado getPropuestaGrado() {
		return propuestaGrado;
	}

	public void setPropuestaGrado(PropuestaDeGrado propuestaGrado) {
		this.propuestaGrado = propuestaGrado;
	}

	public Date getFechaLimite() {
		return fechaLimite;
	}

	public void setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

	public String getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}
	
	
	

}
