package com.estudo.cecierj.poo.iotest;

import java.io.*;

public class LeStringTeclado {
	public static void main (String[] args) {
		try {
			System.out.println("Digite uma tecla: ");
			InputStream is = System.in;//is sabe capturar um byte
			//nesse caso da entrada padrão do sistema
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			/*br sabe receber vários char e armazená-los num
			buffer e tranformá-los em String.
			*/
			String s;
			s = br.readLine();
			
			System.out.println("Você digitou a frase: "+s);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
