package com.estudo.ufsc.herancatest;

import com.estudo.ufsc.heranca.Gerente;

public class GerenteTest {
	public static void main(String[] args) {
		Gerente gr = new Gerente();
		gr.setNome("José");
		gr.setCidade("Rio Branco");
		gr.setBonus(1700);
		gr.setSalario(7000);
		System.out.println("Nome: "+gr.getNome()+"\nCidade: "+gr.getCidade()+
				"\nBônus: "+gr.getBonus()+"\nSalário: "+gr.getSalario());
	}
}
