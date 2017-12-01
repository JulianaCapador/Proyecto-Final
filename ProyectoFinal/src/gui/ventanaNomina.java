package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Strategy.Prestacion;
import Strategy.Termino;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class ventanaNomina extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaNomina frame = new ventanaNomina();
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
	public ventanaNomina() {
		setTitle("NOMINA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSeleccioneElTipo = new JLabel("SELECCIONE EL TIPO DE CONTRATO DEL TRABAJADOR");
		lblSeleccioneElTipo.setForeground(new Color(0, 0, 139));
		lblSeleccioneElTipo.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		lblSeleccioneElTipo.setBounds(10, 11, 456, 56);
		contentPane.add(lblSeleccioneElTipo);
		
		JButton btnPrestacion = new JButton("PRESTACI\u00D3N DE SERVICIOS");
		btnPrestacion.setFont(new Font("Malgun Gothic", Font.BOLD, 12));
		btnPrestacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prestacion pre = new Prestacion();
				try{
				pre.pedir();
				JOptionPane.showMessageDialog(null,"EL SALARIO ES DE : $ "+pre.calcular()+" MCTE"+" Y LAS COMISIONES: $ "+pre.getComisiones());
				}catch (Exception e1){
					JOptionPane.showMessageDialog(null,"El dato ingresado es incorrecto");
				}
			}
		});
		btnPrestacion.setBounds(133, 78, 194, 45);
		contentPane.add(btnPrestacion);
		
		JButton btnFijo = new JButton("T\u00C9RMINO INDEFINIDO");
		btnFijo.setFont(new Font("Malgun Gothic", Font.BOLD, 12));
		btnFijo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				Termino ter = new Termino();
				ter.pedir(); 	 	
				JOptionPane.showMessageDialog(null,"EL SUELDO TOTAL A PAGAR ES DE: $ "+ter.calcular()+" CON SUBSIDIO DE TRANSPORTE IGUAL A: $"+ter.getAuxiliotrans());
				}catch (Exception e1){
					JOptionPane.showMessageDialog(null,"El dato ingresado es incorrecto");
				}
			}
		});
		btnFijo.setBounds(133, 148, 194, 45);
		contentPane.add(btnFijo);
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.setFont(new Font("Malgun Gothic", Font.BOLD, 11));
		btnAnterior.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			
				RecursosHumanos RH = new RecursosHumanos();
				RH.setVisible(true);
				dispose();
			}
		});
		btnAnterior.setBounds(32, 257, 89, 23);
		contentPane.add(btnAnterior);
		
		JButton btnSalir = new JButton("Salir\r\n");
		btnSalir.setFont(new Font("Malgun Gothic", Font.BOLD, 12));
		btnSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(328, 257, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ventanaNomina.class.getResource("/imagenes/contrato.jpg")));
		lblNewLabel.setBounds(-84, -50, 560, 419);
		contentPane.add(lblNewLabel);
	}
}
