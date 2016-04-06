package com.accenture.andreipietrusel.playground.old;

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
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}
