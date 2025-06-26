package com.estudo.cecierj.poo.herancatest;

import com.estudo.cecierj.poo.heranca.Aluno;
import com.estudo.cecierj.poo.heranca.Empregado;
import com.estudo.cecierj.poo.heranca.Pessoa;

public class AlunoTest3 {
	public static void main (String[] args) {
		Pessoa ref;
		
		Aluno alu = new Aluno();
		alu.setNome("Beatriz");
		
		Empregado emp = new Empregado();
		emp.setNome("Carlos");
		
		ref = alu;
		ref.getNome();
		
		ref = emp;
		ref.getNome();
	}
}
