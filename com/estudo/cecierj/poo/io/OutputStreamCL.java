package com.estudo.cecierj.poo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamCL {
	public void imprimeOutputStream() {
		try {
			OutputStream os = new FileOutputStream("escrita.txt");
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("Java na Universidade");
			bw.close();
			InputStream is = new FileInputStream("escrita.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String s = br.readLine();
			StringBuilder sb = new StringBuilder();
			sb.append(s);
			System.out.println(sb.toString());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
