package gui;

import java.awt.BorderLayout;
import java.math.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Font;

public class RecursosHumanos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecursosHumanos frame = new RecursosHumanos();
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
	public RecursosHumanos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(RecursosHumanos.class.getResource("/imagenes/RecursosHumanos.jpg")));
		setTitle("RECURSOS HUMANOS\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 287);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBienvenidoALa = new JLabel("Bienvenido a la ventana de Recursos Humanos \r\n");
		lblBienvenidoALa.setForeground(Color.BLUE);
		lblBienvenidoALa.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
		lblBienvenidoALa.setBounds(26, 11, 460, 19);
		contentPane.add(lblBienvenidoALa);
		
		JButton btnCalcularNomina = new JButton("CALCULAR NOMINA\r\n");
		btnCalcularNomina.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		btnCalcularNomina.setBounds(97, 59, 279, 47);
		btnCalcularNomina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ventanaNomina venN = new ventanaNomina();
				venN.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnCalcularNomina);
		
		JButton btnContratacin = new JButton("CONTRATACI\u00D3N");
		btnContratacin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "SE HAN CONTRATADO: "+(Math.round(Math.random()*100)+10)+" TRABAJADORES");
			}
		});
		btnContratacin.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		btnContratacin.setBounds(97, 146, 279, 47);
		contentPane.add(btnContratacin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(RecursosHumanos.class.getResource("/imagenes/RecursosHumanos.jpg")));
		lblNewLabel.setBounds(0, 0, 486, 248);
		contentPane.add(lblNewLabel);
	}
}
