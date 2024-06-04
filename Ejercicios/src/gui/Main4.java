/*Asesor*/
package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import clases.Asesor;


public class Main4 extends JFrame implements ActionListener{

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
					Main4 frame = new Main4();
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
	public Main4() {
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
		Asesor a = new Asesor("Pepito el Calvito", 77777777, 11111, 3000.0);
		textArea.setText("Nombre: " + a.getNombre() + "\n");
		textArea.append("DNI: " + a.getDni() + "\n");
		textArea.append("Codigo: " + a.getCodigo() + "\n");
		textArea.append("Remuneracion: " + a.getRemuneracion() + "\n");
		textArea.append("Nombre institucion: " + Asesor.NAME + "\n\n");
		
		Asesor a1 = new Asesor("Emerson Melgar", 66666666);
		textArea.append("Nombre: " + a1.getNombre() + "\n");
		textArea.append("DNI: " + a1.getDni() + "\n");
		textArea.append("Codigo: " + a1.getCodigo() + "\n");
		textArea.append("Remuneracion: " + a1.getRemuneracion() + "\n");
		textArea.append("Nombre institucion: " + Asesor.NAME + "\n\n");
		
		Asesor a2 = new Asesor();
		textArea.append("Nombre: " + a2.getNombre() + "\n");
		textArea.append("DNI: " + a2.getDni() + "\n");
		textArea.append("Codigo: " + a2.getCodigo() + "\n");
		textArea.append("Remuneracion: " + a2.getRemuneracion() + "\n");
		textArea.append("Nombre institucion: " + Asesor.NAME + "\n\n\n");
		
		textArea.append("Objetos Creados: " + Asesor.getCantidadObj() + "\n");
		textArea.append("Suma de Remuneraciones: " + Asesor.getSumRemune() + "\n");
		
	}

}
