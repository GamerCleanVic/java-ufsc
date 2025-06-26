package com.estudo.ufsc.valorereferenciatest;

import com.estudo.ufsc.valorereferencia.ValorReferencia;

public class ValorReferenciaTest {
	public static void main (String[] args) {
		ValorReferencia vr = new ValorReferencia();
		System.out.println("Passagem de parâmetros: ");
		
		int iAux = vr.adicionaQuatro(10);
		System.out.println("Valor original de i: "+iAux);
		int j = vr.adicionaQuatro(iAux);
		System.out.println("Valor de j: "+j);
		System.out.println("Valor corrente de i: "+iAux);
	}
}
