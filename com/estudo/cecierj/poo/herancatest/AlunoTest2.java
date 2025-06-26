package com.estudo.cecierj.poo.herancatest;

import com.estudo.cecierj.poo.heranca.Aluno;
import com.estudo.cecierj.poo.heranca.Empregado;
import com.estudo.cecierj.poo.heranca.Pessoa;

public class AlunoTest2 {
	public static void main (String[] args) {
		Pessoa joao = new Pessoa();
		joao.setNome("João");
		joao.getNome();
		
		Aluno ana = new Aluno();
		ana.setNome("Ana");
		ana.getNome();
		
		Empregado marcos = new Empregado();
		marcos.setNome("Marcos");
		marcos.getNome();
	}
}
