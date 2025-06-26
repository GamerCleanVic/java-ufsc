package com.estudo.ufsc.exceptionstest;

import com.estudo.ufsc.exceptions.ExceptionDiv;

public class ExceptionDivTest {
	public static void main (String[] args) {
		ExceptionDiv ed = new ExceptionDiv();
		ed.verificaException(2,0);
	}
}
