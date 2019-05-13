package com.poo.publicacao;

import java.util.List;

import com.poo.interfaces.Acoes;

public class Jornal extends Publicacao implements Acoes {
	private String Caderno;

	public Jornal() {
	}

	public Jornal(String caderno) {
		Caderno = caderno;
	}

	public Jornal(String caderno, int id, String titulo, String editora, int paginas, List<Autor> autores) {
		this.Caderno = caderno;
		super.setId(id);
		super.setTitulo(titulo);
		super.setEditora(editora);
		super.setPaginas(paginas);
		super.setAutores(autores);
	}

	public String getCaderno() {
		return Caderno;
	}

	public void setCaderno(String caderno) {
		Caderno = caderno;
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
