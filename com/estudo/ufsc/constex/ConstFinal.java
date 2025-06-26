package com.estudo.ufsc.constex;

public class ConstFinal {
	private final String cargo = "Gerente Geral";
	private String nome;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}	
	
	public String getCargo() {
		return cargo;
	}
}
