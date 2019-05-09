package br.com.exemplo.basico;

import com.construtores.Cliente;

public class GerenciarCliente {

	public static void main(String[] args) {
		
		
		//Instância da classe Cliente
		
		
		Cliente cl2 = new Cliente();
		
		cl2.setId(10);
		cl2.SetNome("Bruno");
		cl2.SetEmail("bruno@terra.com.br");
		
		System.out.println(cl2.nomePorId(10));
	}

}
