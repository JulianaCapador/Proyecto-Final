package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FamiliaElectrolux extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FamiliaElectrolux frame = new FamiliaElectrolux();
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
	public FamiliaElectrolux() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FamiliaElectrolux.class.getResource("/imagenes/Electrolux.jpg")));
		setTitle("Familia Electrolux\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(FamiliaElectrolux.class.getResource("/imagenes/LElectrolux.jpg")));
		lblNewLabel.setBounds(10, 11, 200, 200);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(FamiliaElectrolux.class.getResource("/imagenes/mElectrolux.jpg")));
		label.setBounds(220, 11, 200, 200);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(FamiliaElectrolux.class.getResource("/imagenes/nElectrolux.jpg")));
		label_1.setBounds(443, 11, 200, 200);
		contentPane.add(label_1);
		
		JLabel lblCatlogoElectrolux = new JLabel("CAT\u00C1LOGO ELECTROLUX");
		lblCatlogoElectrolux.setFont(new Font("Malgun Gothic", Font.BOLD, 30));
		lblCatlogoElectrolux.setBounds(168, 247, 379, 36);
		contentPane.add(lblCatlogoElectrolux);
		
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
