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

	public final static String SALIR = "Salir"; 
	
	
	   /**
     * El menú Archivo.
     */
    private JMenu menuArchivo;

    private InterfazPrincipal principal;
    
    private JMenuItem itemSalir;
    
    
    public MenuInterfaz(InterfazPrincipal ia)
    {
    	principal = ia;
    	
    	menuArchivo = new JMenu( "Archivo" );
        menuArchivo.setMnemonic( KeyEvent.VK_A );
        add( menuArchivo );

        itemSalir = new JMenuItem( "Salir" );
        itemSalir.setActionCommand( SALIR );
        itemSalir.addActionListener( this );
        menuArchivo.add( itemSalir );
        
        
        
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String comando = e.getActionCommand( );

		if(SALIR.equals(comando))
		{
			principal.dispose();
		}
		
		
	}

}
