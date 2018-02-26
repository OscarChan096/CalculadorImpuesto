package Interfaz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelVehiculo extends JPanel{
	
	private InterfazImpuestosCarro principal;
	
	private JTextField txtMarca;
	private JTextField txtLinea;
	private JTextField txtModelo;
	private JTextField txtValor;
	private JLabel labMarca;
	private JLabel labLinea;
	private JLabel labModelo;
	private JLabel labValor;
	
	public PanelVehiculo(/*InterfazImpuestosCarro v*/) {
		
		//principal = v;
		
		setLayout(new GridLayout(5,2));
		setPreferredSize(new Dimension(0,130));
		TitledBorder border = BorderFactory.createTitledBorder("Datos del Vehiculo");
		border.setTitleColor(Color.BLUE);
		setBorder(border);
		
		labMarca = new JLabel("Marca");
		labLinea = new JLabel("Linea");
		labModelo = new JLabel("Modelo");
		labValor = new JLabel("Valor");
		txtMarca = new JTextField();
		txtLinea = new JTextField();
		txtModelo = new JTextField();
		txtValor = new JTextField("$ 0");
		
		txtValor.setEditable(false);
		txtValor.setForeground(Color.BLUE);
		txtValor.setBackground(Color.WHITE);
		
		add(labMarca);
		add(txtMarca);
		add(labLinea);
		add(txtLinea);
		add(labModelo);
		add(txtModelo);
		add(labValor);
		add(txtValor);
		
	}
	
	public void refrescarPrecio(double precio) {
		DecimalFormat df = (DecimalFormat)NumberFormat.getInstance();
		df.applyPattern("$ ###,###.##");
		txtValor.setText(df.format(precio));
	}
	
	public String getMarca() {
		return txtMarca.getText();
	}
	
	public String getLinea() {
		return txtLinea.getText();
	}
	
	public String getModelo() {
		return txtModelo.getText();
	}

}
