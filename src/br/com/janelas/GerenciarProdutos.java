package br.com.janelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.loja.Categoria;
import com.loja.Fornecedor;
import com.loja.Produto;

public class GerenciarProdutos extends JFrame{
	
	//Elementos para a categotia 
	static JLabel lblIdCat = new JLabel("Id Categoria:");
	static JLabel lblNomeCat = new JLabel("Nome Categoria");
	static JLabel lblDescCat = new JLabel("Descri��o:");
	
	static JTextField txtIdCat = new JTextField();
	static JTextField txtNomeCat = new JTextField();
	static JTextField txtDescCat = new JTextField();
			
	static JButton btnCadCat = new JButton("Cadastrar Categoria");
	
	//Elementos para o fornecedor 
	static JLabel lblIdFor = new JLabel("Id Fornecedor:");
	static JLabel lblRS = new JLabel("Raz�o Social:");
	static JLabel lblCnpj = new JLabel("CNPJ:");
	
	static JTextField txtIdfor = new JTextField();
	static JTextField txtRS = new JTextField();
	static JTextField txtCnpj = new JTextField();
	
	static JButton btnCadFor = new JButton("Cadastrar Fornecedor");
	
	//Elementos para produtos
	static JLabel lblIdPr = new JLabel("Id Produto:");
	static JLabel lblNomePr = new JLabel("Nome do Produto:");
	static JLabel lblDescPr = new JLabel("Descri��o Produto:");
	static JLabel lblCategoria = new JLabel("Selecione uma Categoria:");
	static JLabel lblFornecedor = new JLabel("Selecione um Fornecedor:");
	static JLabel lblPrecoPr = new JLabel("Pre�o do Produto:");
	
	static JTextField txtIdPr = new JTextField();
	static JTextField txtNomePr = new  JTextField();
	static JTextField txtDescPr = new  JTextField();
	static JTextField txtCategoria = new  JTextField();
	static JTextField txtFornecedor = new  JTextField();
	static JTextField txtPrecoPr = new  JTextField();
	
	static JButton btnCadPr =  new JButton("Cadastrar Produto");
	
	
	

	public static void main(String[] args) {
		JFrame gerenciar = new JFrame();
		gerenciar.setTitle("Gerenciar Produtos");
		gerenciar.setSize(700,800);
		gerenciar.setLocationRelativeTo(null);
		gerenciar.setDefaultCloseOperation(EXIT_ON_CLOSE);
		gerenciar.setResizable(false);//Deixa a janela sempre do mesmo tamanho 
		//e n�o permite o redimensionamento dela.
		
		//Definir o gerenciamento do layout como absoluto, ou seja, nulo
		gerenciar.getContentPane().setLayout(null);
		
		lblIdCat.setBounds(10, 10, 150, 30);
		gerenciar.add(lblIdCat);
		
		txtIdCat.setBounds(10, 45, 100, 30);
		gerenciar.add(txtIdCat);
		
		lblNomeCat.setBounds(10, 75, 200, 30);
		gerenciar.add(lblNomeCat);
		
		txtNomeCat.setBounds(10, 110, 200, 30);
		gerenciar.add(txtNomeCat);
		
		lblDescCat.setBounds(10, 145, 200, 30);
		gerenciar.add(lblDescCat);
		
		txtDescCat.setBounds(10, 175, 200, 30);
		gerenciar.add(txtDescCat);
		
		btnCadCat.setBounds(10, 210, 200, 30);
		gerenciar.add(btnCadCat);
		
		gerenciar.setVisible(true);
		
		
		
		lblIdFor.setBounds(10, 250, 150, 30);
		gerenciar.add(lblIdFor);
		
		txtIdfor.setBounds(10, 280, 100, 30);
		gerenciar.add(txtIdfor);
		
		lblRS.setBounds(10, 310, 150, 30);
		gerenciar.add(lblRS);
		
		txtRS.setBounds(10, 340, 200, 30);
		gerenciar.add(txtRS);
		
		lblCnpj.setBounds(10, 370, 150, 30);
		gerenciar.add(lblCnpj);
		
		txtCnpj.setBounds(10, 400, 200, 30);
		gerenciar.add(txtCnpj);
		
		btnCadFor.setBounds(10, 440, 200, 30);
		gerenciar.add(btnCadFor);
		
		gerenciar.setVisible(true);
		
		
		
		
		lblIdPr.setBounds(250, 10, 100, 30);
		gerenciar.add(lblIdPr);
		
		txtIdPr.setBounds(250, 40, 100, 30);
		gerenciar.add(txtIdPr);
		
		lblNomePr.setBounds(250, 70, 150, 30);
		gerenciar.add(lblNomePr);
		
		txtNomePr.setBounds(250, 100, 380, 30);
		gerenciar.add(txtNomePr);
		
		lblDescPr.setBounds(250, 130, 150, 30);
		gerenciar.add(lblDescPr);
		
		txtDescPr.setBounds(250, 160, 380, 100);
		gerenciar.add(txtDescPr);
		
		lblCategoria.setBounds(250, 190, 150, 30);
		gerenciar.add(lblCategoria);
		
		txtCategoria.setBounds(250, 220, 380, 30);
		gerenciar.add(txtCategoria);
		
		lblFornecedor.setBounds(250, 250, 150, 30);
		gerenciar.add(lblFornecedor);
		
		txtFornecedor.setBounds(250, 280, 380, 30);
		gerenciar.add(txtFornecedor);
		
		lblPrecoPr.setBounds(250, 310, 150, 30);
		gerenciar.add(lblPrecoPr);
		
		txtPrecoPr.setBounds(250, 340, 380, 30);
		gerenciar.add(txtPrecoPr);
		
		btnCadPr.setBounds(250, 380, 150, 30);
		gerenciar.add(btnCadPr);
		
		
		//############### desabilitar os controles textfield do
		//############### fornecedor e produto
		//###############
		
		txtIdfor.setEnabled(false);
		txtRS.setEditable(false);
		txtCnpj.setEnabled(false);
		btnCadFor.setEnabled(false);
		
		
		txtIdPr.setEnabled(false);
		txtNomePr.setEnabled(false);
		txtDescPr.setEnabled(false);
		txtFornecedor.setEnabled(false);
		txtCategoria.setEnabled(false);
		txtPrecoPr.setEnabled(false);
		btnCadPr.setEnabled(false);
		
		
		//-------- Vamos criar o objeto e
		//-------- Passar os dados do formul�rio para
		//-------- o objeto criado
		final Categoria cat = new Categoria();
		
		//--- vamos fazer a passagem dos dados para o objeto
		//--- no momento em que clicarmos no bot�o de cadastro
		btnCadCat.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				cat.setId(Integer.parseInt(txtIdCat.getText()));
				cat.setNome(txtNomeCat.getText());
				cat.setDescricao(txtDescCat.getText());
				
				
				//----desabilitar as caixas da categoria;
				txtIdCat.setEnabled(false);
				txtNomeCat.setEnabled(false);
				txtDescCat.setEnabled(false);
				btnCadCat.setEnabled(false);
				//-----habilitar as caixas do fornecedor
				txtIdfor.setEnabled(true);
				txtRS.setEditable(true);
				txtCnpj.setEnabled(true);
				btnCadFor.setEnabled(true);
			}
		});
		
		
		//--- Vamos instanciar a classe fornecedor e passar
		//--- os dados para o objeto no momento  em que
		//--- o bot�o de cadastrar for clicado
		final Fornecedor f = new Fornecedor();
		
		btnCadFor.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				f.setId(Integer.parseInt(txtIdfor.getText()));
				f.setRazaoSocial(txtRS.getText());
				f.setCnpj(txtCnpj.getText());
			
		
			//-----desabilitar as caixas do fornecedor
			txtIdfor.setEnabled(false);
			txtRS.setEditable(false);
			txtCnpj.setEnabled(false);
			btnCadFor.setEnabled(false);
			
			
			//---habilitar os controles produto
			txtIdPr.setEnabled(true);
			txtNomePr.setEnabled(true);
			txtDescPr.setEnabled(true);
			txtFornecedor.setEnabled(true);
			txtCategoria.setEnabled(true);
			txtPrecoPr.setEnabled(true);
			btnCadPr.setEnabled(true);
		}
	});
		
		
		//---- Vamos criar um objeto baseado em
		//---- produtos para passar os dados no momento do clique
		//---- bot�o cadastro
		final Produto pr = new Produto();
		btnCadPr.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				pr.setId(Integer.parseInt(txtIdPr.getText()));
				pr.setNome(txtNomePr.getText());
				pr.setDescricao(txtDescPr.getText());
				pr.setCategoria(cat);
				pr.setFornecedor(f);
				pr.setPreco(Double.parseDouble(txtPrecoPr.getText()));
				
				
				
				//---Desabilitar os controles produto
				txtIdPr.setEnabled(false);
				txtNomePr.setEnabled(false);
				txtDescPr.setEnabled(false);
				txtFornecedor.setEnabled(false);
				txtCategoria.setEnabled(false);
				txtPrecoPr.setEnabled(false);
				btnCadPr.setEnabled(false);
				//----Caixa de Confirma��o
				JOptionPane.showMessageDialog(null, "Produto Cadastrado Com Sucesso");
				
				
				//----Habilitar as caixas da categoria;
				txtIdCat.setEnabled(true);
				txtNomeCat.setEnabled(true);
				txtDescCat.setEnabled(true);
				btnCadCat.setEnabled(true);
			}
		});
		
		
		gerenciar.setVisible(true);
		
		

		
	}

}
