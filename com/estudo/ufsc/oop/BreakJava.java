package com.estudo.ufsc.oop;

public class BreakJava {
	private int i;
	
	public void breakLoop() {
		while(true) {
			System.out.println("-> "+i);
			i++;
			if(i > 10) {
				break;
			}
		}
	}
}
