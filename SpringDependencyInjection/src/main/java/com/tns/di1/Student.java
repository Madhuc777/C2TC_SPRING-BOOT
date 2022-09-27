package com.tns.di1;

public class Student {

	MathCheat chit;
	
	public void setChit(MathCheat chit) {
		this.chit = chit;
	}
	public void cheating() {
		chit.mathCheat();
	}
}
