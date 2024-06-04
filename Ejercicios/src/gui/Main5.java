/*Balon*/
package gui;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import clases.Balon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main5 extends JFrame implements ActionListener{

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
					Main5 frame = new Main5();
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
	public Main5() {
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
	protected void actionPerformedBtnProcesar (ActionEvent e) {
		Balon b = new Balon("Adibas", 1.4, 4.7, 17.5, 150);
		textArea.setText("Marca: " + b.getMarca() + "\n");
		textArea.append("Peso: " + b.getPeso() + "\n");
		textArea.append("Presion: " + b.getPresion() + "\n");
		textArea.append("Diametro: " + b.getDiametro() + "\n");
		textArea.append("Precio: " + b.getPrecio() + "\n");
		textArea.append("Radio: " + b.calcularRadio() + "\n");
		textArea.append("Volumen: " + b.calcularVolumen() + "\n");
		textArea.append("Descuento: " + b.calcularDescuento() + "\n");
		textArea.append("Importe Pagar: " + b.calcularImpPagar() + "\n\n\n");
		
		Balon b1 = new Balon("Puma", 1.7, 4.9);
		textArea.append("Marca: " + b1.getMarca() + "\n");
		textArea.append("Peso: " + b1.getPeso() + "\n");
		textArea.append("Presion: " + b1.getPresion() + "\n");
		textArea.append("Diametro: " + b1.getDiametro() + "\n");
		textArea.append("Precio: " + b.getPrecio() + "\n");
		textArea.append("Radio: " + b1.calcularRadio() + "\n");
		textArea.append("Volumen: " + b1.calcularVolumen() + "\n");
		textArea.append("Descuento: " + b1.calcularDescuento() + "\n");
		textArea.append("Importe Pagar: " + b1.calcularImpPagar() + "\n\n\n");
		
		Balon b2 = new Balon();
		textArea.append("Marca: " + b2.getMarca() + "\n");
		textArea.append("Peso: " + b2.getPeso() + "\n");
		textArea.append("Presion: " + b2.getPresion() + "\n");
		textArea.append("Diametro: " + b2.getDiametro() + "\n");
		textArea.append("Precio: " + b2.getPrecio() + "\n");
		textArea.append("Radio: " + b2.calcularRadio() + "\n");
		textArea.append("Volumen: " + b2.calcularVolumen() + "\n");
		textArea.append("Descuento: " + b2.calcularDescuento() + "\n");
		textArea.append("Importe Pagar: " + b2.calcularImpPagar() + "\n\n\n");
		
		
		textArea.append("PI: " + Balon.PI + "\n");
		textArea.append("Descuento: " + Balon.DESCUENTO + "\n");
		textArea.append("Cantidad obj: " + Balon.getCantidadObj() + "\n");
		textArea.append("Suma importes " + Balon.getImportes() + "\n");
		
	}

}
