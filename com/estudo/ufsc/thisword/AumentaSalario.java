package com.estudo.ufsc.thisword;

public class AumentaSalario {
	private double salario;
	private double percentual;
	
	public double aumentarSalario(double salario, double percentual) {
		double aumento;
		this.salario = salario;
		this.percentual = percentual;
		
		aumento = (this.salario*this.percentual) / 100;
		return this.salario += aumento;
	}
}
