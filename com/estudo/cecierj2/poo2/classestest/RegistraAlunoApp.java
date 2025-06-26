package com.estudo.cecierj2.poo2.classestest;

import com.estudo.cecierj2.poo2.classes.RegistraAluno;

public class RegistraAlunoApp {
	public static void main (String[] args) {
		RegistraAluno ana = new RegistraAluno();
		RegistraAluno beto = new RegistraAluno();
		RegistraAluno carlos = new RegistraAluno();
		ana.setNome("Ana Machado");
		ana.setEndereco("Av. Jaca, 1000");
		ana.setIdade(15);		
		
		ana.setNotaMatematica(9.7);
		ana.setNotaPortugues(8.2);
		ana.setNotaGeografia(7.4);
		
		ana.imprimir(ana.getNotaMatematica(), ana.getNotaPortugues(),
				ana.getNotaGeografia());
	}
}
