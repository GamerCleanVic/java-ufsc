package com.estudo.ufsc.oop;

public class ContinueJava {
	private int i;
	
	public void continueJava() {
		for(i = -10; i < 10; i++) {			
			if(i == 0) {
				//System.out.println("-> "+i);
				continue;				
			}
			System.out.println("-> "+(1/i));
		}
	}
}
