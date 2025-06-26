package com.estudo.cecierj.poo.stringbuffertest;

import com.estudo.cecierj.poo.stringbuffer.EstudanteSB;

public class EstudanteTest {
	public static void main (String[] args) {
		EstudanteSB eSB = new EstudanteSB("João", 9.7);	
//		eSB.setNome("Pedro");
//		eSB.setNotaFinal(8.9);
		
		System.out.println(eSB.toString());
	}
}
