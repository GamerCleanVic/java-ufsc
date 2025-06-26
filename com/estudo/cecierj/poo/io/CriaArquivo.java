package com.estudo.cecierj.poo.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CriaArquivo {
	public void criarMeuArquivo() {
		try (PrintWriter writer = new PrintWriter(new FileWriter("texto.txt"))){
			writer.println("Iniciando.");
			writer.println("Meio do texto.");
			writer.println("Fim do texto.");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void main (String[] args) {
		CriaArquivo ca = new CriaArquivo();
		ca.criarMeuArquivo();
	}
}
