package com.estudo.cecierj.poo.heranca;

public class Empregado extends Pessoa{
	private String nome; 
	
	public String getNome() {
		System.out.println("Nome do Empregado: "+nome);
		return nome;
	}public void setNome(String nome){
		this.nome = nome;
	}
}
