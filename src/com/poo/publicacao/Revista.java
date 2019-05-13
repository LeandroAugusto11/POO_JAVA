package com.poo.publicacao;

import java.util.List;

import com.poo.interfaces.Acoes;

public class Revista extends Publicacao implements Acoes {
	
	private String edicao;

	public Revista() {
	}

	public Revista(String edicao) {
		this.edicao = edicao;
	}

	public Revista(String edicao,int id, String titulo, String editora, int paginas, List<Autor> autores) {
		this.edicao = edicao;
		super.setId(id);
		super.setTitulo(titulo);
		super.setEditora(editora);
		super.setPaginas(paginas);
		super.setAutores(autores);
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
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
