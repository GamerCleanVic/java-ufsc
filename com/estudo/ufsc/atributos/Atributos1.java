package com.estudo.ufsc.atributos;

public class Atributos1 {
	private int a = 1;//atributo primitivo
	private int[] b = new int[3];//atributo objeto
	
	public int imprimePrimitivo() {
		return a;
	}
	public void imprimeObjeto() {
		b[0] = 10;
		b[1] = 20;
		b[2] = 20;
		
		System.out.println();
		for(int i = 0; i < b.length; i++) {
			System.out.println("B["+i+"] = "+b[i]);
		}
	}
}
