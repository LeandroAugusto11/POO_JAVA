package com.poo.eventos;

import java.util.List;

import com.poo.interfaces.Acoes;

public class Show extends Eventos implements Acoes{
	private String genero;
	
	public Show() {
	}

	
	
	
	public Show(String genero) {
		this.genero = genero;
	}

	


	public Show(String genero, int id, String titulo, String lotacao, List<Endereco> endereco) {
		this.genero = genero;
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
