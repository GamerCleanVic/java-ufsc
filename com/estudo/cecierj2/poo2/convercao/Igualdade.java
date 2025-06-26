package com.estudo.cecierj2.poo2.convercao;

public class Igualdade {
	private String frase1;
	private String frase2;
	
	public String getFrase1() {
		return frase1;
	}public void setFrase1(String frase1) {
		this.frase1 = frase1;
	}
	public String getFrase2() {
		return frase2;
	}
	public void setFrase2(String frase2) {
		this.frase2 = frase2;
	}	
	
	public String testeIgualdade() {
		StringBuffer sb = new StringBuffer();
		sb.append("Frase 1: ").append(getFrase1()).append("\n");
		sb.append("Frase 2: ").append(getFrase2()).append("\n");
		sb.append("Usando equals(), Frase 1 e Frase 2 são iguais? ")
		.append(getFrase1().equals(getFrase2()));
		sb.append("\n\nPor estar dentro de um StringBuffer leu o \nconteúdo das variáveis e não o endereço também.");
		return sb.toString();
	}
}
