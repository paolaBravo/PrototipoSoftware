package prototipoSoftware.mundo;

import java.io.File;

public class Test {

	public static void main(String[] args) {
	
		
		Proyecto proyecto = new Proyecto("");
		Estudiante estu1 = new Estudiante("Cristian", "2220161013", 5, "Ing.Sistemas");
		Estudiante estu2 = new Estudiante("Paola", "2220161006", 5, "Ing.Sistemas");
		
		
		try {
			
			proyecto.registrarPropuesta( new PropuestaDeGrado("D:\\Unibague\\Credito Universidad.jpg", estu1), estu1);
			proyecto.registrarPropuesta( new PropuestaDeGrado("D:\\Unibague\\Matricula 2017B.pdf", estu2), estu2);
			
			System.out.println(proyecto.darNombre());
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}

	}

}
