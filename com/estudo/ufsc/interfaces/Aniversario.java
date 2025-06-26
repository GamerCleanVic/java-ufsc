package com.estudo.ufsc.interfaces;

import java.util.HashMap;
import java.util.Map;

public class Aniversario implements Festa{	
	private Map<String, Integer> convidados;
	private int baloesEnchidos;
	
	public Aniversario() {
		this.convidados = new HashMap<>();
		this.baloesEnchidos = 0;
	}
	
	@Override
	public void fazBolo(int tamanho) {
		System.out.println("Bolo de tamanho "+tamanho+" feito com sucesso!");
	}
	@Override
	public boolean encherBaloes(int quantidade){
		if(quantidade > 0) {
			baloesEnchidos += quantidade;
			System.out.println(quantidade+" balões enchidos com sucesso!");
			return true;
		}else {
			System.out.println("Quantidade de balões inválida!\n");
			return false;
		}
	}
	@Override
	public int convidarPessoa(String nome) {
		if(!convidados.containsKey(nome)) {
			convidados.put(nome, 1);
			System.out.println(nome+" convidado(ª) para a festa!");
			return convidados.size();
		}else {
			System.out.println(nome+" já foi convidado(ª) anteriormente!\n");
			return convidados.size();
		}		
	}
	
	public int getBaloesEnchidos() {
		return baloesEnchidos;
	}
	public int getNumeroConvidados() {
		return convidados.size();
	}
}
