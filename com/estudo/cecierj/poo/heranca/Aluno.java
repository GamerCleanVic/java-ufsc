package com.estudo.cecierj.poo.heranca;

public class Aluno extends Pessoa{
	private double nota;
	private String nome;
	
	public String getNome() {
		System.out.println("Nome do Aluno: "+nome);
		return nome;
	}public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getNota() {
		return nota;
	}public void setNota(double nota) {
		this.nota = nota;
	}
}
