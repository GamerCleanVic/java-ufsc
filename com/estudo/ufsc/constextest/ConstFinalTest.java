package com.estudo.ufsc.constextest;

import com.estudo.ufsc.constex.ConstFinal;

public class ConstFinalTest {
	public static void main (String[] args) {
		ConstFinal cf = new ConstFinal();
		cf.setNome("Pedro");
		
		System.out.println("Nome: "+cf.getNome()+"\nCargo: "+cf.getCargo());
	}
}
