package com.estudo.ufsc.abstractclass;

public abstract class Instituicao {
	private String nome;
	private String endereco;
	
	public abstract String getNome();	
	public abstract void setNome();
	public abstract String getEndereco();
	public abstract void setEndereco();
}
