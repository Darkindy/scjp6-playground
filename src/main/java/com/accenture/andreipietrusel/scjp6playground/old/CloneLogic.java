package com.accenture.andreipietrusel.scjp6playground.old;

public class CloneLogic implements Cloneable {

	int a;

	@Override
	protected CloneLogic clone() {
		try {
			CloneLogic o = (CloneLogic) super.clone();
			return o;
		} catch (CloneNotSupportedException e) {
			throw new AssertionError(e);
		}
		

		
	}

	public int getA() {
		Integer i = 4;
		char c = (int) 65000;
		
		System.out.println(c * i);
		
		
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}
