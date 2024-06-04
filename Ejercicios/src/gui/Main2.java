/*Empleado*/
package gui;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import clases.Empleado;

public class Main2 extends JFrame implements ActionListener{

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
					Main2 frame = new Main2();
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
	public Main2() {
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
		Empleado empleado1 = new Empleado(1111, "Roy", 0, 970659919);
		textArea.setText("Codigo: " + empleado1.getCodigo() + "\n");
		textArea.append("Nombre: " + empleado1.getNombre() + "\n");
		textArea.append("Categoria: " + empleado1.getCategoria() + "\n");
		textArea.append("Celular: " + empleado1.getCelular() + "\n");
		textArea.append("Sueldo Bruto: " + empleado1.sueldoBruto() + "\n");
		textArea.append("Descuento: " + empleado1.descuento() + "\n");
		textArea.append("Sueldo Neto: " + empleado1.sueldoNeto() + "\n\n\n");
		
		Empleado empleado2 = new Empleado(2222, "Pool");
		textArea.append("Codigo: " + empleado2.getCodigo() + "\n");
		textArea.append("Nombre: " + empleado2.getNombre() + "\n");
		textArea.append("Categoria: " + empleado2.getCategoria() + "\n");
		textArea.append("Celular: " + empleado2.getCelular() + "\n");
		textArea.append("Sueldo Bruto: " + empleado2.sueldoBruto() + "\n");
		textArea.append("Descuento: " + empleado2.descuento() + "\n");
		textArea.append("Sueldo Neto: " + empleado2.sueldoNeto() + "\n\n\n");
		
		Empleado empleado3 = new Empleado();
		textArea.append("Codigo: " + empleado3.getCodigo() + "\n");
		textArea.append("Nombre: " + empleado3.getNombre() + "\n");
		textArea.append("Categoria: " + empleado3.getCategoria() + "\n");
		textArea.append("Celular: " + empleado3.getCelular() + "\n");
		textArea.append("Sueldo Bruto: " + empleado3.sueldoBruto() + "\n");
		textArea.append("Descuento: " + empleado3.descuento() + "\n");
		textArea.append("Sueldo Neto: " + empleado3.sueldoNeto() + "\n\n\n");
		
		textArea.append("Descuento aplicado: " + Empleado.descuentoTodos + "\n");
		textArea.append("Cantidad de Empleados creados: " + Empleado.getCantidadEmpleados() + "\n");
		textArea.append("Sueldos Netos Total: " + Empleado.getSueldosNetosEmpleados() + "\n");
		
		
	}

}
