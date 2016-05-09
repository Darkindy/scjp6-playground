package com.accenture.andreipietrusel.scjp6playground.genericscollections;

import java.util.List;

public class SuperExperiment {

	class Booby {}
	class Dooby extends Booby {}
	class Tooby extends Dooby {}
	
	Booby b = new Booby();
	Tooby t = new Tooby();
	
	public void addData(List<? super Dooby> dataList){
		/* XXX: note that List<? super Clazz> enforces adding elem of Clazz+ */
		dataList.add(t);
	}
	
}