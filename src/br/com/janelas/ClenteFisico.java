package br.com.janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.poo.heranca.PessoaFisica;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClenteFisico extends JFrame {

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtEndereco;
	private JTextField txtCPF;
	private JTextField txtRG;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClenteFisico frame = new ClenteFisico();
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
	public ClenteFisico() {
		setTitle("ClienteFisico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(25, 30, 48, 14);
		contentPane.add(lblId);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(25, 55, 48, 14);
		contentPane.add(lblNome);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(25, 80, 48, 14);
		contentPane.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(25, 105, 48, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(25, 130, 48, 14);
		contentPane.add(lblEndereo);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(25, 155, 48, 14);
		contentPane.add(lblCpf);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(25, 180, 48, 14);
		contentPane.add(lblRg);
		
		txtID = new JTextField();
		txtID.setBounds(69, 27, 96, 20);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(69, 52, 303, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(69, 77, 303, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(79, 102, 293, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(83, 127, 289, 20);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(69, 152, 303, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		txtRG = new JTextField();
		txtRG.setBounds(69, 177, 303, 20);
		contentPane.add(txtRG);
		txtRG.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		
		final PessoaFisica pf = new PessoaFisica();
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pf.setId(Integer.parseInt(txtID.getText()));
				pf.setNome(txtNome.getText());
				pf.setEmail(txtEmail.getText());
				pf.setTelefone(txtTelefone.getText());
				pf.setEndereco(txtEndereco.getText());
				pf.setCpf(txtCPF.getText());
				pf.setRg(txtRG.getText());
				
				pf.cadastrar();
				
				JOptionPane.showMessageDialog(null, "Cadastrou!");
			}
		});
		btnCadastrar.setBounds(144, 208, 138, 23);
		contentPane.add(btnCadastrar);
	}
}
