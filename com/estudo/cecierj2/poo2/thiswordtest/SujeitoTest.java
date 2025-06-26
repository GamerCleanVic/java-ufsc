package com.estudo.cecierj2.poo2.thiswordtest;

import com.estudo.cecierj2.poo2.thisword.Sujeito;

public class SujeitoTest {
	public static void main (String[] args) {
		Sujeito sj = new Sujeito();
		sj.setNome("Jésso");
		sj.setIdade(19);
		
		System.out.println(sj.imprimeDados());
	}
}
