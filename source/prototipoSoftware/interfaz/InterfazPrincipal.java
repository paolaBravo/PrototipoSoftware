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
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        InterfazPrincipal interfaz = new InterfazPrincipal( );
        interfaz.setVisible( true );
	}

}
