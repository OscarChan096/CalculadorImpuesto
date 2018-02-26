package Interfaz;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;

public class PanelDescuentos extends JPanel {
	
	private InterfazImpuestosCarro principal;
	
	private JCheckBox cbPPago;
	private JCheckBox cbSPublico;
	private JCheckBox cbTCuenta;
	
	public PanelDescuentos(/*InterfazImpuestosCarro v*/) {
		
		//principal = v;
		
		setLayout(new GridLayout(2,2));
		TitledBorder border = BorderFactory.createTitledBorder("Descuentos");
		border.setTitleColor(Color.BLUE);
		setBorder(border);
		
		cbPPago = new JCheckBox("Pronto pago");
		cbSPublico = new JCheckBox("Servicio publico");
		cbTCuenta = new JCheckBox("Traslado de cuenta");
		
		add(cbPPago);
		add(cbTCuenta);
		add(cbSPublico);
		
	}
	
	public boolean hayDescuenoProntoPago() {
		return true;
	}
	
	public boolean hayDescuentoServicioPublico() {
		return true;
	}
	
	public boolean hayDescuentoTrasladoCuenta(){
		return true;
	}

}
