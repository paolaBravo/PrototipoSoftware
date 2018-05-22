package prototipoSoftware.interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MenuInterfaz extends JMenuBar implements ActionListener
{
	
	private static final long serialVersionUID = 46378926473L;

	public final static String PROPUESTAGRADO = "Propuestas de grado";
	
	public final static String TRABAJOGRADO = "Trabajo de grado";
	
	public final static String SALIR = "Salir"; 
	
	
	   /**
     * El menú Archivo.
     */
    private JMenu menuArchivo;
    
    /**
     * La opcion para abrir un menu de artistas.
     */
    private JMenuItem itemPropuestaGrado;
    
    /**
     * La opcion para abrir el menu cancion.
     */
    private JMenuItem itemTrabajoGrado;
    
    private InterfazPrincipal principal;
    
    private JMenuItem itemSalir;
    
    
    public MenuInterfaz(InterfazPrincipal ia)
    {
    	principal = ia;
    	
    	menuArchivo = new JMenu( "Archivo" );
        menuArchivo.setMnemonic( KeyEvent.VK_A );
        add( menuArchivo );
        
        itemPropuestaGrado = new JMenuItem("Consultar por Trabajo de grado");
        itemPropuestaGrado.setActionCommand(PROPUESTAGRADO);
        itemPropuestaGrado.setAccelerator( KeyStroke.getKeyStroke( KeyEvent.VK_N, ActionEvent.CTRL_MASK ) );
        itemPropuestaGrado.setMnemonic( KeyEvent.VK_N );
        itemPropuestaGrado.addActionListener( (ActionListener) this );
        menuArchivo.add(itemPropuestaGrado);
        
        itemTrabajoGrado = new JMenuItem("Consultar por canción");
        itemTrabajoGrado.setActionCommand(TRABAJOGRADO);
        itemTrabajoGrado.setAccelerator( KeyStroke.getKeyStroke( KeyEvent.VK_A, ActionEvent.CTRL_MASK ) );
        itemTrabajoGrado.setMnemonic( KeyEvent.VK_A );
        itemTrabajoGrado.addActionListener( (ActionListener) this );
        menuArchivo.add(itemTrabajoGrado);
        
        menuArchivo.addSeparator();
        
        itemSalir = new JMenuItem( "Salir" );
        itemSalir.setActionCommand( SALIR );
        itemSalir.addActionListener( this );
        menuArchivo.add( itemSalir );
        
        
        
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String comando = e.getActionCommand( );
		
		if(PROPUESTAGRADO.equals(comando))
		{

		
		
		}
		if(TRABAJOGRADO.equals(comando))
		{

		}
		if(SALIR.equals(comando))
		{
			principal.dispose();
		}
		
		
	}

}
