package Interfaz;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class InterfazImpuestosCarro extends JFrame{
	
	//private CalculadorImpuestos calculador;
	private PanelVehiculo panelVehiculo;
	private PanelDescuentos panelDescuentos;
	private PanelResultados panelResultados;
	
	public InterfazImpuestosCarro() throws Exception{
		//calculador = new CalculadorImpuestos();
		
		setTitle("Calculo impuestos");
		setSize(290,300);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		panelVehiculo = new PanelVehiculo();
		add(panelVehiculo, BorderLayout.NORTH);
		
		panelDescuentos = new PanelDescuentos();
		add(panelDescuentos, BorderLayout.CENTER);
		
		panelResultados = new PanelResultados();
		add(panelResultados, BorderLayout.SOUTH);
		
	}
	
	public void calcularPrecioVehiculo() {
		String unaMarca = panelVehiculo.getMarca();
		String unaLinea = panelVehiculo.getLinea();
		String unModelo = panelVehiculo.getModelo();
		
		//double precio = calculador.buscarAvaluoVehiculo(
			//	unaMarca, unaLinea, unModelo);
		
		//panelVehiculo.refrescarPrecio(precio);
		
	}
	
	public void CalcularImpuestos() {
		String unaMarca = panelVehiculo.getMarca();
		String unaLinea = panelVehiculo.getLinea();
		String unModelo = panelVehiculo.getModelo();
		
		boolean descProntoPago = panelDescuentos.hayDescuenoProntoPago();
		boolean descServicioPublico = panelDescuentos.hayDescuentoServicioPublico();
		boolean descTrasladoCuenta = panelDescuentos.hayDescuentoTrasladoCuenta();
		
		//double pago = calculador.calcularPago(unaMarca,unaLinea,unModelo,descProntoPago,
			//	descServicioPublico,descTrasladoCuenta);
		
		//panelResultados.refrescarPago(pago);
		
	}
	
	public static void main(String[] args) throws Exception{
		JFrame frame = new InterfazImpuestosCarro();
		frame.setVisible(true);
	}

}
