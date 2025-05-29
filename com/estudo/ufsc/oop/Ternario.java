package com.estudo.ufsc.oop;

public class Ternario {
	private int num1;
	private int num2;
	
	public boolean verificaBool(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		return (this.num1 < this.num2) ? (this.num1 < this.num2) : (this.num1 < this.num2);
	}
}
