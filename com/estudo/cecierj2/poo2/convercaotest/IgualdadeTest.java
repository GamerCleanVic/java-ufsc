package com.estudo.cecierj2.poo2.convercaotest;

import com.estudo.cecierj2.poo2.convercao.Igualdade;

public class IgualdadeTest {
	public static void main (String[] args) {
		Igualdade ig = new Igualdade();
		ig.setFrase1("Testando igualdade!");
		ig.setFrase2("Testando igualdade!");
		
		System.out.println(ig.testeIgualdade());		
	}
}
