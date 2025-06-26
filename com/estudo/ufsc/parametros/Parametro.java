package com.estudo.ufsc.parametros;

public class Parametro {
	private int i, j;
	
	public int adicionaDois(int i) {
		this.i = i + 2;
		return this.i;
	}
	public void voidMetodo() {
		this.j = 11;
		System.out.println("Valor inicial de j: "+this.j);
	}
}
