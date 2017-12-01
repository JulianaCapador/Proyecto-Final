package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class FamiliaWhirlpool extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FamiliaWhirlpool frame = new FamiliaWhirlpool();
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
	public FamiliaWhirlpool() {
		setTitle("Familia Whirlpool");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon(FamiliaWhirlpool.class.getResource("/imagenes/wLavadora.jpg")));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(10, 11, 200, 200);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\r\n");
		lblNewLabel_1.setIcon(new ImageIcon(FamiliaWhirlpool.class.getResource("/imagenes/wMicroondas.png")));
		lblNewLabel_1.setBounds(222, 11, 200, 200);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\r\n");
		lblNewLabel_2.setIcon(new ImageIcon(FamiliaWhirlpool.class.getResource("/imagenes/wNevera.jpg")));
		lblNewLabel_2.setBounds(443, 11, 200, 200);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CAT\u00C1LOGO WHIRLPOOL\r\n");
		lblNewLabel_3.setFont(new Font("Malgun Gothic", Font.BOLD, 30));
		lblNewLabel_3.setBounds(168, 247, 379, 36);
		contentPane.add(lblNewLabel_3);
		
		JButton buttonS = new JButton("");
		buttonS.setIcon(new ImageIcon(FamiliaWhirlpool.class.getResource("/imagenes/salir.jpeg")));
		buttonS.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		buttonS.setBounds(608, 244, 30, 50);
		contentPane.add(buttonS);
	}

}
