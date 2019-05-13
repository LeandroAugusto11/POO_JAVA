package com.poo.eventos;

import java.util.List;


public abstract class Eventos {
	
	private int id;
	private String titulo;
	private String lotacao;
	
	
	private List<Endereco> endereco;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getLotacao() {
		return lotacao;
	}


	public void setLotacao(String lotacao) {
		this.lotacao = lotacao;
	}


	public List<Endereco> getEndereco() {
		return endereco;
	}


	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
	
	
	
	
}
