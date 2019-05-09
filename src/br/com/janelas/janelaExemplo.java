package br.com.janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class janelaExemplo extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janelaExemplo frame = new janelaExemplo();
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
	public janelaExemplo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdDoCliente = new JLabel("Id do Cliente:");
		lblIdDoCliente.setFont(new Font("TypewriterScribbled", Font.PLAIN, 11));
		lblIdDoCliente.setBounds(0, 11, 102, 14);
		contentPane.add(lblIdDoCliente);
		
		txtIdCliente = new JTextField();
		txtIdCliente.setBounds(112, 8, 96, 20);
		contentPane.add(txtIdCliente);
		txtIdCliente.setColumns(10);
		
		JButton btnAcessar = new JButton("Acessar");
		btnAcessar.setBounds(255, 7, 89, 23);
		contentPane.add(btnAcessar);
	}
}
