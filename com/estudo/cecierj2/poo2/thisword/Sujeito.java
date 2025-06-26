package com.estudo.cecierj2.poo2.thisword;

public class Sujeito {
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}public void setNome(String nome){
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String imprimeDados() {
		StringBuffer sb = new StringBuffer();
		sb.append("Nome: ").append(getNome()).append("\n");
		sb.append("Idade: ").append(getIdade());
		return sb.toString();
	}
}
