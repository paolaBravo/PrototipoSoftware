package prototipoSoftware.interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelPropuesta extends JPanel implements ActionListener
{

	public final static String AGREGAR = "Agregar";
	
	public final static String CONSULTAR = "Consultar";
	
    private JDialogPropuesta principal;
    
    private JLabel labNombreEstudiante;
    
    private JLabel labCodigoEstudiante;
    
    private JLabel labSemestreEstudiante;
    
    private JLabel labProgramaEstudiante;
    
    private JTextField txtNombre;
    
    private JTextField txtCodigo;
    
    private JTextField txtSemestre;
    
    private JTextField txtPrograma;
    
	private JTextArea txtResultado;
	
	private JButton butAgregar;
	
	private JButton butConsultar;
	
	private JScrollPane scroll;
	
	private InterfazPrincipal referencia;
	
	public PanelPropuesta( JDialogPropuesta ia )
	{
		principal = ia;
	
		TitledBorder borde = BorderFactory.createTitledBorder("Información de la propuesta de grado");
		borde.setTitleColor( Color.BLACK );
		setBorder( borde );
		
		// Distribuidor grafico en los bordes
		setLayout( new BorderLayout( ) );
		
		JPanel panelInfo = new JPanel();
		
		panelInfo.setLayout(new GridLayout(2, 2));
		panelInfo.setPreferredSize( new Dimension( 100,50 ) );
		
		labNombreEstudiante = new JLabel(" Nombre del estudiante: ");
		labCodigoEstudiante = new JLabel(" Codigo del estudiante: ");
		labSemestreEstudiante = new JLabel(" Semestre: ");	
		labProgramaEstudiante = new JLabel("Programa academico:");
		
		txtNombre = new JTextField();
		txtNombre.setEditable(true);
		
		txtCodigo = new JTextField();
		txtCodigo.setEditable(true);
		
		txtSemestre = new JTextField();
		txtSemestre.setEditable(true);
		
		txtPrograma = new JTextField();
		txtPrograma.setEditable(true);

		
		panelInfo.add(labNombreEstudiante);
		panelInfo.add(txtNombre);
		panelInfo.add(labCodigoEstudiante);
		panelInfo.add(txtCodigo);
		panelInfo.add(labSemestreEstudiante);
		panelInfo.add(txtSemestre);
		panelInfo.add(labProgramaEstudiante);
		panelInfo.add(txtPrograma);
		
	
		add(panelInfo, BorderLayout.NORTH);
		
		//Panel de resultados
		JPanel panelResultados = new JPanel();
		TitledBorder borde1 = BorderFactory.createTitledBorder("Visualizacion previa");
		borde1.setTitleColor( Color.BLACK );
		panelResultados.setLayout(new BorderLayout());
		panelResultados.setBorder( borde1 );

		txtResultado = new JTextArea();
		txtResultado.setBackground(Color.WHITE);
		txtResultado.setEditable(false);
		scroll = new JScrollPane(txtResultado);
		
		panelResultados.add(scroll,BorderLayout.CENTER);
		
		add(panelResultados);
		
		//Panel de Navegación
		JPanel panelNavegacion= new JPanel();
				
		//Adiciona un marco con titulo
		TitledBorder borde2 = BorderFactory.createTitledBorder("Navegación");
		borde2.setTitleColor( Color.BLACK );
		panelNavegacion.setBorder( borde2 );
		
		//Establece las dimensiones del panel
		panelNavegacion.setPreferredSize( new Dimension( 0,90 ) );
		
		butAgregar = new JButton("Agregar");
		butAgregar.setActionCommand(AGREGAR);
		butAgregar.addActionListener(this);
		
		
		butConsultar = new JButton("Consultar");
		butConsultar.setActionCommand(CONSULTAR);
		butConsultar.addActionListener(this);

		panelNavegacion.add(butAgregar);
		panelNavegacion.add(butConsultar);

		add(panelNavegacion, BorderLayout.SOUTH);
	}

 
	
	public void actionPerformed(ActionEvent e) {
		
		if(AGREGAR.equals( e.getActionCommand( ) ))
		{
			principal.registrarPropuesta();
			
		}
		
		else if(CONSULTAR.equals( e.getActionCommand( ) ))
		{
			principal.consultarPropuesta();
		}
		
	}



	/**
	 * @return the txtNombre
	 */
	public String getTxtNombre() {
		return txtNombre.getText();
	}



	/**
	 * @return the txtCodigo
	 */
	public String getTxtCodigo() {
		return txtCodigo.getText();
	}



	/**
	 * @return the txtSemestre
	 */
	public String getTxtSemestre() {
		return txtSemestre.getText();
	}



	/**
	 * @return the txtPrograma
	 */
	public String getTxtPrograma() {
		return txtPrograma.getText();
	}



	/**
	 * @return the txtResultado
	 */
	public JTextArea getTxtResultado() {
		return txtResultado;
	}



	/**
	 * @param txtNombre the txtNombre to set
	 */
	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}



	/**
	 * @param txtCodigo the txtCodigo to set
	 */
	public void setTxtCodigo(JTextField txtCodigo) {
		this.txtCodigo = txtCodigo;
	}



	/**
	 * @param txtSemestre the txtSemestre to set
	 */
	public void setTxtSemestre(JTextField txtSemestre) {
		this.txtSemestre = txtSemestre;
	}



	/**
	 * @param txtPrograma the txtPrograma to set
	 */
	public void setTxtPrograma(JTextField txtPrograma) {
		this.txtPrograma = txtPrograma;
	}



	/**
	 * @param txtResultado the txtResultado to set
	 */
	public void setTxtResultado(JTextArea txtResultado) {
		this.txtResultado = txtResultado;
	}


	
}
