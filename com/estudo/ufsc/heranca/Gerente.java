package com.estudo.ufsc.heranca;

public class Gerente extends Empregado{
	private double bonus;

	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}	
	public double getSalario() {
		return (super.getSalario()) + bonus;
	}
}
