package com.estudo.ufsc.valorereferenciatest;

public class ParametroReferencia {
	static void mudaArray(int[] variavel) {
		variavel[2] = 100;
	}
	
	public static void main(String[] args) {
		int umArray[] = new int[3];
		umArray[2] = 10;
		System.out.println("umArray[2] antes = "+umArray[2]);
		mudaArray(umArray);
		System.out.println("umArray[2] depois = "+umArray[2]);
	}
}
