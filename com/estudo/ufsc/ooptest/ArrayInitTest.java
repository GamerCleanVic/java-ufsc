package com.estudo.ufsc.ooptest;

import com.estudo.ufsc.oop.ArrayInit;

public class ArrayInitTest {
	public static void main (String[] args) {
		ArrayInit ai = new ArrayInit();
		int aux = 0;
		for(int i = 0; i < ai.imprimeVetor().length; i++) {
			for(int j = 0; j < ai.imprimeVetor().length; j++) {
				while(aux < ai.imprimeVetor().length && aux < ai.imprimeVetor().length) {
					System.out.print("| "+(ai.imprimeVetor()[i][j])+"\t");
					aux++;
				}				
			}
			System.out.println();
		}				
	}
}
