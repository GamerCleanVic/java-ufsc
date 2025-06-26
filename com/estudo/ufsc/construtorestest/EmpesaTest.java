package com.estudo.ufsc.construtorestest;

import com.estudo.ufsc.construtores.Empresa;

public class EmpesaTest {
	public static void main (String[] args) {
		Empresa emp = new Empresa();
		emp.setNome("João");
		emp.setEndereco("Rua Piauí");
		System.out.println("O nomme da pessoa é "+emp.getNome()+
				" \ne o endereço da empreza é "+emp.getEndereco());
	}
}
