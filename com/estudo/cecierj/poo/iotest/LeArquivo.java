package com.estudo.cecierj.poo.iotest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeArquivo {
	public static void main (String[] args) throws IOException {
		InputStream is = new FileInputStream("texto.txt");
		//Faz a leitura de um arquivo e o retorna como 
		//um stream de bytes
		InputStreamReader isr = new InputStreamReader(is);
		//ISR sabe receber um byte e transformá-lo em char
		BufferedReader br = new BufferedReader(isr);
		String s;
		s = br.readLine();
		System.out.println(s+"\n");
		while(s != null) {
			System.out.println(s);
			s = br.readLine();
		}
	}
}
