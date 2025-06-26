package com.estudo.cecierj.poo.excecoestest;

import com.estudo.cecierj.poo.excecoes.Excecoes2;

public class Excecoes2Test {
	public static void main (String[] args) {
		Excecoes2 exc = new Excecoes2();
		
		try {
			exc.setNum1(10);
			exc.setNum2(5);
			exc.divisao();
		}catch(Exception e) {
			System.err.println("Nº double / zero, não é possível dividir.");
			e.printStackTrace();
		}
	}
}
