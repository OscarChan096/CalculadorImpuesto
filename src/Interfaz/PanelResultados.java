package Interfaz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel implements ActionListener{
	
	private InterfazImpuestosCarro principal;
	
	private JLabel labTotal;
	private JTextField txtTotal;
	private JButton butLimpiar;
	private JButton butCalcular;
	
	public final static String LIMPIAR = "limpiar";
	public final static String CALCULAR = "calcular";
	
	public PanelResultados(/*InterfazImpuestosCarro v*/) {
		
		//principal = v;
		
		setLayout(new GridLayout(2,3));
		setPreferredSize(new Dimension(0,65));
		TitledBorder border = BorderFactory.createTitledBorder("Resultados");
		border.setTitleColor(Color.BLUE);
		setBorder(border);
		
		labTotal = new JLabel("Total a pagar");
		txtTotal = new JTextField("$ 0");
		
		butLimpiar = new JButton("Limpiar");
		butLimpiar.setActionCommand(LIMPIAR);
		butLimpiar.addActionListener(this);
		
		butCalcular = new JButton("Calcular");
		butCalcular.setActionCommand(CALCULAR);
		butCalcular.addActionListener(this);
		
		add(new JLabel(""));
		add(new JLabel(""));
		add(butLimpiar);
		add(labTotal);
		add(txtTotal);
		add(butCalcular);
		
	}
	
	public void refrescarPrecio(double precio) {
		DecimalFormat df = (DecimalFormat)NumberFormat.getInstance();
		df.applyPattern("$ ###,###.##");
		txtTotal.setText(df.format(precio));
	}
	
	public void actionPerformed(ActionEvent evento) {
		String comando = evento.getActionCommand();
		if(comando.equals(LIMPIAR)) {
			
		}else if(comando.equals(CALCULAR)) {
			
		}
	}

} // end class
