package com.estudo.cecierj.poo.stringbuffertest;

import com.estudo.cecierj.poo.stringbuffer.Aluno;

public class AlunoTest {
	public static void main (String[] args) {
		Aluno al1 = new Aluno();
		al1.setNome("Jimmy");
		al1.setEndereco("Rua da Manga");
		al1.setNumEndereco(29);
		al1.setN1(10);
		al1.setN2(9);
		al1.setN3(8.5);
		al1.setN4(7.2);
		al1.setMedia((al1.getN1()+al1.getN2()
			+al1.getN3()+al1.getN4()) / 4);
		
		System.out.println(al1.toString());
	}	
}
