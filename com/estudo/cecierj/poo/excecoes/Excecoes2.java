package com.estudo.cecierj.poo.excecoes;

public class Excecoes2 {
	private double num1;
	private double num2;
	
	public double getNum1() {
		return num1;
	}public void setNum1(int num1){
		this.num1 = num1;
	}
	
	public double getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public double divisao() {
		System.out.print(getNum1()+" / "+getNum2()+" = "+(getNum1() / getNum2()));
		return (getNum1() / getNum2());		
	}
}
