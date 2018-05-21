package prototipoSoftware.mundo;

public class Estudiante 
{
	/**
	 * atributo que modela el nombre de un estudiante
	 */
	private String nombre;
	
	/**
	 * atributo que modela el codigo de un estudiante
	 */
	private String codigo;
	
	/**
	 * atributo que modela el semestre de un estudiante
	 */
	private int semestre;
	
	/**
	 * atributo que modela el programa academico de un estudiante
	 */
	private String programaAcademico;
	
	/**
	 * Constructor de un estudiante
	 * @param pNombre, nombre de un estudiante nuevo
	 * @param pCodigo, codigo de un estudiante nuevo
	 * @param pSemestre, semestre de un estudiante nuevo
	 * @param pProgamaAcademico, programa academico de un estudiante nuevo
	 * @post Crea un estudiante nuevo
	 */
	public Estudiante( String pNombre, String pCodigo, int pSemestre, String pProgamaAcademico)
	{
		nombre = pNombre;
		codigo = pCodigo;
		semestre = pSemestre;
		programaAcademico = pProgamaAcademico;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the semestre
	 */
	public int getSemestre() {
		return semestre;
	}

	/**
	 * @param semestre the semestre to set
	 */
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	/**
	 * @return the programaAcademico
	 */
	public String getProgramaAcademico() {
		return programaAcademico;
	}

	/**
	 * @param programaAcademico the programaAcademico to set
	 */
	public void setProgramaAcademico(String programaAcademico) {
		this.programaAcademico = programaAcademico;
	}
	
	
	
}
