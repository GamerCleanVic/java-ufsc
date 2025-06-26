package com.estudo.cecierj.poo.stringbuffer;

public class EstudanteSB {
	private String nome;
	private double notaFinal;
	
	public EstudanteSB(String nome, double notaFinal) {
		this.nome = nome;
		this.notaFinal = notaFinal;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Estudante: ").append(nome).append("\n");
		sb.append("Nota final: ").append(notaFinal);
		return sb.toString();
	}
	
	public String getNome() {
		return nome;
	}public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNotaFinal() {
		return notaFinal;
	}public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}		
}
