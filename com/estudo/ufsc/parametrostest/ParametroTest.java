package com.estudo.ufsc.parametrostest;

import com.estudo.ufsc.parametros.Parametro;

public class ParametroTest {
	public static void main (String[] args) {
		int e = 12;
		Parametro pra = new Parametro();
		System.out.println("2 + "+e+" = "+pra.adicionaDois(e));
		pra.voidMetodo();
	}
}
