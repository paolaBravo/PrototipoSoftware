package prototipoSoftware.interfaz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelInterfaz extends JPanel implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4042664352765547035L;
	
	
	public final static String AGREGAR = "Agregar";
	public final static String CONSULTAR = "Consultar";
	
	private InterfazPrincipal principal;
	
	   /**
     * Bot�n agregar
     */
    private JButton btnAgregar;

    /**
     * Bot�n consultar
     */
    private JButton btnConsultar;
    
    
    
    public  PanelInterfaz (InterfazPrincipal ventana)
    {
    	 principal = ventana;

         setBorder( new TitledBorder( "Opciones" ) );
         setLayout( new GridLayout( 1, 2 ) );
         
         // Bot�n opci�n 1
         btnAgregar = new JButton( "Agregar" );
         btnAgregar.setActionCommand( AGREGAR );
         btnAgregar.addActionListener( this );
         add( btnAgregar );

         // Bot�n opci�n 2
         btnConsultar = new JButton( "Consultar" );
         btnConsultar.setActionCommand( CONSULTAR );
         btnConsultar.addActionListener( this );
         add( btnConsultar );
    }



	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
