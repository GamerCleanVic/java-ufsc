package com.estudo.ufsc.abstractclass;

public class Universidade extends Instituicao{
	Instituicao ins = new Universidade();
	
	private String nome;
	private String endereco;
	
	@Override
	public String getNome() {
		return nome;
	}	
	@Override
	public String getEndereco() {
		return endereco;
	}
	@Override
	public void setNome() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setEndereco() {
		// TODO Auto-generated method stub
		
	}
}
