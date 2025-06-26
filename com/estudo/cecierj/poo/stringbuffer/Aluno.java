package com.estudo.cecierj.poo.stringbuffer;

public class Aluno {
	private String nome;
	private String endereco;
	private int numEndereco;
	private double n1;
	private double n2;
	private double n3;
	private double n4;
	private double media;
	
	public Aluno() {
		
	}
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(nome).append("\n");
		sb.append(endereco).append("\n");
		sb.append("Nº da rua: ").append(numEndereco).append("\n");
		sb.append("N1: ").append(n1).append("\n");
		sb.append("N2: ").append(n2).append("\n");
		sb.append("N3: ").append(n3).append("\n");
		sb.append("N4: ").append(n4).append("\n");
		sb.append("Média: ").append(media);
		
		return sb.toString();
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
	public int getNumEndereco() {
		return numEndereco;
	}
	public void setNumEndereco(int numEndereco) {
		this.numEndereco = numEndereco;
	}
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double getN3() {
		return n3;
	}
	public void setN3(double n3) {
		this.n3 = n3;
	}
	public double getN4() {
		return n4;
	}
	public void setN4(double n4) {
		this.n4 = n4;
	}
	public double getMedia() {		
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
}
