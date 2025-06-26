package com.estudo.ufsc.oop;

public class ArrayIndex {
	public long lista(int[] lista) {
		long result = 0;
		for(int i = 0; i < lista.length; i++) {
			result = result + lista[i];
		}
		return result;
	}
}
