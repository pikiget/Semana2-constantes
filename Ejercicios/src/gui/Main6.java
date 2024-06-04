package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Consultor;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Main6 extends JFrame implements ActionListener{

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
					Main6 frame = new Main6();
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
	public Main6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(228, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 56, 539, 352);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar (ActionEvent e) {
		Consultor c1 = new Consultor(111, "Maycol", 20, 2);
		Consultor c2 = new Consultor(222, "El pepe", 8);
		Consultor c3 = new Consultor();
		
		textArea.setText("Codigo: " + c1.getCodigo() + "\n");
		textArea.append("Nombre: " + c1.getNombre() + "\n");
		textArea.append("Horas: " + c1.getHoras() + "\n");
		textArea.append("Tarifa: " + c1.getTarifa() + "\n");
		textArea.append("Sueldo Bruto: " + c1.sueldoBruto() + "\n");
		textArea.append("Descuento AFP: " + c1.descuentoAfp() + "\n");
		textArea.append("Descuento EPS: " + c1.descuentoEps() + "\n");
		textArea.append("Sueldo Neto: " + c1.sueldoNeto() + "\n\n");
		
		textArea.append("Codigo: " + c2.getCodigo() + "\n");
		textArea.append("Nombre: " + c2.getNombre() + "\n");
		textArea.append("Horas: " + c2.getHoras() + "\n");
		textArea.append("Tarifa: " + c2.getTarifa() + "\n");
		textArea.append("Sueldo Bruto: " + c2.sueldoBruto() + "\n");
		textArea.append("Descuento AFP: " + c2.descuentoAfp() + "\n");
		textArea.append("Descuento EPS: " + c2.descuentoEps() + "\n");
		textArea.append("Sueldo Neto: " + c2.sueldoNeto() + "\n\n");
		
		textArea.append("Codigo: " + c3.getCodigo() + "\n");
		textArea.append("Nombre: " + c3.getNombre() + "\n");
		textArea.append("Horas: " + c3.getHoras() + "\n");
		textArea.append("Tarifa: " + c3.getTarifa() + "\n");
		textArea.append("Sueldo Bruto: " + c3.sueldoBruto() + "\n");
		textArea.append("Descuento AFP: " + c3.descuentoAfp() + "\n");
		textArea.append("Descuento EPS: " + c3.descuentoEps() + "\n");
		textArea.append("Sueldo Neto: " + c3.sueldoNeto() + "\n\n");
		
		textArea.append("AFP: " + Consultor.AFP + "\n");
		textArea.append("EPS: " + Consultor.EPS + "\n");
		textArea.append("Cantidad: " + Consultor.getCantidad() + "\n");

		
	}
}
