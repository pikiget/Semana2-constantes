/*Factura*/
package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import clases.Factura;

public class Main1 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnProcesar;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main1 frame = new Main1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 56, 414, 194);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(174, 22, 89, 23);
		contentPane.add(btnProcesar);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		Factura f = new Factura("222222222222222","Petito SAC", 3, 9.8);
		textArea.setText("Ruc: " + f.getRuc() + "\n");
		textArea.append("Nombre: " + f.getEmpresa() + "\n");
		textArea.append("Unidades: " + f.getUnidades() + "\n");
		textArea.append("Precio Unitario: " + f.getPrecioUnitario() + "\n\n");
		
		Factura f2 = new Factura("3333333333","Charito's S.A.");
		textArea.append("Ruc: " + f2.getRuc() + "\n");
		textArea.append("Empresa: " + f2.getEmpresa() + "\n");
		textArea.append("Unidades: " + f2.getUnidades() + "\n");
		textArea.append("Precio Unitario: " + f2.getPrecioUnitario() + "\n\n");
		
		Factura f3 = new Factura();
		textArea.append("Ruc: " + f3.getRuc() + "\n");
		textArea.append("Empresa: " + f3.getEmpresa() + "\n");
		textArea.append("Unidades: " + f3.getUnidades() + "\n");
		textArea.append("Precio Unitario: " + f3.getPrecioUnitario() + "\n\n");
		
		textArea.append("Cantidad de tipos Factura creados: " + Factura.getCantidadFactura() + "\n");
		textArea.append("Suma de importes Facturados: " + Factura.getImportesFacturados());
	}
}
