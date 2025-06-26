package com.estudo.ufsc.construtores;

public class Empresa {
	private String nome;
	private String endereco;
	
	public Empresa(){
		nome = "não definido";
		endereco = "vazio";
	}
	public Empresa(String nomeEmpresa, String enderecoEmpresa){
		nome = nomeEmpresa;
		endereco = enderecoEmpresa;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}	
}
