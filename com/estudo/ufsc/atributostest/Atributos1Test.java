package com.estudo.ufsc.atributostest;

import com.estudo.ufsc.atributos.Atributos1;

public class Atributos1Test {
	public static void main (String[] args) {
		Atributos1 atr = new Atributos1();
		System.out.println("A = "+atr.imprimePrimitivo());
		atr.imprimeObjeto();
	}
}
