package com.estudo.cecierj.poo.herancatest;

import com.estudo.cecierj.poo.heranca.Aluno;

public class AlunoTest {
	public static void main (String[] args) {
		Aluno ana = new Aluno();
		String nomeAtual;
		ana.setNome("Ana");
		nomeAtual = ana.getNome();
		System.out.println("Nome: "+nomeAtual);
	}
}
