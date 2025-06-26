package com.estudo.ufsc.exceptions;

public class ExceptionDiv {
	private int num1;
	private int num2;
	private int div;
	
	public double verificaException(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		try {
			this.div = this.num1 / this.num2;
			System.out.println(this.num1+" / "+this.num2+" = "+this.div);
		}catch(Exception e) {
			//System.err.println("Aconteceu um problema: "+e);
			e.printStackTrace();
		}
		return this.div;
	}
}
