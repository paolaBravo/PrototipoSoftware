package prototipoSoftware.interfaz;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import prototipoSoftware.mundo.Estudiante;
import prototipoSoftware.mundo.PropuestaDeGrado;
import prototipoSoftware.mundo.Proyecto;

public class InterfazPrincipal extends JFrame
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

	private Proyecto proyecto;
	
	private JFileChooser seleccionarArchivo;
	
	private String ultimoDirectorio;
	
	private PanelInterfaz panelPrincipal;
	
	private MenuInterfaz barraMenu;
	
	public InterfazPrincipal()
	{
		
		proyecto = new Proyecto("C:\\Users\\Paola\\Documents");
		
        setLayout( new BorderLayout( ) );
        setTitle( "Consulta" );
        setSize( 400, 400 );
        setLocationRelativeTo( null );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        barraMenu = new MenuInterfaz(this);
        setJMenuBar(barraMenu);
    
        
        panelPrincipal = new PanelInterfaz(this);
        add(panelPrincipal, BorderLayout.SOUTH);
        
        seleccionarArchivo = new JFileChooser();
	}
	
	
	public void registrarPropuesta()
	{
		 JFileChooser fc = new JFileChooser( ultimoDirectorio );
		 fc.setFileSelectionMode( JFileChooser.FILES_ONLY );
		 fc.setMultiSelectionEnabled( false );
		 
         int resultado = fc.showOpenDialog( this );

         if( resultado == JFileChooser.APPROVE_OPTION )
         {
             File seleccionado = fc.getSelectedFile( );
             ultimoDirectorio = seleccionado.getName();
    
			try 
			{
				String pNombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante", "");
				String pCodigo = JOptionPane.showInputDialog("Ingrese el codigo del estudiante", "");
				String pSemestre = JOptionPane.showInputDialog("Ingrese el semestre del estudiante (numero entero)", "");
				int castSemestre = Integer.parseInt(pSemestre);	
				String pPrograma = JOptionPane.showInputDialog("Ingrese el programa del estudiante", "");

				Estudiante estu = new Estudiante(pNombre, pCodigo, castSemestre, pPrograma);
				
				proyecto.registrarPropuesta(new PropuestaDeGrado(ultimoDirectorio, estu), estu);
					
				System.out.println(proyecto.darNombre());
				JOptionPane.showMessageDialog(null, "Se agregado correctamente");
				
			} 
			catch (Exception e) 
			{
				JOptionPane.showMessageDialog( this, e.getMessage( ), "Error", JOptionPane.ERROR_MESSAGE );
			}
		}
	
	}
	
	
	public void consultarPropuesta()
	{	
		
		for (int i = 0; i < proyecto.getArregloPropuesta().size(); i++)
		{
			
			String y = JOptionPane.showInputDialog("Ingrese el codigo del estudiante", "");
			
			PropuestaDeGrado aux = (PropuestaDeGrado) proyecto.getArregloPropuesta().get(i);
			String aux2 = aux.getEstudiante().getCodigo();

			if(y.equalsIgnoreCase(aux2))
			{
				
				String aux3 = aux.getPropuesta().getName();
				JOptionPane.showMessageDialog(null, aux3.toString());
				
				int opciones = JOptionPane.showConfirmDialog(null, "¿Desea abrir este archivo?");
				
				if(opciones == JOptionPane.YES_OPTION)
				{
					String url = aux.getPropuesta().getAbsolutePath();
					
					abrirarchivo(url);
				}
				
				else if(opciones == JOptionPane.NO_OPTION)
				{
					JOptionPane.showMessageDialog(null, "Gracias :v");
				}


			}
		}
		
	}
	
	public void abrirarchivo(String archivo){

	     try {

	            File objetofile = new File (archivo);
	            Desktop.getDesktop().open(objetofile);

	     }catch (IOException ex) {

	            System.out.println(ex);

	     }

	}                         

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        InterfazPrincipal interfaz = new InterfazPrincipal( );
        interfaz.setVisible( true );
	}

}
