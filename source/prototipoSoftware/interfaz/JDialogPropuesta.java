package prototipoSoftware.interfaz;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import prototipoSoftware.mundo.Estudiante;
import prototipoSoftware.mundo.PropuestaDeGrado;
import prototipoSoftware.mundo.Proyecto;

public class JDialogPropuesta extends JDialog 
{
	
	private InterfazPrincipal principal;

	private Proyecto proyecto;
	
	private PanelPropuesta panelInfo;
	
	private String ultimoDirectorio;
	
	public JDialogPropuesta()
	{
		proyecto = new Proyecto("I:\\");
		
		setTitle( "Propuesta de grado" );
        setSize( 600, 400 );
        setResizable( false );
        setLocationRelativeTo(null);
        setModal(true);
        
        // Distribuidor grafico en los bordes
        setLayout( new BorderLayout( ) );        

        
        panelInfo = new PanelPropuesta( this );
        add(panelInfo, BorderLayout.CENTER);
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
				
				String pNombre = panelInfo.getTxtNombre();
				
				String pCodigo = panelInfo.getTxtCodigo();				
				int pSemestre = Integer.parseInt(panelInfo.getTxtSemestre());
				
				String pPrograma = panelInfo.getTxtPrograma();
				
				if( pNombre.equals("") || pCodigo.equals("")  || pSemestre == 0  || pPrograma.equals("") )
				{
					throw new Exception("No pueden haber campos vacios");
				}
				else 
				{
					Estudiante estu = new Estudiante(pNombre, pCodigo, pSemestre, pPrograma);
					
					String pModalidad = accionesButtonGroup();
					
					
					proyecto.registrarPropuesta(new PropuestaDeGrado(ultimoDirectorio, estu, pModalidad), estu);

					
					visualizar();
					
					System.out.println(proyecto.darNombre());
					
					JOptionPane.showMessageDialog(null, "Se agregado correctamente");
				}
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
					
				}
	
	
			}
		}
		
	}
	
	public void visualizar() 
	{
			
		
		for (int i = 0; i < proyecto.getArregloPropuesta().size(); i++)
		{
			PropuestaDeGrado aux = (PropuestaDeGrado) proyecto.getArregloPropuesta().get(i);
			
			String cast = aux.getPropuesta().getName();
			String cast1 = aux.getEstudiante().getCodigo();
			String modalidad = aux.getModalidad();
			
			String x = cast + "  " + "Codigo:" + cast1 + "  "+ "Modalidad:" + modalidad + "\n" ;
			
			if(cast != null && cast !="" && cast1 != null && cast1 != "")
			{
				JTextArea resultado = panelInfo.getTxtResultado();
				resultado.insert(x, 0);
			}
			
			
		}
	}
	
	
	public String accionesButtonGroup()
	{
		
		JRadioButton radioButto1 = panelInfo.getJrbModalidad1();
		JRadioButton radioButto2 = panelInfo.getJrbModalidad2();
		JRadioButton radioButto3 = panelInfo.getJrbModalidad3();
		JRadioButton radioButto4 = panelInfo.getJrbModalidad4();
		
		String modalidad = "";

		
		if(radioButto1.isSelected() == true)
		{
			
			
			String nombre = radioButto1.getText();
			modalidad = nombre;
			
		}
		
		else if(radioButto2.isSelected() == true)
		{
			String nombre = radioButto2.getText();
			modalidad = nombre;
		}
		
		else if(radioButto3.isSelected() == true)
		{
			String nombre = radioButto3.getText();
			modalidad = nombre;
		}
		
		else if(radioButto4.isSelected() == true)
		{
			
			String nombre = radioButto4.getText();
			modalidad = nombre;
		}
		
		return modalidad;
	}
	

	
	public void abrirarchivo(String archivo){
	
	     try {
	
	            File objetofile = new File (archivo);
	            Desktop.getDesktop().open(objetofile);
	
	     }catch (IOException ex) {
	
	            System.out.println(ex);
	
	     }
	
	}                         

	
}
