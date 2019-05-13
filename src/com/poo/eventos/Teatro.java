package com.poo.eventos;

import java.util.List;

import com.poo.interfaces.Acoes;

public class Teatro extends Eventos implements Acoes {
	private String categoria;

	public Teatro() {
	}

	public Teatro(String categoria) {
		this.categoria = categoria;
	}

	public Teatro(String categoria, int id, String titulo, String lotacao, List<Endereco> endereco) {
		this.categoria = categoria;
		super.setId(id);
		super.setTitulo(titulo);
		super.setLotacao(lotacao);
		super.setEndereco(endereco);
		
	}

	public String cadastrar() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> pesquisar(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
