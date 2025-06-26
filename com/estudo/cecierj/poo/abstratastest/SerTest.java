package com.estudo.cecierj.poo.abstratastest;

import com.estudo.cecierj.poo.abstratas.Cachorro;
import com.estudo.cecierj.poo.abstratas.SerHumano;

public class SerTest {
	public static void main (String[] args) {
		SerHumano sh = new SerHumano();
		sh.andar();
		
		Cachorro ch = new Cachorro();
		ch.andar();
	}
}
