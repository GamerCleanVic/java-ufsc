package com.estudo.cecierj.poo.stringbuffertest;

import com.estudo.cecierj.poo.stringbuffer.DadosAluno;

public class StringBuilderDadosAlunoTest {
	public static void main (String[] args) {
		DadosAluno jim = new DadosAluno();
		jim.setNome("Jim");
		jim.setEndereco("Rua Figo");
		jim.setN1(8.4);
		jim.setN2(7.2);
		jim.setN3(9);
		jim.setN4(7.1);
		jim.setMedia((jim.getN1()+jim.getN2()+
			jim.getN3()+jim.getN4()) / 4);		
		
		System.out.println(jim.getDadosEMedia());
		
		long inicio = System.nanoTime();
		Object[] mediaNano = jim.imprimeDadosCrus();
		long fim = System.nanoTime();
		System.out.println("Tempo de execução de getMedia(): "+
		(fim - inicio)+" nanossegundos.");
		
		long inicio2 = System.nanoTime();
		String mediaNano2 = jim.getDadosEMedia();
		long fim2 = System.nanoTime();
		System.out.println("Tempo de execução de getDadosEMedia(): "+
		(fim2 - inicio2)+" nanossegundos.");
	}
}
