package com.estudo.ufsc.heranca;

public class MetodoSuper {
	private String carro, sabao, local;
	
	public MetodoSuper(String nome) {
		carro = nome;
		sabao = "marca";
		local = "lavajato";
	}

	public String getCarro() {
		return carro;
	}	
}
