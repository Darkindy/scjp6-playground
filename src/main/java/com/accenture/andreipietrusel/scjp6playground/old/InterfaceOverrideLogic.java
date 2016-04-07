package com.accenture.andreipietrusel.scjp6playground.old;

public class InterfaceOverrideLogic {

	public String executeLogic() {

		b b1 = new c();
		b1.dothat();

		return null;
	}

	interface a {

		void dothat() throws Exception;

	}

	interface b extends a {
		@Override
		void dothat();

	}

	class c implements b {

		@Override
		public void dothat() {
		}
	}

}
