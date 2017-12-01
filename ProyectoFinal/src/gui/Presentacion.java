package gui;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cadenaResponsabilidad.Compra;
import cadenaResponsabilidad.Funciones;
import cadenaResponsabilidad.Nomina;
import cadenaResponsabilidad.Proceso;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class Presentacion extends JFrame {

	private JPanel contentPane;


	
	public Presentacion() {
		
	
		
		setTitle("APLICACI\u00D3N EMPRESARIAL");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Presentacion.class.getResource("/imagenes/imagenFondo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 473, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUnoF = new JLabel("Bienvenido al sistema de gesti\u00F3n de la empresa.\r\n");
		lblUnoF.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		lblUnoF.setForeground(Color.WHITE);
		lblUnoF.setBackground(new Color(240, 240, 240));
		lblUnoF.setBounds(10, 0, 443, 62);
		contentPane.add(lblUnoF);
		
		JLabel lblDosF = new JLabel("Por favor seleccione la funcion que desea realizar\r\n\r\n");
		lblDosF.setForeground(Color.WHITE);
		lblDosF.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		lblDosF.setBackground(SystemColor.menu);
		lblDosF.setBounds(10, 47, 443, 62);
		contentPane.add(lblDosF);
		
		//boton para realizar la seleccion
		JButton btnNomina = new JButton("Calcular Nomina, Contrataci\u00F3n\r\n");
		
		btnNomina.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
				
				Proceso p = new Proceso(1);
				p.operacion();
				dispose();
				}catch (Exception e1){
					JOptionPane.showMessageDialog(null,"El dato ingresado es incorrecto");
				}
			}

		});
		btnNomina.setFont(new Font("Segoe Print", Font.BOLD, 14));
		btnNomina.setBounds(42, 101, 356, 53);
		contentPane.add(btnNomina);
		
		//Seleccion Compras
		JButton btnRealizarCompras = new JButton("Contactar Proveedores\r\n");
		btnRealizarCompras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					
					Proceso p = new Proceso(2);
					p.operacion();
					dispose();
					
					}catch (Exception e1){
						JOptionPane.showMessageDialog(null,"El dato ingresado es incorrecto");
					}
			
			}
		});
		btnRealizarCompras.setFont(new Font("Segoe Print", Font.BOLD, 14));
		btnRealizarCompras.setBounds(42, 165, 356, 53);
		contentPane.add(btnRealizarCompras);
		
		
		//Boton para salir
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		btnSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(355, 234, 92, 31);
		contentPane.add(btnSalir);
		
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(Presentacion.class.getResource("/imagenes/imagenFondo.png")));
		lblFondo.setBounds(0, 0, 463, 284);
		contentPane.add(lblFondo);
	}
}
