package prototipoSoftware.interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelTrabajo extends JPanel implements ActionListener
{

		public final static String AGREGAR = "Agregar";
		
		public final static String CONSULTAR = "Consultar";
		
		public final static String JURADO = "Jurado";
		
		public final static String ASIGNAR = "Asignar";

		private InterfazPrincipal principal;	
		
		private JLabel labCodigo;
		  
		private JTextField txtCodigo;
		
		private JTextArea txtVisualizar;
		
		private JScrollPane scroll;
		  
		private JButton butAgregar;
		
		private JButton butConsultar;
		
		private JComboBox cmAsignar;
		
		private JButton butAsignarJurado;
	
		public PanelTrabajo(InterfazPrincipal ia)
		{
			principal = ia;
						
			TitledBorder borde = BorderFactory.createTitledBorder("Trabajo de grado");
			borde.setTitleColor( Color.BLACK );
			setBorder( borde );
			
			// Distribuidor grafico en los bordes
			setLayout( new BorderLayout( ) );
			
			JPanel panelInfo = new JPanel();
			
			panelInfo.setLayout(new GridLayout(2, 2));
			panelInfo.setPreferredSize( new Dimension( 100,50 ) );
			
			labCodigo = new JLabel("Codigo del estudiante");
			
			txtCodigo = new JTextField();
			txtCodigo.setEditable(true);
			
			panelInfo.add(labCodigo);
			panelInfo.add(txtCodigo);
			
			add(panelInfo, BorderLayout.NORTH);
			
			//Panel visulaizar
			
			JPanel panelResultados = new JPanel();
			TitledBorder borde1 = BorderFactory.createTitledBorder("Visualizacion previa");
			borde1.setTitleColor( Color.BLACK );
			panelResultados.setLayout(new BorderLayout());
			panelResultados.setBorder( borde1 );
			panelResultados.setPreferredSize( new Dimension(300,90 ) );
			
			txtVisualizar = new JTextArea();
			txtVisualizar.setBackground(Color.WHITE);
			txtVisualizar.setEditable(false);
			scroll = new JScrollPane(txtVisualizar);
			
			panelResultados.add(scroll,BorderLayout.CENTER);
			add(panelResultados, BorderLayout.WEST);
			
			//Panel navegacion
			
			JPanel panelNavegacion= new JPanel();
			
			//Adiciona un marco con titulo
			TitledBorder borde2 = BorderFactory.createTitledBorder("Navegación");
			borde2.setTitleColor( Color.BLACK );
			panelNavegacion.setBorder( borde2 );
			
			//Establece las dimensiones del panel
			panelNavegacion.setLayout(new GridLayout(4, 1));
			panelNavegacion.setPreferredSize( new Dimension( 300,90 ) );
			
			butAgregar = new JButton("Agregar");
			butAgregar.setActionCommand(AGREGAR);
			butAgregar.addActionListener(this);
			
			
			butConsultar = new JButton("Consultar");
			butConsultar.setActionCommand(CONSULTAR);
			butConsultar.addActionListener(this);

			butAsignarJurado = new JButton("Asignar Jurado");
			butAsignarJurado.setActionCommand(ASIGNAR);
			butAsignarJurado.addActionListener(this);
			
			String jurados[] = {"Asignar Jurado", "ANDRES ARCINIEGAS", "CARLOS LUGO"};
			
			cmAsignar = new JComboBox(jurados);
			cmAsignar.setActionCommand(JURADO);
			cmAsignar.addActionListener(this);
			
			panelNavegacion.add(butAgregar);
			panelNavegacion.add(butConsultar);
			panelNavegacion.add(cmAsignar);
			panelNavegacion.add(butAsignarJurado);
			

			add(panelNavegacion, BorderLayout.EAST);
		}
	
	public JLabel getLabCodigo() {
			return labCodigo;
		}

		public JTextField getTxtNombrePropuesta() {
			return txtCodigo;
		}

		public JTextArea getTxtVisualizar() {
			return txtVisualizar;
		}

		public void setLabCodigo(JLabel labCodigo) {
			this.labCodigo = labCodigo;
		}

		public void setTxtCodigo(JTextField txtCodigo) {
			this.txtCodigo = txtCodigo;
		}

		public void setTxtVisualizar(JTextArea txtVisualizar) {
			this.txtVisualizar = txtVisualizar;
		}
		
		
		public String getJurado()
		{
			return cmAsignar.getSelectedItem().toString();
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(AGREGAR.equals( e.getActionCommand( ) ))
		{
			try {
				principal.registrarTrabajoDeGrado();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(CONSULTAR.equals(e.getActionCommand()))
		{
			principal.consultarTrabajo();
		}
		if(ASIGNAR.equals(e.getActionCommand()))
		{
			principal.asignarJurado();
		}
		
	}

}
