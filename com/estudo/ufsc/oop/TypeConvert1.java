package com.estudo.ufsc.oop;

public class TypeConvert1 {
	private short varShort;
	private int varInt = 1;
	
	public int getVarInt() {
		return varInt;
	}	
	public short getVarShort() {
		return varShort;
	}
	public void setVarShort(short varShort) {
		this.varShort = varShort;
	}

	public void setVarInt(int varInt) {
		this.varInt = varInt;
	}
	public int convertToIntImpl() {		
		return this.varInt = this.varShort;
	}
	/*Short é menor que int, por isso dá erro
	public int convertToShortImpl(int varInt, short varShort) {
		return this.varShort = this.varInt;
	} */
}
