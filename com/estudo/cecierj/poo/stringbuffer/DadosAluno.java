package com.estudo.cecierj.poo.stringbuffer;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DadosAluno {
	private String nome;
	private String endereco;
	private double n1;
	private double n2;
	private double n3;
	private double n4;
	private double media;

	public String getNome() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		return nome;
	}public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSBNome() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		return sb.toString();
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getSBEndereco() {
		StringBuilder sb = new StringBuilder();
		sb.append(endereco);
		return sb.toString();
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
	
	public Object[] imprimeDadosCrus() {
		BigDecimal bd2 = BigDecimal.valueOf(getMedia());
		bd2 = bd2.setScale(2, RoundingMode.DOWN);
		Object[] obj = new Object[3];
		obj[0] = getNome();
		obj[1] = getEndereco();
		obj[2] = bd2;
		return obj;
	}
	
	//@Override
	public String getDadosEMedia() {
		StringBuffer sb = new StringBuffer();
		sb.append(getSBNome()).append("\n");
		sb.append(getSBEndereco()).append("\n");
		
		BigDecimal bd = BigDecimal.valueOf(getMedia());
		bd = bd.setScale(2, RoundingMode.DOWN);		
		sb.append(bd).append("\n");
		
		return sb.toString();
	}
}
