package com.estudo.cecierj.poo.escolatest;

import com.estudo.cecierj.poo.escola.RegistraAluno;

public class AppRegistraAluno {
	public static void main (String[] args) {
		RegistraAluno ana = new RegistraAluno();
		RegistraAluno beto = new RegistraAluno();
		RegistraAluno carlos = new RegistraAluno();
		
		ana.setNome("Ana Machado");
		ana.setEndereco("Avenida Brasil, 1000");
		ana.setIdade(15);
		ana.setNotaMatematica(9.7);
		ana.setNotaPortugues(8.2);
		ana.setNotaGeografia(7.4);
		
		beto.setNome("Roberto da Silva");
		carlos.setNome("Carlos Alberto");
		
		System.out.println("Estudantes registrados: "+RegistraAluno.getContadorEstudante());
		
		ana.imprimir();
		System.out.println();
		ana.imprimir(ana.getNotaMatematica(), ana.getNotaPortugues(),
				ana.getNotaGeografia());
	}
}
