package com.estudo.ufsc.nettest;

import java.net.*;
import java.io.*;

public class ServidorTest {
	public static void main (String[] args) throws IOException{
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(4444);
		}catch(IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		
		Socket clientSocket = null;		
		try {
			System.out.println("Servidor esperando conexão!");
			clientSocket = serverSocket.accept();
		}catch(IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		
		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
		BufferedReader in = new BufferedReader(
			new InputStreamReader(clientSocket.getInputStream())
		);
		out.println(in.readLine());
	}
}
