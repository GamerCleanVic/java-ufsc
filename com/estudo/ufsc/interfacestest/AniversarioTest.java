package com.estudo.ufsc.interfacestest;

import com.estudo.ufsc.interfaces.Aniversario;

public class AniversarioTest{
	public static void main (String[] args) {
		Aniversario aniv = new Aniversario();
		
		aniv.fazBolo(3);
		aniv.encherBaloes(10);
		aniv.encherBaloes(-5);
		
		aniv.convidarPessoa("João");
		aniv.convidarPessoa("Maria");
		aniv.convidarPessoa("João");
		
		System.out.println("Número de balões enchidos: "+aniv.getBaloesEnchidos());
		System.out.println("Número de convidados: "+aniv.getNumeroConvidados());
	}	
}
