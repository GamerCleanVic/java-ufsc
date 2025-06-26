package com.estudo.cecierj.poo.interfacestest;

import com.estudo.cecierj.poo.intefaces.Linha;

public class LinhaTest {
	public static void main (String[] args) {
		Linha ln1 = new Linha(3, 5, 7, 9);
		System.out.println("A > B? "+ln1.maiorQue(args, ln1));
	}
}
