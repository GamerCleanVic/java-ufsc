package com.estudo.ufsc.ooptest;

import com.estudo.ufsc.oop.TypeConvert1;

public class TypeConvertTest1 {
	public static void main (String[] args ) {
		TypeConvert1 tc = new TypeConvert1();
		tc.setVarInt(2);
		System.out.println("Int "+tc.getVarInt()+" agora é = "+tc.getVarInt());
		tc.setVarShort((short) 3);		
		System.out.println("Int "+tc.convertToIntImpl()+
			" agora é = "+tc.convertToIntImpl());
	}
}
