package prototipoSoftware.interfaz;

import java.awt.BorderLayout;

import javax.swing.JDialog;

public class JDialogPropuesta extends JDialog 
{
	
	private InterfazPrincipal principal;

	
	private PanelPropuesta panelInfo;
	
	public JDialogPropuesta()
	{
		
		setTitle( "Propuesta de grado" );
        setSize( 590, 400 );
        setResizable( false );
        setLocationRelativeTo(null);
        setModal(true);
        
        // Distribuidor grafico en los bordes
        setLayout( new BorderLayout( ) );        

        
        panelInfo = new PanelPropuesta( this );
        add(panelInfo, BorderLayout.CENTER);
	}

	
}
