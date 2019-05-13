package com.poo.eventos;

public class Endereco {
	private String Rua;
	private String Bairro;
	private String Numero;
	public Endereco() {
	}
	public Endereco(String rua, String bairro, String numero) {
		Rua = rua;
		Bairro = bairro;
		Numero = numero;
	}
	public String getRua() {
		return Rua;
	}
	public void setRua(String rua) {
		Rua = rua;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	public String getNumero() {
		return Numero;
	}
	public void setNumero(String numero) {
		Numero = numero;
	}
	
	

}
