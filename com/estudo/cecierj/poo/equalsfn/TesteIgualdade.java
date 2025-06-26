package com.estudo.cecierj.poo.equalsfn;

public class TesteIgualdade {
	public static void main (String[] args) {
		String frase1;
		String frase2;
		
		frase1 = new String("Testando igualdade!");
		frase2 = new String("Testando igualdade!");
		System.out.println("Frase 1: "+frase1);
		System.out.println("Frase 2: "+frase2);
		System.out.println("Usando ==, Frase 1 e Frase 2 são iguais? "+(frase1==frase2));
		System.out.println("Usando equals(), Frase 1 e Frase 2 são iguais? "+(frase1.equals(frase2)));
	}
}
