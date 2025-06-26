package com.estudo.ufsc.thiswordtest;

import com.estudo.ufsc.thisword.AumentaSalario;

public class AumentaSalarioTest {
	public static void main (String[] args) {
		AumentaSalario sl = new AumentaSalario();
		System.out.println("Novo salário: "+(sl.aumentarSalario(1500, 60)));
	}
}
