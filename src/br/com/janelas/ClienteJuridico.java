package br.com.janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.poo.heranca.PessoaJuridica;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClienteJuridico extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldID;
	private JTextField textFieldRazaoSocial;
	private JTextField textFieldNomeFantasia;
	private JTextField textFieldCNPJ;
	private JTextField textFieldEmail;
	private JTextField textFieldTelefone;
	private JTextField textFieldEndereco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteJuridico frame = new ClienteJuridico();
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
	public ClienteJuridico() {
		setTitle("ClienteJuridico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(5, 5, 27, 14);
		contentPane.add(lblId);
		
		JLabel lblRazoSocial = new JLabel("Raz\u00E3o Social:");
		lblRazoSocial.setBounds(5, 30, 66, 14);
		lblRazoSocial.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lblRazoSocial);
		
		JLabel lblNomeFantasia = new JLabel("Nome Fantasia:");
		lblNomeFantasia.setBounds(5, 55, 77, 14);
		contentPane.add(lblNomeFantasia);
		
		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setBounds(5, 88, 48, 14);
		contentPane.add(lblCnpj);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(5, 120, 48, 14);
		contentPane.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(5, 157, 59, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(5, 192, 66, 14);
		contentPane.add(lblEndereo);
		
		textFieldID = new JTextField();
		textFieldID.setBounds(31, 2, 96, 20);
		contentPane.add(textFieldID);
		textFieldID.setColumns(10);
		
		textFieldRazaoSocial = new JTextField();
		textFieldRazaoSocial.setBounds(82, 30, 342, 20);
		contentPane.add(textFieldRazaoSocial);
		textFieldRazaoSocial.setColumns(10);
		
		textFieldNomeFantasia = new JTextField();
		textFieldNomeFantasia.setBounds(82, 55, 342, 20);
		contentPane.add(textFieldNomeFantasia);
		textFieldNomeFantasia.setColumns(10);
		
		textFieldCNPJ = new JTextField();
		textFieldCNPJ.setBounds(68, 85, 356, 20);
		contentPane.add(textFieldCNPJ);
		textFieldCNPJ.setColumns(10);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(68, 117, 356, 20);
		contentPane.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		textFieldTelefone = new JTextField();
		textFieldTelefone.setBounds(68, 154, 356, 20);
		contentPane.add(textFieldTelefone);
		textFieldTelefone.setColumns(10);
		
		textFieldEndereco = new JTextField();
		textFieldEndereco.setBounds(68, 189, 356, 20);
		contentPane.add(textFieldEndereco);
		textFieldEndereco.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		
		final PessoaJuridica pj = new PessoaJuridica();
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pj.cadastrar();
			}
		});
		btnCadastrar.setBounds(183, 227, 130, 23);
		contentPane.add(btnCadastrar);
	}

}
