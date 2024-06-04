/*Movil*/
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

import clases.Movil;

public class Main3 extends JFrame implements ActionListener{

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
					Main3 frame = new Main3();
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
	public Main3() {
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
		Movil m1 = new Movil(971659919, "Juan Jose", 50, 2);
		textArea.setText("Num Celular: " + m1.getNumMovil() + "\n");
		textArea.append("Nombre: " + m1.getNombre() + "\n");
		textArea.append("Seg consumido: " + m1.getSegConsumidos() + "\n");
		textArea.append("Precio x seg: " + m1.getPrecioSeg() + "\n");
		textArea.append("Costo por Consumo: " + m1.costoConsumo() + "\n");
		textArea.append("Impuesto IGV: " + m1.impuestoIgv() + "\n");
		textArea.append("Importe a Pagar: " + m1.importePagar() + "\n\n");
		
		Movil m2 = new Movil(977465679, "Anatulia");
		textArea.append("Num Celular: " + m2.getNumMovil() + "\n");
		textArea.append("Nombre: " + m2.getNombre() + "\n");
		textArea.append("Seg consumido: " + m2.getSegConsumidos() + "\n");
		textArea.append("Precio x seg: " + m2.getPrecioSeg() + "\n");
		textArea.append("Costo por Consumo: " + m2.costoConsumo() + "\n");
		textArea.append("Impuesto IGV: " + m2.impuestoIgv() + "\n");
		textArea.append("Importe a Pagar: " + m2.importePagar() + "\n\n");
		
		
		Movil m3 = new Movil();
		textArea.append("Num Celular: " + m3.getNumMovil() + "\n");
		textArea.append("Nombre: " + m3.getNombre() + "\n");
		textArea.append("Seg consumido: " + m3.getSegConsumidos() + "\n");
		textArea.append("Precio x seg: " + m3.getPrecioSeg() + "\n");
		textArea.append("Costo por Consumo: " + m3.costoConsumo() + "\n");
		textArea.append("Impuesto IGV: " + m3.impuestoIgv() + "\n");
		textArea.append("Importe a Pagar: " + m3.importePagar() + "\n\n\n");
		
		textArea.append("Cantidad de obj: " + Movil.getCantidadObj() + "\n");
		textArea.append("Suma Importes a Pagar: " + Movil.getImportesApagar() + "\n");
		textArea.append("IGV aplicado: " + Movil.IGV + "\n");
	}
}
