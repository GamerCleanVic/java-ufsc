package com.estudo.cecierj.poo.intefaces;

public class Linha implements Relacao{
	private double x1;
	private double x2;
	private double y1;
	private double y2;
	
	public Linha(double x1, double x2, double y1, double y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	public double getComprimento() {
		double comprimento = Math.sqrt((x1-x2)*(x2-x1)+(y2-y1)*(y2-y1));
		return comprimento;
	}
	
	public boolean maiorQue(Object a, Object b) {
		double aComp = ((Linha)a).getComprimento();
		double bComp = ((Linha)b).getComprimento();
		return (aComp > bComp);		
	}
	public boolean menorQue(Object a, Object b) {
		double aComp = ((Linha)a).getComprimento();
		double bComp = ((Linha)b).getComprimento();
		return (aComp < bComp);		
	}
	public boolean igual(Object a, Object b) {
		double aComp = ((Linha)a).getComprimento();
		double bComp = ((Linha)b).getComprimento();
		return (aComp == bComp);		
	}
}
