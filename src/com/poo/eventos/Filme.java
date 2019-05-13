package com.poo.eventos;

import java.util.List;

import com.poo.interfaces.Acoes;
import com.poo.publicacao.Autor;

public class Filme extends Eventos implements Acoes{
	private String sessao;
	
	
	
	public Filme() {
	}
	
	

	public Filme(String sessao) {
		this.sessao = sessao;
	}

	

	public Filme(String sessao, int id, String titulo, String lotacao, List<Endereco> endereco) {
		this.sessao = sessao;
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
