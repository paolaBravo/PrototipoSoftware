package prototipoSoftware.mundo;

public class Jurado {
	
	/**
	 * atributo que modela el nombre de un jurado
	 */
	private String nombre ;
	
	private String cedula ; 

	/**
	 * Constructor de un jurado
	 * @param pNombre, nombre de un estudiante jurado
		 * @post Crea un jurado
	 */
	public Jurado(String nombre, String cedula) {
		
		this.nombre = nombre;
		this.cedula = cedula ; 
	}

	/**
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	
	
	

}