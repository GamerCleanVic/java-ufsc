package com.estudo.ufsc.ooptest;

import com.estudo.ufsc.oop.ArrBid;

public class ArrBidTest {
	public static void main (String[] args) {
		ArrBid ab = new ArrBid();
		int aux1 = 1;
		for(int i = 0; i < ab.imprimeArray().length; i++) {
			for(int j = 0; j < ab.imprimeArray().length; j++) {
				System.out.print(("| "+(ab.imprimeArray()[i][j] = aux1))+"\t");
				aux1++;
			}
			System.out.println();
		}		
	}
}
