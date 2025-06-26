package com.estudo.cecierj.poo.heranca;

public class Pessoa {
	private String nome;
	private String endereco;
	
	public String getNome() {
		System.out.println("Nome da Pessoa: "+nome);
		return nome;
	}public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
