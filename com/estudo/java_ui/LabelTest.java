package com.estudo.java_ui;

import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class LabelTest extends JFrame{
	private final JLabel label;
	private final Icon icone = null;
	
	//Configurando GUI
	public LabelTest() {
		super("Testando JLabel");
		//Cria um container e define o modelo de layout (FlowLayout)
		Container container = getContentPane();
		container.setLayout( new FlowLayout() );
		//JLabel sem argumento no construtor
		label = new JLabel();
		label.setText("Label com ícone e texto com alinhamento de rodapé bottom.");
		label.setIcon(icone);
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setToolTipText("Este é o label");
		container.add(label);
		setSize(500, 300);
		setVisible(true);
	}
	
	public static void main (String[] args) {
		LabelTest app = new LabelTest();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
