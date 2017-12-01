package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import FabricaAbstracta.AbstractFactory;
import FabricaAbstracta.FabricaWhirpool;
import cadenaResponsabilidad.Proceso;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;

public class AreaComercial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaComercial frame = new AreaComercial();
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
	public AreaComercial() {
		setTitle("\u00C1REA COMERCIAL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 417, 304);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSeleccioneLaMarca = new JLabel("Seleccione el proveedor\r\n");
		lblSeleccioneLaMarca.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblSeleccioneLaMarca.setBounds(10, 66, 199, 25);
		contentPane.add(lblSeleccioneLaMarca);
		
		JButton btnWhirlpool = new JButton("");
		btnWhirlpool.setIcon(new ImageIcon(AreaComercial.class.getResource("/imagenes/Whirlpool.png")));
		
		btnWhirlpool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					
					AbstractFactory AF = new AbstractFactory(1);
					AF.operacion();
					FamiliaWhirlpool famW = new FamiliaWhirlpool();
					famW.setVisible(true);
					dispose();
					}catch (Exception e1){
						JOptionPane.showMessageDialog(null,"El dato ingresado es incorrecto");
					}
			
			}
		});
		btnWhirlpool.setBounds(39, 102, 125, 120);
		contentPane.add(btnWhirlpool);
		
		JButton btnElectrolux = new JButton("");
		btnElectrolux.setVerticalAlignment(SwingConstants.BOTTOM);
		btnElectrolux.setIcon(new ImageIcon(AreaComercial.class.getResource("/imagenes/Electrolux.jpg")));
		btnElectrolux.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					
					AbstractFactory AF = new AbstractFactory(2);
					AF.operacion();
					FamiliaElectrolux famE = new FamiliaElectrolux();
					famE.setVisible(true);
					dispose();
					}catch (Exception e1){
						JOptionPane.showMessageDialog(null,"El dato ingresado es incorrecto");
					}
			
			}
		});
		btnElectrolux.setBounds(234, 102, 135, 120);
		contentPane.add(btnElectrolux);
		
		JLabel lblNewLabel = new JLabel("Bienvenido a la ventana del \u00C1rea Comercial ");
		lblNewLabel.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 21, 354, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblWhirlpool = new JLabel("Whirlpool");
		lblWhirlpool.setFont(new Font("Malgun Gothic", Font.BOLD, 13));
		lblWhirlpool.setBounds(68, 228, 77, 26);
		contentPane.add(lblWhirlpool);
		
		JLabel lblElectrolux = new JLabel("Electrolux\r\n");
		lblElectrolux.setFont(new Font("Malgun Gothic", Font.BOLD, 13));
		lblElectrolux.setBounds(252, 228, 77, 26);
		contentPane.add(lblElectrolux);
	}

}
