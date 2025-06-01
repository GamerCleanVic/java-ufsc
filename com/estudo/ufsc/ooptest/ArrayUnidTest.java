package com.estudo.ufsc.ooptest;

import com.estudo.ufsc.oop.ArrayUnid;

public class ArrayUnidTest {
	public static void main (String[] args) {
		ArrayUnid au = new  ArrayUnid();
		System.out.print("[ ");
		for(int i = 0; i < au.imprimeArray().length; i++) {
			System.out.print(au.imprimeArray()[i]+", ");
		}
		System.out.print("]");
	}
}
