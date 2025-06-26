package com.estudo.ufsc.herancatest;

import com.estudo.ufsc.heranca.MetodoSuper;

public class MetodoSuperTest {
	public static void main (String[] args) {
		MetodoSuper ms = new MetodoSuper("Vectra CD");
		System.out.println("Nome do carro: "+ms.getCarro());
	}
}
