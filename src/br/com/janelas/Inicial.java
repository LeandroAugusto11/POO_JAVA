package br.com.janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Inicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicial frame = new Inicial();
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
	public Inicial() {
		setTitle("Inicial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPessoaFsica = new JButton("Pessoa F\u00EDsica");
		btnPessoaFsica.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		btnPessoaFsica.setBackground(Color.DARK_GRAY);
		btnPessoaFsica.setToolTipText("");
		btnPessoaFsica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClenteFisico jpf = new ClenteFisico();
				jpf.setVisible(true);
						
			}
		});
		btnPessoaFsica.setBounds(10, 63, 414, 23);
		contentPane.add(btnPessoaFsica);
		
		JButton btnPessoaJuridica = new JButton("Pessoa Juridica");
		btnPessoaJuridica.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		btnPessoaJuridica.setBackground(Color.BLACK);
		btnPessoaJuridica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteJuridico jpf = new ClienteJuridico();
				jpf.setVisible(true);
						
			}
		});
		btnPessoaJuridica.setBounds(10, 146, 414, 23);
		contentPane.add(btnPessoaJuridica);
	}
}
